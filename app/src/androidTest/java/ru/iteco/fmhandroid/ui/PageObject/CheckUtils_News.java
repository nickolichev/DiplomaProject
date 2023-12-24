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

import io.qameta.allure.kotlin.Allure;
import io.qameta.allure.kotlin.Step;
import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_News;
import ru.iteco.fmhandroid.ui.testData.Data_News;

public class CheckUtils_News {
    public void checkTitleNewsView_Visibility() {
        Allure.step("экран NEWS / верхняя панель / проверяем Title экрана");
        onView(allOf(withText(Data_News.TITLE_NEWS_TEXT),
                withParent(withParent(withId(Elements_News.ID_TITLE_NEWS))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_NEWS_TEXT)));
    }

    public void checkButtonSortNews_Visibility() {
        Allure.step("экран NEWS / верхняя панель / проверяем видимость кнопки сортировки");
        onView(allOf(withId(Elements_News.ID_BUTTON_SORT_NEWS),
                withContentDescription(Data_News.BUTTON_SORT_NEWS),
                withParent(withParent(withId(R.id.container_list_news_include))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_News.BUTTON_SORT_NEWS)));
    }

    public void checkButtonFilterNews_Visibility() {
        Allure.step("экран NEWS / верхняя панель / проверяем видимость кнопки FILTER");
        onView(allOf(withId(Elements_News.ID_BUTTON_FILTER_NEWS),
                withParent(withParent(withId(R.id.container_list_news_include))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    public void checkButtonEditNews_Visibility() {
        Allure.step("экран NEWS / верхняя панель / проверяем видимость кнопки редактирования");
        onView(allOf(withId(Elements_News.ID_BUTTON_EDIT_NEWS),
                withParent(withParent(withId(R.id.container_list_news_include))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    public void checkTitleControlPanel_Visibility() {
        Allure.step("экран Control panel / панель экрана / проверка Title экрана");
        onView(allOf(withText(Data_News.CONTROL_PANEL),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CONTROL_PANEL)));
    }

    public void checkSortControlPanel_Visibility() {
        Allure.step("экран Control panel / панель экрана / проверяем видимость кнопки SORT");
        onView(allOf(withId(Elements_News.ID_BUTTON_SORT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed())).check(matches(isDisplayed()));
    }

    public void checkIconFilterControlPanel_Visibility() {
        Allure.step("экран Control panel / панель экрана / проверяем видимость кнопки FILTER");
        onView(allOf(withId(Elements_News.ID_ICON_FILTER_NEWS_CONTROL),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    public void checkButtonAddControlPanel_Visibility() {
        Allure.step("экран Control panel / панель экрана / проверяем видимость кнопки ADD");
        onView(allOf(withId(Elements_News.ID_BUTTON_ADD_NEWS),
                withContentDescription(Data_News.BUTTON_ADD_NEWS),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_News.BUTTON_ADD_NEWS)));
    }

    public void checkEmojiCategory_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем видимость эмоджи CATEGORY");
        onView(allOf(withId(Elements_News.ID_ICON_CATEGORY_NEWS),
                withContentDescription(Data_News.ICON_CATEGORY_NEWS),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    public void checkTitleCardNews_Advertisement_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для ADVERTISEMENT");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_ADVERTISEMENT)));
    }

    public void checkTitleCardNews_Birthday_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для BIRTHDAY");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_BIRTHDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_BIRTHDAY)));
    }

    public void checkTitleCardNews_Salary_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для SALARY");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_SALARY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_SALARY)));
    }

    public void checkTitleCardNews_TradeUnion_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для TRADE_UNION");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_TRADE_UNION),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_TRADE_UNION)));
    }

    public void checkTitleCardNews_Holiday_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для HOLIDAY");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_HOLIDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_HOLIDAY)));
    }

    public void checkTitleCardNews_Massage_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для MASSAGE");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_MASSAGE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_MASSAGE)));
    }

    public void checkTitleCardNews_Gratitude_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для GRATITUDE");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_GRATITUDE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_GRATITUDE)));
    }

    public void checkTitleCardNews_Help_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для HELP");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_HELP),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_HELP)));
    }

    public void checkPublicationDateText_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем текст строки Publication Date");
        onView(allOf(withId(Elements_News.ID_PUBLICATION_DATE),
                withText(Data_News.PUBLICATION_DATE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.PUBLICATION_DATE)));
    }

    public void checkPublicationValueControlPanel_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем значение Publication date");
        onView(allOf(withId(Elements_News.ID_PUBLICATION_DATE_VALUE),
                withText(Data_News.PUBLICATION_DATE_VALUE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.PUBLICATION_DATE_VALUE)));
    }

    public void checkCreationDateControlPanel_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем текст строки Creation date");
        onView(allOf(withId(Elements_News.ID_CREATION_DATE),
                withText(Data_News.CREATION_DATE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CREATION_DATE)));
    }

    public static String getCurrentDate() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / генерируем значение Creation date");
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        Date currentDate = new Date(currentTimeMillis);
        return dateFormat.format(currentDate);
    }

