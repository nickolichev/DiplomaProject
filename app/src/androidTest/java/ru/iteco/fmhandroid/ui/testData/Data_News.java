package ru.iteco.fmhandroid.ui.testData;
public class Data_News {

    // экран NEWS
    // нераскрытые карточки
    public static final String TITLE_NEWS_TEXT = "News";
    public static final String BUTTON_SORT_NEWS = "Sort news list button";
    public static final String ICON_CATEGORY_NEWS = "News category icon";

    // тестовые данные TITLE используются: для проверки в нераскрытых карточках; при создания новых
    public static final String TITLE_CARD_INVALID = "@#$%^&*()?!";
    public static final String TITLE_CARD_EMPTY = "";


    // набор тестовых данных для создания News во всех категориях
    // набор тестовых данных для проверок созданных News во всех категориях
    public static final String TITLE_CARD_CUSTOM = "Дед Мороз";
    public static final String TITLE_CARD_ADVERTISEMENT = "В Пн-Вт ожидаются перебои с доступом в интеренет через Wi-Fi";
    public static final String TITLE_CARD_BIRTHDAY = "Мария Петровна приглашает всех на день рождения в Ср 16 августа";
    public static final String TITLE_CARD_SALARY = "Срочно предоставить в бухгалтерию отчеты!";
    public static final String TITLE_CARD_TRADE_UNION = "Собрание членов профсоюза состоится 16 августа в 18.00";
    public static final String TITLE_CARD_HOLIDAY = "День Св.Валентина уже совсем скоро!))";
    public static final String TITLE_CARD_MASSAGE = "Открылся новый массажный кабинет";
    public static final String TITLE_CARD_GRATITUDE = "Сердечно благодарим волонтеров из шк.№9!!!";
    public static final String TITLE_CARD_HELP = "Кто может помочь с расстановкой мебели в отремонтированных комнатах?";

    public static final String DATE_CREATED = "28.11.2023";
    public static final String TIME_CREATED = "10:50";

    // использовать в CREATE в negative tests
    public static final String DATE_INVALID = "10.10.2023";
    public static final String TIME_INVALID = "24:60";

    public static final String DATE_EMPTY = "";
    public static final String TIME_EMPTY = "";



    public static final String EXPEND_CARD_NEWS = "Expand news card button";




    // экран FILTER NEWS
    // набор тестовых данных CATEGORY
    public static final String TITLE_FILTER_NEWS = "Filter news";
    public static final String CATEGORY_FOR_ALL = "Category"; // + для экрана CONTROL PANEL FILTER
    public static final String CATEGORY_EMPTY = "";

    public static final String CATEGORY_CUSTOM = "Новый год";              // test-case #15
    public static final String CATEGORY_ADVERTISEMENT = "Объявление";
    public static final String CATEGORY_BIRTHDAY = "День рождения";
    public static final String CATEGORY_SALARY = "Зарплата";
    public static final String CATEGORY_TRADE_UNION = "Профсоюз";
    public static final String CATEGORY_HOLIDAY = "Праздник";
    public static final String CATEGORY_MASSAGE = "Массаж";
    public static final String CATEGORY_GRATITUDE = "Благодарность";
    public static final String CATEGORY_HELP = "Нужна помощь";


    public static final String DROPDOWN_CATEGORY = "Show dropdown menu"; // + для экрана CONTROL PANEL FILTER
    public static final String DATE_START = "DD.MM.YYYY";
    public static final String DATE_END = "DD.MM.YYYY";
    public static final String DATE_START_TEST_DATA = getInputValidDate();
    public static final String DATE_END_TEST_DATA = getInputValidDate();

    public static final String BUTTON_FILTER = "FILTER";
    public static final String BUTTON_CANCEL = "CANCEL";



    // экран Control panel / нераскрытые карточки
    public static final String CONTROL_PANEL = "Control panel";
    public static final String BUTTON_SORT = "Sort news list button";
    public static final String BUTTON_ADD_NEWS = "Add news button";
    public static final String PUBLICATION_DATE = "Publication date";
    public static final String PUBLICATION_DATE_VALUE = getInputValidDate(); // эта дата устанавливается при создании NEWS
    public static final String CREATION_DATE = "Creation date";
    public static final String CREATION_DATE_VALUE = "15.09.2023"; // эта дата устанавливается как текущая

