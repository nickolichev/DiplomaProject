package ru.iteco.fmhandroid.ui.resourceIDData;

import ru.iteco.fmhandroid.R;

public class Elements_Claim {
    public static final int ID_TITLE_CLAIMS = R.id.container_list_claim_include;
    public static final int ID_REFRESH_BUTTON = R.id.claim_retry_material_button;
    public static final int ID_ADD_NEW_CLAIM = R.id.add_new_claim_material_button;

    // нераскрытая карточка претензии
    public static final int ID_BUTTON_EXTEND_CARD = R.id.claim_list_card;
    public static final int ID_LIST_CARD = R.id.claim_list_card;
    public static final int ID_TOPIC_TEXT_LIST = R.id.description_material_text_view;     // элемент, в котором текст TOPIC

    public static final int ID_EXECUTOR_TEXT_LIST = R.id.executor_name_label_material_text_view;
    public static final int ID_EXECUTOR_VALUE_LIST = R.id.executor_name_material_text_view;

    public static final int ID_PLAN_DATE_TEXT_LIST = R.id.plan_date_label_material_text_view;
    public static final int ID_PLAN_DATE_VALUE_DATE_LIST = R.id.plan_date_material_text_view;
//    public static final int ID_PLAN_DATE_VALUE_TIME_LIST = ; // заполнить



    // раскрытая претензия
    public static final int ID_TITLE_CARD = R.id.title_label_text_view;                // text
    public static final int ID_TITLE_VALUE_CARD = R.id.title_text_view;                // value
    public static final int ID_EXECUTOR_CARD = R.id.executor_name_label_text_view;     // text
    public static final int ID_EXECUTOR_VALUE_CARD = R.id.executor_name_text_view;     // value
    public static final int ID_PLAN_DATE_CARD = R.id.plane_date_label_text_view;       // text
    public static final int ID_PLAN_DATE_VALUE_DATE_CARD = R.id.create_data_text_view; // value
    public static final int ID_PLAN_DATE_VALUE_TIME_CARD = R.id.create_time_text_view; // value                           // value
    public static final int ID_STATUS_CARD = R.id.status_label_text_view;               // for all statuses

    public static final int ID_DESCRIPTION_CARD = R.id.description_material_card_view;  // value
    public static final int ID_DESCRIPTION_VALUE_CARD = R.id.description_text_view;      // value

    public static final int ID_AUTHOR_CARD = R.id.author_label_text_view;                 // text
    public static final int ID_AUTHOR_VALUE_CARD = R.id.author_name_text_view;            // value

    public static final int ID_CREATED_DESCRIPTION_CARD = R.id.create_data_label_text_view;           // text
//    public static final int ID_CREATED_DATE_VALUE_CARD = R.id.create_data_text_view;                // value не проверяем
//    public static final int ID_CREATED_TIME_VALUE_CARD = R.id.create_time_text_view;                // value не проверяем

    public static final int ID_COMMENT_VALUE_CARD = R.id.comment_description_text_view;    // value
    public static final int ID_COMMENT_BUTTON_EDIT = R.id.edit_comment_image_button;       // icon

    public static final int ID_COMMENTATOR_VALUE_CARD = R.id.commentator_name_text_view;

    public static final int ID_COMMENT_DATE_VALUE_CARD = R.id.comment_date_text_view;
    public static final int ID_COMMENT_TIME_VALUE_CARD = R.id.comment_time_text_view;

    // закрыть развернутую Claim
    public static final int ID_BUTTON_CLOSE = R.id.close_image_button;                          // icon Для всех статусов


