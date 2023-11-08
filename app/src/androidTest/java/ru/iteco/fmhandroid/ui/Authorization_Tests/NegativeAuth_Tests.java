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
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Helper;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class NegativeAuth_Tests {
    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);
    // работает 05.11.23
    @Test
    @DisplayName("Negative test. Test-case # 2 / Тестирование авторизации с вводом НЕвалидных тестовых данных + Empty ")
    public void invalidAuthorizationTest() {
        new Utils_Helper().timerWaitingAsyncOperation5000();
        new CheckUtils_Auth().checkTitleAuthView_Visibility();
        new Utils_Auth().inputInvalidLogin();
        new Utils_Auth().inputInvalidPassword();
        new Utils_Auth().clickButtonSignIn();
        new CheckUtils_Auth().checkTitleAuthView_Visibility();
        new Utils_Helper().timerWaitingAsyncOperation5000();
        new Utils_Auth().clearFieldLogin();
        new Utils_Auth().clearFieldPassword();
        new Utils_Auth().clickButtonSignIn();
        new CheckUtils_Auth().checkTitleAuthView_Visibility();
    }
}
