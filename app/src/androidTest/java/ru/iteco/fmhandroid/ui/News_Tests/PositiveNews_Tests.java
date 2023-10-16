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

public class PositiveNews_Tests {

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

    // работает 12.10.23 + 14.10.23
    @Test
    @DisplayName("Positive test. Test-case # 16 / Отмененный процесс создания News")
    public void  cancellationProcessCreatingNewsTest() {
        new Utils_News().clickEdit_News();
        new Summary_Methods_News().checkElements_ViewControlPanel_Visibility();
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        new Utils_News().inputAdvertisementCategory_CreateNews();
        new Utils_News().inputTitleCreateNews_Advertisement() ;
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputDescriptionCreateNews_Advertisement();
        new Utils_News().clickButtonCancelCreateNews();
        new Summary_Methods_News().checkAllElements_ModalView_CreatingNews_Visibility();
        new Utils_News().clickCancelButtonModalViewCreateNews();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_test_case_16_Visibility();
        new Utils_News().clickButtonCancelCreateNews();
        new Utils_News().clickOkButtonModalViewCreateNews();
        new CheckUtils_News().checkTitleControlPanel_Visibility();

    }


    // работает 15.10.23
    @Test
    @DisplayName("Positive test. Test-case # 18 / Проверить функционал Создание + редактирование + удаление карточки в категории \"Объявление\"")
    public void newsInCategoryAdvertisementTest() {
        new Summary_Methods_News().checkElements_ViewNews_Visibility();
        new Utils_News().clickEdit_News();
        new Summary_Methods_News().checkElements_ViewControlPanel_Visibility();
        // создаем новую News
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        new Summary_Methods_News().inputAllFieldsInCreatingNews_Advertisement();
        new Utils_News().clickButtonSaveCreateNews();
        // проверяем, что новая News создана корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_Advertisement();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsInCreatedNews_Advertisement_Visibility();
        // редактируем созданную News
        new Utils_News().clickButtonEditNews();
        new Summary_Methods_News().inputAllFieldsInEditingNews_Advertisement();
        // проверяем, что редактирование News завершилось корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_After_Editing_Advertisement();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsAfterEditing_Advertisement_Visibility();
        // удаляем созданную и редактированную News
        new Utils_News().clickButtonDelete_News();
        new Summary_Methods_News().checkAllElements_ModalView_Delete_Visibility();
        new Utils_News().clickOklModalDelete();
        new CheckUtils_News().checkTitleCardNews_Advertisement_NotVisibility();
    }

    // работает 15.10.23
    @Test
    @DisplayName("Positive test. Test-case # 19 Проверить функционал Создание + редактирование + удаление карточки в категории \"День рождения\"")
    public void newsInCategoryBirthdayTest() {
        new Summary_Methods_News().checkElements_ViewNews_Visibility();
        new Utils_News().clickEdit_News();
        new Summary_Methods_News().checkElements_ViewControlPanel_Visibility();
        // создаем новую News
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        new Summary_Methods_News().inputAllFieldsInCreatingNews_Birthday();
        new Utils_News().clickButtonSaveCreateNews();
        // проверяем, что новая News создана корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_Birthday();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsInCreatedNews_Birthday_Visibility();
        // редактируем созданную News
        new Utils_News().clickButtonEditNews();
        new Summary_Methods_News().inputAllFieldsInEditingNews_Birthday();
        // проверяем, что редактирование News завершилось корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_After_Editing_Birthday();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsAfterEditing_Birthday_Visibility();
        // удаляем созданную и редактированную News
        new Utils_News().clickButtonDelete_News();
        new Summary_Methods_News().checkAllElements_ModalView_Delete_Visibility();
        new Utils_News().clickOklModalDelete();
        new CheckUtils_News().checkTitleCardNews_Birthday_NotVisibility();
    }

