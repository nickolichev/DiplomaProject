package ru.iteco.fmhandroid.ui.OurMission_Tests;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_OurMission;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_OurMission;

public class PositiveOurMissionTests {
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
    @DisplayName("Positive test. Test-case # 30")
    @Description("Проверить функционал  и UI страницы \"Love is all\"")
    public void viewOurMissionTest() {
        new Utils_OurMission().clickIconOurMission();
        new CheckUtils_OurMission().checkTitleView_Visibility();
        // 1-я карточка
        new CheckUtils_OurMission().checkTitleCard_1_Visibility();
        new Utils_OurMission().expendCard_1();
        new CheckUtils_OurMission().checkDescriptionCard_1_Visibility();
        new Utils_OurMission().expendCard_1();
        // 2-я карточка
        new CheckUtils_OurMission().checkTitleCard_2_Visibility();
        new Utils_OurMission().expendCard_2();
        new CheckUtils_OurMission().checkDescriptionCard_2_Visibility();
        new Utils_OurMission().expendCard_2();
        // 3-я карточка
        new CheckUtils_OurMission().checkTitleCard_3_Visibility();
        new Utils_OurMission().expendCard_3();
        new CheckUtils_OurMission().checkDescriptionCard_3_Visibility();
        new Utils_OurMission().expendCard_3();
        // 4-я карточка
        new CheckUtils_OurMission().checkTitleCard_4_Visibility();
        new Utils_OurMission().expendCard_4();
        new CheckUtils_OurMission().checkDescriptionCard_4_Visibility();
        new Utils_OurMission().expendCard_4();
        // 5-я карточка
        new CheckUtils_OurMission().checkTitleCard_5_Visibility();
        new Utils_OurMission().expendCard_5();
        new CheckUtils_OurMission().checkDescriptionCard_5_Visibility();
        new Utils_OurMission().expendCard_5();
        // 6-я карточка
        new Utils_OurMission().swipeUp();
        new CheckUtils_OurMission().checkTitleCard_6_Visibility();
        new Utils_OurMission().expendCard_6();
        new CheckUtils_OurMission().checkDescriptionCard_6_Visibility();
        new Utils_OurMission().expendCard_6();
        // 7-я карточка
        new CheckUtils_OurMission().checkTitleCard_7_Visibility();
        new Utils_OurMission().expendCard_7();
        new CheckUtils_OurMission().checkDescriptionCard_7_Visibility();
        new Utils_OurMission().expendCard_7();
        // 8-я карточка
        new CheckUtils_OurMission().checkTitleCard_8_Visibility();
        new Utils_OurMission().expendCard_8();
        new Utils_OurMission().swipeUp();
        new CheckUtils_OurMission().checkDescriptionCard_8_Visibility();
        new Utils_OurMission().expendCard_8();
    }
}
