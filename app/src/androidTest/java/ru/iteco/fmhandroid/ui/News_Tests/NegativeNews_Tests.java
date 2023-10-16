package ru.iteco.fmhandroid.ui.News_Tests;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_News;
import ru.iteco.fmhandroid.ui.PageObject.Summary_Methods_News;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Helper;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Menu;
import ru.iteco.fmhandroid.ui.PageObject.Utils_News;

public class NegativeNews_Tests {
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
        new Utils_Menu().buttonMenu();
        new Utils_Menu().buttonNews();
        new CheckUtils_News().checkTitleNews_Visibility();

    }

//        new UtilsHelper().timerWaitingAsyncOperation2000();
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
        new Utils_Helper().timerWaitingAsyncOperation1000();
        new Utils_Auth().logOutUtility();
//        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
//      utilsHelper.endAsyncOperation();

    }

    // работает 14.10.23
    @Test
    @DisplayName("Negative test. Test-case # 17 / Проверить функционал \"Создание карточки в категории \"Новый год\"")
    public void creatingNewsInCategoryCustomTest() {
        new Utils_News().clickEdit_News();
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();  // проверка всех элементов на исходном экране
        new Utils_News().inputCustomCategory_CreateNews();                          // вставить тестовые данные для поля Category
        new Utils_News().inputTitleCreateNews_Custom(); ;                           // вставить тестовые данные для поля Title в Category "Новый год"
        new Utils_News().inputPublicationDateCreateNews();                          // вставить валидные данные Publication Date
        new Utils_News().inputTimeCreateNews();                                     // вставить валидные данные Time
        new Utils_News().inputDescriptionCreateNews_Custom();                       // вставить валидные данные Description
        new Utils_News().clickButtonSaveCreateNews();                               // клик по кнопке SAVE
        new CheckUtils_News().checkTitleCreatingNews_Visibility();                  // проверка Title экрана Creating News (News не создана)
        new Utils_Helper().backSystemButton();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
    }


    // со всеми пустыми полями

    // с не валидными данными
}
