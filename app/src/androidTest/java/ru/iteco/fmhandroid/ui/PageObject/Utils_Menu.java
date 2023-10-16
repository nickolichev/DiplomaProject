package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.resourceIDData.Elelements_Menu;
import ru.iteco.fmhandroid.ui.testData.Data_Menu;

public class Utils_Menu {

    @DisplayName("экран MAIN / клик по иконке MENU")
    public void buttonMenu() {
        ViewInteraction button = onView(
                allOf(withId(Elelements_Menu.ID_MAIN_MENU)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }

    @DisplayName("экран MAIN / клик в раскрытом MENU по строке NEWS")
    public void buttonNews() {
        ViewInteraction button = onView(
                allOf(withId(Elelements_Menu.ID_TITLE_MENU), withText(Data_Menu.NEWS_TEXT),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        button.perform(click());
    }

    @DisplayName("экран MAIN / клик в раскрытом MENU по строке CLAIMS")
    public void buttonClaims() {
        ViewInteraction button = onView(
                allOf(withId(Elelements_Menu.ID_TITLE_MENU),
                        withText(Data_Menu.CLAIMS_TEXT),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        button.perform(click());
    }

    @DisplayName("экран MAIN / клик в раскрытом MENU по строке ABOUT")
    public void buttonAbout() {
        ViewInteraction button = onView(
                allOf(withId(Elelements_Menu.ID_TITLE_MENU), withText(Data_Menu.ABOUT_TEXT),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        button.perform(click());
    }
}