    public static final String AUTHOR = "Author";
    public static final String AUTHOR_VALUE = "Ivanov I.I.";
    public static final String CHECK_MARK = "News publish icon"; // галочка, что новость опубликована
    public static final String STATUS_ACTIVE = "ACTIVE";         // Нераскрытоая карточка
    public static final String STATUS_NOT_ACTIVE = "NOT ACTIVE"; // Нераскрытоая карточка
    public static final String BUTTON_DELETE = "News delete button";
    public static final String BUTTON_EDIT = "News editing button";
    public static final String BUTTON_EXPEND = "Expand news card button";



    // экран Control panel CREATING NEWS
    public static final String TITLE_CREATING = "Creating";
    public static final String TITLE_NEWS = "News";
    public static final String CATEGORY_TEXT = "Category";
    public static final String TITLE_TEXT = "Title";
    public static final String PUBLICATION_DATE_CREATING = "Publication date";
    public static final String INPUT_PUBLICATION_DATE_CREATING = getInputValidDate(); // эта ВАЛИДНАЯ дата устанавливается при создании NEWS

    public static final String TIME_CREATING = "Time";
    public static final String INPUT_TIME_CREATING = getInputValidTime();
    public static final String INPUT_INVALID_PUBLICATION_DATE_CREATING = getInputInvalidDate();
    public static final String INPUT_INVALID_TIME_CREATING = getInputInvalidTime();


    public static final String DESCRIPTION_CREATING = "Description";
    public static final String SWITCH_ON_CREATING = "Active ON";
    public static final String SWITCH_OFF_CREATING = "Not active OFF";
    public static final String SAVE_CREATING_DESCRIPTION = "Save";
    public static final String SAVE_CREATING_TEXT = "SAVE";

    public static final String CANCEL_CREATING_DESCRIPTION = "Cancel";
    public static final String CANCEL_CREATING_TEXT = "CANCEL";
    public static final String MESSAGE_CREATING = "The changes won't be saved, do you really want to log out?";



    // экран Control panel FILTER
    public static final String STATUS_ACTIVE_CONTROL_FILTER = "Active";         //чек боксы на экране FILTER Control Panel
    public static final String STATUS_NOT_ACTIVE_CONTROL_FILTER = "Not active"; // чек боксы на экране FILTER Control Panel

    public static final String BUTTON_FILTER_CONTROL = "Filter";
    public static final String BUTTON_CANCEL_CONTROL = "Cancel";





    // набор тестовых данных DESCRIPTION для создания News
    // в Control panel для всех категорий
    public static final String DESCRIPTION_INVALID = "@#%^&*!?()";
    public static final String DESCRIPTION_EMPTY = "";
    public static final String DESCRIPTION_CUSTOM = "Елка";
    public static final String DESCRIPTION_ADVERTISEMENT = "Замена роутеров";
    public static final String DESCRIPTION_BIRTHDAY = "Будет много сюрпризов!))";
    public static final String DESCRIPTION_SALARY = "Для своевременного начисления ЗП необходимо до 16 августа сдать отчеты";
    public static final String DESCRIPTION_TRADE_UNION = "Повестка: 'Внесение изменений в Устав'";
    public static final String DESCRIPTION_HOLIDAY = "Каждому приятно получить валентинку)))";
    public static final String DESCRIPTION_MASSAGE = "Каб.407";
    public static final String DESCRIPTION_GRATITUDE = "В августе девочки и мальчики из шк. №9  провели генеральную уборку во всех комнатах хосписа";
    public static final String DESCRIPTION_HELP = "Информация у администратора";



    // экран EDITING NEWS
    // кнопка EDIT  в разделе: экран Control panel
    // набор тестовых данных для редактирования
    public static final String TITLE_EDITING = "Editing";
    public static final String SUB_TITLE_NEWS = "News";
    public static final String CATEGORY_EDIT = "Category";

    // использовать при редактировании NEWS
    //    public static final String CATEGORY_CUSTOM = "Новый год";
    //    public static final String CATEGORY_ADVERTISEMENT = "Объявление";
    //    public static final String CATEGORY_BIRTHDAY = "День рождения";
    //    public static final String CATEGORY_SALARY = "Зарплата";
    //    public static final String CATEGORY_TRADE_UNION = "Профсоюз";
    //    public static final String CATEGORY_HOLIDAY = "Праздник";
    //    public static final String CATEGORY_MASSAGE = "Массаж";
    //    public static final String CATEGORY_GRATITUDE = "Благодарность";
    //    public static final String CATEGORY_HELP = "Нужна помощь";

