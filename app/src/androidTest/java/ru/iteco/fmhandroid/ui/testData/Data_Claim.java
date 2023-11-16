package ru.iteco.fmhandroid.ui.testData;
public class Data_Claim {
    public static final String TITLE_CLAIMS_TEXT = "Claims";
    public static final String TITLE_TEXT = "Title";
    public static final String EXECUTOR_TEXT = "Executor";
    public static final String PLAN_DATE_TEXT = "Plan date";
    public static final String DATE_TEXT = "Date";
    public static final String TIME_TEXT = "Time";
    public static final String DESCRIPTION_TEXT = "Description";

    // раскрытая карточка
    public static final String TITLE_TEXT_CARD = "Title";
    public static final String EXECUTOR_TEXT_CARD = "Executor";
    public static final String EXECUTOR_VALUE_OPEN_STATUS = "NOT ASSIGNED";
    public static final String PLAN_DATE_TEXT_CARD = "Plan date";
    public static final String AUTHOR_TEXT_CARD = "Author";
    public static final String AUTHOR_VALUE_CARD = "Ivanov Ivan Ivanovich";
    public static final String CREATED_TEXT_CARD = "Created";
    public static final String COMMENTATOR_VALUE_CARD = "Ivanov Ivan Ivanovich";

    public static final String CHANGE_THROW_OFF_TEXT_CARD = "Throw off";
    public static final String CHANGE_TO_EXECUTE_TEXT_CARD = "To execute";
    public static final String CHANGE_TAKE_TO_WORK_TEXT_CARD = "take to work";
    public static final String CHANGE_CANCEL_TEXT_CARD = "Cancel";

    public static final String CHANGE_STATUS_TEXT_CARD = "button change status";

    // Comment / List comments
    public static final String ADD_COMMENT_TEXT_CARD = "Add comment";
    public static final String FIELD_COMMENT = "Comment";
    public static final String ADD_COMMENT_BUTTON_TEXT_CARD = "button add comment";
    public static final String EDIT_COMMENT_BUTTON_TEXT_CARD = "button edit comment";
    public static final String AUTHOR_COMMENT = "Ivanov Ivan Ivanovich";

    public static final String BUTTON_CANCEL_COMMENT = "CANCEL";               // текст кнопки в создать/редактировать Comment
    public static final String BUTTON_CANCEL_COMMENT_DESCRIPTION = "Cancel";   // description кнопки в создать/редактировать Comment
    public static final String BUTTON_SAVE_COMMENT = "SAVE";                   // текст кнопки в создать/редактировать Comment
    public static final String BUTTON_SAVE_COMMENT_DESCRIPTION = "Save";       // description кнопки в создать/редактировать Comment


    // модальное окно FILTER + раскрытая карточка
    public static final String OPEN_STATUS_TEXT = "Open";               // для чек-бокса и карточки
    public static final String IN_PROGRESS_STATUS_TEXT = "In progress"; // для чек-бокса и карточки
    public static final String EXECUTED_STATUS_TEXT = "Executed";       // для чек-бокса и карточки
    public static final String CANCELLED_STATUS_TEXT = "Cancelled";     // для чек-бокса
    public static final String CANCELED_STATUS_TEXT = "Canceled";       // для карточки

    // модальное окно Comment (при смене статуса)
    public static final String COMMENT_TEXT_MODAL_VIEW = "Comment";
    public static final String CANCEL_TEXT_MODAL_VIEW = "CANCEL";
    public static final String CANCEL_CLICK_MODAL_VIEW = "Cancel";
    public static final String OK_TEXT_MODAL_VIEW = "OK";
    public static final String COMMENT_OPEN_INPUT_MODAL_VIEW = "Смена статуса Claim на Open";
    public static final String COMMENT_EXECUTED_INPUT_MODAL_VIEW = "Смена статуса Claim на Executed";


