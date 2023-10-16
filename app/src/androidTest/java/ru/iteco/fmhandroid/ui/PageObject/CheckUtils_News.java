package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.not;
import static ru.iteco.fmhandroid.R.id.news_item_category_text_input_layout;
import static ru.iteco.fmhandroid.ui.PageObject.Utils_Helper.childAtPosition;

import android.view.View;

import androidx.test.espresso.ViewInteraction;

import org.hamcrest.core.IsInstanceOf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_News;
import ru.iteco.fmhandroid.ui.testData.Data_News;

public class CheckUtils_News {
    @DisplayName("экран NEWS / верхняя панель / проверяем Title экрана")
    public void checkTitleNews_Visibility() {
        ViewInteraction title = onView(allOf(withText(Data_News.TITLE_NEWS_TEXT),
                withParent(withParent(withId(Elements_News.ID_TITLE_NEWS))),
                isDisplayed()));
        title.check(matches(withText(Data_News.TITLE_NEWS_TEXT)));
    }
    @DisplayName("экран NEWS / верхняя панель / проверяем видимость кнопки сортировки")
    public void checkButtonSortNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_SORT_NEWS), withContentDescription(Data_News.BUTTON_SORT_NEWS),
                        withParent(withParent(withId(R.id.container_list_news_include))),
                        isDisplayed()));
    }
    @DisplayName("экран NEWS / верхняя панель / проверяем видимость кнопки FILTER")
    public void checkButtonFilterNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_FILTER_NEWS),
                        withParent(withParent(withId(R.id.container_list_news_include))),
                        isDisplayed()));
    }
    @DisplayName("экран NEWS / верхняя панель / проверяем видимость кнопки редактирования")
    public void checkButtonEditNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_EDIT_NEWS),
                        withParent(withParent(withId(R.id.container_list_news_include))),
                        isDisplayed()));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / проверяем видимость эмоджи CATEGORY")
    public void checkEmojiCategoryNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_ICON_CATEGORY_NEWS), withText(Data_News.ICON_CATEGORY_NEWS),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }


    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Custom")
    // использовать также на экране EDITING NEWS
    public void checkNewsListTitleCustom_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_CUSTOM),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Advertisement")
    public void checkNewsListTitleAdvertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Birthday")
    public void checkNewsListTitleBirthday_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Salary")
    public void checkNewsListTitleSalary_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_SALARY),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: TradeUnion")
    public void checkNewsListTitleTradeUnion_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Holiday")
    public void checkNewsListTitleHoliday_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Massage")
    public void checkNewsListTitleMassage_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Gratitude")
    public void checkNewsListTitleGratitude_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Help")
    public void checkNewsListTitleHelp_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_HELP),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость DATE")
    public void checkNewsListDate_Visibility() {
        onView(allOf(withId(Elements_News.ID_DATE_CARD_NEWS), withText(Data_News.DATE_CREATED),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / проверяем видимость кнопки Expend")
    public void checkNewsListExpend_Visibility() {
        onView(allOf(withId(Elements_News.ID_EXPEND_CARD_NEWS), withContentDescription(Data_News.EXPEND_CARD_NEWS),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }


    @DisplayName("экран FILTER NEWS / проверяем видимость Title экрана")
    public void checkTitleFilterNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_FILTER_NEWS), withText(Data_News.TITLE_FILTER_NEWS),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
    }

    @DisplayName("экран FILTER NEWS / проверяем видимость поля CATEGORY")
    // использовать также на экране EDITING NEWS
    public void checkCategoryFilter_Visibility() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL), withText(Data_News.CATEGORY_FOR_ALL),
                        withParent(withParent(withId(news_item_category_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран FILTER NEWS / проверяем видимость в поле CATEGORY кнопки DROPDOWN")
    public void checkDropdownCategory_Visibility() {
        onView(allOf(withId(Elements_News.ID_DROPDOWN_CATEGORY), withContentDescription(Data_News.DROPDOWN_CATEGORY),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
    }

    @DisplayName("экран FILTER NEWS / проверяем видимость поля DATE START")
    public void checkDateStart_Visibility() {
        onView(allOf(withId(Elements_News.ID_DATE_START), withText(Data_News.DATE_START),
                        withParent(withParent(withId(R.id.news_item_publish_date_start_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран FILTER NEWS / проверяем видимость поля DATE END")
    public void checkDateEnd_Visibility() {
        onView(allOf(withId(Elements_News.ID_DATE_END), withText(Data_News.DATE_END),
                        withParent(withParent(withId(R.id.news_item_publish_date_end_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран FILTER NEWS / проверяем видимость кнопки FILTER")
    public void checkButtonFilter_Visibility_Filter() {
        onView(allOf(withId(Elements_News.ID_BUTTON_FILTER), withText(Data_News.BUTTON_FILTER),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
    }

    @DisplayName("экран FILTER NEWS / проверяем видимость кнопки CANCEL")
    public void checkButtonCancel_Visibility_Filter() {
        onView(allOf(withId(Elements_News.ID_BUTTON_CANCEL), withText(Data_News.BUTTON_CANCEL),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
    }


    @DisplayName("экран Control panel / панель экрана / Title экрана")
    public void checkTitleControlPanel_Visibility() {
        ViewInteraction text = onView(
                allOf(withText(Data_News.CONTROL_PANEL),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        text.check(matches(withText(Data_News.CONTROL_PANEL)));
    }

    @DisplayName("экран Control panel / панель экрана / проверяем видимость кнопки SORT")
    public void checkSortControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_SORT),
                withContentDescription(Data_News.BUTTON_SORT),
                childAtPosition(
                        childAtPosition(
                                withId(R.id.container_list_news_include),
                                0),
                        1),
                isDisplayed()));
    }

    @DisplayName("экран Control panel / панель экрана / проверяем видимость кнопки FILTER")
    public void checkIconFilterControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_ICON_FILTER_NEWS_CONTROL),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / панель экрана / проверяем видимость кнопки ADD")
    public void checkButtonAddControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_ADD_NEWS), withContentDescription(Data_News.BUTTON_ADD_NEWS),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
    }

    // проверки эмоджи категорий
    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем видимость эмоджи CATEGORY")
    public void checkEmojiCategory_Visibility() {
        onView(allOf(withId(Elements_News.ID_ICON_CATEGORY_NEWS), withText(Data_News.ICON_CATEGORY_NEWS),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для ADVERTISEMENT")
    public void checkTitleCardNews_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD), withText(Data_News.TITLE_CARD_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для BIRTHDAY")
    public void checkTitleCardNews_Birthday_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD), withText(Data_News.TITLE_CARD_BIRTHDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для SALARY")
    public void checkTitleCardNews_Salary_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD), withText(Data_News.TITLE_CARD_SALARY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для TRADE_UNION")
    public void checkTitleCardNews_TradeUnion_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD), withText(Data_News.TITLE_CARD_TRADE_UNION),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для HOLIDAY")
    public void checkTitleCardNews_Holiday_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD), withText(Data_News.TITLE_CARD_HOLIDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для MASSAGE")
    public void checkTitleCardNews_Massage_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD), withText(Data_News.TITLE_CARD_MASSAGE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для GRATITUDE")
    public void checkTitleCardNews_Gratitude_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD), withText(Data_News.TITLE_CARD_GRATITUDE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем текст Title в карточке NEWS для HELP")
    public void checkTitleCardNews_Help_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD), withText(Data_News.TITLE_CARD_HELP),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем текст строки Publication Date")
    public void checkPublicationDateText_Visibility() {
        onView(allOf(withId(Elements_News.ID_PUBLICATION_DATE), withText(Data_News.PUBLICATION_DATE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем значение Publication date")
    public void checkPublicationValueControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_PUBLICATION_DATE_VALUE), withText(Data_News.PUBLICATION_DATE_VALUE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем текст строки Creation date")
    public void checkCreationDateControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATION_DATE), withText(Data_News.CREATION_DATE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / генерируем значение Creation date")
    public static String getCurrentDate() {
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        Date currentDate = new Date(currentTimeMillis);
        return dateFormat.format(currentDate);
    }
    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем значение Creation date")
    // заменить на текущую дату Попробовать написать метод установки текущей даты
    public void checkCreationDateValueControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATION_DATE_VALUE), withText(getCurrentDate()),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем текст строки Author")
    public void checkAuthorControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_AUTHOR), withText(Data_News.AUTHOR),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем значение Author")
    public void checkAuthorValueControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_AUTHOR_VALUE), withText(Data_News.AUTHOR_VALUE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем отображение CheckMark и статус Active")
    public void checkCheckMarkActiveControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_CHECK_MARK), withContentDescription(Data_News.CHECK_MARK),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        onView(allOf(withId(Elements_News.ID_STATUS_ACTIVE), withText(Data_News.STATUS_ACTIVE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем отображение CheckMark и статус Not Active")
    public void checkCheckMarkNotActiveControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_CHECK_MARK), withContentDescription(Data_News.CHECK_MARK),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        onView(allOf(withId(Elements_News.ID_STATUS_NOT_ACTIVE), withText(Data_News.STATUS_NOT_ACTIVE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем отображение кнопки Delete")
    public void checkDeleteControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_DELETE), withContentDescription(Data_News.BUTTON_DELETE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем отображение кнопки Edit")
    public void checkEditControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_EDIT), withContentDescription(Data_News.BUTTON_EDIT),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем отображение кнопки Expend")
    public void checkExpendControlPanel_Visibility() {
        onView(allOf(withId(Elements_News.ID_BUTTON_EXPEND), withContentDescription(Data_News.EXPEND_CARD_NEWS),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
    }

    // набор методов проверки созданных DESCRIPTION (по всем категориям NEWS)
    // после expend
    @DisplayName("экран Control panel / List / раскрытая карточка / проверка текста Description для Custom")
    public void checkDescriptionControlPanel_Custom_Visibility() {
        ViewInteraction description = onView(
                allOf(withId(Elements_News.ID_DESCRIPTION), withText(Data_News.DESCRIPTION_CUSTOM),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(Data_News.DESCRIPTION_CUSTOM)));
    }

    @DisplayName("экран Control panel / List / раскрытая карточка / проверка текста Description для Advertisement")
    public void checkDescriptionControlPanel_Advertisement_Visibility() {
        ViewInteraction description = onView(
                allOf(withId(Elements_News.ID_DESCRIPTION), withText(Data_News.DESCRIPTION_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(Data_News.DESCRIPTION_ADVERTISEMENT)));
    }

    @DisplayName("экран Control panel / List / раскрытая карточка / проверка текста Description для Birthday")
    public void checkDescriptionControlPanel_Birthday_Visibility() {
        ViewInteraction description = onView(
                allOf(withId(Elements_News.ID_DESCRIPTION), withText(Data_News.DESCRIPTION_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(Data_News.DESCRIPTION_BIRTHDAY)));
    }

    @DisplayName("экран Control panel / List / раскрытая карточка / проверка текста Description для Salary")
    public void checkDescriptionControlPanel_Salary_Visibility() {
        ViewInteraction description = onView(
                allOf(withId(Elements_News.ID_DESCRIPTION), withText(Data_News.DESCRIPTION_SALARY),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(Data_News.DESCRIPTION_SALARY)));
    }

    @DisplayName("экран Control panel / List / раскрытая карточка / проверка текста Description для Trade Union")
    public void checkDescriptionControlPanel_TradeUnion_Visibility() {
        ViewInteraction description = onView(
                allOf(withId(Elements_News.ID_DESCRIPTION), withText(Data_News.DESCRIPTION_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(Data_News.DESCRIPTION_TRADE_UNION)));
    }

    @DisplayName("экран Control panel / List / раскрытая карточка / проверка текста Description для Holiday")
    public void checkDescriptionControlPanel_Holiday_Visibility() {
        ViewInteraction description = onView(
                allOf(withId(Elements_News.ID_DESCRIPTION), withText(Data_News.DESCRIPTION_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(Data_News.DESCRIPTION_HOLIDAY)));
    }

    @DisplayName("экран Control panel / List / раскрытая карточка / проверка текста Description для Massage")
    public void checkDescriptionControlPanel_Massage_Visibility() {
        ViewInteraction description = onView(
                allOf(withId(Elements_News.ID_DESCRIPTION), withText(Data_News.DESCRIPTION_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(Data_News.DESCRIPTION_MASSAGE)));
    }

    @DisplayName("экран Control panel / List / раскрытая карточка / проверка текста Description для Gratitude")
    public void checkDescriptionControlPanel_Gratitude_Visibility() {
        ViewInteraction description = onView(
                allOf(withId(Elements_News.ID_DESCRIPTION), withText(Data_News.DESCRIPTION_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(Data_News.DESCRIPTION_GRATITUDE)));
    }

    @DisplayName("экран Control panel / List / раскрытая карточка / проверка текста Description для Help")
    public void checkDescriptionControlPanel_Help_Visibility() {
        ViewInteraction description = onView(
                allOf(withId(Elements_News.ID_DESCRIPTION), withText(Data_News.DESCRIPTION_HELP),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(Data_News.DESCRIPTION_HELP)));
    }


    // экран Filter News
    @DisplayName("экран Control panel / Filter News  / проверка видимости Title FILTER Control Panel")
    public void checkTitleFilterControlPanel_Visibility() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_TITLE_FILTER_NEWS), withText(Data_News.TITLE_FILTER_NEWS),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
        editText.check(matches(withText(Data_News.TITLE_FILTER_NEWS)));
    }

    @DisplayName("экран Control panel / Filter News / проверка видимости поля Category")
    public void checkCategoryControlPanel_Visibility() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_CATEGORY_CONTROL), withText(Data_News.CATEGORY_FOR_ALL),
                        withParent(withParent(withId(news_item_category_text_input_layout))),
                        isDisplayed()));
        editText.check(matches(withText(Data_News.CATEGORY_FOR_ALL)));
    }

    @DisplayName("экран Control panel / Filter News / проверка видимости кнопки DropDown в поле Category")
    public void checkDropDownControlPanel_Visibility() {
        ViewInteraction imageButton = onView(
                allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL), withContentDescription(Data_News.DROPDOWN_CATEGORY),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        imageButton.check(matches(isDisplayed()));
    }

    @DisplayName("экран Control panel / Filter News / проверка видимости поля DATE START")
    public void checkDateStartControlPanel_Visibility() {
        ViewInteraction editText2 = onView(
                allOf(withId(Elements_News.ID_DATE_START_CONTROL), withText(Data_News.DATE_START),
                        withParent(withParent(withId(R.id.news_item_publish_date_start_text_input_layout))),
                        isDisplayed()));
        editText2.check(matches(withText(Data_News.DATE_START)));
    }

    @DisplayName("экран Control panel / Filter News / проверка видимости поля DATE END")
    public void checkDateEndControlPanel_Visibility() {
        ViewInteraction editText3 = onView(
                allOf(withId(Elements_News.ID_DATE_END_CONTROL), withText(Data_News.DATE_END),
                        withParent(withParent(withId(R.id.news_item_publish_date_end_text_input_layout))),
                        isDisplayed()));
        editText3.check(matches(withText(Data_News.DATE_END)));
    }

    @DisplayName("экран Control panel / Filter News / проверка видимости статуса ACTIVE")
    public void checkActiveControlPanel_Visibility() {
        ViewInteraction editText3 = onView(
                allOf(withId(Elements_News.ID_ACTIVE_CONTROL), withText(Data_News.STATUS_ACTIVE_CONTROL_FILTER),
                        withParent(withParent(withId(R.id.news_item_publish_date_end_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / Filter News / проверка видимости статуса NOT ACTIVE")
    public void checkNotActiveControlPanel_Visibility() {
        ViewInteraction editText3 = onView(
                allOf(withId(Elements_News.ID_NOT_ACTIVE_CONTROL), withText(Data_News.STATUS_NOT_ACTIVE_CONTROL_FILTER),
                        withParent(withParent(withId(R.id.news_item_publish_date_end_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / Filter News / проверка видимости кнопки FILTER")
    public void checkButtonFilterControlPanel_Visibility() {
        ViewInteraction button = onView(
                allOf(withId(Elements_News.ID_BUTTON_FILTER), withText(Data_News.BUTTON_FILTER_CONTROL),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
        button.check(matches(isDisplayed()));
    }

    @DisplayName("экран Control panel / Filter News / проверка видимости кнопки CANCEL")
    public void checkButtonCancelControlPanel_Visibility() {
        ViewInteraction button2 = onView(
                allOf(withId(Elements_News.ID_BUTTON_CANCEL), withText(Data_News.BUTTON_CANCEL_CONTROL),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));
        }


    // экран Creating News
    @DisplayName("экран Control panel / Creating News / проверка Title экрана")
    public void checkCreatingNewsTitle_Visibility() {
        ViewInteraction creating = onView(
                allOf(withId(Elements_News.ID_CREATING_TITLE), withText(Data_News.TITLE_CREATING),
                        withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_news),
                                withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                        isDisplayed()));
        creating.check(matches(withText(Data_News.TITLE_CREATING)));

        ViewInteraction news = onView(
                allOf(withId(Elements_News.ID_CREATING_SUB_TITLE), withText(Data_News.TITLE_NEWS),
                        withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_news),
                                withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                        isDisplayed()));
        news.check(matches(withText(Data_News.TITLE_NEWS)));
    }
    @DisplayName("экран Control panel / Creating News / проверка видимости поля Category для ввода тестовых данных")
    public void checkCategoryCreatingNews_Visibility() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT), withText(Data_News.CATEGORY_TEXT),
                        withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
                        isDisplayed()));
    }
    @DisplayName("экран Control panel / Creating News / проверка видимости поля Title для ввода тестовых данных")
    public void checkTitleCreatingNews_Visibility() {
       onView(allOf(withId(Elements_News.ID_CREATING_TITLE_TEXT), withText(Data_News.TITLE_TEXT),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }
    @DisplayName("экран Control panel / Creating News / проверка видимости поля Publication date для ввода тестовых данных")
    public void checkPublicationCreatingNews_Visibility() {
       onView(allOf(withId(Elements_News.ID_CREATING_PUBLICATION_DATE), withText(Data_News.PUBLICATION_DATE_CREATING),
                        withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
                        isDisplayed()));
    }
    @DisplayName("экран Control panel / Creating News / проверка видимости поля Time для ввода тестовых данных")
    public void checkTimeCreatingNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_TIME), withText(Data_News.TIME_CREATING),
                        withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
                        isDisplayed()));
    }
    @DisplayName("экран Control panel / Creating News / проверка видимости поля Description для ввода тестовых данных")
    public void checkDescriptionCreatingNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_DESCRIPTION), withText(Data_News.DESCRIPTION_CREATING),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }
    @DisplayName("экран Control panel / Creating News / проверка видимости switcher в статусе ON")
    public void checkSwitcherOnCreatingNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_SWITCH), withText(Data_News.SWITCH_ON_CREATING),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / Creating News / проверка видимости switcher в статусе OFF")
    public void checkSwitcherOffCreatingNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_SWITCH), withText(Data_News.SWITCH_OFF_CREATING),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / Creating News / проверка видимости кнопки SAVE")
    public void checkButtonSaveCreatingNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_SAVE), withText(Data_News.SAVE_CREATING_TEXT), withContentDescription(Data_News.SAVE_CREATING_DESCRIPTION),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / Creating News / проверка видимости кнопки CANCEL")
    public void checkButtonCancelCreatingNews_Visibility() {
        onView(allOf(withId(Elements_News.ID_CREATING_CANCEL), withText(Data_News.CANCEL_CREATING_TEXT), withContentDescription(Data_News.CANCEL_CREATING_DESCRIPTION),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
    }



    // экран EDITING NEWS
    // проверка title EDITING
    @DisplayName("экран Control panel / экран Editing NEWS / проверка Title экрана")
    public void checkTitleEditingNews_Visibility(){
        onView(allOf(withId(Elements_News.ID_TITLE_EDITING), withText(Data_News.TITLE_EDITING),
                        withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_news),
                                withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                        isDisplayed()));
        onView(allOf(withId(Elements_News.ID_SUB_TITLE_NEWS), withText(Data_News.SUB_TITLE_NEWS),
                        withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_news),
                                withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                        isDisplayed()));
    }

    // набор методов проверки CATEGORY на экране EDITING NEWS
    // проверка Category в изначально созданном NEWS  (требуется перед редактированием)
    @DisplayName("экран Control panel / экран Editing NEWS / проверка CATEGORY_ADVERTISEMENT")
    public void checkCategory_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL), withText(Data_News.CATEGORY_ADVERTISEMENT),
                        withParent(withParent(withId(news_item_category_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка CATEGORY_BIRTHDAY")
    public void checkCategory_Birthday_Visibility() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL), withText(Data_News.CATEGORY_BIRTHDAY),
                        withParent(withParent(withId(news_item_category_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка CATEGORY_SALARY")
    public void checkCategory_Salary_Visibility() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL), withText(Data_News.CATEGORY_SALARY),
                        withParent(withParent(withId(news_item_category_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка CATEGORY_TRADE_UNION")
    public void checkCategory_TradeUnion_Visibility() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL), withText(Data_News.CATEGORY_TRADE_UNION),
                        withParent(withParent(withId(news_item_category_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка CATEGORY_HOLIDAY")
    public void checkCategory_Holiday_Visibility() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL), withText(Data_News.CATEGORY_HOLIDAY),
                        withParent(withParent(withId(news_item_category_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка CATEGORY_MASSAGE")
    public void checkCategory_Massage_Visibility() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL), withText(Data_News.CATEGORY_MASSAGE),
                        withParent(withParent(withId(news_item_category_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка CATEGORY_GRATITUDE")
    public void checkCategory_Gratitude_Visibility() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL), withText(Data_News.CATEGORY_GRATITUDE),
                        withParent(withParent(withId(news_item_category_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка CATEGORY_HELP")
    public void checkCategory_Help_Visibility() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL), withText(Data_News.CATEGORY_HELP),
                        withParent(withParent(withId(news_item_category_text_input_layout))),
                        isDisplayed()));
    }


    // набор методов проверки TITLE на экране EDITING NEWS
    // проверка Title в изначально созданном NEWS  (требуется перед редактированием)
    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE для CATEGORY_ADVERTISEMENT")
    public void checkTitle_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_CARD_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE для CATEGORY_BIRTHDAY")
    public void checkTitle_Birthday_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_CARD_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE для CATEGORY_SALARY")
    public void checkTitle_Salary_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_CARD_SALARY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE для CATEGORY_TRADE_UNION")
    public void checkTitle_TradeUnion_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_CARD_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE для CATEGORY_HOLIDAY")
    public void checkTitle_Holiday_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_CARD_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE для CATEGORY_MASSAGE")
    public void checkTitle_Massage_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_CARD_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE для CATEGORY_GRATITUDE")
    public void checkTitle_Gratitude_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_CARD_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE для CATEGORY_GRATITUDE")
    public void checkTitle_Help_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_CARD_HELP),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    // набор методов проверки Description на экране EDITING NEWS
    // проверка Description в изначально созданном NEWS  (требуется перед редактированием)
    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_ADVERTISEMENT")
    public void checkDescription_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_BIRTHDAY")
    public void checkDescription_Birthday_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_SALARY")
    public void checkDescription_Salary_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_SALARY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_TRADE_UNION")
    public void checkDescription_TradeUnion_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_HOLIDAY")
    public void checkDescription_Holiday_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_MASSAGE")
    public void checkDescription_Massage_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_GRATITUDE")
    public void checkDescription_Gratitude_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION для CATEGORY_HELP")
    public void checkDescription_Help_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_HELP),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    // проверка Date в изначально созданном NEWS  (требуется перед редактированием)
    @DisplayName("экран Control panel / экран Editing NEWS / проверка DATE")
    public void checkDate_Visibility() {
        onView(allOf(withId(Elements_News.ID_DATE_INPUT), withText(Data_News.DATE_CREATED),
                        withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
                        isDisplayed()));
    }

    // проверка Time в изначально созданном NEWS  (требуется перед редактированием)
    @DisplayName("экран Control panel / экран Editing NEWS / проверка TIME")
    public void checkTime_Visibility() {
        onView(allOf(withId(Elements_News.ID_TIME_INPUT), withText(Data_News.TIME_CREATED),
                        withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
                        isDisplayed()));
    }


    // проверки всех Title в раскрытой карточке на экране EDITING NEWS
    // выполнить проверку каждого Title ПОСЛЕ редактирования
    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_ADVERTISEMENT")
    public void checkEditedTitle_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_EDIT_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_BIRTHDAY")
    public void checkEditedTitle_Birthday_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_EDIT_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_SALARY")
    public void checkEditedTitle_Salary_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_EDIT_SALARY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_TRADE_UNION")
    public void checkEditedTitle_TradeUnion_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_EDIT_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_HOLIDAY")
    public void checkEditedTitle_Holiday_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_EDIT_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_MASSAGE")
    public void checkEditedTitle_Massage_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_EDIT_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_GRATITUDE")
    public void checkEditedTitle_Gratitude_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_EDIT_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка TITLE после редактирования для CATEGORY_HELP")
    public void checkEditedTitle_Help_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_EDIT_HELP),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }


    // выполнить проверку каждого Description ПОСЛЕ редактирования
    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_ADVERTISEMENT")
    public void checkEditedDescription_Advertisement_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_EDIT_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_BIRTHDAY")
    public void checkEditedDescription_Birthday_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_EDIT_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_SALARY")
    public void checkEditedDescription_Salary_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_EDIT_SALARY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_TRADE_UNION")
    public void checkEditedDescription_TradeUnion_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_EDIT_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_HOLIDAY")
    public void checkEditedDescription_Holiday_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_EDIT_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_MASSAGE")
    public void checkEditedDescription_Massage_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_EDIT_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_GRATITUDE")
    public void checkEditedDescription_Gratitude_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_EDIT_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка DESCRIPTION после редактирования для CATEGORY_HELP")
    public void checkEditedDescription_Help_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_EDIT_HELP),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

    // проверка ОТРЕДАКТИРОВАННОЙ DATE
    @DisplayName("экран Control panel / экран Editing NEWS / проверка DATE после редактирования")
    public void checkEditedPublicationDate_Visibility() {
        onView(allOf(withId(Elements_News.ID_DATE_INPUT), withText(Data_News.DATE_EDITED),
                        withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
                        isDisplayed()));
    }

    // проверка ОТРЕДАКТИРОВАННОГО TIME
    @DisplayName("экран Control panel / экран Editing NEWS / проверка TIME после редактирования")
    public void checkEditedTime_Visibility() {
        onView(allOf(withId(Elements_News.ID_TIME_INPUT), withText(Data_News.TIME_EDITED),
                        withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка статуса SWITCH_ON")
    public void checkSwitchActiveOn_Visibility() {
        onView(allOf(withId(Elements_News.ID_SWITCH), withText(Data_News.SWITCH_ON),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка статуса SWITCH_OFF")
    public void checkSwitchActiveOff_Visibility() {
        onView(allOf(withId(Elements_News.ID_SWITCH), withText(Data_News.SWITCH_OFF),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка кнопки SAVE")
    public void checkSaveButton_Visibility() {
        onView(allOf(withId(Elements_News.ID_SAVE_EDITING), withText(Data_News.SAVE_EDITING), withContentDescription(Data_News.SAVE_BUTTON),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / экран Editing NEWS / проверка кнопки CANCEL")
    public void checkCancelButton_Visibility() {
        onView(allOf(withId(Elements_News.ID_CANCEL_EDITING), withText(Data_News.CANCEL_EDITING), withContentDescription(Data_News.SAVE_BUTTON),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
    }


    // набор методов для проверки НЕВАЛИДНЫХ Title, Description, Date, Time
    @DisplayName("экран Control panel / List / проверка INVALID TITLE")
    public void checkInvalidTitle_Visibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_CARD_INVALID),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
    }

//    public void checkEmptyTitle_Visibility() {
//        onView(allOf(withId(Elements_News.ID_TITLE_INPUT), withText(Data_News.TITLE_CARD_EMPTY),
//                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
//                        isDisplayed()));
//    }

    @DisplayName("экран Control panel / List / проверка INVALID DESCRIPTION")
    public void checkInvalidDescription_Visibility() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_INVALID),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
    }

//    public void checkEmptyDescription_Visibility() {
//        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT), withText(Data_News.DESCRIPTION_EMPTY),
//                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
//                        isDisplayed()));
//    }

    @DisplayName("экран Control panel / List / проверка INVALID DATE")
    public void checkInvalidDate_Visibility() {
        onView(allOf(withId(Elements_News.ID_DATE_INPUT), withText(Data_News.DATE_INVALID),
                        withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
                        isDisplayed()));
    }

//    public void checkEmptyDate_Visibility() {
//        onView(allOf(withId(Elements_News.ID_DATE_INPUT), withText(Data_News.DATE_EMPTY),
//                        withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
//                        isDisplayed()));
//    }

    @DisplayName("экран Control panel / List / проверка INVALID TIME")
    public void checkInvalidTime_Visibility() {
        onView(allOf(withId(Elements_News.ID_TIME_INPUT), withText(Data_News.TIME_INVALID),
                        withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
                        isDisplayed()));
    }

//    public void checkEmptyTime_Visibility() {
//        ViewInteraction time = onView(
//                allOf(withId(Elements_News.ID_TIME_INPUT), withText(Data_News.TIME_EMPTY),
//                        withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
//                        isDisplayed()));
//        time.check(matches(withText(Data_News.TIME_EMPTY)));
//    }




    // модальное окно предупреждение CREATING NEWS + EDITING NEWS
    @DisplayName("экран CREATING NEWS/ EDITING NEWS /проверка текста модального окна-предупреждения")
    public void checkMessageTextModalView_Visibility() {
        ViewInteraction message = onView(
                allOf(withId(Elements_News.ID_MODAL_MESSAGE), withText(Data_News.MESSAGE_EDIT),
                        withParent(withParent(withId(com.google.android.material.R.id.scrollView))),
                        isDisplayed()));
        message.check(matches(withText(Data_News.MESSAGE_EDIT)));
    }

    @DisplayName("экран CREATING NEWS/ EDITING NEWS /проверка отображения кнопки Cancel в модальном окне-предупреждении")
    public void checkButtonCancelModalView_Visibility() {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_News.ID_MODAL_CANCEL), withText(Data_News.CANCEL_MODAL),
                        withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                        isDisplayed()));
        cancel.check(matches(isDisplayed()));
    }

    @DisplayName("экран CREATING NEWS/ EDITING NEWS /проверка отображения кнопки Ok в модальном окне-предупреждении")
    public void checkButtonOkModalView_Visibility() {
        ViewInteraction ok = onView(
                allOf(withId(Elements_News.ID_MODAL_OK), withText(Data_News.OK_MODAL),
                        withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                        isDisplayed()));
        ok.check(matches(isDisplayed()));
    }


    // модальное окно DELETE
    @DisplayName("экран Control panel / List / проверка текста модального окна-предупреждения DELETE")
    public void checkMessageDeleteModal_Visibility() {
        onView(allOf(withId(Elements_News.ID_MODAL_MESSAGE), withText(Data_News.MESSAGE_DELETE),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List / проверка отображения кнопки CANCEL в модальном окне-предупреждении DELETE")
    public void checkCancelDeleteModal_Visibility() {
        onView(allOf(withId(Elements_News.ID_MODAL_CANCEL), withText(Data_News.CANCEL_MODAL),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                        isDisplayed()));
    }

    @DisplayName("экран Control panel / List / проверка отображения кнопки OK в модальном окне-предупреждении DELETE")
    public void checkOkDeleteModal_Visibility() {
       onView(allOf(withId(Elements_News.ID_MODAL_OK), withText(Data_News.OK_MODAL),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                        isDisplayed()));
    }


    // проверка пустой страницы
    @DisplayName("экран Control panel / List / проверка отсутствия элементов в списке News")
    public void checkEmptyNews_Visibility() {
        onView(
                allOf(withId(Elements_News.ID_EMPTY_NEWS), withText(Data_News.TEXT_EMPTY_NEWS),
                        withParent(withParent(withId(R.id.news_control_panel_swipe_to_refresh))),
                        isDisplayed()));
    }

    // проверки всех Title в раскрытой карточке на экране EDITING NEWS
    // выполнить проверку каждого Title ПОСЛЕ редактирования
    @DisplayName("экран Control panel / List/ нераскрытая карточка / проверяем отсутствие карточки в списке после удаления / Title для ADVERTISEMENT")
    public void checkTitleCardNews_Advertisement_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD), withText(Data_News.TITLE_CARD_ADVERTISEMENT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                not(isDisplayed())));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Birthday")
    public void checkTitleCardNews_Birthday_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_BIRTHDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                not(isDisplayed())));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Salary")
    public void checkTitleCardNews_Salary_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_SALARY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                not(isDisplayed())));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: TradeUnion")
    public void checkTitleCardNews_TradeUnion_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_TRADE_UNION),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                not(isDisplayed())));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Holiday")
    public void checkTitleCardNews_Holiday_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_HOLIDAY),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                not(isDisplayed())));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Massage")
    public void checkTitleCardNews_Massage_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_MASSAGE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                not(isDisplayed())));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Gratitude")
    public void checkTitleCardNews_Gratitude_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_GRATITUDE),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                not(isDisplayed())));
    }

    @DisplayName("экран NEWS / List / нераскрытая карточка / для поиска в списке + видимость Title для CATEGORY: Help")
    public void checkTitleCardNews_Help_NotVisibility() {
        onView(allOf(withId(Elements_News.ID_TITLE_CARD_NEWS), withText(Data_News.TITLE_CARD_HELP),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                not(isDisplayed())));
    }


}
