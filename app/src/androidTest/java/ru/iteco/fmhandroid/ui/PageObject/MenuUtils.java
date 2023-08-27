package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import ru.iteco.fmhandroid.ui.resourceIDData.MenuElelements;
import ru.iteco.fmhandroid.ui.testData.MenuData;

public class MenuUtils {

    public void buttonMenu() {

        ViewInteraction button = onView(
                allOf(withId(MenuElelements.ID_MAIN_MENU)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }

    public void buttonNews() {

        ViewInteraction button = onView(
                allOf(withId(MenuElelements.ID_TITLE_MENU), withText(MenuData.NEWS_TEXT),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        button.perform(click());
    }

    public void buttonClaims() {

        ViewInteraction button = onView(
                allOf(withId(MenuElelements.ID_TITLE_MENU),
                        withText(MenuData.CLAIMS_TEXT),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        button.perform(click());
    }

    public void buttonAbout() {

        ViewInteraction button = onView(
                allOf(withId(MenuElelements.ID_TITLE_MENU), withText(MenuData.ABOUT_TEXT),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        button.perform(click());
    }
}
