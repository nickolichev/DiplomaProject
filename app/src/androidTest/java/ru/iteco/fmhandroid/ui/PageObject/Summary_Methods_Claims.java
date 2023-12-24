//package ru.iteco.fmhandroid.ui.PageObject;
//
//import io.qameta.allure.kotlin.Step;
//
//public class Summary_Methods_Claims {
//
//    @Step("Сводный метод проверок видимости НЕзаполненных полей на экране Creating Claims")
//    public void checkAllFieldsAndButtons_Visibility() {
//        new Utils_Helper().timerWaitingAsyncOperation1000();
//        Utils_Claims utilsClaims = new Utils_Claims();
//        new CheckUtils_Claims().checkTitleAppBar();
//        new CheckUtils_Claims().checkFieldTitle_Visibility();
//        new CheckUtils_Claims().checkCharactersEntered_Visibility();
//        int characterCount = utilsClaims.updateCharacterCount();
//        new CheckUtils_Claims().checkCounterValue_Visibility(characterCount);
//        new CheckUtils_Claims().checkFieldExecutor_Visibility();
//        new CheckUtils_Claims().checkIconFieldExecutor_Visibility();
//        new CheckUtils_Claims().checkFieldDate_Visibility();
//        new CheckUtils_Claims().checkFieldTime_Visibility();
//        new CheckUtils_Claims().checkFieldDescription_Visibility();
//        new CheckUtils_Claims().checkButtonSave_Visibility();
//        new CheckUtils_Claims().checkButtonCancel_Visibility();
//    }
//    @Step("test-case #7 / экран CREATING CLAIM / Сводный метод создания Claim в статусе Open без исполнителя + без Comment")
//    public void creatingClaimOpenWithoutExecutor() {
//        new Utils_Claims().clickCreateClaim();
//        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
//        new Utils_Claims().inputTitleNewClaim_7();
//        new Utils_Claims().inputValidDate();
//        new Utils_Claims().inputValidTime();
//        new Utils_Claims().inputDescription_7();
//        new CheckUtils_Claims().checkButtonSave_Visibility();
//        new Utils_Claims().clickButtonSaveNewClaim();
//    }
//
//    @Step("test-case #7 Сводный метод проверок ПОСЛЕ создания Claim в развернутой карточке Claim")
//    public void checkVisibilityInNewClaimWithOpenStatus_7() {
//        new CheckUtils_Claims().checkTitle_7_Visibility();
//        new CheckUtils_Claims().checkIndefinedExecutor_Visibility();
//        new CheckUtils_Claims().checkValidPlanDate_Visibility();
//        new CheckUtils_Claims().checkOpenStatusInCard();
//        new CheckUtils_Claims().checkDescription_7_Visibility();
//        new CheckUtils_Claims().checkAuthor_Visibility();
//        new CheckUtils_Claims().checkCreatedDateDescription_Visibility();
//        new CheckUtils_Claims().checkAddComment_Visibility();
//        new CheckUtils_Claims().checkButtonChangeStatus_Visibility();
//        new CheckUtils_Claims().checkEnableStateButtonChangeStatus();
//        new Utils_Helper().backSystemButton();
//        new Utils_Claims().clickIconChangeStatusClaim();
//        new CheckUtils_Claims().checkButtonTakeToWorkStatus_Visibility();
//        new CheckUtils_Claims().checkButtonCancelStatus_Visibility();
//        new Utils_Helper().backSystemButton();
//        new CheckUtils_Claims().checkIconEditCard_Visibility();
//        new CheckUtils_Claims().checkButtonClose_Visibility();
//    }
//
//    @Step("test-case #7 Сводный метод проверок в развернутой карточке Claim ПОСЛЕ создания Comment ")
//    public void checkVisibilityInNewClaimWithInProgressStatus_7() {
//        new Utils_Helper().timerWaitingAsyncOperation1000();
//        new CheckUtils_Claims().checkTitle_7_Visibility();
//        new CheckUtils_Claims().checkDefinedExecutor_Visibility();
//        new CheckUtils_Claims().checkValidPlanDate_Visibility();
//        new CheckUtils_Claims().checkInProgressStatusInCard();
//        new CheckUtils_Claims().checkDescription_7_Visibility();
//        new CheckUtils_Claims().checkAuthor_Visibility();
//        new Utils_Claims().searchComment_7_ByContent();
//        new CheckUtils_Claims().checkAuthorComment_Visibility_7();
//        new CheckUtils_Claims().checkCreatedDateComment_Visibility();
//        new CheckUtils_Claims().checkAddComment_Visibility();
//        new CheckUtils_Claims().checkButtonChangeStatus_Visibility();
//        new CheckUtils_Claims().checkEnableStateButtonChangeStatus();
//        new Utils_Helper().backSystemButton();
//        new Utils_Claims().clickIconChangeStatusClaim();
//        new CheckUtils_Claims().checkButtonThrowOffStatus_Visibility();
//        new CheckUtils_Claims().checkButtonToExecuteStatus_Visibility();
//        new Utils_Helper().backSystemButton();
//        new CheckUtils_Claims().checkIconEditCard_Disable();
//    }
//
//    @Step("test-case #8 / Сводный метод проверок ПОСЛЕ создания Claim в развернутой карточке Claim")
//    public void checkVisibilityInNewClaimWithOpenStatus_8() {
//        new CheckUtils_Claims().checkTitle_8_Visibility();
//        new CheckUtils_Claims().checkIndefinedExecutor_Visibility();
//        new CheckUtils_Claims().checkValidPlanDate_Visibility();
//        new CheckUtils_Claims().checkOpenStatusInCard();
//        new CheckUtils_Claims().checkDescription_8_Visibility();
//        new CheckUtils_Claims().checkAuthor_Visibility();
//        new CheckUtils_Claims().checkCreatedDateDescription_Visibility();
//        new CheckUtils_Claims().checkAddComment_Visibility();
//        new CheckUtils_Claims().checkButtonChangeStatus_Visibility();
//        new CheckUtils_Claims().checkEnableStateButtonChangeStatus();
//        new Utils_Helper().backSystemButton();
//        new Utils_Claims().clickIconChangeStatusClaim();
//        new CheckUtils_Claims().checkButtonTakeToWorkStatus_Visibility();
//        new CheckUtils_Claims().checkButtonCancelStatus_Visibility();
//        new Utils_Helper().backSystemButton();
//        new CheckUtils_Claims().checkIconEditCard_Visibility();
//        new CheckUtils_Claims().checkButtonClose_Visibility();
//    }
//
//    @Step("test-case #8 / Сводный метод проверок видимости значений полей на экране Editing Claims перед редактированием")
//    public void checkAllFieldsAndButtonsViewEditingClaims_Visibility() {
//        new Utils_Helper().timerWaitingAsyncOperation1000();
//        new CheckUtils_Claims().checkTitleViewEditingClaims_Visibility();
//        new CheckUtils_Claims().checkFilledInputFieldTitle_Visibility();
//        new CheckUtils_Claims().checkFieldExecutor_Visibility();
//        new CheckUtils_Claims().checkIconFieldExecutor_Visibility();
//        new CheckUtils_Claims().checkTestDataDate_Visibility();
////        new CheckUtils_Claims().checkFieldTime_Visibility();           // непонятно что с изменением Time
//        new CheckUtils_Claims().checkFilledInputFieldDescription_Visibility();
//        new CheckUtils_Claims().checkButtonSave_Visibility();
//        new CheckUtils_Claims().checkButtonCancel_Visibility();
//    }
//
//    @Step("test-case #8 / Сводный метод проверок ПОСЛЕ РЕДАКТИРОВАНИЯ Claim в развернутой карточке Claim")
//    public void checkVisibilityInEditingClaimWithOpenStatus_8() {
//        new CheckUtils_Claims().checkEditingTitle_8_Visibility();
//        new CheckUtils_Claims().checkIndefinedExecutor_Visibility();
//        new CheckUtils_Claims().checkValidPlanDate_Visibility();
//        new CheckUtils_Claims().checkOpenStatusInCard();
//        new CheckUtils_Claims().checkEditingDescription_8_Visibility();
//        new CheckUtils_Claims().checkAuthor_Visibility();
//        new CheckUtils_Claims().checkCreatedDateDescription_Visibility();
//        new CheckUtils_Claims().checkAddComment_Visibility();
//        new CheckUtils_Claims().checkButtonChangeStatus_Visibility();
//        new CheckUtils_Claims().checkEnableStateButtonChangeStatus();
//        new Utils_Helper().backSystemButton();
//        new Utils_Claims().clickIconChangeStatusClaim();
//        new CheckUtils_Claims().checkButtonTakeToWorkStatus_Visibility();
//        new CheckUtils_Claims().checkButtonCancelStatus_Visibility();
//        new Utils_Helper().backSystemButton();
//        new CheckUtils_Claims().checkIconEditCard_Visibility();
//        new CheckUtils_Claims().checkButtonClose_Visibility();
//    }
//
//    @Step("test-case #8 / экран CREATING CLAIM / Сводный метод создания Claim в статусе Open")
//    public void creatingClaimOpenStatus_8() {
//        new Utils_Claims().inputTitleNewClaim_8();
//        new Utils_Claims().inputValidDate();
//        new Utils_Claims().inputValidTime();
//        new Utils_Claims().inputDescriptionNewClaim_8();
//        new Utils_Claims().clickButtonSaveNewClaim();
//    }
//
//    @Step("test-case #9 + #10 / экран CREATING CLAIM / Сводный метод создания Claim в статусе In Progress")
//    public void creatingClaimInProgressStatus_9_10() {
//        new Utils_Claims().clickCreateClaim();
//        new Utils_Claims().inputTitleNewClaim_9_10();
//        new Utils_Claims().selectExecutorClaim();
//        new Utils_Claims().inputValidDate();
//        new Utils_Claims().inputValidTime();
//        new Utils_Claims().inputDescription_9_10();
//        new Utils_Claims().clickButtonSaveNewClaim();
//    }
//
//    @Step("test-case #9 / Проверка в развернутой карточке Claim после поиска в списке Open")
//    public void checkVisibilityInClaimCardWithOpenStatus_9() {
//        new CheckUtils_Claims().checkTitle_9_10_Visibility();
//        new CheckUtils_Claims().checkIndefinedExecutor_Visibility();
//        new CheckUtils_Claims().checkValidPlanDate_Visibility();
//        new CheckUtils_Claims().checkOpenStatusInCard();
//        new CheckUtils_Claims().checkDescription_9_10_Visibility();
//        new CheckUtils_Claims().checkAuthor_Visibility();
//        new CheckUtils_Claims().checkCreatedDateDescription_Visibility();
//    }
//
//    @Step("test-case #10 / Проверка в развернутой карточке Claim после поиска в списке Executed")
//    public void checkVisibilityInClaimCardWithExecutedStatus_10() {
//        new CheckUtils_Claims().checkTitle_9_10_Visibility();
//        new CheckUtils_Claims().checkDefinedExecutor_Visibility();
//        new CheckUtils_Claims().checkValidPlanDate_Visibility();
//        new CheckUtils_Claims().checkExecutedStatus();
//        new CheckUtils_Claims().checkDescription_9_10_Visibility();
//        new CheckUtils_Claims().checkAuthor_Visibility();
//        new CheckUtils_Claims().checkCreatedDateDescription_Visibility();
//    }
//
//    @Step("test-case #9 + #10 / Проверка в развернутой карточке Claim после поиска в списке In Progress")
//    public void checkVisibilityInClaimCardWithInProgressStatus() {
//        new CheckUtils_Claims().checkTitle_9_10_Visibility();
//        new CheckUtils_Claims().checkDefinedExecutor_Visibility();
//        new CheckUtils_Claims().checkValidPlanDate_Visibility();
//        new CheckUtils_Claims().checkInProgressStatusInCard();
//        new CheckUtils_Claims().checkDescription_9_10_Visibility();
//        new CheckUtils_Claims().checkAuthor_Visibility();
//        new CheckUtils_Claims().checkCreatedDateDescription_Visibility();
//    }
//
//    @Step("test-case #11 / экран CREATING CLAIM / Сводный метод создания Claim в статусе In Progress")
//    public void creatingClaimInProgressStatus_11() {
//        new Utils_Claims().clickCreateClaim();
//        new Utils_Claims().inputTitleNewClaim_11();
//        new Utils_Claims().selectExecutorClaim();
//        new Utils_Claims().inputValidDate();
//        new Utils_Claims().inputValidTime();           // screenshot Allure
//        new Utils_Claims().inputDescription_11();
//        new Utils_Claims().clickButtonSaveNewClaim();
//    }
//
//    @Step("test-case #11 / Проверка в развернутой карточке Claim")
//    public void checkVisibilityInClaimCard_11() {
//        new CheckUtils_Claims().checkTitle_11_Visibility();
//        new CheckUtils_Claims().checkDefinedExecutor_Visibility();
//        new CheckUtils_Claims().checkValidPlanDate_Visibility();
//        new CheckUtils_Claims().checkInProgressStatusInCard();
//        new CheckUtils_Claims().checkDescription_11_Visibility();
//        new CheckUtils_Claims().checkAuthor_Visibility();
//        new CheckUtils_Claims().checkCreatedDateDescription_Visibility();
//    }
//
//    @Step("test-case #12 / Сводный метод проверок ПОСЛЕ создания Claim в развернутой карточке Claim")
//    public void checkVisibilityInNewClaimWithOpenStatus_12() {
//        new CheckUtils_Claims().checkTitle_12_Visibility();
//        new CheckUtils_Claims().checkIndefinedExecutor_Visibility();
//        new CheckUtils_Claims().checkValidPlanDate_Visibility();
//        new CheckUtils_Claims().checkOpenStatusInCard();
//        new CheckUtils_Claims().checkDescription_12_Visibility();
//        new CheckUtils_Claims().checkAuthor_Visibility();
//        new CheckUtils_Claims().checkCreatedDateDescription_Visibility();
//        new CheckUtils_Claims().checkAddComment_Visibility();
//        new CheckUtils_Claims().checkButtonChangeStatus_Visibility();
//        new CheckUtils_Claims().checkEnableStateButtonChangeStatus();
//        new Utils_Helper().backSystemButton();
//        new Utils_Claims().clickIconChangeStatusClaim();
//        new CheckUtils_Claims().checkButtonTakeToWorkStatus_Visibility();
//        new CheckUtils_Claims().checkButtonCancelStatus_Visibility();
//        new Utils_Helper().backSystemButton();
//        new CheckUtils_Claims().checkIconEditCard_Visibility();
//        new CheckUtils_Claims().checkButtonClose_Visibility();
//    }
//
//}
