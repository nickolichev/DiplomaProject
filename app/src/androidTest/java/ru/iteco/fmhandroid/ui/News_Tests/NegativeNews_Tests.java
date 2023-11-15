package ru.iteco.fmhandroid.ui.News_Tests;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import io.qameta.allure.kotlin.junit4.DisplayName;
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

    @Before
    public void startUp() {

        new Utils_Helper().timerWaitingAsyncOperation3000();
        new Utils_Auth().authorizationUtility();
        new Utils_Helper().timerWaitingAsyncOperation3000();
        new Utils_Menu().buttonMenu();
        new Utils_Menu().buttonNews();
        new CheckUtils_News().checkTitleNews_Visibility();

    }

    @After
    public void logOut() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        new Utils_Auth().logOutUtility();
    }

    // работает 14.11.23
    @Test
    @DisplayName("Negative test. Test-case # 17 / Проверить функционал \"Создание карточки в пользовательской категории \"Новый год\"")
    public void creatingNewsInCategoryCustomTest() {
        new Utils_News().clickEdit_News();
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        new Utils_News().inputCustomCategory_CreateNews();
        new Utils_News().inputTitleCreateNews_Custom();
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputDescriptionCreateNews_Custom();
        new Utils_News().clickButtonSaveCreateNews();
        new Utils_Helper().backSystemButton();
        new CheckUtils_News().checkTitleCardNews_Custom_NotVisibility();
    }

    // работает 14.11.23
    @Test
    @DisplayName("Negative test. Test-case # 26 / Проверить создание News с незаполненными полями формы Creating News")
    public void creatingNewsWithEmptyFieldsTest() {
        new Utils_News().clickEdit_News();
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        // оставляем пустым поле Category
        new Utils_News().inputTitleCreateNews_Advertisement();
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputDescriptionCreateNews_Advertisement();
        new Utils_News().clickButtonSaveCreateNews();
        new CheckUtils_News().checkIconEmptyFieldCategory_CreatingNews_Visibility();
        new CheckUtils_News().checkFieldTitle_Advertisement_Visibility();
        new CheckUtils_News().checkFieldDate_Visibility();
        new CheckUtils_News().checkFieldTime_Visibility();
        new CheckUtils_News().checkFieldDescription_Advertisement_Visibility();
        // оставляем пустым поле Title
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().clearTitleField_CreateNews();
        new Utils_News().clickButtonSaveCreateNews();
        new CheckUtils_News().checkFieldCategory_Advertisement_Visibility();
        new CheckUtils_News().checkFieldDescription_Advertisement_Visibility();
        new CheckUtils_News().checkFieldDate_Visibility();
        new CheckUtils_News().checkFieldTime_Visibility();
        new CheckUtils_News().checkFieldDescription_Advertisement_Visibility();
        new CheckUtils_News().checkIconEmptyFieldsRemaining_CreatingNews_Visibility();
        // оставляем пустым поле Publication date
        new Utils_News().inputTitleCreateNews_Advertisement();
        new Utils_News().clearPublicationDateField_CreateNews();
        new Utils_News().clickButtonSaveCreateNews();
        new CheckUtils_News().checkFieldCategory_Advertisement_Visibility();
        new CheckUtils_News().checkFieldTitle_Advertisement_Visibility();
        new CheckUtils_News().checkIconEmptyFieldsRemaining_CreatingNews_Visibility();
        new CheckUtils_News().checkFieldTime_Visibility();
        new CheckUtils_News().checkFieldDescription_Advertisement_Visibility();
        // оставляем пустым поле Time
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().clearTimeField_CreateNews();
        new Utils_News().clickButtonSaveCreateNews();
        new CheckUtils_News().checkFieldCategory_Advertisement_Visibility();
        new CheckUtils_News().checkFieldTitle_Advertisement_Visibility();
        new CheckUtils_News().checkFieldDate_Visibility();
        new CheckUtils_News().checkIconEmptyFieldsRemaining_CreatingNews_Visibility();
        new CheckUtils_News().checkFieldDescription_Advertisement_Visibility();
        // оставляем пустым поле Description
        new Utils_News().inputTimeCreateNews();
        new Utils_News().clearDescriptionField_CreateNews();
        new Utils_News().clickButtonSaveCreateNews();
        new CheckUtils_News().checkFieldCategory_Advertisement_Visibility();
        new CheckUtils_News().checkFieldTitle_Advertisement_Visibility();
        new CheckUtils_News().checkFieldDate_Visibility();
        new CheckUtils_News().checkFieldTime_Visibility();
        new CheckUtils_News().checkIconEmptyFieldsRemaining_CreatingNews_Visibility();
        new Utils_News().clickButtonCancelCreateNews();
        new Utils_News().clickOkButtonModalViewCreateNews();
    }

    // работает 14.11.23
    @Test
    @DisplayName("Negative test. / Bug / Test-case # 27 / Проверить создание News с невалидными тестовыми данными в полях Title, Description формы Creating News")
    public void creatingNewsInvalid_Title_Description_Test() {
        new Utils_News().clickEdit_News();
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputInvalidTitleCreateNews();
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputInvalidDescriptionCreateNews();
        new Utils_News().clickButtonSaveCreateNews();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_Invalid_Title_Description();
        new CheckUtils_News().checkInvalidTitle_Visibility();
        new CheckUtils_News().checkPublicationValueControlPanel_Visibility();
        new CheckUtils_News().checkCreationDateValueControlPanel_Visibility();
        new Utils_News().clickExpendCard_News();
        new CheckUtils_News().checkInvalidDescription_Visibility();
        new Utils_News().clickButtonDelete_News();
        new Summary_Methods_News().checkAllElements_ModalView_Delete_Visibility();
        new Utils_News().clickOklModalDelete();
        new CheckUtils_News().checkInvalidTitle_NotVisibility();
        new CheckUtils_News().checkInvalidDescription_NotVisibility();
    }

    // тест не имеет место быть, так как при вводе через Календарь ввод невалидной даты невозможен
