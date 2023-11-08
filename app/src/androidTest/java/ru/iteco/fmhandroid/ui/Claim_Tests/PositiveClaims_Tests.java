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
        new Utils_Helper().timerWaitingAsyncOperation3000();
        new Utils_Menu().buttonMenu();
        new Utils_Menu().buttonClaims();
        new CheckUtils_Claims().checkTitleClaims_Visibility();
    }

    @After
    public void logOut() {
        new Utils_Helper().timerWaitingAsyncOperation3000();
        new Utils_Auth().logOutUtility();
    }

    // работает 22.10.23
    @Test
    @DisplayName("Positive test. Test-case # 5 / Фильтрация Claims по статусам Open + InProgress + Executed + Cancelled")
    public void filteringClaimsByStatusTest() {
        // фильтрация по статусу Open
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickButton_Ok();
        new Utils_Helper().timerWaitingAsyncOperation5000();
        new Utils_Claims().clickExpendClaim();
        new Utils_Helper().timerWaitingAsyncOperation1000();
        new CheckUtils_Claims().checkOpenStatusInCard();
        new Utils_Claims().clickCloseClaim();
        new Utils_Helper().timerWaitingAsyncOperation1000();
        // фильтрация по статусу InProgress
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_Open();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickButton_Ok();
        new Utils_Helper().timerWaitingAsyncOperation5000();
        new Utils_Claims().clickExpendClaim();
        new Utils_Helper().timerWaitingAsyncOperation1000();
        new CheckUtils_Claims().checkInProgressStatusInCard();
        new Utils_Claims().clickCloseClaim();
        new Utils_Helper().timerWaitingAsyncOperation1000();
        // фильтрация по статусу Executed
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickCheckBox_Executed();
        new Utils_Claims().clickButton_Ok();
        new Utils_Helper().timerWaitingAsyncOperation5000();
        new Utils_Claims().clickExpendClaim();
        new Utils_Helper().timerWaitingAsyncOperation1000();
        new CheckUtils_Claims().checkExecutedStatus();
        new Utils_Claims().clickCloseClaim();
        new Utils_Helper().timerWaitingAsyncOperation1000();
        // фильтрация по статусу Cancelled
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_Executed();
        new Utils_Claims().clickCheckBox_Cancelled();
        new Utils_Claims().clickButton_Ok();
        new Utils_Helper().timerWaitingAsyncOperation5000();
        new Utils_Claims().clickExpendClaim();
        new Utils_Helper().timerWaitingAsyncOperation1000();
        new CheckUtils_Claims().checkCanceledStatus();
        new Utils_Claims().clickCloseClaim();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    // работает 22.10.23
    @Test
    @DisplayName("Positive test. Test-case # 15 / Тестирование отмены процесса создания Claim")
    public void  cancellationProcessCreatingClaimsTest() {
        new Utils_Claims().clickCreateClaim();
        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
        new Utils_Claims().inputTestDataInTitleNewClaim();
        new Utils_Claims().inputExecutorNewClaim();
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

    // работает 28.10.23
    @Test
    @DisplayName("Positive test. Test-case # 7 / Создание новой претензии со статусом \"Open\" (Испольнитель не определен) + Редактирование созданной претензии: добавление комментария + редактирование комментария, перевод в статус \"IN PROGRESS\" через \"take to work\".")
    public void createNewClaimInOpenStatus_7_Test() {
//        new Summary_Methods_Claims().creatingClaimOpenWithoutExecutor();
//        new Utils_Claims().clickIconFilter_View_Claims();
//        new Utils_Claims().clickCheckBox_InProgress();
//        new Utils_Claims().clickButton_Ok();
//        new Utils_Claims().searchAndOpenClaimByTopic_7();
//        new Summary_Methods_Claims().checkVisibilityInNewClaimWithOpenStatus_7(); // 31-й шаг
//        new Utils_Claims().clickAddComment();
//        new CheckUtils_Claims().checkFieldComment_Visibility();
//        new CheckUtils_Claims().checkButtonSaveComment();
//        new CheckUtils_Claims().checkButtonCancelComment();                     // 35-й шаг
//        new Utils_Claims().inputComment_7();
//        new Utils_Claims().clickCancelComment();
//        new CheckUtils_Claims().checkFieldComment_NotVisibility();
//        new Utils_Claims().clickAddComment();
//        new Utils_Claims().inputComment_7();
//        new Utils_Claims().clickSaveComment();                                 // 41-й шаг
//        new Utils_Claims().searchComment_7_ByContent();
//        new CheckUtils_Claims().checkComment_7_Visibility();
//        new Utils_Claims().clickChangeStatusClaim();
//        new Utils_Claims().clickChangeStatusTakeToWork();
//        new CheckUtils_Claims().checkInProgressStatusInCard();                 // 45-й шаг
//        new CheckUtils_Claims().checkTestDataExecutor_Visibility();
//        new Utils_Claims().clickCloseClaim();
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_Open();
//        new Utils_Claims().clickCheckBox_InProgress();                        // 50-й шаг
        new Utils_Claims().clickButton_Ok();
//        new Utils_Claims().searchAndOpenClaimByTopic_7();
        new Summary_Methods_Claims().checkVisibilityInNewClaimWithInProgressStatus_7(); // 61-й шаг
//        new Utils_Claims().clickIconEditComment();
//        new CheckUtils_Claims().checkComment_7_Visibility();
//        new Utils_Claims().inputEditComment_7();
//        new Utils_Claims().clickSaveComment();
//        new Utils_Claims().searchComment_7_EditByContent();
//        new CheckUtils_Claims().checkEditComment_Visibility_7();
//        new Utils_Claims().clickCloseClaim();
    }

    // после отработки на fake data
    // только в этом методе заменить на валидные значения Date / Description / Topic
//    @Test
//    @DisplayName("Positive test. Test-case # 7 / Создание новой претензии со статусом \"Open\" (Испольнитель не определен)")
//    public void creatingNewClaimInOpenStatusTest_2() {
////        new Summary_Methods_Claims().creatingClaimOpenWithoutExecutor();
//        new Utils_Claims().clickIconFilter_View_Claims();
//        new Utils_Claims().clickCheckBox_InProgress();
//        new Utils_Claims().clickButton_Ok();
//        new Utils_Claims().searchAndOpenClaimByTopic_7();
////        new Utils_Claims().searchClaimByTopicForTestCase_7();                     // fake data
////        new Utils_Claims().clickExpendClaim();
////        new Utils_Claims().clickExpendClaim_GetPosition();
////        new Utils_Claims().clickExpendClaimAfterTextSearch();
////        new Utils_Claims().clickExpendClaim_Matcher();
////        new Utils_Claims().clickLastVisibleItem();
//        new Summary_Methods_Claims().checkVisibilityInNewClaimWithOpenStatus();  // проверяем видимость всего
//        new Utils_Claims().clickCloseClaim();
//    }

    // использовать invalid Date для ускорения поиска в списке
    // test-case #8
    @Test
    @DisplayName("Positive test. Test-case # 8 / Проверить функционал \"Создание новой претензии\" со статусом \"Open\" (Испольнитель не определен) + перевод в статус \"IN PROGRESS\" через указание Executor на экране \"Editing claims.")
    public void createNewClaimOpenStatusAndTransferInProgress_8_Test() {
        new Summary_Methods_Claims().creatingClaimOpenStatus_8();
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickButton_Ok();
//        new Utils_Claims().searchAndOpenClaimByTopic_8();
        new Summary_Methods_Claims().checkVisibilityInNewClaimWithOpenStatus_8();
        new Utils_Claims().clickEditClaim();
        new Utils_Claims().inputExecutorNewClaim();
        new Utils_Claims().clickButtonSaveNewClaim();
        new CheckUtils_Claims().checkDefinedExecutor_Visibility();
        new CheckUtils_Claims().checkInProgressStatusInCard();
        new Utils_Claims().clickCloseClaim();
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_Open();
        new Utils_Claims().clickCheckBox_InProgress();
//        new Utils_Claims().searchAndOpenClaimByTopic_8();
        new Summary_Methods_Claims().checkVisibilityInClaimCardWithInProgressStatus_8();
        new Utils_Claims().clickCloseClaim();
    }

    @Test
    @DisplayName("Positive test. Test-case # 9 / Проверить функционал \"Создание новой претензии\" со статусом \"In Progress\" + попытка указать кастомного исполнителя + Смена статуса  \"In progress\" на \"Open\" через \"Throw off + Смена статуса \"Open\" на \"Cancelled\" через \"Cancel")
    public void createNewClaimInProgressStatusAndTransferOpenAndTransferCancelled_8_Test() {
        new Summary_Methods_Claims().creatingClaimInProgressStatusCustomExecutor_9();
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().searchAndOpenClaimByTopic_9();
        new Summary_Methods_Claims().checkVisibilityInClaimCardWithOpenStatus_9();
        new Utils_Claims().clickEditClaim();
        new Utils_Claims().inputExecutorNewClaim();
        new Utils_Claims().clickButtonSaveNewClaim();
        new CheckUtils_Claims().checkDefinedExecutor_Visibility();
        new CheckUtils_Claims().checkInProgressStatusInCard();
        new Utils_Claims().clickChangeStatusClaim();
        new Utils_Claims().clickChangeStatusThrowOff();
        // модальное окно comment
        // методы вставить comment
        // ID элементов + методы проверок



//        new Utils_Claims().clickCloseClaim();
//        new Utils_Claims().clickIconFilter_View_Claims();
//        new Utils_Claims().clickCheckBox_Open();
//        new Utils_Claims().searchAndOpenClaimByTopic_8();
//        new Summary_Methods_Claims().checkVisibilityInClaimCardWithInProgressStatus_9();
//        new Utils_Claims().clickCloseClaim();
    }

    // использовать invalid Date для ускорения поиска в списке
    // test-case #9
    // скроллит список, но открывает не ту карточку
//    @Test
//    @DisplayName("Positive test. Редактирование CLAIM / переводим из статуса Open в статус InProgress")
//    public void editingClaimWithOpenStatus_9_Test() {
//        String cardText = Data_Claim.TOPIC_9;
//        int cardIndex = 0;
//
//        new Summary_Methods_Claims().editingClaimFromOpenToInProgress_9();             // создаем и редактируем претензию
//        new Utils_Claims().clickIconFilter_View_Claims();
//        new Utils_Claims().clickCheckBox_Open();                                        // снимаем чек-бокс Open
//        new Utils_Claims().clickCheckBox_InProgress();                                  // включаем чек-бокс In Progress
//        new Utils_Claims().clickButton_Ok();
//        new Utils_Claims().searchAndOpenClaimByTopic_9();                                       // ищем по Topic в списке Claims
//        new Utils_Claims().clickExpendClaim();
//        new Summary_Methods_Claims().checkVisibilityInEditedClaimWithInProgressStatus(); // создан отдельный метод проверки в части DATA
//        new Utils_Claims().clickCloseClaim();
//    }














    // временный тест
    @Test
    public void checkihgTest() {
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_InProgress();                               // снимаем чек-бокс In Progress / включен Open
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().searchAndOpenClaimByTopic_9();                          // ищем Claim по Topic
//        new ClaimUtils().clickExpend(cardIdlingResource);                 // открываем Claim
    }



    // в тесте создать новую Claim с invalid Date и invald Discription затем ее редактировать
    // и в последующих тестах использовать ее (переводить в статусы)
    // Для ускорения поиска в списке
    // изменить название теста

    // тестирование редактирования проводится на Claim с невалидной датой
    // для ускорения поиска в списке Claims
    @Test
    public void editingClaimInOpenStatusTest() {

    }


}
