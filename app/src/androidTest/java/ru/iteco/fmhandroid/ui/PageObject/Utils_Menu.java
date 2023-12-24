package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import org.hamcrest.core.IsInstanceOf;

//import io.qameta.allure.Allure;
import io.qameta.allure.kotlin.Allure;
import io.qameta.allure.kotlin.Step;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Main;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Menu;
import ru.iteco.fmhandroid.ui.testData.Data_Main;
import ru.iteco.fmhandroid.ui.testData.Data_Menu;

public class Utils_Menu {
    public void clickButtonMenu() {
        Allure.step("экран MAIN / клик по иконке MENU");
        onView(allOf(withId(Elements_Menu.ID_MAIN_MENU)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(click());
    }

    public void clickLineMain() {
        Allure.step("экран MAIN / клик в раскрытом MENU по строке MAIN");
        onView(allOf(withId(Elements_Menu.ID_TITLE_MENU),
                withText(Data_Menu.MAIN_LINE),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .perform(click());
    }

    public void clickLineNews() {
        Allure.step("экран MAIN / клик в раскрытом MENU по строке NEWS");
        onView(allOf(withId(Elements_Menu.ID_TITLE_MENU),
                withText(Data_Menu.NEWS_LINE),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .perform(click());
    }

    public void clickLineClaims() {
        Allure.step("экран MAIN / клик в раскрытом MENU по строке CLAIMS");
        onView(allOf(withId(Elements_Menu.ID_TITLE_MENU),
                withText(Data_Menu.CLAIMS_LINE),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .perform(click());
    }

    public void clickLineAbout() {
        Allure.step("экран MAIN / клик в раскрытом MENU по строке ABOUT");
        onView(allOf(withId(Elements_Menu.ID_TITLE_MENU), withText(Data_Menu.ABOUT_LINE),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .perform(click());
    }

    public void clickIconAllNews() {
        Allure.step("экран Main / клик All News");
        onView(allOf(withId(Elements_Main.ID_ALL_NEWS),
                withText(Data_Main.TEXT_ALL_NEWS),
                withParent(allOf(withId(Elements_Main.ID_CONTAINER_NEWS),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .perform(click());
    }
}
