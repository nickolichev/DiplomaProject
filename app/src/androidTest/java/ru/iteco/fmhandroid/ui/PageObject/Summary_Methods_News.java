package ru.iteco.fmhandroid.ui.PageObject;

import io.qameta.allure.kotlin.Allure;
import io.qameta.allure.kotlin.Step;

public class Summary_Methods_News {

    public void checkAllElements_ModalView_CreatingNews_Visibility() {
        Allure.step("Сводный метод проверок в модальном окне-предупреждении");
        new CheckUtils_News().checkMessageTextModalView_Visibility();
        new CheckUtils_News().checkButtonOkModalView_Visibility();
        new CheckUtils_News().checkButtonCancelModalView_Visibility();
    }

    public void checkAllElements_ModalView_Delete_Visibility() {
        Allure.step("Сводный метод проверок в модальном окне DELETE");
        new CheckUtils_News().checkMessageDeleteModal_Visibility();
        new CheckUtils_News().checkCancelDeleteModal_Visibility();
        new CheckUtils_News().checkOkDeleteModal_Visibility();
    }

    public void checkElements_ViewNews_Visibility() {
        Allure.step("Сводный метод проверок на экране News / верхняя панель экрана");
        new CheckUtils_News().checkTitleNewsView_Visibility();
        new CheckUtils_News().checkButtonSortNews_Visibility();
        new CheckUtils_News().checkButtonFilterNews_Visibility();
        new CheckUtils_News().checkButtonEditNews_Visibility();
    }

    public void checkElements_ControlPanelView_Visibility() {
        Allure.step("Сводный метод проверок на экране Control panel / верхняя панель экрана");
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new CheckUtils_News().checkSortControlPanel_Visibility();
        new CheckUtils_News().checkIconFilterControlPanel_Visibility();
        new CheckUtils_News().checkButtonAddControlPanel_Visibility();
    }

    public void checkAllElements_CreatingNewsView_Visibility() {
        Allure.step("All test-cases / Сводный метод проверок Title экрана Creating News + НЕзаполненных полей и кнопок на экране Creating News");
        new CheckUtils_News().checkCreatingNewsTitle_Visibility();
        new CheckUtils_News().checkFieldCategory_Visibility();
        new CheckUtils_News().checkFieldTitle_Visibility();
        new CheckUtils_News().checkFieldPublicationDate_Visibility();
        new CheckUtils_News().checkFieldPublicationTime_Visibility();
        new CheckUtils_News().checkFieldDescription_Visibility();
        new CheckUtils_News().checkSwitcherOnCreatingNews_Visibility();
        new CheckUtils_News().checkButtonSaveCreatingNews_Visibility();
        new CheckUtils_News().checkButtonCancelCreatingNews_Visibility();
    }

    public void checkAllElementsAfterFilling_ViewCreatingNews_Visibility() {
        Allure.step("test-case #16 / Сводный метод проверок на экране Creating News с заполненными полями");
        new CheckUtils_News().checkFieldCategory_Advertisement_Visibility();
        new CheckUtils_News().checkFieldTitle_Advertisement_Visibility();
        new CheckUtils_News().checkFieldDate_Visibility();
        new CheckUtils_News().checkFieldTime_Visibility();
        new CheckUtils_News().checkFieldDescription_Advertisement_Visibility();
        new CheckUtils_News().checkSwitcherOnCreatingNews_Visibility();
        new CheckUtils_News().checkButtonSaveCreatingNews_Visibility();
        new CheckUtils_News().checkButtonCancelCreatingNews_Visibility();
    }

    public void inputAllFieldsInCreatingNews_Advertisement() {
        Allure.step("test-case #18 / Сводный метод заполнения полей на экране Creating News в Category Advertisement");
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputTitle_Advertisement();
        new Utils_News().inputPublicationDate();
        new Utils_News().inputTime();
        new Utils_News().inputDescription_Advertisement();
    }

    public void checkFieldsInCreatedNews_Visibility() {
        Allure.step("test-case #18-25 / Сводный метод проверок на экране Control panel / List / созданной NEWS для всех Category");
        new CheckUtils_News().checkPublicationDateText_Visibility();
        new CheckUtils_News().checkPublicationValueControlPanel_Visibility();
        new CheckUtils_News().checkCreationDateControlPanel_Visibility();
//        new CheckUtils_News().checkCreationDateValueControlPanel_Visibility();
        new CheckUtils_News().checkAuthorControlPanel_Visibility();
        new CheckUtils_News().checkAuthorValueControlPanel_Visibility();
        new CheckUtils_News().checkActiveControlPanel_Visibility();
        new CheckUtils_News().checkDeleteControlPanel_Visibility();
        new CheckUtils_News().checkEditControlPanel_Visibility();
        new CheckUtils_News().checkExpendControlPanel_Visibility();
        new Utils_News().clickExpendCardNews();
    }