    // работает 15.10.23
    @Test
    @DisplayName("Positive test. Test-case # 20 Проверить функционал Создание + редактирование + удаление карточки в категории \"Зарплата\"")
    public void newsInCategorySalaryTest() {
        new Summary_Methods_News().checkElements_ViewNews_Visibility();
        new Utils_News().clickEdit_News();
        new Summary_Methods_News().checkElements_ViewControlPanel_Visibility();
        // создаем новую News
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        new Summary_Methods_News().inputAllFieldsInCreatingNews_Salary();
        new Utils_News().clickButtonSaveCreateNews();
        // проверяем, что новая News создана корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_Salary();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsInCreatedNews_Salary_Visibility();
        // редактируем созданную News
        new Utils_News().clickButtonEditNews();
        new Summary_Methods_News().inputAllFieldsInEditingNews_Salary();
        // проверяем, что редактирование News завершилось корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_After_Editing_Salary();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsAfterEditing_Salary_Visibility();
        // удаляем созданную и редактированную News
        new Utils_News().clickButtonDelete_News();
        new Summary_Methods_News().checkAllElements_ModalView_Delete_Visibility();
        new Utils_News().clickOklModalDelete();
        new CheckUtils_News().checkTitleCardNews_Salary_NotVisibility();
    }

    // работает 15.10.23
    @Test
    @DisplayName("Positive test. Test-case # 21 Проверить функционал Создание + редактирование + удаление карточки в категории \"Профсоюз\"")
    public void newsInCategoryTradeUnionTest() {
        new Summary_Methods_News().checkElements_ViewNews_Visibility();
        new Utils_News().clickEdit_News();
        new Summary_Methods_News().checkElements_ViewControlPanel_Visibility();
        // создаем новую News
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        new Summary_Methods_News().inputAllFieldsInCreatingNews_TradeUnion();
        new Utils_News().clickButtonSaveCreateNews();
        // проверяем, что новая News создана корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_TradeUnion();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsInCreatedNews_TradeUnion_Visibility();
        // редактируем созданную News
        new Utils_News().clickButtonEditNews();
        new Summary_Methods_News().inputAllFieldsInEditingNews_TradeUnion();
        // проверяем, что редактирование News завершилось корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_After_Editing_TradeUnion();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsAfterEditing_TradeUnion_Visibility();
        // удаляем созданную и редактированную News
        new Utils_News().clickButtonDelete_News();
        new Summary_Methods_News().checkAllElements_ModalView_Delete_Visibility();
        new Utils_News().clickOklModalDelete();
        new CheckUtils_News().checkTitleCardNews_TradeUnion_NotVisibility();
    }

    // работает 15.10.23
    @Test
    @DisplayName("Positive test. Test-case # 22 Проверить функционал Создание + редактирование + удаление карточки в категории \"Праздник\"")
    public void newsInCategoryHolidayTest() {
        new Summary_Methods_News().checkElements_ViewNews_Visibility();
        new Utils_News().clickEdit_News();
        new Summary_Methods_News().checkElements_ViewControlPanel_Visibility();
        // создаем новую News
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        new Summary_Methods_News().inputAllFieldsInCreatingNews_Holiday();
        new Utils_News().clickButtonSaveCreateNews();
        // проверяем, что новая News создана корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_Holiday();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsInCreatedNews_Holiday_Visibility();
        // редактируем созданную News
        new Utils_News().clickButtonEditNews();
        new Summary_Methods_News().inputAllFieldsInEditingNews_Holiday();
        // проверяем, что редактирование News завершилось корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_After_Editing_Holiday();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsAfterEditing_Holiday_Visibility();
        // удаляем созданную и редактированную News
        new Utils_News().clickButtonDelete_News();
        new Summary_Methods_News().checkAllElements_ModalView_Delete_Visibility();
        new Utils_News().clickOklModalDelete();
        new CheckUtils_News().checkTitleCardNews_Holiday_NotVisibility();
    }

