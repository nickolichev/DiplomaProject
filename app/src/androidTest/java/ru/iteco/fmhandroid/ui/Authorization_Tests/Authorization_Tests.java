package ru.iteco.fmhandroid.ui.Authorization_Tests;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.Summary_Methods_Main;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Helper;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Authorization_Tests {
//    CardIdlingResource cardIdlingResource = new CardIdlingResource();

    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void registerIdlingResources() {
//        IdlingRegistry.getInstance().register(ProjectIdlingResources.idlingResource);
        new Utils_Helper().timerWaitingAsyncOperation3000();
        try {
            new Utils_Auth().checkTitleOnAuthView();
        } catch (NoMatchingViewException e) {
            new Utils_Auth().logOut();
        }
    }

    @After
    public void unregisterIdlingResources() {
//        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
        new Utils_Auth().logOutUtility();
    }

    @Test
    @DisplayName("Positive test. Тестирование авторизации с валидными тестовыми данными")
    public void validAuthorizationTest() {
        new Utils_Auth().checkTitleOnAuthView();
        new Utils_Auth().inputValidLogin();
        new Utils_Auth().inputValidPassword();
        new Utils_Auth().buttonSignIn();
        new Summary_Methods_Main().checkAllIconsVisibilityOnMainPage();
        new Utils_Helper().timerWaitingAsyncOperation3000();
        new Utils_Auth().logOut();
    }

    @Test
    @DisplayName("Negative test. Тестирование авторизации с НЕвалидными тестовыми данными")
    public void invalidAuthorizationTest() {

        new Utils_Auth().checkTitleOnAuthView();
        new Utils_Auth().inputInvalidLogin();
        new Utils_Auth().inputInvalidPassword();
        new Utils_Auth().buttonSignIn();
        new Utils_Auth().checkTitleOnAuthView();
    }

    @Test
    @DisplayName("Negative test. Тестирование авторизации с НЕвалидными тестовыми данными EMPTY")
    public void emptyAuthorizationTest() {
        new Utils_Auth().checkTitleOnAuthView();
        new Utils_Auth().inputEmptyLogin();
        new Utils_Auth().inputEmptyPassword();
        new Utils_Auth().buttonSignIn();
        new Utils_Auth().checkTitleOnAuthView();
    }
}
