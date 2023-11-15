package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.resourceIDData.Elelements_Menu;
import ru.iteco.fmhandroid.ui.testData.Data_Menu;

public class CheckUtils_Menu {

    // MENU LIST
    @DisplayName("экран Main / окно Menu / Проверка отображения в Menu строки News")
    public void checkLineVisibilityNews() {
        onView(allOf(withId(Elelements_Menu.ID_TITLE_MENU), withText(Data_Menu.NEWS_TEXT),
                withParent(withParent(withId(Elelements_Menu.ID_PARENT_TITLE))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Menu.NEWS_TEXT)));
    }

    @DisplayName("экран Main / окно Menu / Проверка отображения в Menu строки Claims")
    public void checkLineVisibilityClaims() {
        onView(allOf(withId(Elelements_Menu.ID_TITLE_MENU), withText(Data_Menu.CLAIMS_TEXT),
                withParent(withParent(withId(Elelements_Menu.ID_PARENT_TITLE))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Menu.CLAIMS_TEXT)));
    }

    @DisplayName("экран Main / окно Menu / Проверка отображения в Menu строки About")
    public void checkLineVisibilityAbout() {
        onView(allOf(withId(Elelements_Menu.ID_TITLE_MENU), withText(Data_Menu.ABOUT_TEXT),
                withParent(withParent(withId(Elelements_Menu.ID_PARENT_TITLE))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Menu.ABOUT_TEXT)));
    }
}