    // работает 15.10.23
    @Test
    @DisplayName("Positive test. Test-case # 23 Проверить функционал Создание + редактирование + удаление карточки в категории \"Массаж\"")
    public void newsInCategoryMassageTest() {
        new Summary_Methods_News().checkElements_ViewNews_Visibility();
        new Utils_News().clickEdit_News();
        new Summary_Methods_News().checkElements_ViewControlPanel_Visibility();
        // создаем новую News
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        new Summary_Methods_News().inputAllFieldsInCreatingNews_Massage();
        new Utils_News().clickButtonSaveCreateNews();
        // проверяем, что новая News создана корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_Massage();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsInCreatedNews_Massage_Visibility();
        // редактируем созданную News
        new Utils_News().clickButtonEditNews();
        new Summary_Methods_News().inputAllFieldsInEditingNews_Massage();
        // проверяем, что редактирование News завершилось корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_After_Editing_Massage();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsAfterEditing_Massage_Visibility();
        // удаляем созданную и редактированную News
        new Utils_News().clickButtonDelete_News();
        new Summary_Methods_News().checkAllElements_ModalView_Delete_Visibility();
        new Utils_News().clickOklModalDelete();
        new CheckUtils_News().checkTitleCardNews_Massage_NotVisibility();
    }

    // работает 15.10.23
    @Test
    @DisplayName("Positive test. Test-case # 24 Проверить функционал Создание + редактирование + удаление карточки в категории \"Благодарность\"")
    public void newsInCategoryGratitudeTest() {
        new Summary_Methods_News().checkElements_ViewNews_Visibility();
        new Utils_News().clickEdit_News();
        new Summary_Methods_News().checkElements_ViewControlPanel_Visibility();
        // создаем новую News
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        new Summary_Methods_News().inputAllFieldsInCreatingNews_Gratitude();
        new Utils_News().clickButtonSaveCreateNews();
        // проверяем, что новая News создана корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_Gratitude();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsInCreatedNews_Gratitude_Visibility();
        // редактируем созданную News
        new Utils_News().clickButtonEditNews();
        new Summary_Methods_News().inputAllFieldsInEditingNews_Gratitude();
        // проверяем, что редактирование News завершилось корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_After_Editing_Gratitude();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsAfterEditing_Gratitude_Visibility();
        // удаляем созданную и редактированную News
        new Utils_News().clickButtonDelete_News();
        new Summary_Methods_News().checkAllElements_ModalView_Delete_Visibility();
        new Utils_News().clickOklModalDelete();
        new CheckUtils_News().checkTitleCardNews_Gratitude_NotVisibility();
    }

    // работает 15.10.23
    @Test
    @DisplayName("Positive test. Test-case # 25 Проверить функционал Создание + редактирование + удаление карточки в категории \"Нужна помощь\"")
    public void newsInCategoryHelpTest() {
        new Summary_Methods_News().checkElements_ViewNews_Visibility();
        new Utils_News().clickEdit_News();
        new Summary_Methods_News().checkElements_ViewControlPanel_Visibility();
        // создаем новую News
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        new Summary_Methods_News().inputAllFieldsInCreatingNews_Help();
        new Utils_News().clickButtonSaveCreateNews();
        // проверяем, что новая News создана корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_Help();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsInCreatedNews_Help_Visibility();
        // редактируем созданную News
        new Utils_News().clickButtonEditNews();
        new Summary_Methods_News().inputAllFieldsInEditingNews_Help();
        // проверяем, что редактирование News завершилось корректно
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_After_Editing_Help();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Summary_Methods_News().checkAllFieldsAfterEditing_Help_Visibility();
        // удаляем созданную и редактированную News
        new Utils_News().clickButtonDelete_News();
        new Summary_Methods_News().checkAllElements_ModalView_Delete_Visibility();
        new Utils_News().clickOklModalDelete();
        new CheckUtils_News().checkTitleCardNews_Help_NotVisibility();
    }

    @Test
    @DisplayName("Positive test. Test-case # 26 / на экране NEWS проверить функционал Filter news")
    public void filterNewsTest() {
        new Summary_Methods_News().checkElements_ViewNews_Visibility();
        new Utils_News().clickEdit_News();
        new Summary_Methods_News().checkElements_ViewControlPanel_Visibility();
        // создаем новую News
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        new Summary_Methods_News().inputFieldsInCreatingNews_Advertisement();
        new Utils_News().clickButtonSaveCreateNews();
        new Utils_Menu().buttonMenu();
        new Utils_Menu().buttonNews();
        // находим на экране по фильтру созданную News
        new Utils_News().clickFilter_News();
        new Summary_Methods_News().inputAllFieldsInFilterNews();
        new CheckUtils_News().checkTitleCardNews_Advertisement_Visibility();
    }
}