    public void checkFieldsInCreatedNewsAfterEditing_Visibility() {
        Allure.step("test-case #18-25 / Сводный метод проверок на экране Control panel / List / Редактированной NEWS для всех Category");
        new CheckUtils_News().checkPublicationDateText_Visibility();
        new CheckUtils_News().checkEditedPublicationDate_Visibility();
        new CheckUtils_News().checkCreationDateControlPanel_Visibility();
//        new CheckUtils_News().checkCreationDateValueControlPanel_Visibility();
        new CheckUtils_News().checkAuthorControlPanel_Visibility();
        new CheckUtils_News().checkAuthorValueControlPanel_Visibility();
        new CheckUtils_News().checkNotActiveControlPanel_Visibility();
        new Utils_News().clickExpendCardNews();
    }

    public void checkAllFieldsInCreatedNews_Advertisement_Visibility() {
        Allure.step("test-case #18 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Advertisement");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Advertisement_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Advertisement_Visibility();
    }

    public void inputAllFieldsInFilterNews_Advertisement() {
        Allure.step("test-case #18 / Сводный метод заполнения полей на экране Filter News в Category Advertisement");
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void inputAllFieldsInEditingNews_Advertisement() {
        Allure.step("test-case #18 / Сводный метод заполнения полей на экране Editing News в Category Advertisement");
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputTitleEdited_Advertisement();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Advertisement();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
    }

    public void inputAllFieldsInFilterNews_After_Editing_Advertisement() {
        Allure.step("test-case #18 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Advertisement");
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void checkAllFieldsAfterEditing_Advertisement_Visibility() {
        Allure.step("test-case #18 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Advertisement");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Advertisement_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Advertisement_Visibility();
    }

    public void inputAllFieldsInCreatingNews_Birthday() {
        Allure.step("test-case #19 / Сводный метод заполнения полей на экране Creating News в Category Birthday");
        new Utils_News().selectCategoryBirthday();
        new Utils_News().inputTitle_Birthday();
        new Utils_News().inputPublicationDate();
        new Utils_News().inputTime();
        new Utils_News().inputDescription_Birthday();
    }

    public void checkAllFieldsInCreatedNews_Birthday_Visibility() {
        Allure.step("test-case #19 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Birthday");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Birthday_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Birthday_Visibility();
    }

    public void inputAllFieldsInFilterNews_Birthday() {
        Allure.step("test-case #19 / Сводный метод заполнения полей на экране Filter News в Category Birthday");
        new Utils_News().selectCategoryBirthday();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void inputAllFieldsInEditingNews_Birthday() {
        Allure.step("test-case #19 / Сводный метод заполнения полей на экране Editing News в Category Birthday");
        new Utils_News().selectCategoryBirthday();
        new Utils_News().inputTitleEdited_Birthday();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Birthday();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
    }

    public void inputAllFieldsInFilterNews_After_Editing_Birthday() {
        Allure.step("test-case #19 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Birthday");
        new Utils_News().selectCategoryBirthday();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void checkAllFieldsAfterEditing_Birthday_Visibility() {
        Allure.step("test-case #19 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Birthday");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Birthday_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Birthday_Visibility();
    }

    public void inputAllFieldsInCreatingNews_Salary() {
        Allure.step("test-case #20 / Сводный метод заполнения полей на экране Creating News в Category Salary");
        new Utils_News().selectCategorySalary();
        new Utils_News().inputTitle_Salary();
        new Utils_News().inputPublicationDate();
        new Utils_News().inputTime();
        new Utils_News().inputDescription_Salary();
    }

    public void checkAllFieldsInCreatedNews_Salary_Visibility() {
        Allure.step("test-case #20 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Salary");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Salary_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Salary_Visibility();
    }

    public void inputAllFieldsInFilterNews_Salary() {
        Allure.step("test-case #20 / Сводный метод заполнения полей на экране Filter News в Category Salary");
        new Utils_News().selectCategorySalary();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void inputAllFieldsInEditingNews_Salary() {
        Allure.step("test-case #20 / Сводный метод заполнения полей на экране Editing News в Category Salary");
        new Utils_News().selectCategorySalary();
        new Utils_News().inputTitleEdited_Salary();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Salary();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
    }

    public void inputAllFieldsInFilterNews_After_Editing_Salary() {
        Allure.step("test-case #20 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Salary");
        new Utils_News().selectCategorySalary();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void checkAllFieldsAfterEditing_Salary_Visibility() {
        Allure.step("test-case #20 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Salary");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Salary_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Salary_Visibility();
    }

    public void inputAllFieldsInCreatingNews_TradeUnion() {
        Allure.step("test-case #21 / Сводный метод заполнения полей на экране Creating News в Category Trade Union");
        new Utils_News().selectCategoryTradeUnion();
        new Utils_News().inputTitle_TradeUnion();
        new Utils_News().inputPublicationDate();
        new Utils_News().inputTime();
        new Utils_News().inputDescription_TradeUnion();
    }

    public void checkAllFieldsInCreatedNews_TradeUnion_Visibility() {
        Allure.step("test-case #21 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Trade Union");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_TradeUnion_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_TradeUnion_Visibility();
    }

    public void inputAllFieldsInFilterNews_TradeUnion() {
        Allure.step("test-case #21 / Сводный метод заполнения полей на экране Filter News в Category Trade Union");
        new Utils_News().selectCategoryTradeUnion();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void inputAllFieldsInEditingNews_TradeUnion() {
        Allure.step("test-case #21 / Сводный метод заполнения полей на экране Editing News в Category Trade Union");
        new Utils_News().selectCategoryTradeUnion();
        new Utils_News().inputTitleEdited_TradeUnion();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_TradeUnion();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
    }

    public void inputAllFieldsInFilterNews_After_Editing_TradeUnion() {
        Allure.step("test-case #21 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Trade Union");
        new Utils_News().selectCategoryTradeUnion();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void checkAllFieldsAfterEditing_TradeUnion_Visibility() {
        Allure.step("test-case #21 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Trade Union");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_TradeUnion_Visibility();
        new CheckUtils_News().checkPublicationDateText_Visibility();
        new CheckUtils_News().checkEditedPublicationDate_Visibility();
        new CheckUtils_News().checkCreationDateControlPanel_Visibility();
//        new CheckUtils_News().checkCreationDateValueControlPanel_Visibility();
        new CheckUtils_News().checkAuthorControlPanel_Visibility();
        new CheckUtils_News().checkAuthorValueControlPanel_Visibility();
        new CheckUtils_News().checkNotActiveControlPanel_Visibility();
        new Utils_News().clickExpendCardNews();
        new CheckUtils_News().checkEditedDescription_TradeUnion_Visibility();
    }

    public void inputAllFieldsInCreatingNews_Holiday() {
        Allure.step("test-case #22 / Сводный метод заполнения полей на экране Creating News в Category Holiday");
        new Utils_News().selectCategoryHoliday();
        new Utils_News().inputTitle_Holiday();
        new Utils_News().inputPublicationDate();
        new Utils_News().inputTime();
        new Utils_News().inputDescription_Holiday();
    }

    public void checkAllFieldsInCreatedNews_Holiday_Visibility() {
        Allure.step("test-case #22 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Holiday");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Holiday_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Holiday_Visibility();
    }

    public void inputAllFieldsInFilterNews_Holiday() {
        Allure.step("test-case #22 / Сводный метод заполнения полей на экране Filter News в Category Holiday");
        new Utils_News().selectCategoryHoliday();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void inputAllFieldsInEditingNews_Holiday() {
        Allure.step("test-case #22 / Сводный метод заполнения полей на экране Editing News в Category Holiday");
        new Utils_News().selectCategoryHoliday();
        new Utils_News().inputTitleEdited_Holiday();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Holiday();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
    }

    public void inputAllFieldsInFilterNews_After_Editing_Holiday() {
        Allure.step("test-case #22 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Holiday");
        new Utils_News().selectCategoryHoliday();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void checkAllFieldsAfterEditing_Holiday_Visibility() {
        Allure.step("test-case #22 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Holiday");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Holiday_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Holiday_Visibility();
    }

    public void inputAllFieldsInCreatingNews_Massage() {
        Allure.step("test-case #23 / Сводный метод заполнения полей на экране Creating News в Category Massage");
        new Utils_News().selectCategoryMassage();
        new Utils_News().inputTitle_Massage();
        new Utils_News().inputPublicationDate();
        new Utils_News().inputTime();
        new Utils_News().inputDescription_Massage();
    }

    public void checkAllFieldsInCreatedNews_Massage_Visibility() {
        Allure.step("test-case #23 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Massage");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Massage_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Massage_Visibility();
    }

    public void inputAllFieldsInFilterNews_Massage() {
        Allure.step("test-case #23 / Сводный метод заполнения полей на экране Filter News в Category Massage");
        new Utils_News().selectCategoryMassage();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void inputAllFieldsInEditingNews_Massage() {
        Allure.step("test-case #23 / Сводный метод заполнения полей на экране Editing News в Category Massage");
        new Utils_News().selectCategoryMassage();
        new Utils_News().inputTitleEdited_Massage();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Massage();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
    }

    public void inputAllFieldsInFilterNews_After_Editing_Massage() {
        Allure.step("test-case #23 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Massage");
        new Utils_News().selectCategoryMassage();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void checkAllFieldsAfterEditing_Massage_Visibility() {
        Allure.step("test-case #23 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Massage");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Massage_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Massage_Visibility();
    }

    public void inputAllFieldsInCreatingNews_Gratitude() {
        Allure.step("test-case #24 / Сводный метод заполнения полей на экране Creating News в Category Gratitude");
        new Utils_News().selectCategoryGratitude();
        new Utils_News().inputTitle_Gratitude();
        new Utils_News().inputPublicationDate();
        new Utils_News().inputTime();
        new Utils_News().inputDescription_Gratitude();
    }

    public void checkAllFieldsInCreatedNews_Gratitude_Visibility() {
        Allure.step("test-case #24 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Gratitude");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Gratitude_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Gratitude_Visibility();
    }

    public void inputAllFieldsInFilterNews_Gratitude() {
        Allure.step("test-case #24 / Сводный метод заполнения полей на экране Filter News в Category Gratitude");
        new Utils_News().selectCategoryGratitude();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void inputAllFieldsInEditingNews_Gratitude() {
        Allure.step("test-case #24 / Сводный метод заполнения полей на экране Editing News в Category Gratitude");
        new Utils_News().selectCategoryGratitude();
        new Utils_News().inputTitleEdited_Gratitude();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Gratitude();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
    }

    public void inputAllFieldsInFilterNews_After_Editing_Gratitude() {
        Allure.step("test-case #24 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Gratitude");
        new Utils_News().selectCategoryGratitude();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void checkAllFieldsAfterEditing_Gratitude_Visibility() {
        Allure.step("test-case #24 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Gratitude");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Gratitude_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Gratitude_Visibility();
    }

    public void inputAllFieldsInCreatingNews_Help() {
        Allure.step("test-case #25 / Сводный метод заполнения полей на экране Creating News в Category Help");
        new Utils_News().selectCategoryHelp();
        new Utils_News().inputTitle_Help();
        new Utils_News().inputPublicationDate();
        new Utils_News().inputTime();
        new Utils_News().inputDescription_Help();
    }

    public void checkAllFieldsInCreatedNews_Help_Visibility() {
        Allure.step("test-case #25 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Help");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Help_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Help_Visibility();
    }

    public void inputAllFieldsInFilterNews_Help() {
        Allure.step("test-case #25 / Сводный метод заполнения полей на экране Filter News в Category Help");
        new Utils_News().selectCategoryHelp();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void inputAllFieldsInEditingNews_Help() {
        Allure.step("test-case #25 / Сводный метод заполнения полей на экране Editing News в Category Help");
        new Utils_News().selectCategoryHelp();
        new Utils_News().inputTitleEdited_Help();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Help();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
    }

    public void inputAllFieldsInFilterNews_After_Editing_Help() {
        Allure.step("test-case #25 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Help");
        new Utils_News().selectCategoryHelp();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void checkAllFieldsAfterEditing_Help_Visibility() {
        Allure.step("test-case #25 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Help");
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Help_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Help_Visibility();
    }

    public void inputFieldsInCreatingNews_Advertisement() {
        Allure.step("test-case #26 / Сводный метод заполнения полей на экране Creating News в Category Advertisement");
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputTitle_Advertisement();
        new Utils_News().inputPublicationDate();
        new Utils_News().inputTime();
        new Utils_News().inputDescription_Advertisement();
    }

    public void inputAllFieldsInFilterNews() {
        Allure.step("test-case #26 / экран NEWS / Сводный метод заполнения полей на экране Filter News");
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    public void inputAllFieldsInFilterNews_Invalid_Title_Description() {
        Allure.step("test-case #27 / Сводный метод заполнения полей на экране Filter News НЕвалидными тестовыми данными Title, Description");
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }
}
