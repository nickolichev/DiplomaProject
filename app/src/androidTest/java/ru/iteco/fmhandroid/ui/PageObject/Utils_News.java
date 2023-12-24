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

import io.qameta.allure.kotlin.Allure;
import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_News;
import ru.iteco.fmhandroid.ui.testData.Data_News;

public class Utils_News {
    ProjectIdlingResources idlingResource = new ProjectIdlingResources();

    public void clickFilter_News() {
        Allure.step("экран NEWS / нераскрытые карточки / клик по кнопке FILTER");
        onView(Matchers.allOf(withId(Elements_News.ID_BUTTON_FILTER_NEWS)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(click());
    }

    public void clickEdit_News() {
        Allure.step("экран NEWS / нераскрытые карточки / клик по кнопке EDIT");
        onView(Matchers.allOf(withId(Elements_News.ID_BUTTON_EDIT_NEWS)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(click());
    }

    public void selectCategoryAdvertisement() {
        Allure.step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Объявление\"");
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_ADVERTISEMENT)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    public void selectCategoryBirthday() {
        Allure.step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"День рождения\"");
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_BIRTHDAY)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    public void selectCategorySalary() {
        Allure.step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Зарплата\"");
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_SALARY)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    public void selectCategoryTradeUnion() {
        Allure.step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Профсоюз\"");
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_TRADE_UNION)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    public void selectCategoryHoliday() {
        Allure.step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Праздник\"");
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_HOLIDAY)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    public void selectCategoryMassage() {
        Allure.step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Массаж\"");
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_MASSAGE)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    public void selectCategoryGratitude() {
        Allure.step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Благодарность\"");
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_GRATITUDE)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    public void selectCategoryHelp() {
        Allure.step("Control Panel / экран FILTER NEWS / ввод в CATEGORY  тестовых данных \"Нужна помощь\"");
        onView(allOf(withId(Elements_News.ID_DROP_DOWN_CATEGORY_CONTROL),
                isDisplayed()))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)),
                is(Data_News.CATEGORY_HELP)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    public void inputDateStart_FilterNews() {
        Allure.step("Control Panel / экран FILTER NEWS / ввод в DATE START тестовых данных");
        onView(allOf(withId(Elements_News.ID_DATE_START)))
                .perform(replaceText(Data_News.DATE_START_TEST_DATA));
    }

    public void inputDateEnd_FilterNews() {
        Allure.step("Control Panel / экран FILTER NEWS / ввод в DATE END тестовых данных");
        onView(allOf(withId(Elements_News.ID_DATE_END)))
                .perform(replaceText(Data_News.DATE_END_TEST_DATA));
    }

    public void inputDateStart_AfterEditing_FilterNews() {
        Allure.step("Control Panel / экран FILTER NEWS / ввод в DATE START тестовых данных ПОСЛЕ Editing");
        onView(allOf(withId(Elements_News.ID_DATE_START)))
                .perform(replaceText(Data_News.DATE_EDITED));
    }

    public void inputDateEnd_AfterEditing_FilterNews() {
        Allure.step("Control Panel / экран FILTER NEWS / ввод в DATE END тестовых данных ПОСЛЕ Editing");
        onView(allOf(withId(Elements_News.ID_DATE_END)))
                .perform(replaceText(Data_News.DATE_EDITED));
    }

    public void clickButtonFilter_FilterNews() {
        Allure.step("Control Panel / экран FILTER NEWS / клик по кнопке FILTER");
        new Utils_Helper().startTimer(idlingResource);
        onView(allOf(withId(Elements_News.ID_BUTTON_FILTER),
                withText(Data_News.BUTTON_FILTER),
                withParent(withParent(withId(R.id.nav_host_fragment))),
                isDisplayed()))
                .perform(click());
        new Utils_Helper().endTimerAndSleep(idlingResource);
    }

    public void clickButtonFilter_ControlPanel() {
        Allure.step("экран Control panel / клик по иконке FILTER");
        onView(allOf(withId(Elements_News.ID_ICON_FILTER_NEWS_CONTROL),
                childAtPosition(
                        childAtPosition(
                                withClassName(is("android.widget.LinearLayout")),
                                1),
                        2),
                isDisplayed()))
                .perform(click());
    }

    public void clickButtonAdd_News() {
        Allure.step("экран Control panel / клик по иконке CREATING NEWS");
        onView(allOf(withId(Elements_News.ID_BUTTON_ADD_NEWS),
                withContentDescription(Data_News.BUTTON_ADD_NEWS),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .perform(click());
    }

    public void clickButtonDelete_News() {
        Allure.step("экран Control panel / в НЕраскрытой карточке клик по иконке DELETE");
        new Utils_Helper().startTimer(idlingResource);
        onView(allOf(withId(R.id.delete_news_item_image_view),
                withContentDescription("News delete button"),
                childAtPosition(
                        childAtPosition(
                                withId(R.id.news_item_material_card_view),
                                0),
                        14),
                isDisplayed()))
                .perform(click());
        new Utils_Helper().endTimerAndSleep(idlingResource);
    }

    public void clickExpendCardNews() {
        Allure.step("экран Control panel / List / в НЕраскрытой карточке клик по кнопке Expend");
        new Utils_Helper().startTimer(idlingResource);
        onView(allOf(withId(Elements_News.ID_LIST_NEWS),
                childAtPosition(
                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                        0)))
                .perform(actionOnItemAtPosition(0, click()));
        new Utils_Helper().endTimerAndSleep(idlingResource);
    }

    public void clickOklModalDelete() {
        Allure.step("экран Control panel / клик в модальном окне-предупреждении DELETE по кнопке OK");
        new Utils_Helper().startTimer(idlingResource);
        ViewInteraction ok = onView(
                allOf(withId(Elements_News.ID_MODAL_OK),
                        withText(Data_News.OK_MODAL),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        new Utils_Helper().endTimerAndSleep(idlingResource);
        new Utils_Helper().startTimer(idlingResource);
        ok.perform(scrollTo(), click());
        new Utils_Helper().endTimerAndSleep(idlingResource);
    }

    public void clickButtonEditNews() {
        Allure.step("экран Control panel / List / в НЕраскрытой карточке клик по иконке EDIT");
        onView(allOf(withId(Elements_News.ID_BUTTON_EDIT),
                withContentDescription(Data_News.BUTTON_EDIT),
                withParent(withParent(withId(R.id.news_item_material_card_view))),
                isDisplayed()))
                .perform(click());
    }

    public void clickActive_ControlPanel_Filter() {
        Allure.step("экран Control panel / FILTER / клик по check-box Active");
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

    public void clickNotActive_ControlPanel_Filter() {
        Allure.step("экран Control panel / FILTER / клик по check-box Not Active");
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

    public void inputCustomCategory() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные \"Новый год\" в поле Category");
        onView(allOf(withId(Elements_News.ID_CREATING_CATEGORY_TEXT),
                isDisplayed()))
                .perform(replaceText(Data_News.CATEGORY_CUSTOM));
    }

    public void inputTitle_Custom() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Новый год\"");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_CUSTOM));
    }

    public void inputTitle_Advertisement() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Объявление\"");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_ADVERTISEMENT));
    }

    public void clearFieldTitle() {
        Allure.step("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  TITLE");
        onView(withId(Elements_News.ID_TITLE_INPUT))
                .perform(clearText());
    }

    public void inputTitle_Birthday() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"День рождения\"");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_BIRTHDAY));
    }

    public void inputTitle_Salary() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Зарплата\"");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_SALARY));
    }

    public void inputTitle_TradeUnion() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Профсоюз\"");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_TRADE_UNION));
    }

    public void inputTitle_Holiday() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Праздник\"");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_HOLIDAY));
    }

    public void inputTitle_Massage() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Массаж\"");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_MASSAGE));
    }

    public void inputTitle_Gratitude() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Благодарность\"");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_GRATITUDE));
    }

    public void inputTitle_Help() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  TITLE по каждой отдельной CATEGORY / \"Нужна помощь\"");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_HELP));
    }

    public void inputInvalidTitle() {
        Allure.step("экран CREATING NEWS/ вставить НЕвалидные тестовые данные в  TITLE");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_CARD_INVALID));
    }

    public void inputDescription_Custom() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Новый год\"");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_CUSTOM));
    }

    public void inputDescription_Advertisement() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Объявление\"");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_ADVERTISEMENT));
    }

    public void inputDescription_Birthday() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"День рождения\"");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_BIRTHDAY));
    }

    public void inputDescription_Salary() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Зарплата\"");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_SALARY));
    }

    public void inputDescription_TradeUnion() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Профсоюз\"");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_TRADE_UNION));
    }

    public void inputDescription_Holiday() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Праздник\"");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_HOLIDAY));
    }

    public void inputDescription_Massage() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Массаж\"");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_MASSAGE));
    }

    public void inputDescription_Gratitude() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в  DESCRIPTION по каждой отдельной CATEGORY / \"Благодарность\"");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_GRATITUDE));
    }

    public void inputDescription_Help() {
        Allure.step("экран CREATING NEWS/ вставить тестовые данные в DESCRIPTION по каждой отдельной CATEGORY / \"Нужна помощь\"");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_HELP));
    }

    public void clearFieldDescription() {
        Allure.step("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  Description");
        onView(withId(Elements_News.ID_DESCRIPTION_INPUT))
                .perform(clearText());
    }

    public void inputInvalidDescription() {
        Allure.step("экран CREATING NEWS/ вставить НЕвалидные тестовые данные в DESCRIPTION");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_INVALID));
    }

    public void inputPublicationDate() {
        Allure.step("экран CREATING NEWS/ вставить валидные тестовые данные в PUBLICATION DATE");
        onView(allOf(withId(Elements_News.ID_CREATING_DATE)))
                .perform(replaceText(Data_News.INPUT_PUBLICATION_DATE_CREATING));
    }

    public void clearFieldPublicationDate() {
        Allure.step("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  Publication date");
        onView(withId(Elements_News.ID_CREATING_DATE))
                .perform(clearText());
    }

    public void inputTime() {
        Allure.step("экран CREATING NEWS/ вставить валидные тестовые данные в TIME");
        onView(allOf(withId(Elements_News.ID_CREATING_TIME)))
                .perform(replaceText(Data_News.INPUT_TIME_CREATING));
    }

    public void clearFieldTime() {
        Allure.step("экран CREATING NEWS/ очистить заполненное поле от тестовых данных в  Time");
        onView(withId(Elements_News.ID_CREATING_TIME))
                .perform(clearText());
    }

    public void clickButtonSaveCreatingNews() {
        Allure.step("экран CREATING NEWS/ клик по кнопке SAVE");
        new Utils_Helper().startTimer(idlingResource);
        onView(allOf(withId(Elements_News.ID_CREATING_SAVE),
                withText(Data_News.SAVE_CREATING_TEXT),
                withContentDescription(Data_News.SAVE_CREATING_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .perform(click());
        new Utils_Helper().endTimerAndSleep(idlingResource);
    }

    public void clickButtonCancelCreateNews() {
        Allure.step("экран CREATING NEWS/ клик по кнопке CANCEL");
        onView(allOf(withId(Elements_News.ID_CREATING_CANCEL),
                withText(Data_News.CANCEL_CREATING_TEXT),
                withContentDescription(Data_News.CANCEL_CREATING_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .perform(click());
    }

    public void clickCancelButtonModalViewCreateNews() {
        Allure.step("экран CREATING NEWS/ модальное окно-предупреждение / клик по кнопке CANCEL");
        onView(allOf(withId(Elements_News.ID_MODAL_CANCEL),
                withText(Data_News.CANCEL_MODAL),
                withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                isDisplayed()))
                .perform(click());
    }

    public void clickOkButtonModalViewCreatingNews() {
        Allure.step("экран CREATING NEWS/ модальное окно-предупреждение / клик по кнопке OK");
        onView(allOf(withId(Elements_News.ID_MODAL_OK),
                withText(Data_News.OK_MODAL),
                withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                isDisplayed()))
                .perform(click());
    }

    public void inputTitleEdited_Advertisement() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный TITLE для ADVERTISEMENT");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_ADVERTISEMENT));
    }

    public void inputTitleEdited_Birthday() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный TITLE для BIRTHDAY");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_BIRTHDAY));
    }

    public void inputTitleEdited_Salary() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный TITLE для SALARY");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_SALARY));
    }

    public void inputTitleEdited_TradeUnion() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный TITLE для TRADE_UNION");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_TRADE_UNION));
    }

    public void inputTitleEdited_Holiday() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный TITLE для HOLIDAY");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_HOLIDAY));
    }

    public void inputTitleEdited_Massage() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный TITLE для MASSAGE");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_MASSAGE));
    }

    public void inputTitleEdited_Gratitude() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный TITLE для GRATITUDE");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_GRATITUDE));
    }

    public void inputTitleEdited_Help() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный TITLE для HELP");
        onView(allOf(withId(Elements_News.ID_TITLE_INPUT)))
                .perform(replaceText(Data_News.TITLE_EDIT_HELP));
    }

    public void inputDescriptionEdited_Advertisement() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для ADVERTISEMENT");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_ADVERTISEMENT));
    }

    public void inputDescriptionEdited_Birthday() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для BIRTHDAY");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_BIRTHDAY));
    }

    public void inputDescriptionEdited_Salary() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для SALARY");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_SALARY));
    }

    public void inputDescriptionEdited_TradeUnion() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для TRADE_UNION");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_TRADE_UNION));
    }

    public void inputDescriptionEdited_Holiday() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для HOLIDAY");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_HOLIDAY));
    }

    public void inputDescriptionEdited_Massage() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для MASSAGE");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_MASSAGE));
    }

    public void inputDescriptionEdited_Gratitude() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для GRATITUDE");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_GRATITUDE));
    }

    public void inputDescriptionEdited_Help() {
        Allure.step("экран EDITING NEWS/ вставить отредактированный DESCRIPTION для HELP");
        onView(allOf(withId(Elements_News.ID_DESCRIPTION_INPUT)))
                .perform(replaceText(Data_News.DESCRIPTION_EDIT_HELP));
    }

    public void inputDateEditedNews() {
        Allure.step("экран EDITING NEWS/ вставить EDIT-тестовые данные в DATE");
        onView(allOf(withId(Elements_News.ID_DATE_INPUT)))
                .perform(replaceText(Data_News.DATE_EDITED));
    }

    public void inputTimeEditedNews() {
        Allure.step("экран EDITING NEWS/ вставить EDIT-тестовые данные EDIT в TIME");
        onView(allOf(withId(Elements_News.ID_TIME_INPUT)))
                .perform(replaceText(Data_News.TIME_EDITED));
    }

    public void clickSwitch() {
        Allure.step("экран EDITING NEWS / клик по  SWITCH статуса / для ON и OFF");
        onView(allOf(withId(Elements_News.ID_SWITCH),
                withText(Data_News.SWITCH_TEXT),
                childAtPosition(
                        childAtPosition(
                                withClassName(is("com.google.android.material.card.MaterialCardView")),
                                0),
                        5)))
                .perform(scrollTo(), click());
    }

    public void clickSaveEditing() {
        Allure.step("экран EDITING NEWS / клик по кнопке SAVE");
        new Utils_Helper().startTimer(idlingResource);
        onView(allOf(withId(Elements_News.ID_SAVE_EDITING),
                withText(Data_News.SAVE_BUTTON),
                withContentDescription(Data_News.SAVE_BUTTON),
                childAtPosition(
                        childAtPosition(
                                withClassName(is("com.google.android.material.card.MaterialCardView")),
                                0),
                        6)))
                .perform(scrollTo(), click());
        new Utils_Helper().endTimerAndSleep(idlingResource);
    }
}
