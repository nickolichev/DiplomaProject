package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.not;
import static ru.iteco.fmhandroid.R.id.news_item_category_text_input_layout;

import android.view.View;

import org.hamcrest.core.IsInstanceOf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import io.qameta.allure.kotlin.Step;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_News;
import ru.iteco.fmhandroid.ui.testData.Data_News;

public class CheckUtils_News {
    @Step("экран NEWS / верхняя панель / проверяем Title экрана")
    public void checkTitleNews_Visibility() {
        onView(allOf(withText(Data_News.TITLE_NEWS_TEXT),
                withParent(withParent(withId(Elements_News.ID_TITLE_NEWS))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_NEWS_TEXT)));
    }

    @Step("экран NEWS / верхняя панель / проверяем видимость кнопки сортировки")
    public void checkButtonSortNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_SORT_NEWS),
                withContentDescription(Data_News.BUTTON_SORT_NEWS),
                withParent(withParent(withId(R.id.container_list_news_include))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_News.BUTTON_SORT_NEWS)));
    }

    @Step("экран NEWS / верхняя панель / проверяем видимость кнопки FILTER")
    public void checkButtonFilterNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_FILTER_NEWS),
                withParent(withParent(withId(R.id.container_list_news_include))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @Step("экран NEWS / верхняя панель / проверяем видимость кнопки редактирования")
    public void checkButtonEditNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_EDIT_NEWS),
                withParent(withParent(withId(R.id.container_list_news_include))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @Step("экран Control panel / панель экрана / Title экрана")
    public void checkTitleControlPanel_Visibility() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        onView(allOf(withText(Data_News.CONTROL_PANEL),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CONTROL_PANEL)));
    }

    @Step("экран Control panel / панель экрана / проверяем видимость кнопки SORT")
    public void checkSortControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_SORT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed())).check(matches(isDisplayed()));
    }

    @Step("экран Control panel / панель экрана / проверяем видимость кнопки FILTER")
    public void checkIconFilterControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_ICON_FILTER_NEWS_CONTROL),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @Step("экран Control panel / панель экрана / проверяем видимость кнопки ADD")
    public void checkButtonAddControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_ADD_NEWS),
                withContentDescription(Data_News.BUTTON_ADD_NEWS),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_News.BUTTON_ADD_NEWS)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем видимость эмоджи CATEGORY")
    public void checkEmojiCategory_Visibility() {
        onView(allOf(withId(Elements_News.ID_ICON_CATEGORY_NEWS),
                withContentDescription(Data_News.ICON_CATEGORY_NEWS),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для ADVERTISEMENT")
    public void checkTitleCardNews_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_ADVERTISEMENT)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для BIRTHDAY")
    public void checkTitleCardNews_Birthday_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_BIRTHDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_BIRTHDAY)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для SALARY")
    public void checkTitleCardNews_Salary_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_SALARY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_SALARY)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для TRADE_UNION")
    public void checkTitleCardNews_TradeUnion_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_TRADE_UNION),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_TRADE_UNION)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для HOLIDAY")
    public void checkTitleCardNews_Holiday_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_HOLIDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_HOLIDAY)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для MASSAGE")
    public void checkTitleCardNews_Massage_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_MASSAGE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_MASSAGE)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для GRATITUDE")
    public void checkTitleCardNews_Gratitude_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_GRATITUDE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_GRATITUDE)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для HELP")
    public void checkTitleCardNews_Help_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_HELP),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_HELP)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем текст строки Publication Date")
    public void checkPublicationDateText_Visibility() {
        onView(allOf(withId(Elements_News.ID_PUBLICATION_DATE),
                withText(Data_News.PUBLICATION_DATE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.PUBLICATION_DATE)));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем значение Publication date")
    public void checkPublicationValueControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_PUBLICATION_DATE_VALUE),
                withText(Data_News.PUBLICATION_DATE_VALUE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.PUBLICATION_DATE_VALUE)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем текст строки Creation date")
    public void checkCreationDateControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATION_DATE),
                withText(Data_News.CREATION_DATE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CREATION_DATE)));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран Control panel / List/ нераскрытая карточка / генерируем значение Creation date")
    public static String getCurrentDate() {
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        Date currentDate = new Date(currentTimeMillis);
        return dateFormat.format(currentDate);
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем значение Creation date")
    public void checkCreationDateValueControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATION_DATE_VALUE),
                withText(getCurrentDate()),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(getCurrentDate())));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем текст строки Author")
    public void checkAuthorControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_AUTHOR),
                withText(Data_News.AUTHOR),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.AUTHOR)));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем значение Author")
    public void checkAuthorValueControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_AUTHOR_VALUE),
                withText(Data_News.AUTHOR_VALUE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.AUTHOR_VALUE)));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем отображение CheckMark и статус Active")
    public void checkCheckMarkActiveControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_CHECK_MARK),
                withContentDescription(Data_News.CHECK_MARK),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_News.CHECK_MARK)));
        onView(allOf(withId(Elements_News.ID_STATUS_ACTIVE),
                withText(Data_News.STATUS_ACTIVE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.STATUS_ACTIVE)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем отображение CheckMark и статус Not Active")
    public void checkCheckMarkNotActiveControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_CHECK_MARK),
                withContentDescription(Data_News.CHECK_MARK),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_News.CHECK_MARK)));
        onView(allOf(withId(Elements_News.ID_STATUS_NOT_ACTIVE),
                withText(Data_News.STATUS_NOT_ACTIVE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.STATUS_NOT_ACTIVE)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем отображение кнопки Delete")
    public void checkDeleteControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_DELETE),
                withContentDescription(Data_News.BUTTON_DELETE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_News.BUTTON_DELETE)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем отображение кнопки Edit")
    public void checkEditControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_EDIT),
                withContentDescription(Data_News.BUTTON_EDIT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_News.BUTTON_EDIT)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем отображение кнопки Expend")
    public void checkExpendControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_EXPEND),
                withContentDescription(Data_News.EXPEND_CARD_NEWS),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_News.EXPEND_CARD_NEWS)));
    }

    @Step("экран Control panel / Filter News  / проверка видимости Title FILTER Control Panel")
    public void checkTitleFilterControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_FILTER_NEWS),
                withText(Data_News.TITLE_FILTER_NEWS),
                withParent(withParent(withId(R.id.nav_host_fragment))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_FILTER_NEWS)));
    }

    @Step("экран Control panel / Filter News / проверка видимости поля Category")
    public void checkCategoryControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_CONTROL),
                withText(Data_News.CATEGORY_FOR_ALL),
                withParent(withParent(withId(news_item_category_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CATEGORY_FOR_ALL)));
    }

    @Step("экран Control panel / Filter News / проверка видимости кнопки DropDown в поле Category")
    public void checkDropDownControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                withContentDescription(Data_News.DROPDOWN_CATEGORY),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @Step("экран Control panel / Filter News / проверка видимости статуса ACTIVE")
    public void checkActiveControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_STATUS_ACTIVE),
                withText(Data_News.STATUS_ACTIVE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed())).check(matches(withText(Data_News.STATUS_ACTIVE)));
        onView(allOf(withId(Elements_News.ID_CHECK_MARK),
                withContentDescription(Data_News.CHECK_MARK),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed())).check(matches(isDisplayed()));
    }

    @Step("экран Control panel / Filter News / проверка видимости статуса NOT ACTIVE")
    public void checkNotActiveControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_STATUS_NOT_ACTIVE),
                withText(Data_News.STATUS_NOT_ACTIVE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed())).check(matches(withText(Data_News.STATUS_NOT_ACTIVE)));
        onView(allOf(withId(Elements_News.ID_CHECK_MARK),
                withContentDescription(Data_News.CHECK_MARK),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed())).check(matches(isDisplayed()));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран Control panel / Creating News / проверка Title экрана")
    public void checkCreatingNewsTitle_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_TITLE),
                withText(Data_News.TITLE_CREATING),
                withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_news),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CREATING)));
        onView(allOf(withId(Elements_News.ID_CREATING_SUB_TITLE),
                withText(Data_News.TITLE_NEWS),
                withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_news),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_NEWS)));
    }

    @Step("экран Control panel / Creating News / проверка видимости поля Category для ввода тестовых данных")
    public void checkFieldCategory_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                withHint(Data_News.CATEGORY_TEXT),
                withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_News.CATEGORY_TEXT)));
    }

    @Step("экран Control panel / Creating News / проверка видимости поля Title для ввода тестовых данных")
    public void checkFieldTitle_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_TITLE_TEXT),
                withHint(Data_News.TITLE_TEXT),
                withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_News.TITLE_TEXT)));
    }

    @Step("экран Control panel / Creating News / проверка видимости поля Publication date для ввода тестовых данных")
    public void checkFieldPublicationDate_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_DATE),
                withHint(Data_News.PUBLICATION_DATE_CREATING),
                withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_News.PUBLICATION_DATE_CREATING)));
    }

    @Step("экран Control panel / Creating News / проверка видимости поля Time для ввода тестовых данных")
    public void checkFieldPublicationTime_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_TIME),
                withHint(Data_News.TIME_CREATING),
                withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_News.TIME_CREATING)));
    }

    @Step("экран Control panel / Creating News / проверка видимости поля Description для ввода тестовых данных")
    public void checkFieldDescription_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_DESCRIPTION),
                withHint(Data_News.DESCRIPTION_CREATING),
                withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_News.DESCRIPTION_CREATING)));
    }

    @Step("экран Control panel / Creating News / проверка видимости switcher в статусе ON")
    public void checkSwitcherOnCreatingNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_SWITCH),
                withText(Data_News.SWITCH_ON_CREATING),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(doesNotExist());
    }

    @Step("экран Control panel / Creating News / проверка видимости кнопки SAVE")
    public void checkButtonSaveCreatingNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_SAVE),
                withText(Data_News.SAVE_CREATING_TEXT),
                withContentDescription(Data_News.SAVE_CREATING_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.SAVE_CREATING_TEXT)));
    }

    @Step("экран Control panel / Creating News / проверка видимости кнопки CANCEL")
    public void checkButtonCancelCreatingNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_CANCEL),
                withText(Data_News.CANCEL_CREATING_TEXT),
                withContentDescription(Data_News.CANCEL_CREATING_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CANCEL_CREATING_TEXT)));
    }

    @Step("экран Control panel / Creating News / проверка видимости иконки-предупреждения о незаполненном поле Category")
    public void checkIconEmptyFieldCategory_CreatingNews_Visibility() {
        onView(allOf(withId(com.google.android.material.R.id.text_input_start_icon),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @Step("экран Control panel / Creating News / проверка видимости иконки-предупреждения о незаполненном поле")
    public void checkIconEmptyFieldsRemaining_CreatingNews_Visibility() {
        onView(allOf(withId(com.google.android.material.R.id.text_input_end_icon),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout.class))),
                isDisplayed(),
                not(withContentDescription("Show dropdown menu"))))
                .check(matches(isDisplayed()));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка CATEGORY_ADVERTISEMENT")
    public void checkFieldCategory_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL),
                withText(Data_News.CATEGORY_ADVERTISEMENT),
                withParent(withParent(withId(news_item_category_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CATEGORY_ADVERTISEMENT)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка введенного в поле TITLE значения для CATEGORY_ADVERTISEMENT")
    public void checkFieldTitle_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT),
                withText(Data_News.TITLE_CARD_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_ADVERTISEMENT)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка введенного в поле DESCRIPTION значения для CATEGORY_ADVERTISEMENT")
    public void checkFieldDescription_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT),
                withText(Data_News.DESCRIPTION_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_ADVERTISEMENT)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_ADVERTISEMENT")
    public void checkDescription_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_ADVERTISEMENT)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_BIRTHDAY")
    public void checkDescription_Birthday_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_BIRTHDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_BIRTHDAY)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_SALARY")
    public void checkDescription_Salary_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_SALARY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_SALARY)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_TRADE_UNION")
    public void checkDescription_TradeUnion_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_TRADE_UNION),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_TRADE_UNION)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_HOLIDAY")
    public void checkDescription_Holiday_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_HOLIDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_HOLIDAY)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_MASSAGE")
    public void checkDescription_Massage_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_MASSAGE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_MASSAGE)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_GRATITUDE")
    public void checkDescription_Gratitude_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_GRATITUDE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_GRATITUDE)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_HELP")
    public void checkDescription_Help_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_HELP),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_HELP)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DATE")
    public void checkFieldDate_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_DATE),
                withText(Data_News.DATE_CREATED),
                withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DATE_CREATED)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка TIME")
    public void checkFieldTime_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_TIME),
                withText(Data_News.TIME_CREATED),
                withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TIME_CREATED)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_ADVERTISEMENT")
    public void checkEditedTitle_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_ADVERTISEMENT)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_BIRTHDAY")
    public void checkEditedTitle_Birthday_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_BIRTHDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_BIRTHDAY)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_SALARY")
    public void checkEditedTitle_Salary_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_SALARY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_SALARY)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_TRADE_UNION")
    public void checkEditedTitle_TradeUnion_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_TRADE_UNION),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_TRADE_UNION)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_HOLIDAY")
    public void checkEditedTitle_Holiday_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_HOLIDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_HOLIDAY)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_MASSAGE")
    public void checkEditedTitle_Massage_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_MASSAGE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_MASSAGE)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_GRATITUDE")
    public void checkEditedTitle_Gratitude_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_GRATITUDE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_GRATITUDE)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_HELP")
    public void checkEditedTitle_Help_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_HELP),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_HELP)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_ADVERTISEMENT")
    public void checkEditedDescription_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_ADVERTISEMENT)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_BIRTHDAY")
    public void checkEditedDescription_Birthday_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_BIRTHDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_BIRTHDAY)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_SALARY")
    public void checkEditedDescription_Salary_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_SALARY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_SALARY)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_TRADE_UNION")
    public void checkEditedDescription_TradeUnion_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_TRADE_UNION),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_TRADE_UNION)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_HOLIDAY")
    public void checkEditedDescription_Holiday_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_HOLIDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_HOLIDAY)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_MASSAGE")
    public void checkEditedDescription_Massage_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_MASSAGE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_MASSAGE)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_GRATITUDE")
    public void checkEditedDescription_Gratitude_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_GRATITUDE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_GRATITUDE)));
    }

    @Step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_HELP")
    public void checkEditedDescription_Help_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_HELP),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_HELP)));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DATE после редактирования")
    public void checkEditedPublicationDate_Visibility() {
        onView(allOf(withId(Elements_News.ID_PUBLICATION_DATE_VALUE),
                withText(Data_News.DATE_EDITED),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DATE_EDITED)));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    // проверка ОТРЕДАКТИРОВАННОГО TIME
