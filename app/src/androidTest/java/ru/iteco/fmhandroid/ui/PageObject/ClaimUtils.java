package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static java.util.EnumSet.allOf;
import static ru.iteco.fmhandroid.ui.PageObject.DataHelper.childAtPosition;

import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.idling.CountingIdlingResource;
import androidx.test.espresso.matcher.ViewMatchers;

import static org.hamcrest.Matchers.allOf;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.ClaimElements;
import ru.iteco.fmhandroid.ui.testData.ClaimData;

// Define an IdlingResource

public class ClaimUtils {
    private static final String REFRESH_IDLING_RESOURCE = "refreshIdlingResource";
    private final CountingIdlingResource refreshIdlingResource = new CountingIdlingResource(REFRESH_IDLING_RESOURCE);

    @Before
    public void registerIdlingResources() {
        IdlingRegistry.getInstance().register(refreshIdlingResource);
    }

    @After
    public void unregisterIdlingResources() {
        IdlingRegistry.getInstance().unregister(refreshIdlingResource);
    }

    // кликаем на кнопку REFRESH, если только она присутствует на экране
    // + дожидаемся обновления страницы
    public void clickRefreshButton() {
        try {
            onView(withId(ClaimElements.ID_REFRESH_BUTTON))
                    .check(matches(isDisplayed()))
                    .perform(click());

            refreshIdlingResource.increment();

            final long timeoutMillis = 4000;
            final long startTime = System.currentTimeMillis();

            while (!refreshIdlingResource.isIdleNow()) {
                // Check if the timeout has been reached
                if (System.currentTimeMillis() - startTime >= timeoutMillis) {
                    throw new RuntimeException("Timeout while waiting for refresh to complete");
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (NoMatchingViewException e) {
        }
    }

    // утилиты модального окна FILTER
    public void clickFilters(CardIdlingResource cardIdlingResource) {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_FILTERS_BUTTON),
                        withContentDescription(ClaimData.FILTER_DISCRIPTION)));
        cardIdlingResource.setIdle(false);
        cardIdlingResource.setIdle(true);
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }

    public void clickOpen() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_OPEN_CHECK_BOX),
                        withText(ClaimData.OPEN_STATUS_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }

    public void clickInProgress() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_IN_PROGRESS_CHECK_BOX),
                        withText(ClaimData.IN_PROGRESS_STATUS_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }

    public void clickExecuted() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_EXECUTED_CHECK_BOX),
                        withText(ClaimData.EXECUTED_STATUS_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }

    public void clickCancelled() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_CANCELLED_CHECK_BOX),
                        withText(ClaimData.CANCELLED_STATUS_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }

    public void clickOk(CardIdlingResource cardIdlingResource) {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_OK_BUTTON),
                        withText(ClaimData.OK_BUTTON_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        button.perform(scrollTo(), click());
        cardIdlingResource.setIdle(false);
        cardIdlingResource.setIdle(true);
        cardIdlingResource.waitUntilIdle();
    }

    public void clickCancel(CardIdlingResource cardIdlingResource) {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_CANCEL_BUTTON),
                        withText(ClaimData.CANCEL_BUTTON_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
        cardIdlingResource.setIdle(false);
        cardIdlingResource.waitUntilIdle();
    }

    public void clickClose(CardIdlingResource cardIdlingResource) {
        new DataHelper().waitAsynchOperation1000();
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_BUTTON_CLOSE),
                        withContentDescription(ClaimData.BUTTON_CLOSE)));
        cardIdlingResource.setIdle(false);
        cardIdlingResource.setIdle(true);

        button.perform(scrollTo(), click());

        cardIdlingResource.setIdle(false);
        cardIdlingResource.setIdle(true);
        cardIdlingResource.waitUntilIdle();
    }

    // развернуть карточку претензии
    public void clickExpend(CardIdlingResource cardIdlingResource) {
        new DataHelper().waitAsynchOperation2000();
        ViewInteraction recyclerView = onView(
                allOf(withId(ClaimElements.ID_LIST_CARDS),
                        childAtPosition(
                                withId(R.id.all_claims_cards_block_constraint_layout),
                                4)));
        recyclerView.perform(actionOnItemAtPosition(0, click()));
        cardIdlingResource.setIdle(false);
        cardIdlingResource.setIdle(true);
        cardIdlingResource.waitUntilIdle();
    }
}
