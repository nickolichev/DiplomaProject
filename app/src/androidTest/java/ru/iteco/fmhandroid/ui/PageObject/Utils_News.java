package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.RootMatchers.isPlatformPopup;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.instanceOf;
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

import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_News;
import ru.iteco.fmhandroid.ui.testData.Data_News;

public class Utils_News {

    @Step("экран NEWS / нераскрытые карточки / клик по кнопке FILTER")
    public void clickFilter_News() {
        onView(Matchers.allOf(withId(Elements_News.ID_BUTTON_FILTER_NEWS)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(click());
    }

    @Step("экран NEWS / нераскрытые карточки / клик по кнопке EDIT")
    public void clickEdit_News() {
        onView(Matchers.allOf(withId(Elements_News.ID_BUTTON_EDIT_NEWS)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(click());
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Объявление\"")
    public void selectCategoryAdvertisement() {
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_ADVERTISEMENT)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"День рождения\"")
    public void selectCategoryBirthday() {
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_BIRTHDAY)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Зарплата\"")
    public void selectCategorySalary() {
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_SALARY)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Профсоюз\"")
    public void selectCategoryTradeUnion() {
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_TRADE_UNION)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Праздник\"")
    public void selectCategoryHoliday() {
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_HOLIDAY)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Массаж\"")
    public void selectCategoryMassage() {
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_MASSAGE)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Благодарность\"")
    public void selectCategoryGratitude() {
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_GRATITUDE)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Нужна помощь\"")
    public void selectCategoryHelp() {
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_HELP)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в DATE START тестовых данных")
    public void inputDateStart_FilterNews() {
        onView(allOf(withId(Elements_News.ID_DATE_START)))
                .perform(replaceText(Data_News.DATE_START_TEST_DATA));
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в DATE END тестовых данных")
    public void inputDateEnd_FilterNews() {
        onView(allOf(withId(Elements_News.ID_DATE_END)))
                .perform(replaceText(Data_News.DATE_END_TEST_DATA));
    }

    @Step("тест-кейс #26 / NEWS / экран FILTER NEWS / ввод в DATE END тестовых данных")
    public void inputDateEnd() {
        onView(allOf(withId(Elements_News.ID_DATE_END)))
                .perform(replaceText(CheckUtils_News.getCurrentDate()));
    }

    @Step("тест-кейс #26 / NEWS / экран FILTER NEWS / ввод в DATE START тестовых данных")
    public void inputDateStart() {
        onView(allOf(withId(Elements_News.ID_DATE_START)))
                .perform(replaceText(CheckUtils_News.getCurrentDate()));
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в DATE START тестовых данных ПОСЛЕ Editing")
    public void inputDateStart_AfterEditing_FilterNews() {
        onView(allOf(withId(Elements_News.ID_DATE_START)))
                .perform(replaceText(Data_News.DATE_EDITED));
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в DATE END тестовых данных ПОСЛЕ Editing")
    public void inputDateEnd_AfterEditing_FilterNews() {
        onView(allOf(withId(Elements_News.ID_DATE_END)))
                .perform(replaceText(Data_News.DATE_EDITED));
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в DATE START НЕвалидных тестовых данных")
    public void inputInvalidDateStart_FilterNews() {
        onView(allOf(withId(Elements_News.ID_DATE_START)))
                .perform(replaceText(Data_News.DATE_INVALID));
    }

    @Step("Control Panel / экран FILTER NEWS / ввод в DATE END НЕвалидных тестовых данных")
    public void inputInvalidDateEnd_FilterNews() {
        onView(allOf(withId(Elements_News.ID_DATE_END)))
                .perform(replaceText(Data_News.DATE_INVALID));
    }

    @Step("Control Panel / экран FILTER NEWS / клик по кнопке FILTER")
    public void clickButtonFilter_FilterNews() {
        onView(allOf(withId(Elements_News.ID_BUTTON_FILTER),
                withText(Data_News.BUTTON_FILTER),
                withParent(withParent(withId(R.id.nav_host_fragment))),
                isDisplayed()))
                .perform(click());
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран Control panel / клик по иконке FILTER")
    public void clickButtonFilter_ControlPanel() {
        onView(allOf(withId(Elements_News.ID_ICON_FILTER_NEWS_CONTROL),
                childAtPosition(
                        childAtPosition(
                                withClassName(is("android.widget.LinearLayout")),
                                1),
                        2),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран Control panel / клик по иконке CREATING NEWS")
    public void clickButtonAdd_News() {
        onView(allOf(withId(Elements_News.ID_BUTTON_ADD_NEWS),
                withContentDescription(Data_News.BUTTON_ADD_NEWS),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран Control panel / в НЕраскрытой карточке клик по иконке DELETE")
    public void clickButtonDelete_News() {
        onView(allOf(withId(R.id.delete_news_item_image_view),
                withContentDescription("News delete button"),
                childAtPosition(
                        childAtPosition(
                                withId(R.id.news_item_material_card_view),
                                0),
                        14),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран Control panel / List / в НЕраскрытой карточке клик по кнопке Expend")
    public void clickExpendCardNews() {
        onView(allOf(withId(Elements_News.ID_LIST_NEWS),
                childAtPosition(
                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                        0)))
                .perform(actionOnItemAtPosition(0, click()));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран Control panel / клик в модальном окне-предупреждении DELETE по кнопке OK")
    public void clickOklModalDelete() {
        ViewInteraction ok = onView(
                allOf(withId(Elements_News.ID_MODAL_OK),
                        withText(Data_News.OK_MODAL),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        new Utils_Helper().timerWaitingAsyncOperation1000();
        ok.perform(scrollTo(), click());
    }

    @Step("экран Control panel / List / в НЕраскрытой карточке клик по иконке EDIT")
    public void clickButtonEditNews() {
        onView(allOf(withId(Elements_News.ID_BUTTON_EDIT),
                withContentDescription(Data_News.BUTTON_EDIT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран Control panel / FILTER / клик по check-box Active")
    public void clickActive_ControlPanel_Filter() {
        onView(allOf(withId(Elements_News.ID_ACTIVE_CONTROL),
                withText(Data_News.STATUS_ACTIVE_CONTROL_FILTER),
                childAtPosition(
                        childAtPosition(
                                withId(R.id.nav_host_fragment),
                                0),
                        4),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран Control panel / FILTER / клик по check-box Not Active")
    public void clickNotActive_ControlPanel_Filter() {
        onView(allOf(withId(Elements_News.ID_NOT_ACTIVE_CONTROL),
                withText(Data_News.STATUS_NOT_ACTIVE_CONTROL_FILTER),
                childAtPosition(
                        childAtPosition(
                                withId(R.id.nav_host_fragment),
                                0),
                        5),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные \"Новый год\" в поле Category")
    public void inputCustomCategory() {
        onView(allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                isDisplayed()))
                .perform(replaceText(Data_News.CATEGORY_CUSTOM));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Новый год\"")
    public void inputTitle_Custom() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_CUSTOM));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Объявление\"")
    public void inputTitle_Advertisement() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_ADVERTISEMENT));
    }

    @Step("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  TITLE ")
    public void clearFieldTitle() {
        onView(withId(Elements_News.ID_TITLE_INPUT))
                .perform(clearText());
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"День рождения\"")
    public void inputTitle_Birthday() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_BIRTHDAY));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Зарплата\"")
    public void inputTitle_Salary() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_SALARY));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Профсоюз\"")
    public void inputTitle_TradeUnion() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_TRADE_UNION));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Праздник\"")
    public void inputTitle_Holiday() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_HOLIDAY));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Массаж\"")
    public void inputTitle_Massage() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_MASSAGE));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Благодарность\"")
    public void inputTitle_Gratitude() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_GRATITUDE));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Нужна помощь\"")
    public void inputTitle_Help() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_HELP));
    }

    @Step("экран CREATING NEWS/ вставить НЕвалидные тестовые данные в  TITLE")
    public void inputInvalidTitle() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_INVALID));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Новый год\"")
    public void inputDescription_Custom() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_CUSTOM));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Объявление\"")
    public void inputDescription_Advertisement() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_ADVERTISEMENT));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"День рождения\"")
    public void inputDescription_Birthday() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_BIRTHDAY));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Зарплата\"")
    public void inputDescription_Salary() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_SALARY));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Профсоюз\"")
    public void inputDescription_TradeUnion() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_TRADE_UNION));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Праздник\"")
    public void inputDescription_Holiday() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_HOLIDAY));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Массаж\"")
    public void inputDescription_Massage() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_MASSAGE));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Благодарность\"")
    public void inputDescription_Gratitude() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_GRATITUDE));
    }

    @Step("экран CREATING NEWS/ вставить тестовые данные в DESCRIPTION по каждой отдельной CATEGORY / \"Нужна помощь\"")
    public void inputDescription_Help() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_HELP));
    }

    @Step("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  Description ")
    public void clearFieldDescription() {
        onView(withId(Elements_News.ID_DESCRIPTION_INPUT))
                .perform(clearText());
    }

    @Step("экран CREATING NEWS/ вставить НЕвалидные тестовые данные в DESCRIPTION")
    public void inputInvalidDescription() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_INVALID));
    }

    @Step("экран CREATING NEWS/ вставить валидные тестовые данные в PUBLICATION DATE")
    public void inputPublicationDate() {
        onView(allOf(withId(Elements_News.ID_CREATING_DATE)))
                .perform(replaceText(Data_News.INPUT_PUBLICATION_DATE_CREATING));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  Publication date")
    public void clearFieldPublicationDate() {
        onView(withId(Elements_News.ID_CREATING_DATE))
                .perform(clearText());
    }

    @Step("экран CREATING NEWS/ вставить валидные тестовые данные в TIME")
    public void inputTime() {
        onView(allOf(withId(Elements_News.ID_CREATING_TIME)))
                .perform(replaceText(Data_News.INPUT_TIME_CREATING));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  Time")
    public void clearFieldTime() {
        onView(withId(Elements_News.ID_CREATING_TIME))
                .perform(clearText());
    }

    @Step("экран CREATING NEWS/ вставить НЕвалидные тестовые данные в PUBLICATION DATE")
    public void inputInvalidPublicationDate() {
        onView(allOf(withId(Elements_News.ID_CREATING_DATE)))
                .perform(clearText());
        onView(allOf(withId(Elements_News.ID_CREATING_DATE)))
                .perform(replaceText(Data_News.INPUT_INVALID_PUBLICATION_DATE_CREATING));
    }

    @Step("тест-кейс #26 / экран CREATING NEWS/ вставить валидные тестовые данные в PUBLICATION DATE / текущая дата")
    public void inputCurrentDate() {
        onView(allOf(withId(Elements_News.ID_CREATING_DATE)))
                .perform(replaceText(CheckUtils_News.getCurrentDate()));
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран CREATING NEWS/ клик по кнопке SAVE")
    public void clickButtonSaveCreateNews() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        onView(allOf(withId(Elements_News.ID_CREATING_SAVE),
                withText(Data_News.SAVE_CREATING_TEXT),
                withContentDescription(Data_News.SAVE_CREATING_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .perform(click());
        new Utils_Helper().timerWaitingAsyncOperation500();
    }

    @Step("экран CREATING NEWS/ клик по кнопке CANCEL")
    public void clickButtonCancelCreateNews() {
        onView(allOf(withId(Elements_News.ID_CREATING_CANCEL),
                withText(Data_News.CANCEL_CREATING_TEXT),
                withContentDescription(Data_News.CANCEL_CREATING_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран CREATING NEWS/ модальное окно-предупреждение / клик по кнопке CANCEL")
    public void clickCancelButtonModalViewCreateNews() {
        onView(allOf(withId(Elements_News.ID_MODAL_CANCEL),
                withText(Data_News.CANCEL_MODAL),
                withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран CREATING NEWS/ модальное окно-предупреждение / клик по кнопке OK")
    public void clickOkButtonModalViewCreateNews() {
        onView(allOf(withId(Elements_News.ID_MODAL_OK),
                withText(Data_News.OK_MODAL),
                withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран EDITING NEWS/ вставить отредактированный TITLE для ADVERTISEMENT")
    public void inputTitleEdited_Advertisement() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_ADVERTISEMENT));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный TITLE для BIRTHDAY")
    public void inputTitleEdited_Birthday() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_BIRTHDAY));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный TITLE для SALARY")
    public void inputTitleEdited_Salary() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_SALARY));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный TITLE для TRADE_UNION")
    public void inputTitleEdited_TradeUnion() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_TRADE_UNION));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный TITLE для HOLIDAY")
    public void inputTitleEdited_Holiday() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_HOLIDAY));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный TITLE для MASSAGE")
    public void inputTitleEdited_Massage() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_MASSAGE));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный TITLE для GRATITUDE")
    public void inputTitleEdited_Gratitude() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_GRATITUDE));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный TITLE для HELP")
    public void inputTitleEdited_Help() {
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_HELP));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для ADVERTISEMENT")
    public void inputDescriptionEdited_Advertisement() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_ADVERTISEMENT));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для BIRTHDAY")
    public void inputDescriptionEdited_Birthday() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_BIRTHDAY));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для SALARY")
    public void inputDescriptionEdited_Salary() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_SALARY));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для TRADE_UNION")
    public void inputDescriptionEdited_TradeUnion() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_TRADE_UNION));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для HOLIDAY")
    public void inputDescriptionEdited_Holiday() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_HOLIDAY));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для MASSAGE")
    public void inputDescriptionEdited_Massage() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_MASSAGE));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для GRATITUDE")
    public void inputDescriptionEdited_Gratitude() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_GRATITUDE));
    }

    @Step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для HELP")
    public void inputDescriptionEdited_Help() {
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_HELP));
    }

    @Step("экран EDITING NEWS/ вставить EDIT-тестовые данные в DATE")
    public void inputDateEditedNews() {
        onView(allOf(withId(Elements_News.ID_DATE_INPUT)))
                .perform(replaceText(Data_News.DATE_EDITED));
    }

    @Step("экран EDITING NEWS/ вставить EDIT-тестовые данные EDIT в TIME")
    public void inputTimeEditedNews() {
        onView(allOf(withId(Elements_News.ID_TIME_INPUT)))
                .perform(replaceText(Data_News.TIME_EDITED));
    }

    @Step("экран EDITING NEWS / клик по  SWITCH статуса / для ON и OFF")
    public void clickSwitch() {
        onView(allOf(withId(Elements_News.ID_SWITCH),
                withText(Data_News.SWITCH_TEXT),
                childAtPosition(
                        childAtPosition(
                                withClassName(is("com.google.android.material.card.MaterialCardView")),
                                0),
                        5)))
                .perform(scrollTo(), click());
    }

    @Step("экран EDITING NEWS / клик по кнопке SAVE")
    public void clickSaveEditing() {
        onView(allOf(withId(Elements_News.ID_SAVE_EDITING),
                withText(Data_News.SAVE_BUTTON),
                withContentDescription(Data_News.SAVE_BUTTON),
                childAtPosition(
                        childAtPosition(
                                withClassName(is("com.google.android.material.card.MaterialCardView")),
                                0),
                        6)))
                .perform(scrollTo(), click());
    }
}