//    @Step("экран Control panel / экран Editing NEWS / проверка TIME после редактирования")
//    public void checkEditedTime_Visibility() {
//        onView(allOf(withId(Elements_News.ID_TIME_INPUT),
//                withText(Data_News.TIME_EDITED),
//                withParent(withParent(withId(R.id.news_item_material_card_view))),
//                isDisplayed()))
//                .check(matches(isDisplayed()))
//                .check(matches(withText(Data_News.TIME_EDITED)));
//    }

    @Step("экран Control panel / List / проверка INVALID TITLE в нераскрытой карточке News")
    public void checkInvalidTitle_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_INVALID),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_INVALID)));
    }

    @Step("экран Control panel / List / проверка что News с INVALID TITLE не отображается")
    public void checkInvalidTitle_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_INVALID),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(doesNotExist());
    }

    @Step("экран Control panel / List / проверка INVALID DESCRIPTION в нераскрытой карточке News")
    public void checkInvalidDescription_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_INVALID),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_INVALID)));
    }

    @Step("экран Control panel / List /  проверка что News с INVALID DESCRIPTION не отображается")
    public void checkInvalidDescription_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_INVALID),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(doesNotExist());
    }

    @Step("экран CREATING NEWS/ EDITING NEWS /проверка текста модального окна-предупреждения")
    public void checkMessageTextModalView_Visibility() {
        onView(allOf(withId(Elements_News.ID_MODAL_MESSAGE),
                withText(Data_News.MESSAGE_EDIT),
                withParent(withParent(withId(com.google.android.material.R.id.scrollView))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.MESSAGE_EDIT)));
    }

    @Step("экран CREATING NEWS/ EDITING NEWS /проверка отображения кнопки Cancel в модальном окне-предупреждении")
    public void checkButtonCancelModalView_Visibility() {
        onView(allOf(withId(Elements_News.ID_MODAL_CANCEL),
                withText(Data_News.CANCEL_MODAL),
                withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CANCEL_MODAL)));
    }

    @Step("экран CREATING NEWS/ EDITING NEWS /проверка отображения кнопки Ok в модальном окне-предупреждении")
    public void checkButtonOkModalView_Visibility() {
        onView(allOf(withId(Elements_News.ID_MODAL_OK),
                withText(Data_News.OK_MODAL),
                withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.OK_MODAL)));
    }

    @Step("экран Control panel / List / проверка текста модального окна-предупреждения DELETE")
    public void checkMessageDeleteModal_Visibility() {
        onView(allOf(withId(Elements_News.ID_MODAL_MESSAGE),
                withText(Data_News.MESSAGE_DELETE),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.MESSAGE_DELETE)));
    }

    @Step("экран Control panel / List / проверка отображения кнопки CANCEL в модальном окне-предупреждении DELETE")
    public void checkCancelDeleteModal_Visibility() {
        onView(allOf(withId(Elements_News.ID_MODAL_CANCEL),
                withText(Data_News.CANCEL_MODAL),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CANCEL_MODAL)));
    }

    @Step("экран Control panel / List / проверка отображения кнопки OK в модальном окне-предупреждении DELETE")
    public void checkOkDeleteModal_Visibility() {
        onView(allOf(withId(Elements_News.ID_MODAL_OK),
                withText(Data_News.OK_MODAL),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.OK_MODAL)));
    }

    @Step("экран Control panel / List/ нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для ADVERTISEMENT")
    public void checkTitleCardNews_Advertisement_NotVisibility() {
        new Utils_Helper().timerWaitingAsyncOperation2000();
        onView(allOf(
                withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    @Step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Birthday")
    public void checkTitleCardNews_Birthday_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_BIRTHDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    @Step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Salary")
    public void checkTitleCardNews_Salary_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_SALARY),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    @Step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для TradeUnion")
    public void checkTitleCardNews_TradeUnion_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_TRADE_UNION),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    @Step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Holiday")
    public void checkTitleCardNews_Holiday_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_HOLIDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    @Step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Massage")
    public void checkTitleCardNews_Massage_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_MASSAGE),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    @Step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Gratitude")
    public void checkTitleCardNews_Gratitude_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_GRATITUDE),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    @Step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Help")
    public void checkTitleCardNews_Help_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_HELP),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    @Step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Новый год")
    public void checkTitleCardNews_Custom_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_CUSTOM),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }
}
