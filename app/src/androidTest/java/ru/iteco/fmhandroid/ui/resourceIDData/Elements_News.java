package ru.iteco.fmhandroid.ui.resourceIDData;

import ru.iteco.fmhandroid.R;

public class Elements_News {

    // экран NEWS
    // нераскрытые карточки
    public static final int ID_TITLE_NEWS = R.id.container_list_news_include;         // TITLE_NEWS_TEXT = "News"
    public static final int ID_BUTTON_SORT_NEWS = R.id.sort_news_material_button;     // BUTTON_SORT_NEWS_LIST = "Sort news list button"
    public static final int ID_BUTTON_FILTER_NEWS = R.id.filter_news_material_button; // Кнопка фильтра нет текста и описания
    public static final int ID_BUTTON_EDIT_NEWS = R.id.edit_news_material_button;     // Кнопка редактировать "Карандаш" нет текста и описания
    public static final int ID_ICON_CATEGORY_NEWS = R.id.category_icon_image_view;    // ICON_CATEGORY_NEWS = "News category icon";
    public static final int ID_TITLE_CARD_NEWS = R.id.news_item_title_text_view;      // Тестовые данные по категориям
    public static final int ID_DATE_CARD_NEWS = R.id.news_item_date_text_view;        // DATE_CARD_NEWS = "15.09.2023"
    public static final int ID_EXPEND_CARD_NEWS = R.id.view_news_item_image_view;      // EXPEND_CARD_NEWS = "Expand news card button"


    // экран FILTER NEWS
    public static final int ID_TITLE_FILTER_NEWS = R.id.filter_news_title_text_view;    // TITLE_FILTER_NEWS = "Filter news"
    public static final int ID_CATEGORY_FOR_ALL = R.id.news_item_category_text_auto_complete_text_view; // CATEGORY_FOR_ALL = "Category"
    public static final int ID_DROPDOWN_CATEGORY = com.google.android.material.R.id.text_input_end_icon; // DROPDOWN_CATEGORY = "Show dropdown menu"
    public static final int ID_DATE_START = R.id.news_item_publish_date_start_text_input_edit_text; // DATE_START = "DD.MM.YYYY" + DATE_START_TEST_DATA =
    public static final int ID_DATE_END = R.id.news_item_publish_date_end_text_input_edit_text; // DATE_END = "DD.MM.YYYY" + DATE_END_TEST_DATA =

    public static final int ID_BUTTON_FILTER = R.id.filter_button; // BUTTON_FILTER = "FILTER"
    public static final int ID_BUTTON_CANCEL = R.id.cancel_button; //BUTTON_CANCEL = "CANCEL"


    // экран Control panel / верхняя панель
    // public static final int ID_CONTROL_PANEL = R.id. отсутствует. Записано в check сразу методом проверки;

    public static final int ID_ICON_FILTER_NEWS_CONTROL = R.id.filter_news_material_button; // Кнопка фильтра нет текста и описания
    public static final int ID_BUTTON_SORT = R.id.sort_news_material_button; // BUTTON_SORT = "Sort news list button";
    public static final int ID_BUTTON_ADD_NEWS = R.id.add_news_image_view; // BUTTON_ADD_NEWS = "Add news button"
    public static final int ID_TITLE_CARD_CONTROL_PANEL = R.id.news_item_title_text_view;      // Тестовые данные по категориям




    // экран Control panel / Filter News
    public static final int ID_DATE_START_CONTROL = R.id.news_item_publish_date_start_text_input_edit_text; // DATE_START = "DD.MM.YYYY" + DATE_START_TEST_DATA =
    public static final int ID_DATE_END_CONTROL = R.id.news_item_publish_date_end_text_input_edit_text; // DATE_END = "DD.MM.YYYY" + DATE_END_TEST_DATA =

    public static final int ID_DROP_DOWN_CATEGORY_CONTROL = com.google.android.material.R.id.text_input_end_icon; // кнопка раскрыть список CATEGORY

    public static final int ID_CONTROL_BUTTON_FILTER = R.id.filter_button; // BUTTON_FILTER = "FILTER"
    public static final int ID_CONTROL_BUTTON_CANCEL = R.id.cancel_button; //BUTTON_CANCEL = "CANCEL"
    public static final int ID_CONTROL_TITLE_FILTER_NEWS = R.id.filter_news_title_text_view;    // TITLE_FILTER_NEWS = "Filter news"



    // экран Control panel / CREATING NEWS /

    public static final int ID_CREATING_TITLE = R.id.custom_app_bar_title_text_view;            // TITLE_CREATING = "Creating";
    public static final int ID_CREATING_SUB_TITLE = R.id.custom_app_bar_sub_title_text_view;    // TITLE_NEWS = "News";
    public static final int ID_CREATING_CATEGORY_TEXT = R.id.news_item_category_text_auto_complete_text_view; // CATEGORY_TEXT = "Category";
    public static final int ID_CREATING_TITLE_TEXT = R.id.news_item_title_text_input_edit_text; // TITLE_TEXT = "Title";
    public static final int ID_CREATING_PUBLICATION_DATE = R.id.news_item_publish_date_text_input_edit_text; // PUBLICATION_DATE_TEXT = "Publication date";
    public static final int ID_CREATING_TIME = R.id.news_item_publish_time_text_input_edit_text; // TIME_CREATING = "Time";
    public static final int ID_CREATING_DESCRIPTION = R.id.news_item_description_text_input_edit_text; // DESCRIPTION_CREATING = "Description";
    public static final int ID_CREATING_SWITCH = R.id.switcher; // SWITCH_ON_CREATING = "Active ON"; / SWITCH_OFF_CREATING = "Not active OFF";
    public static final int ID_CREATING_SAVE = R.id.save_button; // SAVE_CREATING = "Save";
    public static final int ID_CREATING_CANCEL = R.id.cancel_button; // CANCEL_CREATING = "Cancel";
    public static final int ID_CREATING_DROPDOWN = com.google.android.material.R.id.text_input_end_icon; // CANCEL_CREATING = "Cancel";