    public static final String DATE_EDITED = "10.12.2023";
    public static final String TIME_EDITED = "12:30";


    // набор тестовых данных для редактирования TITLE во всех категориях
    // набор тестовых данных для проверок после редактирования TITLE во всех категориях
    // попробовать написать метод добавления к тексту = "Редактирование", а не полной замены текста
    public static final String TITLE_EDIT_ADVERTISEMENT = "Редактирование В Пн-Вт ожидаются перебои с доступом в интеренет Wi-Fi";
    public static final String TITLE_EDIT_BIRTHDAY = "Редактирование Мария Петровна приглашает всех на день рождения в Ср 16 августа";
    public static final String TITLE_EDIT_SALARY = "Редактирование Срочно предоставить в бухгалтерию отчеты!";
    public static final String TITLE_EDIT_TRADE_UNION = "Редактирование Собрание членов профсоюза состоится 16 августа в 18.00";
    public static final String TITLE_EDIT_HOLIDAY = "Редактирование День Св.Валентина уже совсем скоро!))";
    public static final String TITLE_EDIT_MASSAGE = "Редактирование Открылся новый массажный кабинет";
    public static final String TITLE_EDIT_GRATITUDE = "Редактирование Сердечно благодарим волонтеров из шк.№9!!!";
    public static final String TITLE_EDIT_HELP = "Редактирование Кто может помочь с расстановкой мебели в отремонтированных комнатах?";


    // набор тестовых данных для редактирования DESCRIPTION во всех категориях
    // набор тестовых данных для проверок после редактирования DESCRIPTION во всех категориях
    // попробовать написать метод добавления к тексту = "Редактирование", а не полной замены текста
    public static final String DESCRIPTION_EDIT_CUSTOM = "Елка Редактирование";
    public static final String DESCRIPTION_EDIT_ADVERTISEMENT = "Замена роутеров Редактирование";
    public static final String DESCRIPTION_EDIT_BIRTHDAY = "Будет много сюрпризов!)) Редактирование";
    public static final String DESCRIPTION_EDIT_SALARY = "Для своевременного начисления ЗП необходимо до 16 августа сдать отчеты Редактирование";
    public static final String DESCRIPTION_EDIT_TRADE_UNION = "Повестка: 'Внесение изменений в Устав' Редактирование";
    public static final String DESCRIPTION_EDIT_HOLIDAY = "Каждому приятно получить валентинку))) Редактирование";
    public static final String DESCRIPTION_EDIT_MASSAGE = "Каб.407 Редактирование";
    public static final String DESCRIPTION_EDIT_GRATITUDE = "В августе девочки и мальчики из шк. №9  провели генеральную уборку во всех комнатах хосписа Редактирование";
    public static final String DESCRIPTION_EDIT_HELP = "Информация у администратора Редактирование";




    public static final String SWITCH_ON = "Active ON";
    public static final String SWITCH_OFF = "Not active OFF";
    public static final String SWITCH_TEXT = "Active";
    public static final String SAVE_EDITING = "SAVE";
    public static final String SAVE_BUTTON = "Save";
    public static final String CANCEL_EDITING = "CANCEL";
    public static final String CANCEL_BUTTON = "Cancel";
//    public static final String OK_BUTTON = "OK";
    public static final String MESSAGE_EDIT = "The changes won't be saved, do you really want to log out?";
    public static final String OK_MODAL = "OK";
    public static final String CANCEL_MODAL = "CANCEL";

    // модальное окно DELETE
    public static final String MESSAGE_DELETE = "Are you sure you want to permanently delete the document? These changes cannot be reversed in the future.";


    public static final String TEXT_REFRESH_BUTTON = "Refresh";
    public static final String TEXT_EMPTY_NEWS = "There is nothing here yet…";

    public static String getInputValidDate() {
        return Data_News.DATE_CREATED;
    }

    public static String getInputValidTime() {
        return Data_News.TIME_CREATED;
    }

    public static String getInputInvalidDate() {
        return Data_News.DATE_INVALID;
    }

    public static String getInputInvalidTime() {
        return Data_News.TIME_INVALID;
    }

}

