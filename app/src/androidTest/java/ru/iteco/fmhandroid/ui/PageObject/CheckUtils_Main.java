package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import org.hamcrest.core.IsInstanceOf;

import io.qameta.allure.kotlin.Allure;
import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Main;
import ru.iteco.fmhandroid.ui.testData.Data_Main;

public class CheckUtils_Main {
    public void checkIconMenu_Visibility() {
        Allure.step("экран Main / проверяем отображение кнопки Menu");
        onView(allOf(withId(Elements_Main.ID_MAIN_MENU),
                withContentDescription(Data_Main.DESCRIPTION_MENU),
                withParent(allOf(withId(Elements_Main.ID_CONTAINER_CUSTOM_APP),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_Main.DESCRIPTION_MENU)));
    }

    public void checkIconTradeMark_Visibility() {
        Allure.step("экран Main / проверяем отображение icon Trade Mark");
        onView(allOf(withId(Elements_Main.ID_TRADE_MARK),
                withParent(allOf(withId(Elements_Main.ID_CONTAINER_CUSTOM_APP),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    public void checkIconButterFly_Visibility() {
        Allure.step("экран Main / проверяем отображение icon Our Mission");
        onView(allOf(withId(Elements_Main.ID_BUTTERFLY),
                withContentDescription(Data_Main.DESCRIPTION_MISSION),
                withParent(allOf(withId(Elements_Main.ID_CONTAINER_CUSTOM_APP),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    public void checkIconLogOut_Visibility() {
        Allure.step("экран Main / проверяем отображение icon Log out");
        onView(allOf(withId(Elements_Main.ID_AUTHORIZATION),
                withContentDescription(Data_Main.DESCRIPTION_LOG_OUT),
                withParent(allOf(withId(Elements_Main.ID_CONTAINER_CUSTOM_APP),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    public void checkIconNews_Visibility() {
        Allure.step("экран Main / проверяем отображение icon SubTitle News");
        onView(allOf(withText(Data_Main.TEXT_NEWS),
                withParent(withParent(withId(Elements_Main.ID_CONTAINER_NEWS))),
                isDisplayed()))
                .check(matches(withText(Data_Main.TEXT_NEWS)));
    }

    public void checkIconAllNews_Visibility() {
        Allure.step("экран Main / проверяем отображение icon SubTitle All News");
        onView(allOf(withId(Elements_Main.ID_ALL_NEWS),
                withText(Data_Main.TEXT_ALL_NEWS),
                withParent(allOf(withId(Elements_Main.ID_CONTAINER_NEWS),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(matches(withText(Data_Main.TEXT_ALL_NEWS)));
    }

//    @Step("экран Main / проверяем отображение icon SubTitle Claims")
//    public void checkIconClaims_Visibility() {
//        onView(allOf(withText(Data_Main.TEXT_CLAIMS),
//                withParent(withParent(withId(Elements_Main.ID_CONTAINER_CLAIMS))),
//                isDisplayed()))
//                .check(matches(withText(Data_Main.TEXT_CLAIMS)));
//    }
//
//    @Step("экран Main / проверяем отображение icon SubTitle All Claims")
//    public void checkIconAllClaims_Visibility() {
//        onView(allOf(withId(Elements_Main.ID_ALL_CLAIMS),
//                withText(Data_Main.TEXT_ALL_CLAIMS),
//                withParent(allOf(withId(Elements_Main.ID_CONTAINER_CLAIMS),
//                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
//                isDisplayed()))
//                .check(matches(withText(Data_Main.TEXT_ALL_CLAIMS)));
//    }

//    @Step("экран Main / проверяем отображение button Add New Claim")
//    public void checkButtonAddNewClaim_Visibility() {
//        onView(allOf(withId(Elements_Main.ID_BUTTON_ADD_NEW_CLAIM),
//                withContentDescription(Data_Main.TEXT_ADD_NEW_CLAIM),
//                withParent(withParent(withId(Elements_Main.ID_CONTAINER_CLAIMS))),
//                isDisplayed()))
//                .check(matches(isDisplayed()));
//    }

    //    @Step("экран Main / проверяем отображение button expend Claim card")
//    public void checkButtonExpendClaim_Visibility() {
//        onView(allOf(withId(Elements_Main.ID_BUTTON_EXPEND),
//                withParent(withParent(withId(Elements_Main.ID_CONTAINER_CLAIMS))),
//                isDisplayed()))
//                .check(matches(isDisplayed()));
//    }
    public void checkButtonExpendNews_Visibility() {
        Allure.step("экран Main / проверяем отображение button expend News card");
        onView(allOf(withId(Elements_Main.ID_BUTTON_EXPEND),
                withParent(withParent(withId(Elements_Main.ID_CONTAINER_NEWS))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }
}