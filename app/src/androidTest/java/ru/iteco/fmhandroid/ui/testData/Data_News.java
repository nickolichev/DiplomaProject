package ru.iteco.fmhandroid.ui.testData;
public class Data_News {

    // экран NEWS
    // нераскрытые карточки
    public static final String TITLE_NEWS_TEXT = "News";
    public static final String BUTTON_SORT_NEWS = "Sort news list button";
    public static final String ICON_CATEGORY_NEWS = "News category icon";
    public static final String TITLE_CARD_INVALID = "@#$%^&*()?!";
    public static final String TITLE_CARD_CUSTOM = "Дед Мороз";
    public static final String TITLE_CARD_ADVERTISEMENT = "В Пн-Вт ожидаются перебои с доступом в интеренет через Wi-Fi";
    public static final String TITLE_CARD_BIRTHDAY = "Мария Петровна приглашает всех на день рождения в Ср 16 августа";
    public static final String TITLE_CARD_SALARY = "Срочно предоставить в бухгалтерию отчеты!";
    public static final String TITLE_CARD_TRADE_UNION = "Собрание членов профсоюза состоится 16 августа в 18.00";
    public static final String TITLE_CARD_HOLIDAY = "День Св.Валентина уже совсем скоро!))";
    public static final String TITLE_CARD_MASSAGE = "Открылся новый массажный кабинет";
    public static final String TITLE_CARD_GRATITUDE = "Сердечно благодарим волонтеров из шк.№9!!!";
    public static final String TITLE_CARD_HELP = "Кто может помочь с расстановкой мебели в отремонтированных комнатах?";

    public static final String DATE_CREATED = "29.12.2023";
    public static final String TIME_CREATED = "10:50";

    // использовать в CREATE в negative tests
    public static final String DATE_INVALID = "10.10.2023";
    public static final String EXPEND_CARD_NEWS = "Expand news card button";

    // экран FILTER NEWS
    public static final String TITLE_FILTER_NEWS = "Filter news";
    public static final String CATEGORY_CUSTOM = "Новый год";
    public static final String CATEGORY_ADVERTISEMENT = "Объявление";
    public static final String CATEGORY_BIRTHDAY = "День рождения";
    public static final String CATEGORY_SALARY = "Зарплата";
    public static final String CATEGORY_TRADE_UNION = "Профсоюз";
    public static final String CATEGORY_HOLIDAY = "Праздник";
    public static final String CATEGORY_MASSAGE = "Массаж";
    public static final String CATEGORY_GRATITUDE = "Благодарность";
    public static final String CATEGORY_HELP = "Нужна помощь";
    public static final String DATE_START_TEST_DATA = getInputValidDate();
    public static final String DATE_END_TEST_DATA = getInputValidDate();
    public static final String BUTTON_FILTER = "FILTER";

    // экран Control panel / нераскрытые карточки
    public static final String CONTROL_PANEL = "Control panel";
    public static final String BUTTON_ADD_NEWS = "Add news button";
    public static final String PUBLICATION_DATE = "Publication date";
    public static final String PUBLICATION_DATE_VALUE = getInputValidDate(); // эта дата устанавливается при создании NEWS
    public static final String CREATION_DATE = "Creation date";

    public static final String AUTHOR = "Author";
    public static final String AUTHOR_VALUE = "Лебедев Д.А.";
    public static final String CHECK_MARK = "News publish icon";
    public static final String STATUS_ACTIVE = "ACTIVE";
    public static final String STATUS_NOT_ACTIVE = "NOT ACTIVE";
    public static final String BUTTON_DELETE = "News delete button";
    public static final String BUTTON_EDIT = "News editing button";

    // экран Control panel CREATING NEWS
    public static final String TITLE_CREATING = "Creating";
    public static final String TITLE_NEWS = "News";
    public static final String CATEGORY_TEXT = "Category";
    public static final String TITLE_TEXT = "Title";
    public static final String PUBLICATION_DATE_CREATING = "Publication date";
    public static final String INPUT_PUBLICATION_DATE_CREATING = getInputValidDate();
    public static final String TIME_CREATING = "Time";
    public static final String INPUT_TIME_CREATING = getInputValidTime();
    public static final String DESCRIPTION_CREATING = "Description";
    public static final String SWITCH_ON_CREATING = "Active ON";
    public static final String SAVE_CREATING_DESCRIPTION = "Save";
    public static final String SAVE_CREATING_TEXT = "SAVE";
    public static final String CANCEL_CREATING_DESCRIPTION = "Cancel";
    public static final String CANCEL_CREATING_TEXT = "CANCEL";

