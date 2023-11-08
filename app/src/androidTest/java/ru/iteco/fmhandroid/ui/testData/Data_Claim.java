package ru.iteco.fmhandroid.ui.testData;
public class Data_Claim {
    public static final String TITLE_CLAIMS_TEXT = "Claims";
    public static final String TEXT_REFRESH_BUTTON = "Refresh";

    // нераскрытая карточка в списке на странице Claims
    // для проверки в списке
    public static final String TOPIC_TEXT = "Topic";
    public static final String TITLE_TEXT = "Title";
    public static final String EXECUTOR_TEXT = "Executor";
    public static final String EXECUTOR_VALUE_EMPTY = ""; //для статуса OPEN
    public static final String PLAN_DATE_TEXT = "Plan date";
    public static final String PLAN_DATE_VALUE_DATE = getInputValidDate();
    public static final String PLAN_DATE_VALUE_TIME = getInputValidTime();
    public static final String INV_PLAN_DATE_DATE = getInputInvalidDate();


    // раскрытая карточка
    public static final String TITLE_TEXT_CARD = "Title";
    public static final String EXECUTOR_TEXT_CARD = "Executor";
    public static final String EXECUTOR_VALUE_OPEN_STATUS = "NOT ASSIGNED";
    public static final String PLAN_DATE_TEXT_CARD = "Plan date";
    public static final String AUTHOR_TEXT_CARD = "Author";
    public static final String AUTHOR_VALUE_CARD = "Ivanov Ivan Ivanovich";
    public static final String CREATED_TEXT_CARD = "Created";
    public static final String COMMENTATOR_VALUE_CARD = "Ivanov Ivan Ivanovich";
//    public static final String COMMENT_DATE_VALUE_CARD = "";                   // вопрос как зафиксировать актуальную дату
//    public static final String COMMENT_TIME_VALUE_CARD = "";                   // вопрос как зафиксировать актуальное время

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



    // VALID Создание новой Claim  / тестовые данные VALID
    // Для соблюдения независмости тестов требуются отдельные методы с полным циклом создания/редактирования
    // в которых потребуются уникальные тестовые данные TITLE (+ не обязательно уникальные DESCRIPTION и COMMENT)
    // в противном случае невозможно будет выполнить корректный поиск созданных/отредактированных претензий в списке
    // и проверить корректность их создания/редактирования
    // полный цикл в тестах (создание+редактирование) гарантирует выполнение всех операций без риска
    // внесения изменений в тестируемые карточки другими пользователями приложения
    public static final String INPUT_TITLE_7 = "Новая претензия без исполнителя + статус Open / 50"; //тест-кейс 7
    public static final String INPUT_TITLE_8 = "newClaim Open + перевод в In Progress"; //тест-кейс 8
    public static final String INPUT_TITLE_9 = "Create claim status In Progress+try customExecutor"; //тест-кейс 9


    public static final String INPUT_TITLE_10 = "#4 Editing claim status Open - In Progress";         //тест-кейс 10
    public static final String INPUT_TITLE_11 = "#5 Смена статуса In progress - Open через ThrowOff"; //тест-кейс 11
    public static final String INPUT_TITLE_12 = "#6 Смена статуса Open -Cancelled через Cancel";      //тест-кейс 12
    public static final String INPUT_TITLE_13 = "#7 Смена InProgress на Executed через \"to execute\"";//тест-кейс 13


    public static final String INPUT_DESCRIPTION_7 = "Testing the functionality Creating a new claim!!!!"; //тест-кейс 7
    public static final String INPUT_DESCRIPTION_8 = "Testing functionality \"From Open status to In Progress status\""; //тест-кейс 8
    public static final String INPUT_DESCRIPTION_9 = "Description for test-case #9";                               //тест-кейс 9



    public static final String INPUT_DESCRIPTION_10 = "Смена статуса Open на In Progress через назначение Executor"; //тест-кейс 10
    public static final String INPUT_DESCRIPTION_11 = "Редактирование статуса In Progress на Open через button change"; //тест-кейс 11
    public static final String INPUT_DESCRIPTION_12 = "Редактирование статуса Open на Cancelled через button change"; //тест-кейс 12
    public static final String INPUT_DESCRIPTION_13 = "Редактирование статуса In Progress на Executed через button change"; //тест-кейс 13

    public static final String COMMENT_CONTENT_CARD_7 = "Переводим в статус \"In progress\"";          //тест-кейс 7
    public static final String COMMENT_CONTENT_EDIT_CARD_7 = "Успешно переведена в статус \"In progress\" (через take to work)"; //тест-кейс 7
//    public static final String COMMENT_CONTENT_CARD_10 = "Успешно переведена в статус \"In progress\""; //тест-кейс 9
    public static final String COMMENT_CONTENT_CARD_11 = "Тест на статус \"Throw oof\"";                //тест-кейс 11
    public static final String COMMENT_CONTENT_CARD_12 = "Тест на статус \"Cancelled\"";                //тест-кейс 12
    public static final String COMMENT_CONTENT_CARD_13 = "Тест на статус \"Executed\"";                 //тест-кейс 13
    //
    public static final String INPUT_EXECUTOR_TEXT = "Ivanov Ivan Ivanovich";

