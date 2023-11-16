package ru.iteco.fmhandroid.ui.Menu_Tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_About;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Claims;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Main;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Menu;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_News;
import ru.iteco.fmhandroid.ui.PageObject.Utils_About;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Helper;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Menu;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class PositiveMenu_Tests {
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

    // работает 14.11.23
    @Test
    @DisplayName("Positive test. Test-case # 4 / Навигация в MENU")
    public void navigationMenuTest() {
        new CheckUtils_Main().checkIconMenu_Visibility();
        new Utils_Menu().clickButtonMenu();
        new CheckUtils_Menu().checkLineVisibilityNews();
        new CheckUtils_Menu().checkLineVisibilityClaims();
        new CheckUtils_Menu().checkLineVisibilityAbout();
        new Utils_Menu().clickButtonClaims();
        new CheckUtils_Claims().checkTitleClaims_Visibility();
        new Utils_Menu().clickButtonMenu();
        new Utils_Menu().clickButtonNews();
        new CheckUtils_News().checkTitleNews_Visibility();
        new Utils_Menu().clickButtonMenu();
        new Utils_Menu().clickButtonAbout();
        new CheckUtils_About().checkTitleAbout_Visibility();
        new Utils_About().clickButtonBackAboutUtility();
    }
}


