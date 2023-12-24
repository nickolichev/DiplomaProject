package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import io.qameta.allure.kotlin.Allure;
import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Menu;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Menu;
import ru.iteco.fmhandroid.ui.testData.Data_Menu;

public class CheckUtils_Menu {

    public void checkLineMain_Visibility() {
        Allure.step("экран Main / окно Menu / Проверка отображения в Menu строки Main");
        onView(allOf(withId(Elements_Menu.ID_TITLE_MENU),
                withText(Data_Menu.MAIN_LINE),
                withParent(withParent(withId(Elements_Menu.ID_PARENT_TITLE))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Menu.MAIN_LINE)));
    }

    public void checkLineNews_Visibility() {
        Allure.step("экран Main / окно Menu / Проверка отображения в Menu строки News");
        onView(allOf(withId(Elements_Menu.ID_TITLE_MENU),
                withText(Data_Menu.NEWS_LINE),
                withParent(withParent(withId(Elements_Menu.ID_PARENT_TITLE))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Menu.NEWS_LINE)));
    }

//    public void checkLineClaims_Visibility() {
//        Allure.step("экран Main / окно Menu / Проверка отображения в Menu строки Claims");
//        onView(allOf(withId(Elements_Menu.ID_TITLE_MENU),
//                withText(Data_Menu.CLAIMS_LINE),
//                withParent(withParent(withId(Elements_Menu.ID_PARENT_TITLE))),
//                isDisplayed()))
//                .check(matches(isDisplayed()))
//                .check(matches(withText(Data_Menu.CLAIMS_LINE)));
//    }

    public void checkLineAbout_Visibility() {
        Allure.step("экран Main / окно Menu / Проверка отображения в Menu строки About");
        onView(allOf(withId(Elements_Menu.ID_TITLE_MENU),
                withText(Data_Menu.ABOUT_LINE),
                withParent(withParent(withId(Elements_Menu.ID_PARENT_TITLE))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Menu.ABOUT_LINE)));
    }
}