//    @Test
//    @DisplayName("Negative test. / Bug / Test-case # 28 / Проверить создание News с невалидными тестовыми данными в поле Date формы Creating News")
//    public void creatingNewsInvalid_Date_Test() {
//        new Utils_News().clickEdit_News();
//        new Utils_News().clickButtonAdd_News();
//        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
//        new Utils_News().selectAdvertisementCategory_CreateNews();
//        new Utils_News().inputTitleCreateNews_Advertisement();
//        new Utils_News().inputInvalidPublicationDateCreateNews();
//        new Utils_News().inputTimeCreateNews();
//        new Utils_News().inputDescriptionCreateNews_Advertisement();
//        new Utils_News().clickButtonSaveCreateNews();
//        new CheckUtils_News().checkTitleControlPanel_Visibility();
//        new Utils_News().clickButtonFilter_ControlPanel();
//        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
//        new Summary_Methods_News().inputAllFieldsInFilterNews_Invalid_Date();
//        new CheckUtils_News().checkTitleCardNews_Advertisement_Visibility();
//        new CheckUtils_News().checkInvalidDate_Visibility();
//        new CheckUtils_News().checkCreationDateValueControlPanel_Visibility();
//        new Utils_News().clickExpendCard_News();
//        new CheckUtils_News().checkDescriptionControlPanel_Advertisement_Visibility();
//        new Utils_News().clickButtonDelete_News();
//        new Summary_Methods_News().checkAllElements_ModalView_Delete_Visibility();
//        new Utils_News().clickOklModalDelete();
//        new CheckUtils_News().checkInvalidTitle_NotVisibility();
//        new CheckUtils_News().checkInvalidDescription_NotVisibility();
//    }

    // тест не имеет место быть, так как при вводе через Календарь ввод невалидной Time невозможен
//    @Test
//    @DisplayName("Negative test. / Bug / Test-case # 29 / Проверить создание News с невалидными тестовыми данными в поле Time формы Creating News")
//    public void creatingNewsInvalid_Time_Test() {
//        new Utils_News().clickEdit_News();
//        new Utils_News().clickButtonAdd_News();
//        new Summary_Methods_News().checkAllElements_ViewCreatingNews_Visibility();
//        new Utils_News().selectAdvertisementCategory_CreateNews();
//        new Utils_News().inputTitleCreateNews_Advertisement();
//        new Utils_News().inputPublicationDateCreateNews();
//        new Utils_News().inputInvalidTimeCreateNews();
//        new Utils_News().inputDescriptionCreateNews_Advertisement();
//        new Utils_News().clickButtonSaveCreateNews();
//        new CheckUtils_News().checkTitleControlPanel_Visibility();
//        new Utils_News().clickButtonFilter_ControlPanel();
//        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
//        new Summary_Methods_News().inputAllFieldsInFilterNews_Invalid_Date();
//        new CheckUtils_News().checkTitleCardNews_Advertisement_Visibility();
//        new CheckUtils_News().checkInvalidDate_Visibility();
//        new CheckUtils_News().checkCreationDateValueControlPanel_Visibility();
//        new Utils_News().clickExpendCard_News();
//        new CheckUtils_News().checkDescriptionControlPanel_Advertisement_Visibility();
//        new Utils_News().clickButtonDelete_News();
//        new Summary_Methods_News().checkAllElements_ModalView_Delete_Visibility();
//        new Utils_News().clickOklModalDelete();
//        new CheckUtils_News().checkInvalidTitle_NotVisibility();
//        new CheckUtils_News().checkInvalidDescription_NotVisibility();
//    }

}
