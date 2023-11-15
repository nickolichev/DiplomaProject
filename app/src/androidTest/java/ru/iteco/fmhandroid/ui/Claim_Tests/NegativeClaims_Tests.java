package ru.iteco.fmhandroid.ui.Claim_Tests;

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
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Claims;
import ru.iteco.fmhandroid.ui.PageObject.Summary_Methods_Claims;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Claims;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Helper;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Menu;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class NegativeClaims_Tests {
    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void startUp() {
        new Utils_Helper().timerWaitingAsyncOperation3000();
        new Utils_Auth().authorizationUtility();
        new Utils_Helper().timerWaitingAsyncOperation3000();
        new Utils_Menu().buttonMenu();
        new Utils_Menu().buttonClaims();
        new CheckUtils_Claims().checkTitleClaims_Visibility();

    }

    @After
    public void logOut() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        new Utils_Auth().logOutUtility();
    }

    // работает 14.11.23
    @Test
    @DisplayName("Negative test. test-case # 13 / Попытка создать Claim с незаполненными полями Title, Date, Time, Description")
    public void creatingClaimWithEmptyFieldsTest() {
        new Utils_Claims().clickCreateClaim();
        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
        // оставляем пустым поле Title
        new Utils_Claims().selectExecutorClaim();
        new Utils_Claims().inputValidDate();
        new Utils_Claims().inputValidTime();
        new Utils_Claims().inputTestDataInDescription_7();
        new Utils_Claims().clickButtonSaveNewClaim();
        new CheckUtils_Claims().checkModalViewWarningText_Visibility();
        new CheckUtils_Claims().checkModalViewWarningButtonOk_Visibility();
        new Utils_Claims().clickButtonOkInModalViewWarning();
        new CheckUtils_Claims().checkIconEmptyField_Visibility();
        new CheckUtils_Claims().checkTestDataExecutor_Visibility();
        new CheckUtils_Claims().checkTestDataDate_Visibility();
        new CheckUtils_Claims().checkTestDataTime_Visibility();
        new CheckUtils_Claims().checkTestDataDescription_Visibility();
        // оставляем пустым поле Date
        new Utils_Claims().inputTitleNewClaim_7();
        new Utils_Claims().clearDateField_CreateNews();
        new Utils_Claims().clickButtonSaveNewClaim();
        new Utils_Claims().clickButtonOkInModalViewWarning();
        new CheckUtils_Claims().checkTestDataTitle_Visibility();
        new CheckUtils_Claims().checkTestDataExecutor_Visibility();
        new CheckUtils_Claims().checkIconEmptyField_Visibility();
        new CheckUtils_Claims().checkTestDataTime_Visibility();
        new CheckUtils_Claims().checkTestDataDescription_Visibility();
        // оставляем пустым поле Time
        new Utils_Claims().inputValidDate();
        new Utils_Claims().clearTimeField_CreateNews();
        new Utils_Claims().clickButtonSaveNewClaim();
        new Utils_Claims().clickButtonOkInModalViewWarning();
        new CheckUtils_Claims().checkTestDataTitle_Visibility();
        new CheckUtils_Claims().checkTestDataExecutor_Visibility();
        new CheckUtils_Claims().checkTestDataDate_Visibility();
        new CheckUtils_Claims().checkIconEmptyField_Visibility();
        new CheckUtils_Claims().checkTestDataDescription_Visibility();
        // оставляем пустым поле Description
        new Utils_Claims().inputValidTime();
        new Utils_Claims().clearDescriptionField_CreateNews();
        new Utils_Claims().clickButtonSaveNewClaim();
        new Utils_Claims().clickButtonOkInModalViewWarning();
        new CheckUtils_Claims().checkTestDataTitle_Visibility();
        new CheckUtils_Claims().checkTestDataExecutor_Visibility();
        new CheckUtils_Claims().checkTestDataDate_Visibility();
        new CheckUtils_Claims().checkTestDataTime_Visibility();
        new CheckUtils_Claims().checkIconEmptyField_Visibility();
        // заполняем пустое поле Description
        new Utils_Claims().inputTestDataInDescription_7();
        // отменяем создание Claim
        new Utils_Claims().clickButtonCancelNewClaim();
        new Utils_Claims().clickInModalViewButtonOk();
        new CheckUtils_Claims().checkTitleClaims_Visibility();
    }

    // работает 14.11.23
    @Test
    @DisplayName("Negative test. test-case # 11 / Попытка создать Claim с невалидными тестовыми данными Title (>50 знаков)")
    public void creatingClaimWithInvalidTitleTest() {
        Utils_Claims utilsClaims = new Utils_Claims();
        new Utils_Claims().clickCreateClaim();
        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
        // вставляем Title длиной в 51 знак
        new Utils_Claims().inputInvalidTitleNewClaim();
        // проверяем, что количество знаков в поле Title осталось = 50
        int characterCount = utilsClaims.updateCharacterCount();
        new CheckUtils_Claims().checkCounterValue_Visibility(characterCount);
        // проверка Title, который содержит на 1 знак меньше введенного при создании
        new CheckUtils_Claims().checkTestInvalidDataTitle_Visibility();
        new Utils_Claims().clickButtonCancelNewClaim();
        new CheckUtils_Claims().checkModalViewQuestionText_Visibility();
        new CheckUtils_Claims().checkModalViewQuestionButtonCancel_Visibility();
        new CheckUtils_Claims().checkModalViewQuestionButtonOk_Visibility();
        new Utils_Claims().clickInModalViewButtonOk();
    }
}
