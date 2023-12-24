package ru.iteco.fmhandroid.ui.About_Tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_About;
import ru.iteco.fmhandroid.ui.PageObject.Utils_About;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Menu;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AboutTests {
    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void startUp() {
        new Utils_Auth().authorizationUtility();
    }

    @After
    public void logOut() {
        new Utils_Auth().logOutUtility();
    }

    @Test
    @DisplayName("Positive test. Test-case # 29")
    @Description("Тестирование отображения элементов и функциональности на экране About")
    public void viewAboutTest() {
        new Utils_Menu().clickButtonMenu();
        new Utils_Menu().clickLineAbout();
        new CheckUtils_About().checkTitleAbout_Visibility();
        new CheckUtils_About().checkVersionValue_Visibility();
        new CheckUtils_About().checkPrivacyPolicy_Visibility();
        new CheckUtils_About().checkTermsOfUse_Visibility();
        new Utils_About().clickPrivacyPolicy();
        new Utils_About().returnFromBrowserToApp();
        new Utils_About().clickTermsOfUse();
        new Utils_About().returnFromBrowserToApp();
        new Utils_About().clickButtonBackAboutView();
    }
}


