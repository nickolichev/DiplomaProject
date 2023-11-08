package ru.iteco.fmhandroid.ui.PageObject;

import io.qameta.allure.kotlin.junit4.DisplayName;

public class Summary_Methods_Claims {

    // сводные методы проверок
    @DisplayName("Сводный метод проверок видимости полей на экране Creating Claims")
    public void checkAllFieldsAndButtons_Visibility() {
        new CheckUtils_Claims().checkTitleAppBar();
        new CheckUtils_Claims().checkFieldTitle_Visibility();
        new CheckUtils_Claims().checkFieldExecutor_Visibility();
        new CheckUtils_Claims().checkFieldDate_Visibility();
        new CheckUtils_Claims().checkFieldTime_Visibility();
        new CheckUtils_Claims().checkFieldDescription_Visibility();
        new CheckUtils_Claims().checkButtonSave_Visibility();
        new CheckUtils_Claims().checkButtonCancel_Visibility();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

//    @DisplayName("Сводный метод проверок видимости НЕзаполненных полей на экране Creating Claims")
//    public void checkAllFieldsEmpty_Visibility() {
//        new CheckUtils_Claims().checkIconEmptyTitle_Visibility();
//        new CheckUtils_Claims().checkIconEmptyDate_Visibility();
//        new CheckUtils_Claims().checkIconEmptyTime_Visibility();
//        new CheckUtils_Claims().checkIconEmptyDescription_Visibility();
//    }


    // также использовать этот метод для тест-кейса #10 Перевод в статус In Progress через указание Executor
// использовать valid Date
    @DisplayName("test-case #7 / экран CREATING CLAIM / Сводный метод создания Claim в статусе Open без исполнителя + без Comment")
    public void creatingClaimOpenWithoutExecutor() {
        new Utils_Claims().clickCreateClaim();
//    new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
        new Utils_Claims().inputTitleNewClaim_7();
        new Utils_Claims().inputValidDate();
        new Utils_Claims().inputValidTime();
        new Utils_Claims().inputTestDataInDescription_7();
        new CheckUtils_Claims().checkButtonSave_Visibility();
        new Utils_Claims().clickButtonSaveNewClaim();
    }


    @DisplayName("test-case #7 Сводный метод проверок для теста creatingNewClaimInOpenStatusTest() в развернутой карточке Claim")
    public void checkVisibilityInNewClaimWithOpenStatus_7() {
        new CheckUtils_Claims().checkTitle_7_Visibility();
        new CheckUtils_Claims().checkIndefinedExecutor_Visibility();
        new CheckUtils_Claims().checkValidPlanDate_Visibility();
        new CheckUtils_Claims().checkOpenStatusInCard();
        new CheckUtils_Claims().checkDescription_7_Visibility();
        new CheckUtils_Claims().checkAuthor_Visibility();
        new CheckUtils_Claims().checkCreatedDescription_Visibility();
        new CheckUtils_Claims().checkAddComment_Visibility();
        new CheckUtils_Claims().checkButtonChangeStatus_Visibility();
        new CheckUtils_Claims().checkEnableStateButtonChangeStatus();
        new Utils_Helper().backSystemButton();
        new Utils_Claims().clickChangeStatusClaim();
        new CheckUtils_Claims().checkButtonTakeToWorkStatus_Visibility();
        new CheckUtils_Claims().checkButtonCancelStatus_Visibility();
        new Utils_Helper().backSystemButton();
        new CheckUtils_Claims().checkIconEditCard_Visibility();
        new CheckUtils_Claims().checkButtonClose_Visibility();
    }

    @DisplayName("test-case #7 Сводный метод проверок для теста creatingNewClaimInOpenStatusTest() в развернутой карточке Claim")
    public void checkVisibilityInNewClaimWithInProgressStatus_7() {
        new CheckUtils_Claims().checkTitle_7_Visibility();
        new CheckUtils_Claims().checkIndefinedExecutor_Visibility();
        new CheckUtils_Claims().checkValidPlanDate_Visibility();
        new CheckUtils_Claims().checkInProgressStatusInCard();
        new CheckUtils_Claims().checkDescription_7_Visibility();
        new CheckUtils_Claims().checkAuthor_Visibility();
        new CheckUtils_Claims().checkCreatedDescription_Visibility();
        new CheckUtils_Claims().checkComment_Visibility_7();
        new CheckUtils_Claims().checkAddComment_Visibility();
        new CheckUtils_Claims().checkButtonChangeStatus_Visibility();
        new CheckUtils_Claims().checkEnableStateButtonChangeStatus();
        new Utils_Helper().backSystemButton();
        new Utils_Claims().clickChangeStatusClaim();
        new CheckUtils_Claims().checkButtonThrowOffStatus_Visibility();
        new CheckUtils_Claims().checkButtonToExecuteStatus_Visibility();
        new Utils_Helper().backSystemButton();
        new CheckUtils_Claims().checkIconEditCard_NotVisibility();
    }

    @DisplayName("test-case #7 Проверка #1 Сводный метод проверок для теста editingClaimFromOpenToInProgress_9() в развернутой карточке Claim")
    public void checkVisibilityInEditedClaimWithInProgressStatus() {
        new CheckUtils_Claims().checkTitle_9_Visibility();
        new CheckUtils_Claims().checkIndefinedExecutor_Visibility();
        new CheckUtils_Claims().checkInvalidPlanDate_Visibility();
        new CheckUtils_Claims().checkInProgressStatusInCard();             // проверям что Claim перешла в статус In Progress
        new CheckUtils_Claims().checkAuthor_Visibility();
        new CheckUtils_Claims().checkCreatedDescription_Visibility();       // видимость Created Description (значение Date и Time не проверяем)
        new CheckUtils_Claims().checkEditingComment_7_Visibility();    // проверяем отредактированный Comment

//        checkUtilsClaims.checkAddCommentVisibility();              // в test-case #8 нет Comment
//        checkUtilsClaims.checkButtonChangeStatusVisibility();      // видимость кнопки смены статуса
//        checkUtilsClaims.checkEnableStateButtonChangeStatus();     // состояние Enable кнопки смены статуса
//        utilsHelper.backSystemButton();                            // вспомогательный клик для снятия блока модального окна
//        claimsUtils.clickChangeStatusClaimWithOpenStatus();        // открываем модальное окно
//        checkUtilsClaims.checkButtonTakeToWorkStatusVisibility();  // видимость в модальном окне кнопки смены статуса
//        checkUtilsClaims.checkButtonCancelStatusVisibility();      // видимость в модальном окне кнопки смены статуса
//        utilsHelper.backSystemButton();                            // вспомогательный клик для снятия блока модального окна
//        checkUtilsClaims.checkIconEditCardVisibility();            // видимость иконки Редактировать карточку
//        checkUtilsClaims.checkButtonCloseVisibility();             // видимость иконки Закрыть карточку
//
    }
    @DisplayName("test-case #8 / Проверка в развернутой карточке Claim после поиска в списке Open")
    public void checkVisibilityInNewClaimWithOpenStatus_8() {
        new CheckUtils_Claims().checkTitle_8_Visibility();
        new CheckUtils_Claims().checkIndefinedExecutor_Visibility();
        new CheckUtils_Claims().checkValidPlanDate_Visibility();
        new CheckUtils_Claims().checkOpenStatusInCard();
        new CheckUtils_Claims().checkDescription_8_Visibility();
        new CheckUtils_Claims().checkAuthor_Visibility();
        new CheckUtils_Claims().checkCreatedDescription_Visibility();       // видимость Created Description (значение Date и Time не проверяем)
    }
    @DisplayName("test-case #8 / Проверка в развернутой карточке Claim после поиска в списке In Progress")
    public void checkVisibilityInClaimCardWithInProgressStatus_8() {
        new CheckUtils_Claims().checkTitle_8_Visibility();
        new CheckUtils_Claims().checkDefinedExecutor_Visibility();
        new CheckUtils_Claims().checkValidPlanDate_Visibility();
        new CheckUtils_Claims().checkInProgressStatusInCard();
        new CheckUtils_Claims().checkDescription_8_Visibility();
        new CheckUtils_Claims().checkAuthor_Visibility();
        new CheckUtils_Claims().checkCreatedDescription_Visibility();       // видимость Created Description (значение Date и Time не проверяем)
    }

    @DisplayName("test-case #8 / экран CREATING CLAIM / Сводный метод создания Claim в статусе Open")
    public void creatingClaimOpenStatus_8() {
        new Utils_Claims().clickCreateClaim();
        new Utils_Claims().inputTitleNewClaim_8();
        new Utils_Claims().inputValidDate();
        new Utils_Claims().inputValidTime();
        new Utils_Claims().inputTestDataInDescription_8();
        new Utils_Claims().clickButtonSaveNewClaim();
    }
    @DisplayName("test-case #9 / экран CREATING CLAIM / Сводный метод создания Claim в статусе In Progress с Custom Executor")
    public void creatingClaimInProgressStatusCustomExecutor_9() {
        new Utils_Claims().clickCreateClaim();
        new Utils_Claims().inputTitleNewClaim_9();
        new Utils_Claims().inputCustomIExecutorNewClaim();
        new Utils_Claims().inputValidDate();
        new Utils_Claims().inputValidTime();
        new Utils_Claims().inputTestDataInDescription_9();
        new Utils_Claims().clickButtonSaveNewClaim();
    }
    @DisplayName("test-case #9 / Проверка в развернутой карточке Claim после поиска в списке Open")
    public void checkVisibilityInClaimCardWithOpenStatus_9() {
        new CheckUtils_Claims().checkTitle_9_Visibility();
        new CheckUtils_Claims().checkIndefinedExecutor_Visibility();
        new CheckUtils_Claims().checkValidPlanDate_Visibility();
        new CheckUtils_Claims().checkOpenStatusInCard();
        new CheckUtils_Claims().checkDescription_9_Visibility();
        new CheckUtils_Claims().checkAuthor_Visibility();
        new CheckUtils_Claims().checkCreatedDescription_Visibility();       // видимость Created Description (значение Date и Time не проверяем)
    }

    @DisplayName("test-case #9 / Проверка в развернутой карточке Claim после поиска в списке In Progress")
    public void checkVisibilityInClaimCardWithInProgressStatus_9() {
        new CheckUtils_Claims().checkTitle_9_Visibility();
        new CheckUtils_Claims().checkDefinedExecutor_Visibility();
        new CheckUtils_Claims().checkValidPlanDate_Visibility();
        new CheckUtils_Claims().checkInProgressStatusInCard();
        new CheckUtils_Claims().checkDescription_9_Visibility();
        new CheckUtils_Claims().checkAuthor_Visibility();
        new CheckUtils_Claims().checkCreatedDescription_Visibility();       // видимость Created Description (значение Date и Time не проверяем)
    }


    // (предварительно в тесте создать new Claim Open без Executor) + создать Comment и редактировать его
    // использовать invalid Date для ускорения поиска в списке ЕСЛИ не реализован скроллинг и поиск карточки с валидной датой
    // ЕСЛИ  скроллинг реализован + поиск карточки с валидной датой = использовать valid DATE
//    @DisplayName("test-case #9 / раскрытая карточка CLAIM / Сводный метод для редактирования статуса претензии: из Open через \"take to work\" в InProgress")
//    public void editingClaimFromOpenToInProgress_9() {
//        String cardText = Data_Claim.TOPIC_9;
//        int cardIndex = 0;
//        new Utils_Claims().clickCreateClaim();           // создаем новую Claim
//        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
//        new Utils_Claims().inputTestDataInTitleNewClaim_3();
////        new ClaimUtils().inputTestDataInExecutorNewClaim();              // создаем Open без Executor
//        new Utils_Claims().inputInvalidTestDataDate();                     // не валидная DATE
//        new Utils_Claims().inputOnTestDataTime();                          // валидное TIME
//        new Utils_Claims().inputTestDataInDescription_9();
//        new CheckUtils_Claims().checkButtonSave_Visibility();
//        new Utils_Claims().clickButtonSave();
//
//        // находим созданную Claim
//        new Utils_Claims().clickIconFilter_View_Claims();
//        new Utils_Claims().clickCheckBox_InProgress();                      // снимаем чек-бокс In Progress / включен Open
//        new Utils_Claims().clickButton_Ok();
//        new Utils_Claims().searchAndOpenClaimByTopic_9();                          // ищем Claim по Topic
//        new Utils_Claims().clickExpendClaim();                              // открываем Claim
//
//        // методы редактирования Claim: создание Comment
//        new Utils_Claims().clickAddComment();
//        new Utils_Claims().inputComment_9();                                // вводим текст Comment
//        new CheckUtils_Claims().checkButtonSaveComment();                   // проверяем, что кнопка SAVE видна
//        new CheckUtils_Claims().checkButtonCancelComment();                 // проверяем, что кнопка CANCEL видна
//        new Utils_Claims().clickCancelComment();                            // тестируем отмену создания Comment
//        new CheckUtils_Claims().checkComment_9_NotVisibility();            // проверяем, что Comment НЕ отображается в раскрытой Claim
//        new Utils_Claims().clickAddComment();                               // повторно создаем Comment
//        new Utils_Claims().inputComment_9();                                // повторно вводим текст Comment
//        new Utils_Claims().clickSaveComment();                              // сохраняем введенные значения Comment
//        new Utils_Claims().searchComment_9_ByContent();                     // находим созданный Comment
//        new CheckUtils_Claims().checkComment_Visibility();               // проверяем, что Comment отображается в раскрытой Claim
//
//        // методы редактирования Claim: редактирование существующего Comment
//        new Utils_Claims().clickEditInsideComment_9();                        // клик на  Edit в редактируемом Comment
//        new Utils_Claims().inputEditComment_9();                              // редактируем созданный Comment
//        new Utils_Claims().clickSaveComment();                                // сохраняем введенные значения Comment
//        new Utils_Claims().searchComment_9_EditByContent();                   // проверяем, что отредактированный Comment отображается в Claim
//
//        // методы изменения статуса Claim
//        new Utils_Claims().clickChangeStatusClaim();            // клик по Change Status в раскрытой Claim
//        new Utils_Claims().clickChangeStatusTakeToWork();                     // клик по take to work
//        new Utils_Claims().clickCloseClaim();
//
//    }

    // предварительно в тесте создаем new Claim Open без Executor
    // использовать invalid Date для ускорения поиска в списке ЕСЛИ не реализован скроллинг и поиск карточки с валидной датой
    // ЕСЛИ  скроллинг реализован + поиск карточки с валидной датой = использовать valid DATE
    @DisplayName("test-case #10 / раскрытая карточка CLAIM / Сводный метод для редактирования статуса претензии: из Open в InProgress, через назначение Executor ")
    public void editingClaimFromOpenToInProgress_Part_2() {
        new Utils_Claims().clickCreateClaim();
        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
        new Utils_Claims().inputTitleNewClaim_10();
        new Utils_Claims().inputExecutorNewClaim();
        new Utils_Claims().inputValidDate();
        new Utils_Claims().inputValidTime();
        new Utils_Claims().inputTestDataInDescription_10();
        new CheckUtils_Claims().checkButtonSave_Visibility();
        new Utils_Claims().clickButtonSave();
    }

    // набор методов для редактирования претензии в статусе In Progress через "Throw off"
    // предварительно в тесте создать new Claim In Progress
    // использовать invalid Date для ускорения поиска в списке
    @DisplayName("test-case #11 / раскрытая карточка CLAIM / Сводный метод для редактирования статуса претензии: из Open в InProgress, через назначение Executor ")
    public void editingClaimFromInProgressToOpen() {              // case #11
        new Utils_Claims().clickCreateClaim();
        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
        new Utils_Claims().inputTitleNewClaim_11();
        new Utils_Claims().inputExecutorNewClaim();
        new Utils_Claims().inputValidDate();
        new Utils_Claims().inputValidTime();
        new Utils_Claims().inputTestDataInDescription_11();
        new CheckUtils_Claims().checkButtonSave_Visibility();
        new Utils_Claims().clickButtonSave();
    }
}
