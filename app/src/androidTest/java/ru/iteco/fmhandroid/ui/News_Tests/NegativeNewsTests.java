package ru.iteco.fmhandroid.ui.News_Tests;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import io.qameta.allure.kotlin.Description;
import io.qameta.allure.kotlin.junit4.DisplayName;
import io.qameta.allure.kotlin.junit4.Tag;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils_News;
import ru.iteco.fmhandroid.ui.PageObject.Summary_Methods_News;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Auth;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Helper;
import ru.iteco.fmhandroid.ui.PageObject.Utils_Menu;
import ru.iteco.fmhandroid.ui.PageObject.Utils_News;

public class NegativeNewsTests {
    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void startUp() {
        new Utils_Auth().authorizationUtility();
        new Utils_Menu().clickButtonMenu();
        new Utils_Menu().clickLineNews();
        new CheckUtils_News().checkTitleNewsView_Visibility();
    }

    @After
    public void logOut() {
        new Utils_Auth().logOutUtility();
    }

    @Test
    @DisplayName("Negative test. Test-case # 17")
    @Description("Проверить функционал \"Создание карточки в пользовательской категории \"Новый год\"")
    public void creatingNewsInCategoryCustomTest() {
        new Utils_News().clickEdit_News();
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_CreatingNewsView_Visibility();
        new Utils_News().inputCustomCategory();
        new Utils_News().inputTitle_Custom();
        new Utils_News().inputPublicationDate();
        new Utils_News().inputTime();
        new Utils_News().inputDescription_Custom();
        new Utils_News().clickButtonSaveCreatingNews();
        new Utils_Helper().backSystemButton();
        new CheckUtils_News().checkTitleCardNews_Custom_NotVisibility();
    }

    @Test
    @DisplayName("Negative test. Test-case # 26")
    @Description("Проверить создание News с незаполненными полями формы Creating News")
    public void creatingNewsWithEmptyFieldsTest() {
        new Utils_News().clickEdit_News();
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_CreatingNewsView_Visibility();
        // оставляем пустым поле Category
        new Utils_News().inputTitle_Advertisement();
        new Utils_News().inputPublicationDate();
        new Utils_News().inputTime();
        new Utils_News().inputDescription_Advertisement();
        new Utils_News().clickButtonSaveCreatingNews();
        new CheckUtils_News().checkIconEmptyFieldCategory_Visibility();
        new CheckUtils_News().checkFieldTitle_Advertisement_Visibility();
        new CheckUtils_News().checkFieldDate_Visibility();
        new CheckUtils_News().checkFieldTime_Visibility();
        new CheckUtils_News().checkFieldDescription_Advertisement_Visibility();
        // оставляем пустым поле Title
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().clearFieldTitle();
        new Utils_News().clickButtonSaveCreatingNews();
        new CheckUtils_News().checkFieldCategory_Advertisement_Visibility();
        new CheckUtils_News().checkFieldDescription_Advertisement_Visibility();
        new CheckUtils_News().checkFieldDate_Visibility();
        new CheckUtils_News().checkFieldTime_Visibility();
        new CheckUtils_News().checkFieldDescription_Advertisement_Visibility();
        new CheckUtils_News().checkIconEmptyFieldsRemaining_Visibility();
        // оставляем пустым поле Publication date
        new Utils_News().inputTitle_Advertisement();
        new Utils_News().clearFieldPublicationDate();
        new Utils_News().clickButtonSaveCreatingNews();
        new CheckUtils_News().checkFieldCategory_Advertisement_Visibility();
        new CheckUtils_News().checkFieldTitle_Advertisement_Visibility();
        new CheckUtils_News().checkIconEmptyFieldsRemaining_Visibility();
        new CheckUtils_News().checkFieldTime_Visibility();
        new CheckUtils_News().checkFieldDescription_Advertisement_Visibility();
        // оставляем пустым поле Time
        new Utils_News().inputPublicationDate();
        new Utils_News().clearFieldTime();
        new Utils_News().clickButtonSaveCreatingNews();
        new CheckUtils_News().checkFieldCategory_Advertisement_Visibility();
        new CheckUtils_News().checkFieldTitle_Advertisement_Visibility();
        new CheckUtils_News().checkFieldDate_Visibility();
        new CheckUtils_News().checkIconEmptyFieldsRemaining_Visibility();
        new CheckUtils_News().checkFieldDescription_Advertisement_Visibility();
        // оставляем пустым поле Description
        new Utils_News().inputTime();
        new Utils_News().clearFieldDescription();
        new Utils_News().clickButtonSaveCreatingNews();
        new CheckUtils_News().checkFieldCategory_Advertisement_Visibility();
        new CheckUtils_News().checkFieldTitle_Advertisement_Visibility();
        new CheckUtils_News().checkFieldDate_Visibility();
        new CheckUtils_News().checkFieldTime_Visibility();
        new CheckUtils_News().checkIconEmptyFieldsRemaining_Visibility();
        new Utils_News().clickButtonCancelCreateNews();
        new Utils_News().clickOkButtonModalViewCreatingNews();
    }

    @Test
    @DisplayName("Negative test. / Test-case # 27")
    @Description("Проверить создание News с невалидными тестовыми данными в полях Title, Description формы Creating News")
    @Tag("BUG / Приложение генерирует Creation date в неприемлимом формате / Creation date не может быть проверена, соответствующий метод закомментирован")
    public void creatingNewsInvalid_Title_Description_Test() {
        new Utils_News().clickEdit_News();
        new Utils_News().clickButtonAdd_News();
        new Summary_Methods_News().checkAllElements_CreatingNewsView_Visibility();
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputInvalidTitle();
        new Utils_News().inputPublicationDate();
        new Utils_News().inputTime();
        new Utils_News().inputInvalidDescription();
        new Utils_News().clickButtonSaveCreatingNews();
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new Utils_News().clickButtonFilter_ControlPanel();
        new CheckUtils_News().checkTitleFilterControlPanel_Visibility();
        new Summary_Methods_News().inputAllFieldsInFilterNews_Invalid_Title_Description();
        new CheckUtils_News().checkInvalidTitle_Visibility();
        new CheckUtils_News().checkPublicationValueControlPanel_Visibility();
        // использовать метод при отсутствии BUG
//        new CheckUtils_News().checkCreationDateValueControlPanel_Visibility();
        new Utils_News().clickExpendCardNews();
        new CheckUtils_News().checkInvalidDescription_Visibility();
        new Utils_News().clickButtonDelete_News();
        new Summary_Methods_News().checkAllElements_ModalView_Delete_Visibility();
        new Utils_News().clickOklModalDelete();
        new CheckUtils_News().checkInvalidTitle_NotVisibility();
        new CheckUtils_News().checkInvalidDescription_NotVisibility();
    }
}
