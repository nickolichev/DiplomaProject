package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;

import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.ui.resourceIDData.Elelements_Menu;
import ru.iteco.fmhandroid.ui.testData.Data_Menu;

public class CheckUtils_Menu {

    // MENU LIST
    // Утилиты проверок, что в списке отображаются все строки меню
    public void checkLineVisibilityNews() {
        ViewInteraction news = onView(
                allOf(withId(Elelements_Menu.ID_TITLE_MENU), withText(Data_Menu.NEWS_TEXT),
                        withParent(withParent(withId(Elelements_Menu.ID_PARENT_TITLE))),
                        isDisplayed()));
        news.check(matches(withText(Data_Menu.NEWS_TEXT)));
    }

    public void checkLineVisibilityClaims() {
        ViewInteraction claims = onView(
                allOf(withId(Elelements_Menu.ID_TITLE_MENU), withText(Data_Menu.CLAIMS_TEXT),
                        withParent(withParent(withId(Elelements_Menu.ID_PARENT_TITLE))),
                        isDisplayed()));
        claims.check(matches(withText(Data_Menu.CLAIMS_TEXT)));
    }

    public void checkLineVisibilityAbout() {
        ViewInteraction about = onView(
                allOf(withId(Elelements_Menu.ID_TITLE_MENU), withText(Data_Menu.ABOUT_TEXT),
                        withParent(withParent(withId(Elelements_Menu.ID_PARENT_TITLE))),
                        isDisplayed()));
        about.check(matches(withText(Data_Menu.ABOUT_TEXT)));
    }
}
