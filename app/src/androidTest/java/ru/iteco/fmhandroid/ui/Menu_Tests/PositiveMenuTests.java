package ru.iteco.fmhandroid.ui.Menu_Tests;

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
import io.qameta.allure.kotlin.junit4.Tag;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_About;
//import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Claims;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Main;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Menu;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_News;
import ru.iteco.fmhandroid.ui.PageObject.Utils_About;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Menu;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class PositiveMenuTests {
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
    @DisplayName("Positive test. Test-case # 4")
    @Description("Тестирование навигации в MENU")
    @Tag("BUG / Строка \"About\" НЕ активна, если вызвать Menu когда пользователь находится на экране News")
    public void navigationMenuTest() {
        new CheckUtils_Main().checkIconMenu_Visibility();
        new Utils_Menu().clickButtonMenu();
        new CheckUtils_Menu().checkLineMain_Visibility();
        new CheckUtils_Menu().checkLineNews_Visibility();
//        new CheckUtils_Menu().checkLineClaims_Visibility();
        new CheckUtils_Menu().checkLineAbout_Visibility();
//        new Utils_Menu().clickLineClaims();
//        new CheckUtils_Claims().checkTitleClaims_Visibility();
//        new Utils_Menu().clickButtonMenu();
        new Utils_Menu().clickLineNews();
        new CheckUtils_News().checkTitleNewsView_Visibility();
        new Utils_Menu().clickButtonMenu();
        new Utils_Menu().clickLineMain();
        new Utils_Menu().clickButtonMenu();
        new Utils_Menu().clickLineAbout();
        new CheckUtils_About().checkTitleAbout_Visibility();
        new Utils_About().clickButtonBackAboutView();
    }
}


