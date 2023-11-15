package ru.iteco.fmhandroid.ui.PageObject;

import io.qameta.allure.kotlin.junit4.DisplayName;

public class Summary_Methods_News {

    @DisplayName("Сводный метод проверок в модальном окне-предупреждении")
    public void checkAllElements_ModalView_CreatingNews_Visibility() {
        new CheckUtils_News().checkMessageTextModalView_Visibility();
        new CheckUtils_News().checkButtonOkModalView_Visibility();
        new CheckUtils_News().checkButtonCancelModalView_Visibility();
    }

    @DisplayName("Сводный метод проверок в модальном окне DELETE ")
    public void checkAllElements_ModalView_Delete_Visibility() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        new CheckUtils_News().checkMessageDeleteModal_Visibility();
        new CheckUtils_News().checkCancelDeleteModal_Visibility();
        new CheckUtils_News().checkOkDeleteModal_Visibility();
    }

    @DisplayName("Сводный метод проверок на экране News / верхняя панель экрана")
    public void checkElements_ViewNews_Visibility() {
        new CheckUtils_News().checkTitleNews_Visibility();
        new CheckUtils_News().checkButtonSortNews_Visibility();
        new CheckUtils_News().checkButtonFilterNews_Visibility();
        new CheckUtils_News().checkButtonEditNews_Visibility();
//        new CheckUtils_News().checkEmojiCategoryNews_Visibility();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("Сводный метод проверок на экране Control panel / верхняя панель экрана")
    public void checkElements_ViewControlPanel_Visibility() {
        new CheckUtils_News().checkTitleControlPanel_Visibility();
        new CheckUtils_News().checkSortControlPanel_Visibility();
        new CheckUtils_News().checkIconFilterControlPanel_Visibility();
        new CheckUtils_News().checkButtonAddControlPanel_Visibility();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #15 / Сводный метод проверок Title, НЕзаполненных полей и кнопок на экране Creating News")
    public void checkAllElements_ViewCreatingNews_Visibility() {
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

    @DisplayName("test-case #16 / Сводный метод проверок на экране Creating News с заполненными полями")
    public void checkAllElementsAfterFilling_ViewCreatingNews_Visibility() {
        new CheckUtils_News().checkFieldCategory_Advertisement_Visibility();
        new CheckUtils_News().checkFieldTitle_Advertisement_Visibility();
        new CheckUtils_News().checkFieldDate_Visibility();
        new CheckUtils_News().checkFieldTime_Visibility();
        new CheckUtils_News().checkFieldDescription_Advertisement_Visibility();
        new CheckUtils_News().checkSwitcherOnCreatingNews_Visibility();
        new CheckUtils_News().checkButtonSaveCreatingNews_Visibility();
        new CheckUtils_News().checkButtonCancelCreatingNews_Visibility();
    }

    // test-case #18
    @DisplayName("test-case #18 / Сводный метод заполнения полей на экране Creating News в Category Advertisement")
    public void inputAllFieldsInCreatingNews_Advertisement() {
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputTitleCreateNews_Advertisement();
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputDescriptionCreateNews_Advertisement();
    }

    @DisplayName("test-case #18-25 / Сводный метод проверок на экране Control panel / List / созданной NEWS для всех Category")
    public void checkFieldsInCreatedNews_Visibility() {
        new CheckUtils_News().checkPublicationDateText_Visibility();
        new CheckUtils_News().checkPublicationValueControlPanel_Visibility();
        new CheckUtils_News().checkCreationDateControlPanel_Visibility();
        new CheckUtils_News().checkCreationDateValueControlPanel_Visibility();
        new CheckUtils_News().checkAuthorControlPanel_Visibility();
        new CheckUtils_News().checkAuthorValueControlPanel_Visibility();
        new CheckUtils_News().checkActiveControlPanel_Visibility();
        new CheckUtils_News().checkDeleteControlPanel_Visibility();
        new CheckUtils_News().checkEditControlPanel_Visibility();
        new CheckUtils_News().checkExpendControlPanel_Visibility();
        new Utils_News().clickExpendCard_News();
    }

    @DisplayName("test-case #18-25 / Сводный метод проверок на экране Control panel / List / Редактированной NEWS для всех Category")
    public void checkFieldsInCreatedNewsAfterEditing_Visibility() {
        new CheckUtils_News().checkPublicationDateText_Visibility();
        new CheckUtils_News().checkEditedPublicationDate_Visibility();
        new CheckUtils_News().checkCreationDateControlPanel_Visibility();
        new CheckUtils_News().checkCreationDateValueControlPanel_Visibility();
        new CheckUtils_News().checkAuthorControlPanel_Visibility();
        new CheckUtils_News().checkAuthorValueControlPanel_Visibility();
        new CheckUtils_News().checkNotActiveControlPanel_Visibility();
        new Utils_News().clickExpendCard_News();
    }

    @DisplayName("test-case #18 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Advertisement")
    public void checkAllFieldsInCreatedNews_Advertisement_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Advertisement_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Advertisement_Visibility();
    }

    @DisplayName("test-case #18 / Сводный метод заполнения полей на экране Filter News в Category Advertisement")
    public void inputAllFieldsInFilterNews_Advertisement() {
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    @DisplayName("test-case #18 / Сводный метод заполнения полей на экране Editing News в Category Advertisement")
    public void inputAllFieldsInEditingNews_Advertisement() {
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputTitleEdited_Advertisement();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Advertisement();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
    }

    @DisplayName("test-case #18 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Advertisement")
    public void inputAllFieldsInFilterNews_After_Editing_Advertisement() {
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation2000();
    }

    @DisplayName("test-case #18 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Advertisement")
    public void checkAllFieldsAfterEditing_Advertisement_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Advertisement_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Advertisement_Visibility();
    }

    // test-case #19
    @DisplayName("test-case #19 / Сводный метод заполнения полей на экране Creating News в Category Birthday")
    public void inputAllFieldsInCreatingNews_Birthday() {
        new Utils_News().selectCategoryBirthday();
        new Utils_News().inputTitleCreateNews_Birthday();
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputDescriptionCreateNews_Birthday();
    }

    @DisplayName("test-case #19 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Birthday")
    public void checkAllFieldsInCreatedNews_Birthday_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Birthday_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Birthday_Visibility();
    }

    @DisplayName("test-case #19 / Сводный метод заполнения полей на экране Filter News в Category Birthday")
    public void inputAllFieldsInFilterNews_Birthday() {
        new Utils_News().selectCategoryBirthday();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #19 / Сводный метод заполнения полей на экране Editing News в Category Birthday")
    public void inputAllFieldsInEditingNews_Birthday() {
        new Utils_News().selectCategoryBirthday();
        new Utils_News().inputTitleEdited_Birthday();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Birthday();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #19 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Birthday")
    public void inputAllFieldsInFilterNews_After_Editing_Birthday() {
        new Utils_News().selectCategoryBirthday();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #19 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Birthday")
    public void checkAllFieldsAfterEditing_Birthday_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Birthday_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Birthday_Visibility();
    }

    // test-case #20
    @DisplayName("test-case #20 / Сводный метод заполнения полей на экране Creating News в Category Salary")
    public void inputAllFieldsInCreatingNews_Salary() {
        new Utils_News().selectCategorySalary();
        new Utils_News().inputTitleCreateNews_Salary();
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputDescriptionCreateNews_Salary();
    }

    @DisplayName("test-case #20 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Salary")
    public void checkAllFieldsInCreatedNews_Salary_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Salary_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Salary_Visibility();
    }

    @DisplayName("test-case #20 / Сводный метод заполнения полей на экране Filter News в Category Salary")
    public void inputAllFieldsInFilterNews_Salary() {
        new Utils_News().selectCategorySalary();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #20 / Сводный метод заполнения полей на экране Editing News в Category Salary")
    public void inputAllFieldsInEditingNews_Salary() {
        new Utils_News().selectCategorySalary();
        new Utils_News().inputTitleEdited_Salary();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Salary();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #20 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Salary")
    public void inputAllFieldsInFilterNews_After_Editing_Salary() {
        new Utils_News().selectCategorySalary();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #20 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Salary")
    public void checkAllFieldsAfterEditing_Salary_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Salary_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Salary_Visibility();
    }

    @DisplayName("test-case #21 / Сводный метод заполнения полей на экране Creating News в Category Trade Union")
    public void inputAllFieldsInCreatingNews_TradeUnion() {
        new Utils_News().selectCategoryTradeUnion();
        new Utils_News().inputTitleCreateNews_TradeUnion();
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputDescriptionCreateNews_TradeUnion();
    }

    @DisplayName("test-case #21 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Trade Union")
    public void checkAllFieldsInCreatedNews_TradeUnion_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_TradeUnion_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_TradeUnion_Visibility();
    }

    @DisplayName("test-case #21 / Сводный метод заполнения полей на экране Filter News в Category Trade Union")
    public void inputAllFieldsInFilterNews_TradeUnion() {
        new Utils_News().selectCategoryTradeUnion();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #21 / Сводный метод заполнения полей на экране Editing News в Category Trade Union")
    public void inputAllFieldsInEditingNews_TradeUnion() {
        new Utils_News().selectCategoryTradeUnion();
        new Utils_News().inputTitleEdited_TradeUnion();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_TradeUnion();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #21 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Trade Union")
    public void inputAllFieldsInFilterNews_After_Editing_TradeUnion() {
        new Utils_News().selectCategoryTradeUnion();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #21 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Trade Union")
    public void checkAllFieldsAfterEditing_TradeUnion_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_TradeUnion_Visibility();
        new CheckUtils_News().checkPublicationDateText_Visibility();
        new CheckUtils_News().checkEditedPublicationDate_Visibility();
        new CheckUtils_News().checkCreationDateControlPanel_Visibility();
        new CheckUtils_News().checkCreationDateValueControlPanel_Visibility();
        new CheckUtils_News().checkAuthorControlPanel_Visibility();
        new CheckUtils_News().checkAuthorValueControlPanel_Visibility();
        new CheckUtils_News().checkNotActiveControlPanel_Visibility();
        new Utils_News().clickExpendCard_News();
        new CheckUtils_News().checkEditedDescription_TradeUnion_Visibility();
    }

    // test-case #22
    @DisplayName("test-case #22 / Сводный метод заполнения полей на экране Creating News в Category Holiday")
    public void inputAllFieldsInCreatingNews_Holiday() {
        new Utils_News().selectCategoryHoliday();
        new Utils_News().inputTitleCreateNews_Holiday();
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputDescriptionCreateNews_Holiday();
    }

    @DisplayName("test-case #22 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Holiday")
    public void checkAllFieldsInCreatedNews_Holiday_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Holiday_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Holiday_Visibility();
    }

    @DisplayName("test-case #22 / Сводный метод заполнения полей на экране Filter News в Category Holiday")
    public void inputAllFieldsInFilterNews_Holiday() {
        new Utils_News().selectCategoryHoliday();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #22 / Сводный метод заполнения полей на экране Editing News в Category Holiday")
    public void inputAllFieldsInEditingNews_Holiday() {
        new Utils_News().selectCategoryHoliday();
        new Utils_News().inputTitleEdited_Holiday();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Holiday();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #22 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Holiday")
    public void inputAllFieldsInFilterNews_After_Editing_Holiday() {
        new Utils_News().selectCategoryHoliday();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #22 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Holiday")
    public void checkAllFieldsAfterEditing_Holiday_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Holiday_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Holiday_Visibility();
    }

    @DisplayName("test-case #23 / Сводный метод заполнения полей на экране Creating News в Category Massage")
    public void inputAllFieldsInCreatingNews_Massage() {
        new Utils_News().selectCategoryMassage();
        new Utils_News().inputTitleCreateNews_Massage();
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputDescriptionCreateNews_Massage();
    }

    @DisplayName("test-case #23 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Massage")
    public void checkAllFieldsInCreatedNews_Massage_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Massage_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Massage_Visibility();
    }

    @DisplayName("test-case #23 / Сводный метод заполнения полей на экране Filter News в Category Massage")
    public void inputAllFieldsInFilterNews_Massage() {
        new Utils_News().selectCategoryMassage();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #23 / Сводный метод заполнения полей на экране Editing News в Category Massage")
    public void inputAllFieldsInEditingNews_Massage() {
        new Utils_News().selectCategoryMassage();
        new Utils_News().inputTitleEdited_Massage();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Massage();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #23 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Massage")
    public void inputAllFieldsInFilterNews_After_Editing_Massage() {
        new Utils_News().selectCategoryMassage();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #23 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Massage")
    public void checkAllFieldsAfterEditing_Massage_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Massage_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Massage_Visibility();
    }

    @DisplayName("test-case #24 / Сводный метод заполнения полей на экране Creating News в Category Gratitude")
    public void inputAllFieldsInCreatingNews_Gratitude() {
        new Utils_News().selectCategoryGratitude();
        new Utils_News().inputTitleCreateNews_Gratitude();
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputDescriptionCreateNews_Gratitude();
    }

    @DisplayName("test-case #24 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Gratitude")
    public void checkAllFieldsInCreatedNews_Gratitude_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Gratitude_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Gratitude_Visibility();
    }

    @DisplayName("test-case #24 / Сводный метод заполнения полей на экране Filter News в Category Gratitude")
    public void inputAllFieldsInFilterNews_Gratitude() {
        new Utils_News().selectCategoryGratitude();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #24 / Сводный метод заполнения полей на экране Editing News в Category Gratitude")
    public void inputAllFieldsInEditingNews_Gratitude() {
        new Utils_News().selectCategoryGratitude();
        new Utils_News().inputTitleEdited_Gratitude();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Gratitude();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #24 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Gratitude")
    public void inputAllFieldsInFilterNews_After_Editing_Gratitude() {
        new Utils_News().selectCategoryGratitude();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #24 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Gratitude")
    public void checkAllFieldsAfterEditing_Gratitude_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Gratitude_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Gratitude_Visibility();
    }

    @DisplayName("test-case #25 / Сводный метод заполнения полей на экране Creating News в Category Help")
    public void inputAllFieldsInCreatingNews_Help() {
        new Utils_News().selectCategoryHelp();
        new Utils_News().inputTitleCreateNews_Help();
        new Utils_News().inputPublicationDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputDescriptionCreateNews_Help();
    }

    @DisplayName("test-case #25 / Сводный метод проверок на экране Control panel / List / созданной NEWS в Category Help")
    public void checkAllFieldsInCreatedNews_Help_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkTitleCardNews_Help_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNews_Visibility();
        new CheckUtils_News().checkDescription_Help_Visibility();
    }

    @DisplayName("test-case #25 / Сводный метод заполнения полей на экране Filter News в Category Help")
    public void inputAllFieldsInFilterNews_Help() {
        new Utils_News().selectCategoryHelp();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #25 / Сводный метод заполнения полей на экране Editing News в Category Help")
    public void inputAllFieldsInEditingNews_Help() {
        new Utils_News().selectCategoryHelp();
        new Utils_News().inputTitleEdited_Help();
        new Utils_News().inputDateEditedNews();
        new Utils_News().inputTimeEditedNews();
        new Utils_News().inputDescriptionEdited_Help();
        new Utils_News().clickSwitch();
        new Utils_News().clickSaveEditing();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #25 / Сводный метод заполнения полей на экране Filter News ПОСЛЕ редактирования News в Category Help")
    public void inputAllFieldsInFilterNews_After_Editing_Help() {
        new Utils_News().selectCategoryHelp();
        new Utils_News().inputDateStart_AfterEditing_FilterNews();
        new Utils_News().inputDateEnd_AfterEditing_FilterNews();
        new Utils_News().clickActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #25 / Сводный метод проверок на экране Control panel / List / созданной NEWS ПОСЛЕ редактирования в Category Help")
    public void checkAllFieldsAfterEditing_Help_Visibility() {
        new CheckUtils_News().checkEmojiCategory_Visibility();
        new CheckUtils_News().checkEditedTitle_Help_Visibility();
        new Summary_Methods_News().checkFieldsInCreatedNewsAfterEditing_Visibility();
        new CheckUtils_News().checkEditedDescription_Help_Visibility();
    }

    @DisplayName("test-case #26 / Сводный метод заполнения полей на экране Creating News в Category Advertisement")
    public void inputFieldsInCreatingNews_Advertisement() {
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputTitleCreateNews_Advertisement();
        new Utils_News().inputCurrentDateCreateNews();
        new Utils_News().inputTimeCreateNews();
        new Utils_News().inputDescriptionCreateNews_Advertisement();
    }

    @DisplayName("test-case #26 / экран NEWS / Сводный метод заполнения полей на экране Filter News")
    public void inputAllFieldsInFilterNews() {
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputDateStart();
        new Utils_News().inputDateEnd();
        new Utils_News().clickButtonFilter_FilterNews();
    }

    @DisplayName("test-case #27 / Сводный метод заполнения полей на экране Filter News НЕвалидными тестовыми данными Title, Description")
    public void inputAllFieldsInFilterNews_Invalid_Title_Description() {
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #28 / Сводный метод заполнения полей на экране Filter News НЕвалидными тестовыми данными Date")
    public void inputAllFieldsInFilterNews_Invalid_Date() {
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputInvalidDateStart_FilterNews();
        new Utils_News().inputInvalidDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("test-case #28 / Сводный метод заполнения полей на экране Filter News НЕвалидными тестовыми данными Date, Time")
    public void inputAllFieldsInFilterNews_Invalid_Date_Time() {
        new Utils_News().selectCategoryAdvertisement();
        new Utils_News().inputDateStart_FilterNews();
        new Utils_News().inputDateEnd_FilterNews();
        new Utils_News().clickNotActive_ControlPanel_Filter();
        new Utils_News().clickButtonFilter_FilterNews();
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

}