    // Comment создание/редактирование/проверка
    public static final int ID_CONTAINER_COMMENT_CARD = R.id.claim_comments_list_recycler_view;        // контейнер комментария
    public static final int ID_ADD_COMMENT_CARD = R.id.comments_material_card_view;               // text Add comment
    public static final int ID_ADD_COMMENT_BUTTON_CARD = R.id.add_comment_image_button;           // icon
    public static final int ID_LIST_COMMENT_CARD = R.id.claim_comments_list_recycler_view; // список comments
    public static final int ID_CONTENT_COMMENT = R.id.comment_description_text_view;              // поле comment c текстом
    public static final int ID_ICON_EDIT_COMMENT = R.id.edit_comment_image_button;                // кнопка редактировать comment
    public static final int ID_INPUT_COMMENT = R.id.comment_text_input_layout;                    // ввод текста comment
    public static final int ID_CANCEL_COMMENT = R.id.cancel_button;                               // кнопка CANCEL в окне Comment
    public static final int ID_SAVE_COMMENT = R.id.save_button;                                   // кнопка SAVE в окне Comment

    public static final int ID_INPUT_EDIT_COMMENT = R.id.description_edit_text;                   // поле с редактируемым Comment
    public static final int ID_INPUT_EDIT_COMMENT_PARENT = R.id.description_edit_text;            // родитель поля с редактируемым Comment


    // смена статуса Claim
    public static final int ID_CHANGE_STATUS_ICON_CARD = R.id.status_processing_image_button;         // icon Для всех статусов
    public static final int ID_CHANGE_THROW_OFF_CARD = android.R.id.title;                            // icon
    public static final int ID_CHANGE_TO_EXECUTE_CARD = android.R.id.title;                           // icon
    public static final int ID_CHANGE_TAKE_TO_WORK_CARD = android.R.id.title;                         // icon
    public static final int ID_CHANGE_CANCEL_CARD = android.R.id.title;                               // icon


    // модальное окно FILTER
    public static final int ID_FILTERS_BUTTON = R.id.filters_material_button;
    public static final int ID_OK_BUTTON = R.id.claim_list_filter_ok_material_button;
    public static final int ID_CANCEL_BUTTON = R.id.claim_filter_cancel_material_button;
    public static final int ID_LIST_CARDS = R.id.claim_list_recycler_view;
    public static final int LIST_CARDS_POSITION_4 = 4;
    public static final int EXPEND_CARD = 0;
    public static final int ID_IN_PROGRESS_CHECK_BOX = R.id.item_filter_in_progress;
    public static final int ID_OPEN_CHECK_BOX = R.id.item_filter_open;
    public static final int ID_EXECUTED_CHECK_BOX = R.id.item_filter_executed;
    public static final int ID_CANCELLED_CHECK_BOX = R.id.item_filter_cancelled;


    // окно Creating Claim
    public static final int ID_TITLE_APP_BAR = R.id.custom_app_bar_title_text_view;
    public static final int ID_FIELD_TITLE = R.id.title_edit_text;
    public static final int ID_FIELD_DATE = R.id.date_in_plan_text_input_edit_text;
    public static final int ID_FIELD_TIME = R.id.time_in_plan_text_input_edit_text;
    public static final int ID_CANCEL_MODAL_VIEW = android.R.id.button2;
    public static final int ID_OK_MODAL_VIEW = android.R.id.button1;
    public static final int ID_CANCEL_CREATING_Claims = R.id.cancel_button;
    public static final int ID_FIELD_DESCRIPTION = R.id.description_edit_text;
    public static final int ID_SAVE_CREATING_Claims = R.id.save_button;
    public static final int ID_FIELD_EXECUTOR = R.id.executor_drop_menu_auto_complete_text_view;
    public static final int ID_PLACE_HOLDER_EXECUTOR = com.google.android.material.R.id.textinput_placeholder;
    public static final int ID_MODAL_VIEWS = android.R.id.message;       // test-case #14 Negative test EMPTY
    public static final int ID_OK_MODAL_VIEWS = android.R.id.button1;    // test-case #14 Negative test EMPTY
    public static final int ID_CANCEL_MODAL_VIEWS = android.R.id.button2;// test-case #14 Negative test EMPTY
    public static final int ID_ICON_EMPTY_FIELD = com.google.android.material.R.id.text_input_end_icon;// test-case #14 Negative test EMPTY




    // Editing Claim
    public static final int ID_EDIT_CARD_BUTTON_CARD = R.id.edit_processing_image_button;       // icon Для всех статусов


}
