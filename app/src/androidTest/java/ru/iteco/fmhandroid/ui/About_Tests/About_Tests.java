package ru.iteco.fmhandroid.ui.About_Tests;

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
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_About;
import ru.iteco.fmhandroid.ui.PageObject.Utils_About;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Helper;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Menu;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class About_Tests {
    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void startUp() {

        new Utils_Helper().timerWaitingAsyncOperation3000();
        new Utils_Auth().authorizationUtility();
        new Utils_Helper().timerWaitingAsyncOperation3000();
    }

    @After
    public void logOut() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        new Utils_Auth().logOutUtility();
    }

    @Test
    @DisplayName("Positive test. Test-case # 28 / Тестирование отображения элементов и функциональности на экране About")
    public void viewAboutTest() {
        new Utils_Menu().clickButtonMenu();
        new Utils_Menu().clickButtonAbout();
        new CheckUtils_About().checkTitleAbout_Visibility();
        new CheckUtils_About().checkVersionValueVisibility();
        new CheckUtils_About().checkPrivacyPolicyVisibility();
        new CheckUtils_About().checkTermsOfUseVisibility();
        new Utils_About().clickPrivacyPolicy();
        new Utils_About().returnFromBrowserToApp();
        new Utils_About().clickTermsOfUse();
        new Utils_About().returnFromBrowserToApp();
        new Utils_About().clickButtonBackAboutUtility();
    }
}


