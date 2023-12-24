package ru.iteco.fmhandroid.ui.Authorization_Tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.junit4.DisplayName;
import io.qameta.allure.kotlin.junit4.Tag;
import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Main;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Helper;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class NegativeAuthTests {
    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);
    ProjectIdlingResources idlingResource = new ProjectIdlingResources();

    @Test
    @DisplayName("Negative test. Test-case # 2")
    @Description("Тестирование авторизации с вводом НЕвалидных тестовых данных + Cyrillic + Empty ")
    @Tag("BUG / При вводе НЕвалидных данных login3 и password3 выполняется авторизация и переход на экран Main")
    public void invalidAuthorizationTest() {
        new Utils_Helper().timerWaitingAsyncOperation3000();
        new CheckUtils_Auth().checkTitleAuthView_Visibility();
        new Utils_Auth().inputInvalidLogin();
        new Utils_Auth().inputInvalidPassword();
        new Utils_Helper().startTimer(idlingResource);
        new Utils_Auth().clickButtonSignIn();
        new Utils_Helper().endTimerAndSleep(idlingResource);
        new CheckUtils_Main().checkIconTradeMark_Visibility();
        // методы, необходимые при отсутствии BUG
//        new CheckUtils_Auth().checkTitleAuthView_Visibility();
//        new Utils_Auth().clearFieldLogin();
//        new Utils_Auth().clearFieldPassword();
        new Utils_Auth().logOutUtility();
        new Utils_Auth().inputInvalidCyrillicLogin();
        new Utils_Auth().inputInvalidCyrillicPassword();
        new Utils_Helper().startTimer(idlingResource);
        new Utils_Auth().clickButtonSignIn();
        new Utils_Helper().endTimerAndSleep(idlingResource);
        new CheckUtils_Auth().checkTitleAuthView_Visibility();
        new Utils_Auth().clearFieldLogin();
        new Utils_Auth().clearFieldPassword();
        new Utils_Helper().startTimer(idlingResource);
        new Utils_Auth().clickButtonSignIn();
        new Utils_Helper().endTimerAndSleep(idlingResource);
        new CheckUtils_Auth().checkTitleAuthView_Visibility();
    }
}
