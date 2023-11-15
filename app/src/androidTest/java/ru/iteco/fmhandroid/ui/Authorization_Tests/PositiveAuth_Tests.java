package ru.iteco.fmhandroid.ui.Authorization_Tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Main;
import ru.iteco.fmhandroid.ui.PageObject.Summary_Methods_Main;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Helper;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class PositiveAuth_Tests {

    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);

    // работает 14.11.23
    @Test
    @DisplayName("Positive test. Test-case # 1 / Тестирование авторизации с валидными тестовыми данными")
    public void validAuthorizationTest() {
        new Utils_Helper().timerWaitingAsyncOperation5000();
        new CheckUtils_Auth().checkTitleAuthView_Visibility();
        new CheckUtils_Auth().checkFieldLoginAuthView_Visibility();
        new CheckUtils_Auth().checkFieldPasswordAuthView_Visibility();
        new CheckUtils_Auth().checkButtonSignInAuthView_Visibility();
        new Utils_Auth().inputValidLogin();
        new Utils_Auth().inputValidPassword();
        new Utils_Auth().clickButtonSignIn();
        new Utils_Helper().timerWaitingAsyncOperation3000();
        new CheckUtils_Main().checkIconTradeMark_Visibility();
        new Utils_Helper().timerWaitingAsyncOperation3000();
        new Utils_Auth().logOut();
    }

    // работает 14.11.23
    @Test
    @DisplayName("Positive test. Test-case # 3 / Тестирование UI на экране Main")
    public void viewMainTest() {
        new Utils_Helper().timerWaitingAsyncOperation5000();
        new CheckUtils_Auth().checkTitleAuthView_Visibility();
        new CheckUtils_Auth().checkFieldLoginAuthView_Visibility();
        new CheckUtils_Auth().checkFieldPasswordAuthView_Visibility();
        new CheckUtils_Auth().checkButtonSignInAuthView_Visibility();
        new Utils_Auth().inputValidLogin();
        new Utils_Auth().inputValidPassword();
        new Utils_Auth().clickButtonSignIn();
        new Utils_Helper().timerWaitingAsyncOperation5000();
        new Summary_Methods_Main().checkAllIconsVisibilityOnMainPage();
        new Utils_Auth().logOut();
    }
}
