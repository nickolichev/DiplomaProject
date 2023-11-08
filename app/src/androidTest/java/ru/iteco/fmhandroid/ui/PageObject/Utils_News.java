package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;
import static ru.iteco.fmhandroid.ui.PageObject.Utils_Helper.childAtPosition;

import android.view.View;

import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_News;
import ru.iteco.fmhandroid.ui.testData.Data_News;

public class Utils_News {

    @DisplayName("экран NEWS / нераскрытые карточки / клик по кнопке SORT")
    public void clickSort_News() {
        ViewInteraction sort = onView(
                Matchers.allOf(withId(Elements_News.ID_BUTTON_SORT_NEWS),
                        withContentDescription(Data_News.BUTTON_SORT_NEWS)));

        sort.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        sort.perform(click());
    }
    @DisplayName("экран NEWS / нераскрытые карточки / клик по кнопке FILTER")
    public void clickFilter_News() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_News.ID_BUTTON_FILTER_NEWS)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }
    @DisplayName("экран NEWS / нераскрытые карточки / клик по кнопке EDIT")
    public void clickEdit_News() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_News.ID_BUTTON_EDIT_NEWS)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }

    @DisplayName("экран NEWS / нераскрытые карточки / клик по кнопке Expend")
    public void clickExpendCloseCard_News() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_News.ID_EXPEND_CARD_NEWS),
                        withContentDescription(Data_News.EXPEND_CARD_NEWS)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }

    // набор методов ввода тестовых данных CATEGORY
    @DisplayName("экран FILTER NEWS / ввод в CATEGORY невалидных тестовых данных EMPTY")
    public void inputCategoryEmpty_FilterNews() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL)))
                .perform(replaceText(Data_News.CATEGORY_EMPTY))
                .perform(ViewActions.closeSoftKeyboard());
    }

    @DisplayName("экран FILTER NEWS / ввод в CATEGORY пользовательских тестовых данных CUSTOM")
    public void inputCategoryCustom_FilterNews() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL)))
                .perform(replaceText(Data_News.CATEGORY_CUSTOM))
                .perform(ViewActions.closeSoftKeyboard());
    }

    @DisplayName("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Объявление\"")
    public void inputCategoryAdvertisement_FilterNews() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL)))
                .perform(replaceText(Data_News.CATEGORY_ADVERTISEMENT))
                .perform(ViewActions.closeSoftKeyboard());
        new Utils_Helper().timerWaitingAsyncOperation500();
    }
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"День рождения\"")
    public void inputCategoryBirthday_FilterNews() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL)))
                .perform(replaceText(Data_News.CATEGORY_BIRTHDAY))
                .perform(ViewActions.closeSoftKeyboard());
        new Utils_Helper().timerWaitingAsyncOperation500();

    }
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Зарплата\"")
    public void inputCategorySalary_FilterNews() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL)))
                .perform(replaceText(Data_News.CATEGORY_SALARY))
                .perform(ViewActions.closeSoftKeyboard());
        new Utils_Helper().timerWaitingAsyncOperation500();
    }
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Профсоюз\"")
    public void inputCategoryTradeUnion_FilterNews() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL)))
                .perform(replaceText(Data_News.CATEGORY_TRADE_UNION))
                .perform(ViewActions.closeSoftKeyboard());
        new Utils_Helper().timerWaitingAsyncOperation500();
    }
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Праздник\"")
    public void inputCategoryHoliday_FilterNews() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL)))
                .perform(replaceText(Data_News.CATEGORY_HOLIDAY))
                .perform(ViewActions.closeSoftKeyboard());
        new Utils_Helper().timerWaitingAsyncOperation500();
    }
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Массаж\"")
    public void inputCategoryMassage_FilterNews() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL)))
                .perform(replaceText(Data_News.CATEGORY_MASSAGE))
                .perform(ViewActions.closeSoftKeyboard());
        new Utils_Helper().timerWaitingAsyncOperation500();
    }
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Благодарность\"")
    public void inputCategoryGratitude_FilterNews() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL)))
                .perform(replaceText(Data_News.CATEGORY_GRATITUDE))
                .perform(ViewActions.closeSoftKeyboard());
        new Utils_Helper().timerWaitingAsyncOperation500();
    }
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Нужна помощь\"")
    public void inputCategoryHelp_FilterNews() {
        onView(allOf(withId(Elements_News.ID_CATEGORY_FOR_ALL)))
                .perform(replaceText(Data_News.CATEGORY_HELP))
                .perform(ViewActions.closeSoftKeyboard());
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    // набор методов ввода тестовых данных DATE_START и DATE_END для фильтрации NEWS
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в DATE START тестовых данных")
    public void inputDateStart_FilterNews() {
        onView(allOf(withId(Elements_News.ID_DATE_START)))
                .perform(replaceText(Data_News.DATE_START_TEST_DATA));
    }
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в DATE END тестовых данных")
    public void inputDateEnd_FilterNews() {
        onView(allOf(withId(Elements_News.ID_DATE_END)))
                .perform(replaceText(Data_News.DATE_END_TEST_DATA));
    }
    @DisplayName("тест-кейс #26 / NEWS / экран FILTER NEWS / ввод в DATE END тестовых данных")
    public void inputDateEnd() {
        onView(allOf(withId(Elements_News.ID_DATE_END)))
                .perform(replaceText(CheckUtils_News.getCurrentDate()));
    }
    @DisplayName("тест-кейс #26 / NEWS / экран FILTER NEWS / ввод в DATE START тестовых данных")
    public void inputDateStart() {
        onView(allOf(withId(Elements_News.ID_DATE_START)))
                .perform(replaceText(CheckUtils_News.getCurrentDate()));
    }
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в DATE START тестовых данных ПОСЛЕ Editing")
    public void inputDateStart_AfterEditing_FilterNews() {
        onView(allOf(withId(Elements_News.ID_DATE_START)))
                .perform(replaceText(Data_News.DATE_EDITED));
    }
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в DATE END тестовых данных ПОСЛЕ Editing")
    public void inputDateEnd_AfterEditing_FilterNews() {
        onView(allOf(withId(Elements_News.ID_DATE_END)))
                .perform(replaceText(Data_News.DATE_EDITED));
    }
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в DATE START НЕвалидных тестовых данных")
    public void inputInvalidDateStart_FilterNews() {
        onView(allOf(withId(Elements_News.ID_DATE_START)))
                .perform(replaceText(Data_News.DATE_INVALID));
    }
    @DisplayName("Control Panel / экран FILTER NEWS / ввод в DATE END НЕвалидных тестовых данных")
    public void inputInvalidDateEnd_FilterNews() {
        onView(allOf(withId(Elements_News.ID_DATE_END)))
                .perform(replaceText(Data_News.DATE_INVALID));
    }
    @DisplayName("Control Panel / экран FILTER NEWS / клик по кнопке FILTER")
    public void clickButtonFilter_FilterNews() {
        ViewInteraction button = onView(
                allOf(withId(Elements_News.ID_BUTTON_FILTER), withText(Data_News.BUTTON_FILTER),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
        button.perform(click());
        new Utils_Helper().timerWaitingAsyncOperation500();
    }
    @DisplayName("Control Panel / экран FILTER NEWS / клик по кнопке CANCEL")
    public void clickButtonCancel_FilterNews() {
        ViewInteraction button = onView(
                allOf(withId(Elements_News.ID_BUTTON_CANCEL), withText(Data_News.BUTTON_CANCEL),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
        button.perform(click());
    }
    @DisplayName("экран Control panel / клик по кнопке SORT")
    public void clickButtonSort_ControlPanel() {
        ViewInteraction sort = onView(
                allOf(withId(Elements_News.ID_BUTTON_SORT), withContentDescription(Data_News.BUTTON_SORT),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.container_list_news_include),
                                        0),
                                1),
                        isDisplayed()));
        sort.perform(click());
    }
    @DisplayName("экран Control panel / клик по иконке FILTER")
    public void clickButtonFilter_ControlPanel() {
        ViewInteraction filter = onView(
                allOf(withId(Elements_News.ID_ICON_FILTER_NEWS_CONTROL),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                2),
                        isDisplayed()));
        filter.perform(click());
    }
    @DisplayName("экран Control panel / клик по иконке CREATING NEWS")
    public void clickButtonAdd_News() {
        ViewInteraction add = onView(
                allOf(withId(Elements_News.ID_BUTTON_ADD_NEWS), withContentDescription(Data_News.BUTTON_ADD_NEWS),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        add.perform(click());
    }
    @DisplayName("экран Control panel / в НЕраскрытой карточке клик по иконке DELETE")
    public void clickButtonDelete_News() {

        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.delete_news_item_image_view), withContentDescription("News delete button"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.news_item_material_card_view),
                                        0),
                                14),
                        isDisplayed()));
        appCompatImageView.perform(click());
