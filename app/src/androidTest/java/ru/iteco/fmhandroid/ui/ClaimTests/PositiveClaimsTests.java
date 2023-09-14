package ru.iteco.fmhandroid.ui.ClaimTests;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.AuthUtils;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils;
import ru.iteco.fmhandroid.ui.PageObject.ClaimUtils;
import ru.iteco.fmhandroid.ui.PageObject.MenuUtils;
import ru.iteco.fmhandroid.ui.PageObject.UtilsHelper;
import ru.iteco.fmhandroid.ui.testData.ClaimData;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class PositiveClaimsTests {
//    CardIdlingResource cardIdlingResource = new CardIdlingResource();
    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);
//    public ActivityTestRule<AppActivity> mActivityRule = new ActivityTestRule<>(AppActivity.class);
    UtilsHelper utilsHelper = new UtilsHelper();
    AuthUtils authUtils = new AuthUtils();
    MenuUtils menuUtils = new MenuUtils();
    CheckUtils checkUtils = new CheckUtils();
    ClaimUtils claimUtils = new ClaimUtils();
    ProjectIdlingResources projectIdlingResources = new ProjectIdlingResources();

    @Before
    public void startUp() {

        utilsHelper.timerWaitingAsynchOperation3000();
//        projectIdlingResources.setBusy();
//        projectIdlingResources.setIdle();
        authUtils.authorizationUtility();
        utilsHelper.timerWaitingAsynchOperation3000();
//        utilsHelper.timerWaitingAsynchOperation1000();
        menuUtils.buttonMenu();
        menuUtils.buttonClaims();
        checkUtils.checkTitleVisibilityClaims();

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

      authUtils.logOutUtility();
//        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
//      utilsHelper.endAsyncOperation();

    }

    // работает 02.09.23 + 12.09.23
    @Test
    public void filteringClaimsByStatusTest() {
        // фильтрация по статусу Open
        claimUtils.clickFilters();
        claimUtils.clickInProgress();
        claimUtils.clickOk();
        claimUtils.clickExpend();
        checkUtils.checkOpenStatusInCard();
        claimUtils.clickClose();
        utilsHelper.timerWaitingAsynchOperation1000();

        // фильтрация по статусу InProgress
        claimUtils.clickFilters();
        claimUtils.clickOpen();
        claimUtils.clickInProgress();
        claimUtils.clickOk();
        claimUtils.clickExpend();
        utilsHelper.timerWaitingAsynchOperation1000();
        checkUtils.checkInProgressStatusInCard();
        claimUtils.clickClose();
        utilsHelper.timerWaitingAsynchOperation1000();

        // фильтрация по статусу Executed
        claimUtils.clickFilters();
        claimUtils.clickInProgress();
        claimUtils.clickExecuted();
        claimUtils.clickOk();
        claimUtils.clickExpend();
        utilsHelper.timerWaitingAsynchOperation1000();
        checkUtils.checkExecutedStatus();
        claimUtils.clickClose();
        utilsHelper.timerWaitingAsynchOperation1000();

        // фильтрация по статусу Cancelled
        claimUtils.clickFilters();
        claimUtils.clickExecuted();
        claimUtils.clickCancelled();
        claimUtils.clickOk();
        claimUtils.clickExpend();
        utilsHelper.timerWaitingAsynchOperation1000();
        checkUtils.checkCanceledStatus();
        claimUtils.clickClose();
        utilsHelper.timerWaitingAsynchOperation1000();
    }

    // работает 02.09.23 // работает 08.09.23 + 12.09.23
    @Test
    public void  cancellationClaimProcessTest() {
        new ClaimUtils().clickCreateClaim();
        new CheckUtils().checkAllFieldsAndButtonsVisibility();
        new ClaimUtils().inputTestDataInTitleNewClaim_1();
        new ClaimUtils().inputTestDataInExecutorNewClaim();
        new ClaimUtils().inputOnTestDataDate();
        new ClaimUtils().inputOnTestDataTime();
        new ClaimUtils().inputTestDataInDiscription_1_NewClaim();
        new ClaimUtils().clickButtonCancel();
        new ClaimUtils().clickInModalViewButtonCancel();
        new ClaimUtils().clickButtonCancel();
        new ClaimUtils().clickInModalViewButtonOk();

    }

    // после отработки на fake data
    // только в этом методе заменить на валидные значения Date / Discription / Topic
    @Test
    public void creatingNewClaimInOpenStatus_7_Test() {
//        claimUtils.creatingClaimOpenWithoutExecutor();
//        claimUtils.clickCreateClaim(cardIdlingResource);
//        checkUtils.checkAllFieldsAndButtonsVisibility();
//        claimUtils.inputTestDataInTitleNewClaim();       // fake data
//        claimUtils.inputEmptyInExecutorNewClaim();       // оставляем пустым для статуса Open
//        claimUtils.inputOnTestDataDate();                // fake data
//        claimUtils.inputOnTestDataTime();                // fake data
//        claimUtils.inputTestDataInDiscriptionNewClaim(); // fake data
//        checkUtils.checkButtonSaveVisibility();
//        claimUtils.clickButtonSave();
//        menuUtils.buttonMenu();
//        menuUtils.buttonClaims();
        claimUtils.clickFilters();
        claimUtils.clickInProgress();
        claimUtils.clickOk();
        claimUtils.searchClaimByTopic_1();                     // fake data
        claimUtils.clickExpend();
        checkUtils.checkVisibilityInNewClaimWithOpenStatus();  // проверяем видимость всего
        claimUtils.clickClose();
    }

    // использовать invalid Date для ускорения поиска в списке
    // test-case #8
    @Test
    public void creatingNewClaimInProgressStatus_8_Test() {
        String cardText = ClaimData.TOPIC_2;
        int cardIndex = 0;

        claimUtils.creatingClaimInProgress_8();                     // отредактирован набор методов в части DATA
        claimUtils.clickFilters();
        claimUtils.clickOpen();                                     // снимаем чек-бокс Open / включен In Progress
        claimUtils.clickOk();
        claimUtils.searchClaimByTopic_2();                          // создан отдельный метод поиска в части DATA
        claimUtils.clickExpend();
        checkUtils.checkVisibilityInNewClaimWithInProgressStatus(); // создан отдельный метод проверки в части DATA
        claimUtils.clickClose();                  // закрыть развернутую карточку претензии
    }

    // использовать invalid Date для ускорения поиска в списке
    // test-case #9
    // скроллит список, но открывает не ту карточку
    @Test
    public void editingClaimWithOpenStatus_9_Test() {
        String cardText = ClaimData.TOPIC_3;
        int cardIndex = 0;

        claimUtils.editingClaimFromOpenToInProgress_9();             // создаем и редактируем претензию
        claimUtils.clickFilters();
        claimUtils.clickOpen();                                      // снимаем чек-бокс Open
        claimUtils.clickInProgress();                                // включаем чек-бокс In Progress
        claimUtils.clickOk();
        claimUtils.searchClaimByTopic_3();                           // ищем по Topic в списке Claims
        claimUtils.clickExpend();
        checkUtils.checkVisibilityInEditedClaimWithInProgressStatus(); // создан отдельный метод проверки в части DATA
        claimUtils.clickClose();
    }














    // временный тест
    @Test
    public void checkihgTest() {
        new ClaimUtils().clickFilters();
        new ClaimUtils().clickInProgress();                               // снимаем чек-бокс In Progress / включен Open
        new ClaimUtils().clickOk();
        new ClaimUtils().searchClaimByTopic_3();                          // ищем Claim по Topic
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