    // экран Control panel FILTER
    public static final String STATUS_ACTIVE_CONTROL_FILTER = "Active";
    public static final String STATUS_NOT_ACTIVE_CONTROL_FILTER = "Not active";

    // набор тестовых данных DESCRIPTION для создания News
    public static final String DESCRIPTION_INVALID = "@#%^&*!?()";
    public static final String DESCRIPTION_CUSTOM = "Елка";
    public static final String DESCRIPTION_ADVERTISEMENT = "Замена роутеров";
    public static final String DESCRIPTION_BIRTHDAY = "Будет много сюрпризов!))";
    public static final String DESCRIPTION_SALARY = "Для своевременного начисления ЗП необходимо до 16 августа сдать отчеты";
    public static final String DESCRIPTION_TRADE_UNION = "Повестка: 'Внесение изменений в Устав'";
    public static final String DESCRIPTION_HOLIDAY = "Каждому приятно получить валентинку)))";
    public static final String DESCRIPTION_MASSAGE = "Каб.407";
    public static final String DESCRIPTION_GRATITUDE = "В августе девочки и мальчики из шк. №9  провели генеральную уборку во всех комнатах хосписа";
    public static final String DESCRIPTION_HELP = "Информация у администратора";

    public static final String DATE_EDITED = "31.12.2023";
    public static final String TIME_EDITED = "12:30";

    // набор тестовых данных для редактирования TITLE во всех категориях
    public static final String TITLE_EDIT_ADVERTISEMENT = "Редактирование В Пн-Вт ожидаются перебои с доступом в интеренет Wi-Fi";
    public static final String TITLE_EDIT_BIRTHDAY = "Редактирование Мария Петровна приглашает всех на день рождения в Ср 16 августа";
    public static final String TITLE_EDIT_SALARY = "Редактирование Срочно предоставить в бухгалтерию отчеты!";
    public static final String TITLE_EDIT_TRADE_UNION = "Редактирование Собрание членов профсоюза состоится 16 августа в 18.00";
    public static final String TITLE_EDIT_HOLIDAY = "Редактирование День Св.Валентина уже совсем скоро!))";
    public static final String TITLE_EDIT_MASSAGE = "Редактирование Открылся новый массажный кабинет";
    public static final String TITLE_EDIT_GRATITUDE = "Редактирование Сердечно благодарим волонтеров из шк.№9!!!";
    public static final String TITLE_EDIT_HELP = "Редактирование Кто может помочь с расстановкой мебели в отремонтированных комнатах?";

    // набор тестовых данных для редактирования DESCRIPTION во всех категориях
    public static final String DESCRIPTION_EDIT_ADVERTISEMENT = "Замена роутеров Редактирование";
    public static final String DESCRIPTION_EDIT_BIRTHDAY = "Будет много сюрпризов!)) Редактирование";
    public static final String DESCRIPTION_EDIT_SALARY = "Для своевременного начисления ЗП необходимо до 16 августа сдать отчеты Редактирование";
    public static final String DESCRIPTION_EDIT_TRADE_UNION = "Повестка: 'Внесение изменений в Устав' Редактирование";
    public static final String DESCRIPTION_EDIT_HOLIDAY = "Каждому приятно получить валентинку))) Редактирование";
    public static final String DESCRIPTION_EDIT_MASSAGE = "Каб.407 Редактирование";
    public static final String DESCRIPTION_EDIT_GRATITUDE = "В августе девочки и мальчики из шк. №9  провели генеральную уборку во всех комнатах хосписа Редактирование";
    public static final String DESCRIPTION_EDIT_HELP = "Информация у администратора Редактирование";
    public static final String SWITCH_TEXT = "Active";
    public static final String SAVE_BUTTON = "Save";
    public static final String MESSAGE_EDIT = "The changes won't be saved, do you really want to log out?";
    public static final String OK_MODAL = "OK";
    public static final String CANCEL_MODAL = "CANCEL";

    // модальное окно DELETE
    public static final String MESSAGE_DELETE = "Are you sure you want to permanently delete the document? These changes cannot be reversed in the future.";

    public static String getInputValidDate() {
        return Data_News.DATE_CREATED;
    }

    public static String getInputValidTime() {
        return Data_News.TIME_CREATED;
    }

}