    // экран Control panel / List /  нераскрытые карточки NEWS

    // использовать методы check для ID_TITLE_CARD_NEWS
    public static final int ID_TITLE_CARD = R.id.news_item_title_text_view;      // Тестовые данные по категориям как для ID_TITLE_CARD_NEWS
    public static final int ID_CATEGORY_CONTROL = R.id.news_item_category_text_auto_complete_text_view; // CATEGORY_FOR_ALL = "Category"
    public static final int ID_PUBLICATION_DATE = R.id.news_item_publication_text_view;  // PUBLICATION_DATE = "Publication date";
    public static final int ID_PUBLICATION_DATE_VALUE = R.id.news_item_publication_date_text_view;  // PUBLICATION_DATE_VALUE =
    public static final int ID_ACTIVE_CONTROL = R.id.filter_news_active_material_check_box;  // check-box ACTIVE
    public static final int ID_NOT_ACTIVE_CONTROL = R.id.filter_news_inactive_material_check_box;  // check-box NOT ACTIVE
    public static final int ID_CREATION_DATE = R.id.news_item_creation_text_view;  // CREATION_DATE = "Creation date";
    public static final int ID_CREATION_DATE_VALUE = R.id.news_item_create_date_text_view;  // CREATION_DATE_VALUE = "15.09.2023"; // эта дата устанавливается как текущая
    public static final int ID_AUTHOR = R.id.news_item_author_text_view;  // AUTHOR = "Author"
    public static final int ID_AUTHOR_VALUE = R.id.news_item_author_name_text_view;  // AUTHOR_VALUE = "Ivanov I.I."
    public static final int ID_CHECK_MARK = R.id.news_item_published_icon_image_view;  // CHECK_MARK = "News publish icon"
    public static final int ID_STATUS_ACTIVE = R.id.news_item_published_text_view;      // STATUS_ACTIVE = "ACTIVE"
    public static final int ID_STATUS_NOT_ACTIVE = R.id.news_item_published_text_view;  // STATUS_ACTIVE = "NOT ACTIVE"
    public static final int ID_BUTTON_DELETE = R.id.delete_news_item_image_view;  // BUTTON_DELETE = "News delete button"
    public static final int ID_BUTTON_EDIT = R.id.edit_news_item_image_view;  // BUTTON_EDIT = "News editing button"
    public static final int ID_BUTTON_EXPEND = R.id.view_news_item_image_view;  // BUTTON_EXPEND = "Expand news card button"
    public static final int ID_DESCRIPTION = R.id.news_item_description_text_view;  // BUTTON_EDIT = "News editing button"



    // экран EDITING NEWS
    public static final int ID_TITLE_EDITING = R.id.custom_app_bar_title_text_view;  // TITLE_EDITING = "Editing"
    public static final int ID_SUB_TITLE_NEWS = R.id.custom_app_bar_sub_title_text_view;  // SUB_TITLE_NEWS = "News"

    // использовать
    // public static final int ID_CATEGORY_FOR_ALL = R.id.news_item_category_text_auto_complete_text_view; // CATEGORY_FOR_ALL = "Category"

    public static final int ID_DATE_INPUT = R.id.news_item_publish_date_text_input_edit_text;  // DATE_CREATED = "15.11.2023" / DATE_EMPTY = "" / DATE_EDITED = "10.12.2023"
    public static final int ID_TIME_INPUT = R.id.news_item_publish_time_text_input_edit_text;  // TIME_CREATED = "10:50" / TIME_EMPTY = "" / TIME_EDITED = "12:30"

    public static final int ID_TITLE_INPUT = R.id.news_item_title_text_input_edit_text; //

    public static final int ID_DESCRIPTION_INPUT = R.id.news_item_description_text_input_edit_text; //

    public static final int ID_SWITCH = R.id.switcher; // SWITCH_ON = "Active ON" / SWITCH_OFF = "Not active OFF"

    public static final int ID_SAVE_EDITING = R.id.save_button; // SAVE_EDITING = "SAVE" / SAVE_BUTTON = "Save"
    public static final int ID_CANCEL_EDITING = R.id.cancel_button; // CANCEL_EDITING = "CANCEL" / / CANCEL_BUTTON = "Cancel"


    // модальное окно предупреждение CREATING NEWS + EDITING NEWS
    // модальное окно предупреждение DELETE
    public static final int ID_MODAL_MESSAGE = android.R.id.message; // MESSAGE_TEXT = "The changes won't be saved, do you really want to log out?" / MESSAGE_DELETE = "Are you sure you want to
    public static final int ID_MODAL_CANCEL = android.R.id.button2; // CANCEL_MODAL = "CANCEL"
    public static final int ID_MODAL_OK = android.R.id.button1; // OK_MODAL = "OK"









    public static final int ID_LIST_NEWS = R.id.news_list_recycler_view;

    public static final int ID_EMPTY_NEWS = R.id.control_panel_empty_news_list_text_view;
    public static final int ID_REFRESH_BUTTON = R.id.news_retry_material_button; // TEXT_REFRESH_BUTTON = "Refresh";





}
