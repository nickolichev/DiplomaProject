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
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_Main;
import ru.iteco.fmhandroid.ui.PageObject.Summary_Methods_Claims;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Claims;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Helper;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Menu;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class NegativeClaims_Tests {
//    CardIdlingResource cardIdlingResource = new CardIdlingResource();
    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void registerIdlingResources() {

//        IdlingRegistry.getInstance().register(ProjectIdlingResources.idlingResource);
        new Utils_Helper().timerWaitingAsyncOperation3000();
//        try {
//            new Utils_Auth().checkTitleOnAuthView();
//            new Utils_Helper().timerWaitingAsyncOperation20000();
//        } catch (NoMatchingViewException e) {
//            new Utils_Auth().logOut();
//        }
        new Utils_Auth().authorizationUtility();
        new Utils_Menu().buttonMenu();
        new Utils_Menu().buttonClaims();
        new CheckUtils_Claims().checkTitleClaims_Visibility();
        new Utils_Helper().timerWaitingAsyncOperation3000();
    }

    @After
    public void unregisterIdlingResources() {
//        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
        new Utils_Auth().logOutUtility();
    }

    @Test
    @DisplayName("Negative test. test-case # 14 / Попытка создать Claim с незаполненными полями Title, Executor, Date, Time, Description")
    public void  creatingClaimWithEmptyFieldsTest() {
        new Utils_Claims().clickCreateClaim();
        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility(); // проверяем исходную страницу с полями
        // удалить методы, как избыточные
//        new Utils_Claims().inputEmptyInTitleNewClaim();
//        new Utils_Claims().inputEmptyInExecutorNewClaim();
//        new Utils_Claims().inputEmptyTestDataDate();
//        new Utils_Claims().inputEmptyTestDataTime();
//        new Utils_Claims().inputEmptyInDescriptionNewClaim();
        new Utils_Claims().clickButtonSaveNewClaim();
        new CheckUtils_Claims().checkModalViewWarningText_Visibility();    // проверяем текст модального окна WARNING
        new Utils_Claims().clickButtonOkInModalViewWarning();              // клик в модальном окне по кнопке OK
        new Summary_Methods_Claims().checkAllFieldsEmpty_Visibility();     // проверяем, что иконки-предупреждения есть в пустых полях
        new Utils_Claims().clickButtonCancelNewClaim();                    // клик по кнопке CANCEL на экране CREATING CLAIMS
        new CheckUtils_Claims().checkModalViewQuestionText_Visibility();   // проверяем текст модального окна QUESTION
        new Utils_Claims().clickButtonCancelInModalViewQuestion();         // клик по кнопке CANCEL в модальном окне QUESTION
        new Summary_Methods_Claims().checkAllFieldsEmpty_Visibility();     // проверяем, что иконки-предупреждения есть в пустых полях
        new Utils_Claims().clickButtonCancelNewClaim();                    // клик по кнопке CANCEL на экране CREATING CLAIMS
        new Utils_Claims().clickButtonOkInModalViewQuestion();             // клик по кнопке OK в модальном окне QUESTION
        new CheckUtils_Main().checkIconClaims_Visibility();                // проверяем Title на экране CLAIMS
    }

    @Test
    @DisplayName("Negative test. Попытка создать Claim с невалидными тестовыми данными Date")
    public void  creatingClaimWithInvalidDateTest() {
       // дата в прошлом
        // дописать методы

    }

    @Test
    @DisplayName("Negative test. Попытка создать Claim с невалидными тестовыми данными Title (>50 знаков)")
    public void  creatingClaimWithInvalidTitleTest() {
        // больше 50 знаков
        new Utils_Claims().clickCreateClaim();
        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
        new Utils_Claims().inputEmptyInTitleNewClaim();
        new Utils_Claims().inputEmptyInExecutorNewClaim();
        new Utils_Claims().inputEmptyInDescriptionNewClaim();
        // дописать методы

    }

    @Test
    @DisplayName("Negative test. Попытка создать Claim с невалидными тестовыми данными Executor")
    public void  creatingClaimWithInvalidExecutorTest() {
        new Utils_Claims().clickCreateClaim();
        new Summary_Methods_Claims().checkAllFieldsAndButtons_Visibility();
        new Utils_Claims().inputEmptyInTitleNewClaim();
        new Utils_Claims().inputEmptyInExecutorNewClaim();
        new Utils_Claims().inputEmptyInDescriptionNewClaim();
        // дописать методы

    }
}
