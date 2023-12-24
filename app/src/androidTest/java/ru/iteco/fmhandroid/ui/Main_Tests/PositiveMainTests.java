package ru.iteco.fmhandroid.ui.Main_Tests;

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
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Main;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class PositiveMainTests {

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
    @DisplayName("Positive test. Test-case # 3")
    @Description("Тестирование UI на экране Main")
    public void viewMainTest() {
        new CheckUtils_Main().checkIconMenu_Visibility();
        new CheckUtils_Main().checkIconTradeMark_Visibility();
        new CheckUtils_Main().checkIconButterFly_Visibility();
        new CheckUtils_Main().checkIconNews_Visibility();
        new CheckUtils_Main().checkIconAllNews_Visibility();
        new CheckUtils_Main().checkButtonExpendNews_Visibility();
//        new CheckUtils_Main().checkIconClaims_Visibility();
//        new CheckUtils_Main().checkIconAllClaims_Visibility();
//        new CheckUtils_Main().checkButtonAddNewClaim_Visibility();
//        new CheckUtils_Main().checkButtonExpendClaim_Visibility();
        new CheckUtils_Main().checkIconLogOut_Visibility();
    }
}
