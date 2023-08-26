package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;

import org.hamcrest.core.IsInstanceOf;

import ru.iteco.fmhandroid.ui.resourceIDData.AuthorizationElements;
import ru.iteco.fmhandroid.ui.resourceIDData.MainElements;
import ru.iteco.fmhandroid.ui.testData.MainPage;

public class CheckUtils {

    public void checkAllIconsVisibilityOnMainPage() {
        new CheckUtils().checkIconVisibilityMenu();
        new CheckUtils().checkIconVisibilityTradeMark();
        new CheckUtils().checkIconVisibilityButterFly();
        new CheckUtils().checkIconVisibilityNews();
        new CheckUtils().checkIconVisibilityAllNews();
        new CheckUtils().checkIconVisibilityClaims();
        new CheckUtils().checkIconVisibilityAllClaims();
        new CheckUtils().checkIconVisibilityLogOut();
    }
    public void checkIconVisibilityMenu() {
        ViewInteraction iconMenu = onView(withId(MainElements.ID_MAIN_MENU));
        iconMenu.check(matches(isDisplayed()));
        ViewInteraction descriptionMenu = onView(allOf(
                withId(MainElements.ID_MAIN_MENU),
                withContentDescription(MainPage.DESCRIPTION_MENU)
        ));
        descriptionMenu.check(matches(isDisplayed()));
    }

    public void checkIconVisibilityTradeMark() {
        ViewInteraction iconTradMark = onView(withId(MainElements.ID_TRADE_MARK));
        iconTradMark.check(matches(isDisplayed()));
    }

    public void checkIconVisibilityButterFly() {
        ViewInteraction iconButterFly = onView(withId(MainElements.ID_BUTTERFLY));
        iconButterFly.check(matches(isDisplayed()));
        ViewInteraction descriptionMission = onView(allOf(
                withId(MainElements.ID_BUTTERFLY),
                withContentDescription(MainPage.DESCRIPTION_MISSION)
        ));
        descriptionMission.check(matches(isDisplayed()));
    }

    public void checkIconVisibilityNews() {
        ViewInteraction iconNews = onView(withId(MainElements.ID_NEWS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textNews = onView(allOf(
                withId(MainElements.ID_NEWS),
                hasDescendant(withText(MainPage.TEXT_NEWS))
        ));
        textNews.check(matches(isDisplayed()));
    }
    public void checkIconVisibilityAllNews() {
        ViewInteraction iconNews = onView(withId(MainElements.ID_ALL_NEWS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textAllNews = onView(allOf(
                withId(MainElements.ID_ALL_NEWS),
                withParent(allOf(
                        withId(MainElements.ID_NEWS),
                        withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout.class))
                )),
                withText(MainPage.TEXT_ALL_NEWS)
        ));
        textAllNews.check(matches(isDisplayed()));
    }
    public void checkIconVisibilityClaims() {
        ViewInteraction iconNews = onView(withId(MainElements.ID_CLAIMS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textClaims = onView(allOf(
                withId(MainElements.ID_CLAIMS),
                hasDescendant(withText(MainPage.TEXT_CLAIMS))
        ));
        textClaims.check(matches(isDisplayed()));
    }

    public void checkIconVisibilityAllClaims() {
        ViewInteraction iconNews = onView(withId(MainElements.ID_ALL_CLAIMS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textAllClaims = onView(allOf(
                withId(MainElements.ID_ALL_CLAIMS),
                withParent(allOf(
                        withId(MainElements.ID_CLAIMS),
                        withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout.class))
                )),
                withText(MainPage.TEXT_ALL_CLAIMS)
        ));
        textAllClaims.check(matches(isDisplayed()));
    }
    public void checkIconVisibilityLogOut() {
        ViewInteraction iconLogOut = onView(withId(AuthorizationElements.ID_IMAGE_LOG_OUT));
        iconLogOut.check(matches(isDisplayed()));
        ViewInteraction descriptionMission = onView(allOf(
                withId(AuthorizationElements.ID_IMAGE_LOG_OUT),
                withContentDescription(MainPage.DESCRIPTION_LOG_OUT)
        ));
        descriptionMission.check(matches(isDisplayed()));
    }


}