//        onView(allOf(withId(Elements_News.ID_BUTTON_DELETE), withContentDescription(Data_News.BUTTON_DELETE),
//                childAtPosition(
//                        childAtPosition(
//                                withId(R.id.news_item_material_card_view),
//                                0),
//                        14),
//                isDisplayed()))
//                .perform(click());
    }
    @DisplayName("экран Control panel / List / в НЕраскрытой карточке клик по кнопке Expend")
    public void clickExpendCard_News() {
        onView(allOf(withId(Elements_News.ID_LIST_NEWS),     // также для ID кнопки Expend
                childAtPosition(
                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                        0)))                 // клик в первой карточке списка /
                .perform(actionOnItemAtPosition(0, click()));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }
    // модальное окно-предупреждение DELETE
    @DisplayName("экран Control panel / клик в модальном окне-предупреждении DELETE по кнопке CANCEL")
    public void clickCancelModalDelete() {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_News.ID_MODAL_CANCEL), withText(Data_News.CANCEL_BUTTON),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        cancel.perform(scrollTo(), click());
    }
    @DisplayName("экран Control panel / клик в модальном окне-предупреждении DELETE по кнопке OK")
    public void clickOklModalDelete() {
        ViewInteraction ok = onView(
                allOf(withId(Elements_News.ID_MODAL_OK), withText(Data_News.OK_MODAL),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        new Utils_Helper().timerWaitingAsyncOperation1000();
        ok.perform(scrollTo(), click());
    }
    @DisplayName("экран Control panel / List / в НЕраскрытой карточке клик по иконке EDIT")
    public void clickButtonEditNews() {
        ViewInteraction edit = onView(
                allOf(withId(Elements_News.ID_BUTTON_EDIT), withContentDescription(Data_News.BUTTON_EDIT),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        edit.perform(click());
    }

    // ?? после поиска в списке
    // резервный метод для раскрытия карточки
    public void clickButtonExpendNews() {
        ViewInteraction expend = onView(
                allOf(withId(Elements_News.ID_BUTTON_EXPEND), withContentDescription(Data_News.BUTTON_EXPEND),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        expend.perform(click());
    }

    // ?? после поиска в списке
    // используем как основной (метод для клика по первой карточке в списке)
    public void clickExpendNews() {
        ViewInteraction expend = onView(
                allOf(withId(R.id.news_list_recycler_view),
                        childAtPosition(
                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                0)));
        expend.perform(actionOnItemAtPosition(0, click()));
    }

    // через эти методы написать тесты для проверки фильтрации в Control Panel
    // по Категории + датам + статусам
    @DisplayName("экран Control panel / FILTER / клик по кнопке DropDown Category")
    public void clickDropDownCategory_ControlPanel_Filter() {
        ViewInteraction drop_down = onView(
                allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL), withContentDescription(Data_News.DROPDOWN_CATEGORY),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                0),
                        isDisplayed()));
        drop_down.perform(click());
    }

    @DisplayName("экран Control panel / FILTER / клик по строке \"Объявление\" в списке Category")
    public void clickAdvertisementCategory_ControlPanel_Filter() {
        DataInteraction line = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(1);
        line.perform(click());
    }

    @DisplayName("экран Control panel / FILTER / клик по строке \"День рождения\" в списке Category")
    public void clickBirthdayCategory_ControlPanel_Filter() {
        DataInteraction line = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(2);
        line.perform(click());
    }

    @DisplayName("экран Control panel / FILTER / клик по строке \"Зарплата\" в списке Category")
    public void clickSalaryCategory_ControlPanel_Filter() {
        DataInteraction line = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(3);
        line.perform(click());
    }

    @DisplayName("экран Control panel / FILTER / клик по строке \"Профсоюз\" в списке Category")
    public void clickTradeUnionCategory_ControlPanel_Filter() {
        DataInteraction line = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(4);
        line.perform(click());
    }

    @DisplayName("экран Control panel / FILTER / клик по строке \"Праздник\" в списке Category")
    public void clickHolidayCategory_ControlPanel_Filter() {
        DataInteraction line = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(5);
        line.perform(click());
    }

    @DisplayName("экран Control panel / FILTER / клик по строке \"Массаж\" в списке Category")
    public void clickMassageCategory_ControlPanel_Filter() {
        DataInteraction line = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(6);
        line.perform(click());
    }

    @DisplayName("экран Control panel / FILTER / клик по строке \"Благодарность\" в списке Category")
    public void clickGratitudeCategory_ControlPanel_Filter() {
        DataInteraction line = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(7);
        line.perform(click());
    }

    @DisplayName("экран Control panel / FILTER / клик по строке \"Нужна помощь\" в списке Category")
    public void clickHelpCategory_ControlPanel_Filter() {
        DataInteraction line = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(8);
        line.perform(click());
    }

    @DisplayName("экран Control panel / FILTER / клик по check-box Active")
    public void clickActive_ControlPanel_Filter() {
        ViewInteraction active = onView(
                allOf(withId(Elements_News.ID_ACTIVE_CONTROL), withText(Data_News.STATUS_ACTIVE_CONTROL_FILTER),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nav_host_fragment),
                                        0),
                                4),
                        isDisplayed()));
        active.perform(click());
    }

    @DisplayName("экран Control panel / FILTER / клик по check-box Not Active")
    public void clickNotActive_ControlPanel_Filter() {
        ViewInteraction not_active = onView(
                allOf(withId(Elements_News.ID_NOT_ACTIVE_CONTROL), withText(Data_News.STATUS_NOT_ACTIVE_CONTROL_FILTER),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nav_host_fragment),
                                        0),
                                5),
                        isDisplayed()));
        not_active.perform(click());
    }

    @DisplayName("экран Control panel / FILTER / клик по кнопке FILTER")
    public void clickFilter_ControlPanel_Filter() {
        ViewInteraction filter = onView(
                allOf(withId(Elements_News.ID_BUTTON_FILTER), withText(Data_News.BUTTON_FILTER_CONTROL),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nav_host_fragment),
                                        0),
                                6),
                        isDisplayed()));
        filter.perform(click());
    }

    @DisplayName("экран Control panel / FILTER / клик по кнопке CANCEL")
    public void clickCancel_Control_Panel_Filter() {
        ViewInteraction materialButton6 = onView(
                allOf(withId(Elements_News.ID_BUTTON_CANCEL), withText(Data_News.BUTTON_CANCEL_CONTROL),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nav_host_fragment),
                                        0),
                                7),
                        isDisplayed()));
        materialButton6.perform(click());
    }


    // экран CREATING NEWS

    // выбор CATEGORY из выпадающего списка
    // не факт, что методы будут работать
    // в этом случае заменить на input (ниже представлены)

    @DisplayName("экран CREATING NEWS/ клик по Show dropdown menu")
    public void clickShowDropdownCategory_CreateNews() {
//        ViewInteraction dropdown = onView(
//                allOf(withId(com.google.android.material.R.id.text_input_end_icon), withContentDescription("Show dropdown menu"),
//                        childAtPosition(
//                                childAtPosition(
//                                        withClassName(is("android.widget.LinearLayout")),
//                                        1),
//                                0),
//                        isDisplayed()));
//        dropdown.perform(click());
//        ViewInteraction editText = onView(
//                allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT), withText(Data_News.CATEGORY_TEXT),
//                        withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
//                        isDisplayed()));
//        new Utils_Helper().timerWaitingAsyncOperation3000();
//        editText.perform(click());
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные \"Новый год\" в поле Category")
    public void inputCustomCategory_CreateNews() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                        isDisplayed()));
        editText.perform(replaceText(Data_News.CATEGORY_CUSTOM));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные \"новый год\" в поле Category")
    public void inputCustomCategory_CreateNews_Bug() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                        isDisplayed()));
        editText.perform(replaceText("новый год"));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные \"Объявление\" в поле Category")
    public void inputAdvertisementCategory_CreateNews() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                        isDisplayed()));
        editText.perform(replaceText(Data_News.CATEGORY_ADVERTISEMENT));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные \"День рождения\" в поле Category")
    public void inputBirthdayCategory_CreateNews() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                        isDisplayed()));
        editText.perform(replaceText(Data_News.CATEGORY_BIRTHDAY));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные \"Зарплата\" в поле Category")
    public void inputSalaryCategory_CreateNews() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                        isDisplayed()));
        editText.perform(replaceText(Data_News.CATEGORY_SALARY));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные \"Профсоюз\" в поле Category")
    public void inputTradeUnionCategory_CreateNews() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                        isDisplayed()));
        editText.perform(replaceText(Data_News.CATEGORY_TRADE_UNION));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные \"Праздник\" в поле Category")
    public void inputHolidayCategory_CreateNews() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                        isDisplayed()));
        editText.perform(replaceText(Data_News.CATEGORY_HOLIDAY));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные \"Массаж\" в поле Category")
    public void inputMassageCategory_CreateNews() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                        isDisplayed()));
        editText.perform(replaceText(Data_News.CATEGORY_MASSAGE));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные \"Благодарность\" в поле Category")
    public void inputGratitudeCategory_CreateNews() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                        isDisplayed()));
        editText.perform(replaceText(Data_News.CATEGORY_GRATITUDE));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные \"Нужна помощь\" в поле Category")
    public void inputHelpCategory_CreateNews() {
        ViewInteraction editText = onView(
                allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                        isDisplayed()));
        editText.perform(replaceText(Data_News.CATEGORY_HELP));
    }

    @DisplayName("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  Category ")
    public void clearCategoryField_CreateNews() {
        onView(withId(Elements_News.ID_CREATING_CATEGORY_TEXT))
                .perform(clearText());
    }


    // набор методов input для создания Title
    // проверить ID_TITLE_INPUT так как взят с экрана EDITING

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Новый год\"")
    public void inputTitleCreateNews_Custom() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_CUSTOM));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Объявление\"")
    public void inputTitleCreateNews_Advertisement() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_ADVERTISEMENT));
    }

    @DisplayName("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  TITLE ")
    public void clearTitleField_CreateNews() {
        onView(withId(Elements_News.ID_TITLE_INPUT))
                .perform(clearText());
    }
    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"День рождения\"")
    public void inputTitleCreateNews_Birthday() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_BIRTHDAY));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Зарплата\"")
    public void inputTitleCreateNews_Salary() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_SALARY));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Профсоюз\"")
    public void inputTitleCreateNews_TradeUnion() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_TRADE_UNION));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Праздник\"")
    public void inputTitleCreateNews_Holiday() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_HOLIDAY));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Массаж\"")
    public void inputTitleCreateNews_Massage() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_MASSAGE));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Благодарность\"")
    public void inputTitleCreateNews_Gratitude() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_GRATITUDE));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Нужна помощь\"")
    public void inputTitleCreateNews_Help() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_HELP));
    }

    @DisplayName("экран CREATING NEWS/ вставить НЕвалидные тестовые данные в  TITLE")
    public void inputInvalidTitleCreateNews() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_INVALID));
    }

    @DisplayName("экран CREATING NEWS/ вставить НЕвалидные тестовые данные EMPTY в  TITLE")
    public void inputEmptyTitleCreateNews() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_EMPTY));
    }


    // набор методов input для создания Description для всех категорий
    // проверить ID_DESCRIPTION_INPUT так как взят с экрана EDITING

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Новый год\"")
    public void inputDescriptionCreateNews_Custom() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_CUSTOM));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Объявление\"")
    public void inputDescriptionCreateNews_Advertisement() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_ADVERTISEMENT));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"День рождения\"")
    public void inputDescriptionCreateNews_Birthday() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_BIRTHDAY));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Зарплата\"")
    public void inputDescriptionCreateNews_Salary() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_SALARY));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Профсоюз\"")
    public void inputDescriptionCreateNews_TradeUnion() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_TRADE_UNION));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Праздник\"")
    public void inputDescriptionCreateNews_Holiday() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_HOLIDAY));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Массаж\"")
    public void inputDescriptionCreateNews_Massage() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_MASSAGE));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Благодарность\"")
    public void inputDescriptionCreateNews_Gratitude() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_GRATITUDE));
    }

    @DisplayName("экран CREATING NEWS/ вставить тестовые данные в DESCRIPTION по каждой отдельной CATEGORY / \"Нужна помощь\"")
    public void inputDescriptionCreateNews_Help() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_HELP));
    }

    @DisplayName("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  Description ")
    public void clearDescriptionField_CreateNews() {
        onView(withId(Elements_News.ID_DESCRIPTION_INPUT))
                .perform(clearText());
    }


    // набор методов input для создания НЕвалидных Description
    // проверить ID_DESCRIPTION_INPUT так как взят с экрана EDITING
    @DisplayName("экран CREATING NEWS/ вставить НЕвалидные тестовые данные в DESCRIPTION")
    public void inputInvalidDescriptionCreateNews() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_INVALID));
    }

    @DisplayName("экран CREATING NEWS/ вставить НЕвалидные тестовые данные EMPTY в DESCRIPTION")
    public void inputEmptyDescriptionCreateNews() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EMPTY));
    }

    @DisplayName("экран CREATING NEWS/ вставить валидные тестовые данные в PUBLICATION DATE")
    public void inputPublicationDateCreateNews() {
        onView(allOf(withId(Elements_News.ID_CREATING_DATE)))
                .perform(replaceText(Data_News.INPUT_PUBLICATION_DATE_CREATING));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @DisplayName("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  Publication date")
    public void clearPublicationDateField_CreateNews() {
        onView(withId(Elements_News.ID_CREATING_DATE))
                .perform(clearText());
    }

    @DisplayName("экран CREATING NEWS/ вставить валидные тестовые данные в TIME")
    public void inputTimeCreateNews() {
        onView(allOf(withId(Elements_News.ID_CREATING_TIME)))
                .perform(replaceText(Data_News.INPUT_TIME_CREATING));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @DisplayName("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  Time")
    public void clearTimeField_CreateNews() {
        onView(withId(Elements_News.ID_CREATING_TIME))
                .perform(clearText());
    }

    // использовать ДО отладки метода поиска/скроллинга
//    @DisplayName("экран CREATING NEWS/ вставить ВРЕМЕННЫЕ тестовые данные в PUBLICATION DATE")
//    public void inputTemporaryPublicationDateCreateNews() {
//        onView(allOf(withId(Elements_News.ID_CREATING_PUBLICATION_DATE)))
//                .perform(replaceText("08.10.2023"));
//    }

    @DisplayName("экран CREATING NEWS/ вставить НЕвалидные тестовые данные в PUBLICATION DATE")
    public void inputInvalidPublicationDateCreateNews() {
        onView(allOf(withId(Elements_News.ID_CREATING_DATE)))
                .perform(clearText());
        onView(allOf(withId(Elements_News.ID_CREATING_DATE)))
                .perform(replaceText(Data_News.INPUT_INVALID_PUBLICATION_DATE_CREATING));
    }

    @DisplayName("экран CREATING NEWS/ вставить НЕвалидные тестовые данные в TIME")
    public void inputInvalidTimeCreateNews() {
        onView(allOf(withId(Elements_News.ID_TIME_INPUT)))
                .perform(clearText());
        onView(allOf(withId(Elements_News.ID_TIME_INPUT)))
                .perform(replaceText(Data_News.INPUT_INVALID_TIME_CREATING));
    }

    @DisplayName("экран CREATING NEWS/ вставить НЕвалидные тестовые данные EMPTY в DATE")
    public void inputEmptyDateCreateNews() {
        onView(allOf(withId(Elements_News.ID_DATE_INPUT)))
                .perform(replaceText(Data_News.DATE_EMPTY));
    }

    @DisplayName("экран CREATING NEWS/ вставить НЕвалидные тестовые данные EMPTY в TIME")
    public void inputEmptyTimeCreateNews() {
        onView(allOf(withId(Elements_News.ID_TIME_INPUT)))
                .perform(replaceText(Data_News.TIME_EMPTY));
    }

    @DisplayName("тест-кейс #26 / экран CREATING NEWS/ вставить валидные тестовые данные в PUBLICATION DATE / текущая дата")
    public void inputCurrentDateCreateNews() {
        onView(allOf(withId(Elements_News.ID_CREATING_DATE)))
                .perform(replaceText(CheckUtils_News.getCurrentDate()));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @DisplayName("экран CREATING NEWS/ клик по кнопке SAVE")
    public void clickButtonSaveCreateNews() {
        new Utils_Helper().timerWaitingAsyncOperation3000();
        onView(allOf(withId(Elements_News.ID_CREATING_SAVE),
                withText(Data_News.SAVE_CREATING_TEXT),
                withContentDescription(Data_News.SAVE_CREATING_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .perform(click());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("экран CREATING NEWS/ клик по кнопке CANCEL")
    public void clickButtonCancelCreateNews() {
        onView(allOf(withId(Elements_News.ID_CREATING_CANCEL),
                withText(Data_News.CANCEL_CREATING_TEXT),
                withContentDescription(Data_News.CANCEL_CREATING_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .perform(click());
    }

    @DisplayName("экран CREATING NEWS/ модальное окно-предупреждение / клик по кнопке CANCEL")
    public void clickCancelButtonModalViewCreateNews() {
        onView(allOf(withId(Elements_News.ID_MODAL_CANCEL),
                withText(Data_News.CANCEL_MODAL),
                withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                isDisplayed()))
                .perform(click());
    }

    @DisplayName("экран CREATING NEWS/ модальное окно-предупреждение / клик по кнопке OK")
    public void clickOkButtonModalViewCreateNews() {
        onView(allOf(withId(Elements_News.ID_MODAL_OK),
                withText(Data_News.OK_MODAL),
                withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                isDisplayed()))
                .perform(click());
    }





    // экран EDITING NEWS
    @DisplayName("экран EDITING NEWS/ клик по кнопке EDIT NEWS")
    public void clickEditeNews() {
        ViewInteraction edite = onView(
                allOf(withId(Elements_News.ID_BUTTON_EDIT), withContentDescription(Data_News.BUTTON_EDIT),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.news_item_material_card_view),
                                        0),
                                15),
                        isDisplayed()));
        edite.perform(click());
    }

    // CATEGORY не изменяем при редактировании
    // набор методов input для редактирования Title
    // попробовать редактирование через добавление "Редактирование", а не через замену полного текста
    @DisplayName("экран EDITING NEWS/ вставить отредактированный TITLE для ADVERTISEMENT")
    public void inputTitleEdited_Advertisement() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_ADVERTISEMENT));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный TITLE для BIRTHDAY")
    public void inputTitleEdited_Birthday() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_BIRTHDAY));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный TITLE для SALARY")
    public void inputTitleEdited_Salary() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_SALARY));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный TITLE для TRADE_UNION")
    public void inputTitleEdited_TradeUnion() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_TRADE_UNION));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный TITLE для HOLIDAY")
    public void inputTitleEdited_Holiday() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_HOLIDAY));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный TITLE для MASSAGE")
    public void inputTitleEdited_Massage() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_MASSAGE));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный TITLE для GRATITUDE")
    public void inputTitleEdited_Gratitude() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_GRATITUDE));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный TITLE для HELP")
    public void inputTitleEdited_Help() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_HELP));
    }


    // набор методов input для редактирования Description
    // попробовать редактирование через добавление "Редактирование", а не через замену полного текста

    @DisplayName("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для ADVERTISEMENT")
    public void inputDescriptionEdited_Advertisement() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_ADVERTISEMENT));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для BIRTHDAY")
    public void inputDescriptionEdited_Birthday() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_BIRTHDAY));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для SALARY")
    public void inputDescriptionEdited_Salary() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_SALARY));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для TRADE_UNION")
    public void inputDescriptionEdited_TradeUnion() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_TRADE_UNION));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для HOLIDAY")
    public void inputDescriptionEdited_Holiday() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_HOLIDAY));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для MASSAGE")
    public void inputDescriptionEdited_Massage() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_MASSAGE));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для GRATITUDE")
    public void inputDescriptionEdited_Gratitude() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_GRATITUDE));
    }

    @DisplayName("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для HELP")
    public void inputDescriptionEdited_Help() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_HELP));
    }


    // методы РЕДАКТИРОВАНИЯ даты и времени
    @DisplayName("экран EDITING NEWS/ вставить EDIT-тестовые данные в DATE")
    public void inputDateEditedNews() {
        onView(allOf(withId(Elements_News.ID_DATE_INPUT)))
                .perform(replaceText(Data_News.DATE_EDITED));
    }

    @DisplayName("экран EDITING NEWS/ вставить EDIT-тестовые данные EDIT в TIME")
    public void inputTimeEditedNews() {
        onView(allOf(withId(Elements_News.ID_TIME_INPUT)))
                .perform(replaceText(Data_News.TIME_EDITED));
    }

    @DisplayName("экран EDITING NEWS / клик по  SWITCH статуса / для ON и OFF")
    public void clickSwitch() {
        ViewInteraction switch_= onView(
                allOf(withId(Elements_News.ID_SWITCH),
                        withText(Data_News.SWITCH_TEXT),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                5)));
        switch_.perform(scrollTo(), click());
    }

    @DisplayName("экран EDITING NEWS / клик по кнопке SAVE")
    public void clickSaveEditing() {
        ViewInteraction save = onView(
                allOf(withId(Elements_News.ID_SAVE_EDITING),
                        withText(Data_News.SAVE_BUTTON),
                        withContentDescription(Data_News.SAVE_BUTTON),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                6)));
        save.perform(scrollTo(), click());
    }

    @DisplayName("экран EDITING NEWS / клик по кнопке CANCEL")
    public void clickCancelEditing() {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_News.ID_CANCEL_EDITING),
                        withText(Data_News.CANCEL_BUTTON),
                        withContentDescription(Data_News.CANCEL_BUTTON),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                7)));
        cancel.perform(scrollTo(), click());
    }

    // модальное окно-предупреждение EDIT
    @DisplayName("экран EDITING NEWS / клик в модальном окне-предупреждении по кнопке CANCEL")
    public void clickCancelModalEditing() {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_News.ID_MODAL_CANCEL),
                        withText(Data_News.CANCEL_BUTTON),
                        childAtPosition(
                                childAtPosition(
                                        withId(com.google.android.material.R.id.buttonPanel),
                                        0),
                                2)));
        cancel.perform(scrollTo(), click());
    }

    @DisplayName("экран EDITING NEWS / клик в модальном окне-предупреждении по кнопке OK")
    public void clickOkModalEditing() {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_News.ID_MODAL_OK),
                        withText(Data_News.OK_MODAL),
                        childAtPosition(
                                childAtPosition(
                                        withId(com.google.android.material.R.id.buttonPanel),
                                        0),
                                1)));
        cancel.perform(scrollTo(), click());
    }
}