    public void checkCreationDateValueControlPanel_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем значение Creation date");
        onView(allOf(withId(Elements_News.ID_CREATION_DATE_VALUE),
                withText(getCurrentDate()),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(getCurrentDate())));
    }

    public void checkAuthorControlPanel_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем текст строки Author");
        onView(allOf(withId(Elements_News.ID_AUTHOR),
                withText(Data_News.AUTHOR),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.AUTHOR)));
    }

    public void checkAuthorValueControlPanel_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем значение Author");
        onView(allOf(withId(Elements_News.ID_AUTHOR_VALUE),
                withText(Data_News.AUTHOR_VALUE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.AUTHOR_VALUE)));
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

    public void checkDeleteControlPanel_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем отображение кнопки Delete");
        onView(allOf(withId(Elements_News.ID_BUTTON_DELETE),
                withContentDescription(Data_News.BUTTON_DELETE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_News.BUTTON_DELETE)));
    }

    public void checkEditControlPanel_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем отображение кнопки Edit");
        onView(allOf(withId(Elements_News.ID_BUTTON_EDIT),
                withContentDescription(Data_News.BUTTON_EDIT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_News.BUTTON_EDIT)));
    }

    public void checkExpendControlPanel_Visibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем отображение кнопки Expend");
        onView(allOf(withId(Elements_News.ID_BUTTON_EXPEND),
                withContentDescription(Data_News.EXPEND_CARD_NEWS),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_News.EXPEND_CARD_NEWS)));
    }

    public void checkTitleFilterControlPanel_Visibility() {
        Allure.step("экран Control panel / Filter News  / проверка видимости Title экрана FILTER Control Panel");
        onView(allOf(withId(Elements_News.ID_TITLE_FILTER_NEWS),
                withText(Data_News.TITLE_FILTER_NEWS),
                withParent(withParent(withId(R.id.nav_host_fragment))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_FILTER_NEWS)));
    }

    public void checkActiveControlPanel_Visibility() {
        Allure.step("экран Control panel / Filter News / проверка видимости статуса ACTIVE + отображение CheckMark");
        onView(allOf(withId(Elements_News.ID_STATUS_ACTIVE),
                withText(Data_News.STATUS_ACTIVE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed())).check(matches(withText(Data_News.STATUS_ACTIVE)));
        onView(allOf(withId(Elements_News.ID_CHECK_MARK),
                withContentDescription(Data_News.CHECK_MARK),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed())).check(matches(isDisplayed()));
    }

    public void checkNotActiveControlPanel_Visibility() {
        Allure.step("экран Control panel / Filter News / проверка видимости статуса NOT ACTIVE + отображение CheckMark");
        onView(allOf(withId(Elements_News.ID_STATUS_NOT_ACTIVE),
                withText(Data_News.STATUS_NOT_ACTIVE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed())).check(matches(withText(Data_News.STATUS_NOT_ACTIVE)));
        onView(allOf(withId(Elements_News.ID_CHECK_MARK),
                withContentDescription(Data_News.CHECK_MARK),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed())).check(matches(isDisplayed()));
    }

    public void checkCreatingNewsTitle_Visibility() {
        Allure.step("экран Control panel / Creating News / проверка Title экрана");
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

    public void checkFieldCategory_Visibility() {
        Allure.step("экран Control panel / Creating News / проверка видимости поля Category для ввода тестовых данных");
        onView(allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                withHint(Data_News.CATEGORY_TEXT),
                withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_News.CATEGORY_TEXT)));
    }

    public void checkFieldTitle_Visibility() {
        Allure.step("экран Control panel / Creating News / проверка видимости поля Title для ввода тестовых данных");
        onView(allOf(withId(Elements_News.ID_CREATING_TITLE_TEXT),
                withHint(Data_News.TITLE_TEXT),
                withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_News.TITLE_TEXT)));
    }

    public void checkFieldPublicationDate_Visibility() {
        Allure.step("экран Control panel / Creating News / проверка видимости поля Publication date для ввода тестовых данных");
        onView(allOf(withId(Elements_News.ID_CREATING_DATE),
                withHint(Data_News.PUBLICATION_DATE_CREATING),
                withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_News.PUBLICATION_DATE_CREATING)));
    }

    public void checkFieldPublicationTime_Visibility() {
        Allure.step("экран Control panel / Creating News / проверка видимости поля Time для ввода тестовых данных");
        onView(allOf(withId(Elements_News.ID_CREATING_TIME),
                withHint(Data_News.TIME_CREATING),
                withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_News.TIME_CREATING)));
    }

    public void checkFieldDescription_Visibility() {
        Allure.step("экран Control panel / Creating News / проверка видимости поля Description для ввода тестовых данных");
        onView(allOf(withId(Elements_News.ID_CREATING_DESCRIPTION),
                withHint(Data_News.DESCRIPTION_CREATING),
                withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_News.DESCRIPTION_CREATING)));
    }

    public void checkSwitcherOnCreatingNews_Visibility() {
        Allure.step("экран Control panel / Creating News / проверка видимости switcher в статусе ON");
        onView(allOf(withId(Elements_News.ID_CREATING_SWITCH),
                withText(Data_News.SWITCH_ON_CREATING),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(doesNotExist());
    }

    public void checkButtonSaveCreatingNews_Visibility() {
        Allure.step("экран Control panel / Creating News / проверка видимости кнопки SAVE");
        onView(allOf(withId(Elements_News.ID_CREATING_SAVE),
                withText(Data_News.SAVE_CREATING_TEXT),
                withContentDescription(Data_News.SAVE_CREATING_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.SAVE_CREATING_TEXT)));
    }

    public void checkButtonCancelCreatingNews_Visibility() {
        Allure.step("экран Control panel / Creating News / проверка видимости кнопки CANCEL");
        onView(allOf(withId(Elements_News.ID_CREATING_CANCEL),
                withText(Data_News.CANCEL_CREATING_TEXT),
                withContentDescription(Data_News.CANCEL_CREATING_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CANCEL_CREATING_TEXT)));
    }

    public void checkIconEmptyFieldCategory_Visibility() {
        Allure.step("экран Control panel / Creating News / проверка видимости иконки-предупреждения о незаполненном поле Category");
        onView(allOf(withId(com.google.android.material.R.id.text_input_start_icon),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.FrameLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    public void checkIconEmptyFieldsRemaining_Visibility() {
        Allure.step("экран Control panel / Creating News / проверка видимости иконки-предупреждения о незаполненном поле");
        onView(allOf(withId(com.google.android.material.R.id.text_input_end_icon),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout.class))),
                isDisplayed(),
                not(withContentDescription("Show dropdown menu"))))
                .check(matches(isDisplayed()));
    }

    public void checkFieldCategory_Advertisement_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка выбранного значения для поле CATEGORY_ADVERTISEMENT");
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL),
                withText(Data_News.CATEGORY_ADVERTISEMENT),
                withParent(withParent(withId(news_item_category_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CATEGORY_ADVERTISEMENT)));
    }

    public void checkFieldTitle_Advertisement_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS + Creating NEWS / проверка введенного в поле TITLE значения для CATEGORY_ADVERTISEMENT");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT),
                withText(Data_News.TITLE_CARD_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_ADVERTISEMENT)));
    }

    public void checkFieldDescription_Advertisement_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS + Creating NEWS / проверка введенного в поле DESCRIPTION значения для CATEGORY_ADVERTISEMENT");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT),
                withText(Data_News.DESCRIPTION_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_ADVERTISEMENT)));
    }

    public void checkDescription_Advertisement_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_ADVERTISEMENT");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_ADVERTISEMENT)));
    }

    public void checkDescription_Birthday_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_BIRTHDAY");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_BIRTHDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_BIRTHDAY)));
    }

    public void checkDescription_Salary_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_SALARY");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_SALARY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_SALARY)));
    }

    public void checkDescription_TradeUnion_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_TRADE_UNION");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_TRADE_UNION),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_TRADE_UNION)));
    }

    public void checkDescription_Holiday_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_HOLIDAY");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_HOLIDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_HOLIDAY)));
    }

    public void checkDescription_Massage_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_MASSAGE");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_MASSAGE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_MASSAGE)));
    }

    public void checkDescription_Gratitude_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_GRATITUDE");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_GRATITUDE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_GRATITUDE)));
    }

    public void checkDescription_Help_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_HELP");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_HELP),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_HELP)));
    }

    public void checkFieldDate_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS + Creating NEWS / проверка введенного в поле DATE значения");
        onView(allOf(withId(Elements_News.ID_CREATING_DATE),
                withText(Data_News.DATE_CREATED),
                withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DATE_CREATED)));
    }

    public void checkFieldTime_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS + Creating NEWS /  проверка введенного в поле TIME значения");
        onView(allOf(withId(Elements_News.ID_CREATING_TIME),
                withText(Data_News.TIME_CREATED),
                withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TIME_CREATED)));
    }

    public void checkEditedTitle_Advertisement_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_ADVERTISEMENT");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_ADVERTISEMENT)));
    }

    public void checkEditedTitle_Birthday_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_BIRTHDAY");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_BIRTHDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_BIRTHDAY)));
    }

    public void checkEditedTitle_Salary_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_SALARY");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_SALARY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_SALARY)));
    }

    public void checkEditedTitle_TradeUnion_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_TRADE_UNION");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_TRADE_UNION),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_TRADE_UNION)));
    }

    public void checkEditedTitle_Holiday_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_HOLIDAY");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_HOLIDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_HOLIDAY)));
    }

    public void checkEditedTitle_Massage_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_MASSAGE");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_MASSAGE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_MASSAGE)));
    }

    public void checkEditedTitle_Gratitude_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_GRATITUDE");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_GRATITUDE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_GRATITUDE)));
    }

    public void checkEditedTitle_Help_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_HELP");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_HELP),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_EDIT_HELP)));
    }

    public void checkEditedDescription_Advertisement_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_ADVERTISEMENT");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_ADVERTISEMENT)));
    }

    public void checkEditedDescription_Birthday_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_BIRTHDAY");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_BIRTHDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_BIRTHDAY)));
    }

    public void checkEditedDescription_Salary_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_SALARY");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_SALARY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_SALARY)));
    }

    public void checkEditedDescription_TradeUnion_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_TRADE_UNION");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_TRADE_UNION),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_TRADE_UNION)));
    }

    public void checkEditedDescription_Holiday_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_HOLIDAY");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_HOLIDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_HOLIDAY)));
    }

    public void checkEditedDescription_Massage_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_MASSAGE");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_MASSAGE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_MASSAGE)));
    }

    public void checkEditedDescription_Gratitude_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_GRATITUDE");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_GRATITUDE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_GRATITUDE)));
    }

    public void checkEditedDescription_Help_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_HELP");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_EDIT_HELP),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_EDIT_HELP)));
    }

    public void checkEditedPublicationDate_Visibility() {
        Allure.step("экран Control panel / экран Editing NEWS / проверка DATE после редактирования");
        onView(allOf(withId(Elements_News.ID_PUBLICATION_DATE_VALUE),
                withText(Data_News.DATE_EDITED),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DATE_EDITED)));
    }

    public void checkInvalidTitle_Visibility() {
        Allure.step("экран Control panel / List / проверка INVALID TITLE в нераскрытой карточке News");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_INVALID),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.TITLE_CARD_INVALID)));
    }

    public void checkInvalidTitle_NotVisibility() {
        Allure.step("экран Control panel / List / проверка что News с INVALID TITLE не отображается");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_CARD_INVALID),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(doesNotExist());
    }

    public void checkInvalidDescription_Visibility() {
        Allure.step("экран Control panel / List / проверка INVALID DESCRIPTION в нераскрытой карточке News");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_INVALID),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.DESCRIPTION_INVALID)));
    }

    public void checkInvalidDescription_NotVisibility() {
        Allure.step("экран Control panel / List /  проверка что News с INVALID DESCRIPTION не отображается");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION),
                withText(Data_News.DESCRIPTION_INVALID),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .check(doesNotExist());
    }

    public void checkMessageTextModalView_Visibility() {
        Allure.step("экран CREATING NEWS/ EDITING NEWS /проверка текста модального окна-предупреждения");
        onView(allOf(withId(Elements_News.ID_MODAL_MESSAGE),
                withText(Data_News.MESSAGE_EDIT),
                withParent(withParent(withId(com.google.android.material.R.id.scrollView))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.MESSAGE_EDIT)));
    }

    public void checkButtonCancelModalView_Visibility() {
        Allure.step("экран CREATING NEWS/ EDITING NEWS /проверка отображения кнопки Cancel в модальном окне-предупреждении");
        onView(allOf(withId(Elements_News.ID_MODAL_CANCEL),
                withText(Data_News.CANCEL_MODAL),
                withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CANCEL_MODAL)));
    }

    public void checkButtonOkModalView_Visibility() {
        Allure.step("экран CREATING NEWS/ EDITING NEWS /проверка отображения кнопки Ok в модальном окне-предупреждении");
        onView(allOf(withId(Elements_News.ID_MODAL_OK),
                withText(Data_News.OK_MODAL),
                withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.OK_MODAL)));
    }

    public void checkMessageDeleteModal_Visibility() {
        Allure.step("экран Control panel / List / проверка текста модального окна-предупреждения DELETE");
        onView(allOf(withId(Elements_News.ID_MODAL_MESSAGE),
                withText(Data_News.MESSAGE_DELETE),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.MESSAGE_DELETE)));
    }

    public void checkCancelDeleteModal_Visibility() {
        Allure.step("экран Control panel / List / проверка отображения кнопки CANCEL в модальном окне-предупреждении DELETE");
        onView(allOf(withId(Elements_News.ID_MODAL_CANCEL),
                withText(Data_News.CANCEL_MODAL),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.CANCEL_MODAL)));
    }

    public void checkOkDeleteModal_Visibility() {
        Allure.step("экран Control panel / List / проверка отображения кнопки OK в модальном окне-предупреждении DELETE");
        onView(allOf(withId(Elements_News.ID_MODAL_OK),
                withText(Data_News.OK_MODAL),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_News.OK_MODAL)));
    }

    public void checkTitleCardNews_Advertisement_NotVisibility() {
        Allure.step("экран Control panel / List/ нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для ADVERTISEMENT");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD),
                withText(Data_News.TITLE_EDIT_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    public void checkTitleCardNews_Birthday_NotVisibility() {
        Allure.step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Birthday");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_BIRTHDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    public void checkTitleCardNews_Salary_NotVisibility() {
        Allure.step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Salary");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_SALARY),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    public void checkTitleCardNews_TradeUnion_NotVisibility() {
        Allure.step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для TradeUnion");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_TRADE_UNION),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    public void checkTitleCardNews_Holiday_NotVisibility() {
        Allure.step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Holiday");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_HOLIDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    public void checkTitleCardNews_Massage_NotVisibility() {
        Allure.step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Massage");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_MASSAGE),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    public void checkTitleCardNews_Gratitude_NotVisibility() {
        Allure.step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Gratitude");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_GRATITUDE),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    public void checkTitleCardNews_Help_NotVisibility() {
        Allure.step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Help");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_HELP),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }

    public void checkTitleCardNews_Custom_NotVisibility() {
        Allure.step("экран NEWS / List / нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для Новый год");
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS),
                withText(Data_News.TITLE_CARD_CUSTOM),
                withParent(withParent(withId(R.id.news_item_material_card_view)))))
                .check(doesNotExist());
    }
}