    public static final String APP_BAR_CREATING_TEXT = "Creating";
    public static final String APP_BAR_CLAIMS_TEXT = "Claims";

    public static final String ADD_NEW_CLAIM_TEXT = "Add new claim button";                          //Description

    public static final String CANCEL_MODAL_VIEW_TEXT = "Cancel"; //
    public static final String OK_MODAL_VIEW_TEXT = "OK";
    public static final String CANCEL_CREATING_CLAIMS = "Cancel"; //Text + description
    public static final String SAVE_CREATING_CLAIMS = "Save";     //Text + description
    public static final String INPUT_DATE = "12.10.2023";
    public static final String INPUT_TIME = "01:35";


    // Editing Claim
    public static final String EDIT_CARD_BUTTON_TEXT_CARD = "button settings";
//    public static final String BUTTON_EDIT_COMMENT_TEXT_CARD = "button edit comment";



    // TOPIC для поиска и проверок созданных/редактированных Claim
    // привязываем к значениям TITLE для исключения ошибок
    public static final String TOPIC_7 = getInputTitle_7();  // test-case #7
    public static final String TOPIC_8 = getInputTitle_8();  // test-case #8
    public static final String TOPIC_9 = getInputTitle_9(); // "#3 Editing claim status Open - In Progress+Comment";  // не находит через геттер
    public static final String TOPIC_10 = getInputTitle_10();
    public static final String TOPIC_11 = getInputTitle_11();
    public static final String TOPIC_12 = getInputTitle_12();
    public static final String TOPIC_13 = getInputTitle_13();



    // INVALID Создание новой Claim  / тестовые данные
    public static final String INV_INPUT_TITLE = "ТестЗаголовок Создание новой претензии здесь 51знак";
    public static final String INV_EMPTY_TITLE = "";
    public static final String INV_INPUT_DESCRIPTION = "Attention!!! The test deliberately uses an invalid date";
    public static final String INV_EMPTY_DESCRIPTION = "";
    public static final String INV_INPUT_DATE = "02.01.1980";
    public static final String INV_INPUT_TIME = "25:60";
    public static final String INV_EMPTY_DATE = "";
    public static final String INV_EMPTY_TIME = "";
    public static final String INV_INPUT_EXECUTOR = "Petrov Petr Petrovich";
    public static final String INV_EMPTY_EXECUTOR = "";
    public static final String MODAL_VIEW_WARNING = "Fill empty fields"; // при незаполненных полях после клика по кнопке OK
    public static final String MODAL_VIEW_QUESTION = "The changes won't be saved, do you really want to log out?"; // при незаполненных полях после клика по кнопке CANCEL
    public static final String MODAL_VIEW_OK = "OK";
    public static final String MODAL_VIEW_CANCEL = "CANCEL";


    // FAKE Создание новой Claim  / тестовые данные для ввода
    public static final String FAKE_TITLE = "Fake Title iteration #2";
    public static final String FAKE_DESCRIPTION = "Fake Description iteration #4";
    public static final String FAKE_DATE = "02.01.1980";
    public static final String FAKE_TIME = "04:30";



    // для проверки заполненных полей/значений
    public static final String CREATED_TEXT = "Created";
    public static final String DATE_VALUE_CREATED_TEXT = "14.09.2023";
    public static final String TIME_VALUE_CREATED_TEXT = "14:35";



    public static final String ICON_EDIT_COMMENT_TEXT = "button edit comment"; // withContentDescription
    public static final String BUTTON_CLOSE = "button close";               // закрыть карточку

    // модальное окно FILTERS
    public static final String FILTER_DESCRIPTION = "Filter claim list menu button";
    public static final String OK_BUTTON_TEXT = "OK";    // в т.ч. для test-case #14 Negative test EMPTY
    public static final String CANCEL_BUTTON_TEXT = "Cancel";


    // геттеры для TOPIC
    public static String getInputTitle_7() {
        return INPUT_TITLE_7;
    }

    public static String getInputTitle_8() {
        return INPUT_TITLE_8;
    }

    public static String getInputTitle_9() {
        return INPUT_TITLE_9;
    }

    public static String getInputTitle_10() {
        return INPUT_TITLE_10;
    }

    public static String getInputTitle_11() {
        return INPUT_TITLE_11;
    }

    public static String getInputTitle_12() {
        return INPUT_TITLE_12;
    }

    public static String getInputTitle_13() {
        return INPUT_TITLE_13;
    }

// геттеры для DATE и TIME

    public static String getInputValidDate() {
        return DATE_VALUE_CREATED_TEXT;
    }

    public static String getInputValidTime() {
        return TIME_VALUE_CREATED_TEXT;
    }

    public static String getInputInvalidDate() {
        return INV_INPUT_DATE;
    }

    public static String getInputInvalidTime() {
        return INV_INPUT_TIME;
    }


}