    public static final String INPUT_TITLE_7 = "Новая претензия без исполнителя + статус Open / 50"; //тест-кейс 7
    public static final String INPUT_DESCRIPTION_7 = "Testing the functionality Creating a new claim!!!!"; //тест-кейс 7
    public static final String INPUT_DESCRIPTION_8 = "Testing functionality \"From Open status to In Progress status\""; //тест-кейс 8
    public static final String INPUT_EDITING_DESCRIPTION_8 = "Editing Claims \"From Open status to In Progress status\""; //тест-кейс 8
    public static final String INPUT_DESCRIPTION_9 = "Description for test-case #9";                               //тест-кейс 9
    public static final String INPUT_DESCRIPTION_10 = "Смена статуса Open на In Progress через назначение Executor"; //тест-кейс 10
    public static final String COMMENT_CONTENT_CARD_7 = "Переводим в статус \"In progress\"";          //тест-кейс 7
    public static final String COMMENT_CONTENT_EDIT_CARD_7 = "Успешно переведена в статус \"In progress\" (через take to work)"; //тест-кейс 7
    public static final String INPUT_EXECUTOR_TEXT = "Ivanov Ivan Ivanovich";
    public static final String APP_BAR_CREATING_TEXT = "Creating";
    public static final String APP_BAR_CLAIMS_TEXT = "Claims";
    public static final String ADD_NEW_CLAIM_TEXT = "Add new claim button";                          //Description
    public static final String CANCEL_MODAL_VIEW_TEXT = "Cancel"; //
    public static final String OK_MODAL_VIEW_TEXT = "OK";
    public static final String CANCEL_CREATING_CLAIMS = "Cancel"; //Text + description
    public static final String SAVE_CREATING_CLAIMS = "Save";     //Text + description
    public static final String INPUT_DATE = "12.10.2023";
    public static final String INPUT_TIME = "02:35";

    // Editing Claim
    public static final String TITLE_EDITING = "Editing";
    public static final String SUB_TITLE_CLAIMS = "Claims";
    public static final String PLACEHOLDER_EXECUTOR = "Executor";
    public static final String DROPDOWN_EXECUTOR = "Show dropdown menu";

    public static final String EDIT_CARD_BUTTON_TEXT_CARD = "button settings";
    public static final String MAX_ALLOWED_CHARACTERS = "50";

    // Editing Comment
    public static final String SAVE_EDIT_COMMENT = "SAVE";
    public static final String SAVE_EDIT_COMMENT_DESCRIPTION = "Save";
    public static final String CANCEL_EDIT_COMMENT = "CANCEL";
    public static final String CANCEL_EDIT_COMMENT_DESCRIPTION = "Cancel";

    // INVALID Создание новой Claim  / тестовые данные
    public static final String INV_INPUT_TITLE = "Создание новой претензии в этом Title 51 знак     !";
    public static final String INV_INPUT_EXECUTOR = "Petrov Petr Petrovich";
    public static final String MODAL_VIEW_WARNING = "Fill empty fields"; // при незаполненных полях после клика по кнопке OK
    public static final String MODAL_VIEW_QUESTION = "The changes won't be saved, do you really want to log out?"; // при незаполненных полях после клика по кнопке CANCEL
    public static final String MODAL_VIEW_OK = "OK";
    public static final String MODAL_VIEW_CANCEL = "CANCEL";


    // FAKE Создание новой Claim  / тестовые данные для ввода
    public static final String FAKE_TITLE = "Fake Title iteration #8";
    public static final String FAKE_TITLE_8 = "#07 Fake Title iteration";
    public static final String FAKE_EDITING_TITLE_8 = "#06 Fake Title iteration Editing Claims";
    public static final String FAKE_TITLE_9_10 = "#11 Fake Title iteration Editing Claims";

    // для проверки заполненных полей/значений
    public static final String CREATED_TEXT = "Created";
    public static final String ICON_EDIT_COMMENT_TEXT = "button edit comment";
    public static final String BUTTON_CLOSE = "button close";

    // модальное окно FILTERS
    public static final String FILTER_DESCRIPTION = "Filter claim list menu button";
    public static final String OK_BUTTON_TEXT = "OK";    // в т.ч. для test-case #14 Negative test EMPTY
    public static final String CANCEL_BUTTON_TEXT = "Cancel";
}
