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
public class PositiveClaims_Tests {
    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void startUp() {
        new Utils_Helper().timerWaitingAsyncOperation3000();
        new Utils_Auth().authorizationUtility();
        new Utils_Helper().timerWaitingAsyncOperation2000();
        new Utils_Menu().clickButtonMenu();
        new Utils_Menu().clickButtonClaims();
        new CheckUtils_Claims().checkTitleClaims_Visibility();
    }

    @After
    public void logOut() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        new Utils_Auth().logOutUtility();
    }

    @Test
    @DisplayName("Positive test. Test-case # 5 / Фильтрация Claims по статусам Open + InProgress + Executed + Cancelled")
    public void filteringClaimsByStatusTest() {
        // фильтрация по статусу Open
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().clickExpendClaim();
        new CheckUtils_Claims().checkOpenStatusInCard();
        new Utils_Claims().clickCloseClaim();
        // фильтрация по статусу InProgress
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_Open();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().clickExpendClaim();
        new CheckUtils_Claims().checkInProgressStatusInCard();
        new Utils_Claims().clickCloseClaim();
        // фильтрация по статусу Executed
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickCheckBox_Executed();
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().clickExpendClaim();
        new CheckUtils_Claims().checkExecutedStatus();
        new Utils_Claims().clickCloseClaim();
        // фильтрация по статусу Cancelled
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_Executed();
        new Utils_Claims().clickCheckBox_Cancelled();
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().clickExpendClaim();
        new CheckUtils_Claims().checkCanceledStatus();
        new Utils_Helper().backSystemButton();
    }

    @Test
    @DisplayName("Positive test. Test-case # 15 / Тестирование отмены процесса создания Claim")
    public void cancellationProcessCreatingClaimsTest() {
        new Utils_Claims().clickCreateClaim();
        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
        new Utils_Claims().inputTestDataInTitleNewClaim();
        new Utils_Claims().selectExecutorClaim();
        new Utils_Claims().inputValidDate();
        new Utils_Claims().inputValidTime();
        new Utils_Claims().inputTestDataInDescription_7();
        new Utils_Claims().clickButtonCancelNewClaim();
        new CheckUtils_Claims().checkModalViewQuestionText_Visibility();
        new CheckUtils_Claims().checkModalViewQuestionButtonCancel_Visibility();
        new CheckUtils_Claims().checkModalViewQuestionButtonOk_Visibility();
        new Utils_Claims().clickInModalViewButtonCancel();
        new CheckUtils_Claims().checkButtonCancel_Visibility();
        new Utils_Claims().clickButtonCancelNewClaim();
        new Utils_Claims().clickInModalViewButtonOk();
        new CheckUtils_Claims().checkTitleClaims_Visibility();
    }

    @Test
    @DisplayName("Positive test. / BUG / Test-case # 7 / Создание новой претензии со статусом \"Open\" (Испольнитель не определен) + перевод в статус \"IN PROGRESS\" через \"take to work\" + добавление комментария + редактирование комментария.")
    public void createNewClaimInOpenStatus_7_Test() {
        new Summary_Methods_Claims().creatingClaimOpenWithoutExecutor();
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().searchAndOpenClaimByTopic_7();
        new Summary_Methods_Claims().checkVisibilityInNewClaimWithOpenStatus_7();
        new Utils_Claims().clickAddComment();
        new CheckUtils_Claims().checkFieldComment_Visibility();
        new CheckUtils_Claims().checkButtonSaveComment();
        new CheckUtils_Claims().checkButtonCancelComment();
        new Utils_Claims().inputComment_7();
        new Utils_Claims().clickCancelComment();
        new CheckUtils_Claims().checkFieldComment_NotVisibility();
        new Utils_Claims().clickAddComment();
        new Utils_Claims().inputComment_7();
        new Utils_Claims().clickSaveComment();
        new Utils_Claims().searchComment_7_ByContent();
        new CheckUtils_Claims().checkAuthorComment_Visibility_7();
        new Utils_Claims().clickChangeStatusClaim();
        new Utils_Claims().clickChangeStatusTakeToWork();
        new CheckUtils_Claims().checkInProgressStatusInCard();
        new CheckUtils_Claims().checkDefinedExecutor_Visibility();
        new Utils_Claims().clickCloseClaim();
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_Open();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().searchAndOpenClaimByTopic_7();
        new Summary_Methods_Claims().checkVisibilityInNewClaimWithInProgressStatus_7();
        new Utils_Claims().clickIconEditComment();
        new CheckUtils_Claims().checkComment_7_Visibility();
        new CheckUtils_Claims().checkButtonSave_EditComment_Visibility();
        new CheckUtils_Claims().checkButtonCancel_EditComment_Visibility();
        new Utils_Claims().inputEditComment_7();
        new CheckUtils_Claims().checkEditComment_7_Visibility();
        new Utils_Claims().clickSaveComment();
        new Utils_Claims().searchComment_7_EditByContent();
        new Utils_Claims().clickCloseClaim();
    }

    @Test
    @DisplayName("Positive test. Test-case # 8 / Проверить функционал \"Создание новой претензии\" со статусом \"Open\" (Испольнитель не определен) + Редактирование Claim (с проверкой количества знаков в Title)+ перевод в статус \"IN PROGRESS\" через указание Executor на экране \"Editing claims\".")
    public void createNewClaimOpenStatusAndTransferInProgress_8_Test() {
        Utils_Claims utilsClaims = new Utils_Claims();
        new Utils_Claims().clickCreateClaim();
        // проверяем незаполненные поля формы + счетчик поля Title + создаем New Claim
        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
        new Summary_Methods_Claims().creatingClaimOpenStatus_8();
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_InProgress();
//        new Utils_Claims().clickCheckBox_Open(); // временно
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().searchAndOpenClaimByTopic_8();
        new Summary_Methods_Claims().checkVisibilityInNewClaimWithOpenStatus_8();
        // редактируем Title
        new Utils_Claims().clickEditClaim();
        new Summary_Methods_Claims().checkAllFieldsAndButtonsViewEditingClaims_Visibility();
        new Utils_Claims().clearTitleClaim_8();
        new Utils_Claims().inputTitleEditingClaim_8();
        int characterCount = utilsClaims.updateCharacterCount();
        // проверяем количество знаков в поле Title
        new CheckUtils_Claims().checkCounterValue_Visibility(characterCount);
        // редактируем Description
        new Utils_Claims().clearDescriptionClaim_8();
        new Utils_Claims().inputDescriptionEditingClaim_8();
        new Utils_Claims().clickButtonSaveNewClaim();
        new Utils_Claims().clickCloseClaim();
        // находим, открываем, проверяем отредактированную карточку
        new Utils_Claims().searchAndOpenClaimAfterEditing_8();
        new Summary_Methods_Claims().checkVisibilityInEditingClaimWithOpenStatus_8();
        // переводим в статус In Progress
        new Utils_Claims().clickEditClaim();
        new Utils_Claims().selectExecutorClaim();
        new Utils_Claims().clickButtonSaveNewClaim();
        new CheckUtils_Claims().checkDefinedExecutor_Visibility();
        new CheckUtils_Claims().checkInProgressStatusInCard();
        new Utils_Claims().clickCloseClaim();
    }

    @Test
    @DisplayName("Positive test. Test-case # 9 / Проверить функционал \"Создание новой претензии\" со статусом \"In Progress\" + Смена статуса  \"In progress\" на \"Open\" через \"Throw off + Смена статуса \"Open\" на \"Cancelled\" через \"Cancel")
    public void createNewClaimInProgressStatusAndTransferOpenAndTransferCancelled_9_Test() {
        new Summary_Methods_Claims().checkVisibilityInClaimWithInProgressStatus();
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_Open();
//        new Utils_Claims().clickCheckBox_InProgress(); // временно
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().searchAndOpenClaimByTopic_9();
        new Summary_Methods_Claims().checkVisibilityInClaimCardWithInProgressStatus();
        // клик на смену статуса
        new Utils_Claims().clickChangeStatusClaim();
        new Utils_Claims().clickChangeStatusThrowOff();
        new CheckUtils_Claims().checkModalViewComment_FieldComment_Visibility();
        new CheckUtils_Claims().checkModalViewComment_ButtonCancel_Visibility();
        new CheckUtils_Claims().checkModalViewComment_ButtonOK_Visibility();
        // вводим тестовые данные в поле Comment
        new Utils_Claims().inputComment_Open_ModalView();
        // отменяем ввод тестовых данных в поле Comment
        new Utils_Claims().clickCancel_ModalViewComment();
        // повторно клик на смену статуса
        new Utils_Claims().clickChangeStatusClaim();
        new Utils_Claims().clickChangeStatusThrowOff();
        // повторно вводим тестовые данные в поле Comment
        new Utils_Claims().inputComment_Open_ModalView();
        new Utils_Claims().clickOK_ModalViewComment();
        new CheckUtils_Claims().checkComment_9_Visibility();
        new Summary_Methods_Claims().checkVisibilityInClaimCardWithOpenStatus_9();
        // меняем статус на Cancelled
        new Utils_Claims().clickChangeStatusClaim();
        new Utils_Claims().clickChangeStatusCancel();
        new CheckUtils_Claims().checkCanceledStatus();
        new Utils_Claims().clickCloseClaim();
    }

    @Test
    @DisplayName("Positive test. Test-case # 10 / Проверить функционал \"Создание новой претензии\" со статусом \"In Progress\" + Смена статуса  \"In progress\" на \"Open\" через \"Throw off + Смена статуса \"Open\" на \"Cancelled\" через \"Cancel")
    public void createNewClaimInProgressStatusAndTransferExecuted_10_Test() {
        new Summary_Methods_Claims().checkVisibilityInClaimWithInProgressStatus();
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_Open();
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().searchAndOpenClaimByTopic_9();
        new Summary_Methods_Claims().checkVisibilityInClaimCardWithInProgressStatus();
        // клик на смену статуса
        new Utils_Claims().clickChangeStatusClaim();
        new Utils_Claims().clickChangeStatusToExecute();
        new CheckUtils_Claims().checkModalViewComment_FieldComment_Visibility();
        new CheckUtils_Claims().checkModalViewComment_ButtonCancel_Visibility();
        new CheckUtils_Claims().checkModalViewComment_ButtonOK_Visibility();
        // вводим тестовые данные в поле Comment
        new Utils_Claims().inputComment_Executed_ModalView();
        // отменяем ввод тестовых данных в поле Comment
        new Utils_Claims().clickCancel_ModalViewComment();
        // повторно клик на смену статуса
        new Utils_Claims().clickChangeStatusClaim();
        new Utils_Claims().clickChangeStatusToExecute();
        // повторно вводим тестовые данные в поле Comment
        new Utils_Claims().inputComment_Executed_ModalView();
        new Utils_Claims().clickOK_ModalViewComment();
        new CheckUtils_Claims().checkComment_10_Visibility();
        new Summary_Methods_Claims().checkVisibilityInClaimCardWithExecutedStatus_10();
        new Utils_Claims().clickCloseClaim();
    }
}
