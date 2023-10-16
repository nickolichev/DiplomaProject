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
import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Claims;
import ru.iteco.fmhandroid.ui.PageObject.Summary_Methods_Claims;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Claims;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Helper;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Menu;
import ru.iteco.fmhandroid.ui.testData.Data_Claim;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class PositiveClaims_Tests {
//    CardIdlingResource cardIdlingResource = new CardIdlingResource();
    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);
//    public ActivityTestRule<AppActivity> mActivityRule = new ActivityTestRule<>(AppActivity.class);
    ProjectIdlingResources projectIdlingResources = new ProjectIdlingResources();

    @Before
    public void startUp() {

        new Utils_Helper().timerWaitingAsyncOperation3000();
//        projectIdlingResources.setBusy();
//        projectIdlingResources.setIdle();
        new Utils_Auth().authorizationUtility();
        new Utils_Helper().timerWaitingAsyncOperation3000();
//        new Utils_Helper().timerWaitingAsyncOperation1000();
        new Utils_Menu().buttonMenu();
        new Utils_Menu().buttonClaims();
        new CheckUtils_Claims().checkTitleClaims_Visibility();

    }

//        new UtilsHelper().timerWaitingAsynchOperation2000();
//        IdlingRegistry.getInstance().register(ProjectIdlingResources.idlingResource);
//
//        try {
//            authUtils.titleCheck();
//        } catch (NoMatchingViewException e) {
//            authUtils.logOut();
//        }
//        authUtils.authorizationUtility();
//        menuUtils.buttonMenu();
//        menuUtils.buttonClaims();
//        checkUtils.checkTitleVisibilityClaims();
//    }

    @After
    public void logOut() {
//      utilsHelper.beginAsyncOperation();

      new Utils_Auth().logOutUtility();
//        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
//      utilsHelper.endAsyncOperation();

    }

    // работает 02.09.23 + 12.09.23
    @Test
    @DisplayName("Positive test. Фильтрация Claims по статусам Open + InProgress + Executed + Cancelled")
    public void filteringClaimsByStatusTest() {
        // фильтрация по статусу Open
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().clickExpendClaim();
        new CheckUtils_Claims().checkOpenStatusInCard();
        new Utils_Claims().clickCloseClaim();
        new Utils_Helper().timerWaitingAsyncOperation1000();

        // фильтрация по статусу InProgress
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_Open();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickButton_Ok();
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
        new Utils_Claims().clickExpendClaim();
        new Utils_Helper().timerWaitingAsyncOperation1000();
        new CheckUtils_Claims().checkCanceledStatus();
        new Utils_Claims().clickCloseClaim();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    // работает 02.09.23 // работает 08.09.23 + 12.09.23
    @Test
    @DisplayName("Positive test. Незавершенный процесс создания Claim")
    public void  cancellationProcessCreatingClaimsTest() {
        new Utils_Claims().clickCreateClaim();
        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
        new Utils_Claims().inputTestDataInTitleNewClaim_1();
        new Utils_Claims().inputTestDataInExecutorNewClaim();
        new Utils_Claims().inputOnTestDataDate();
        new Utils_Claims().inputOnTestDataTime();
        new Utils_Claims().inputTestDataInDescription_1();
        new Utils_Claims().clickButtonCancelNewClaim();
        new Utils_Claims().clickInModalViewButtonCancel();
        new Utils_Claims().clickButtonCancelNewClaim();
        new Utils_Claims().clickInModalViewButtonOk();

    }

    // после отработки на fake data
    // только в этом методе заменить на валидные значения Date / Discription / Topic
    @Test
    @DisplayName("Positive test. Процесс создания CLAIM в статусе Open")
    public void creatingNewClaimInOpenStatus_7_Test() {
//        claimUtils.creatingClaimOpenWithoutExecutor();
//        claimUtils.clickCreateClaim(cardIdlingResource);
//        checkUtils.checkAllFieldsAndButtonsVisibility();
//        claimUtils.inputTestDataInTitleNewClaim();       // fake data
//        claimUtils.inputEmptyInExecutorNewClaim();       // оставляем пустым для статуса Open
        new Utils_Claims().inputOnTestDataDate();                // fake data
        new Utils_Claims().inputOnTestDataTime();                // fake data
//        claimUtils.inputTestDataInDiscriptionNewClaim(); // fake data
//        checkUtils.checkButtonSaveVisibility();
//        claimUtils.clickButtonSave();
//        menuUtils.buttonMenu();
//        menuUtils.buttonClaims();
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_InProgress();
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().searchClaimByTopic_1();                     // fake data
        new Utils_Claims().clickExpendClaim();
        new Summary_Methods_Claims().checkVisibilityInNewClaimWithOpenStatus();  // проверяем видимость всего
        new Utils_Claims().clickCloseClaim();
    }

    // использовать invalid Date для ускорения поиска в списке
    // test-case #8
    @Test
    @DisplayName("Positive test. Создание CLAIM в статусе InProgress")
    public void creatingNewClaimInProgressStatus_8_Test() {
        String cardText = Data_Claim.TOPIC_2;
        int cardIndex = 0;

        new Summary_Methods_Claims().creatingClaimInProgress_8();                     // отредактирован набор методов в части DATA
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_Open();                                     // снимаем чек-бокс Open / включен In Progress
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().searchClaimByTopic_2();                                    // создан отдельный метод поиска в части DATA
        new Utils_Claims().clickExpendClaim();
        new Summary_Methods_Claims().checkVisibilityInNewClaimWithInProgressStatus(); // создан отдельный метод проверки в части DATA
        new Utils_Claims().clickCloseClaim();                                         // закрыть развернутую карточку претензии
    }

    // использовать invalid Date для ускорения поиска в списке
    // test-case #9
    // скроллит список, но открывает не ту карточку
    @Test
    @DisplayName("Positive test. Редактирование CLAIM / переводим из статуса Open в статус InProgress")
    public void editingClaimWithOpenStatus_9_Test() {
        String cardText = Data_Claim.TOPIC_3;
        int cardIndex = 0;

        new Summary_Methods_Claims().editingClaimFromOpenToInProgress_9();             // создаем и редактируем претензию
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_Open();                                        // снимаем чек-бокс Open
        new Utils_Claims().clickCheckBox_InProgress();                                  // включаем чек-бокс In Progress
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().searchClaimByTopic_3();                                       // ищем по Topic в списке Claims
        new Utils_Claims().clickExpendClaim();
        new Summary_Methods_Claims().checkVisibilityInEditedClaimWithInProgressStatus(); // создан отдельный метод проверки в части DATA
        new Utils_Claims().clickCloseClaim();
    }














    // временный тест
    @Test
    public void checkihgTest() {
        new Utils_Claims().clickIconFilter_View_Claims();
        new Utils_Claims().clickCheckBox_InProgress();                               // снимаем чек-бокс In Progress / включен Open
        new Utils_Claims().clickButton_Ok();
        new Utils_Claims().searchClaimByTopic_3();                          // ищем Claim по Topic
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
