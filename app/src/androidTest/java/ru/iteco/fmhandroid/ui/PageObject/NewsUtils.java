package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;
import static ru.iteco.fmhandroid.ui.PageObject.UtilsHelper.childAtPosition;

import android.view.View;

import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;

import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.NewsElements;
import ru.iteco.fmhandroid.ui.testData.NewsData;

public class NewsUtils {

    UtilsHelper utilsHelper = new UtilsHelper();
    AuthUtils authUtils = new AuthUtils();
    MenuUtils menuUtils = new MenuUtils();
    CheckUtils checkUtils = new CheckUtils();
    ClaimUtils claimUtils = new ClaimUtils();
    ProjectIdlingResources projectIdlingResources = new ProjectIdlingResources();


    // экран NEWS
    // кнопка сортировки
    public void clickSort() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(NewsElements.ID_BUTTON_SORT_NEWS),
                        withContentDescription(NewsData.BUTTON_SORT_NEWS)));

        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }

    // кнопка фильтра
    public void clickFilter() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(NewsElements.ID_BUTTON_FILTER_NEWS)));

        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }

    // кнопка редактирования "Карандаш"
    public void clickEdit() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(NewsElements.ID_BUTTON_EDIT_NEWS)));

        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }

    // кнопка Expend в нераскрытой карточке
    public void clickExpendCloseCard() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(NewsElements.ID_EXPEND_CARD_NEWS),
                        withContentDescription(NewsData.EXPEND_CARD_NEWS)));

        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }

    // экран FILTER NEWS

    // набор методов ввода тестовых данных CATEGORY
    public void inputCategoryEmpty() {
        onView(allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL)))
                .perform(ViewActions.replaceText(NewsData.CATEGORY_EMPTY))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputCategoryCustom() {
        onView(allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL)))
                .perform(ViewActions.replaceText(NewsData.CATEGORY_CUSTOM))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputCategoryAdvertisement() {
        onView(allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL)))
                .perform(ViewActions.replaceText(NewsData.CATEGORY_ADVERTISEMENT))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputCategoryBirthday() {
        onView(allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL)))
                .perform(ViewActions.replaceText(NewsData.CATEGORY_BIRTHDAY))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputCategorySalary() {
        onView(allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL)))
                .perform(ViewActions.replaceText(NewsData.CATEGORY_SALARY))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputCategoryTradeUnion() {
        onView(allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL)))
                .perform(ViewActions.replaceText(NewsData.CATEGORY_TRADE_UNION))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputCategoryHoliday() {
        onView(allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL)))
                .perform(ViewActions.replaceText(NewsData.CATEGORY_HOLIDAY))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputCategoryMassage() {
        onView(allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL)))
                .perform(ViewActions.replaceText(NewsData.CATEGORY_MASSAGE))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputCategoryGratitude() {
        onView(allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL)))
                .perform(ViewActions.replaceText(NewsData.CATEGORY_GRATITUDE))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputCategoryHelp() {
        onView(allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL)))
                .perform(ViewActions.replaceText(NewsData.CATEGORY_HELP))
                .perform(ViewActions.closeSoftKeyboard());
    }

    // набор методов ввода тестовых данных DATE_START и DATE_END для фильтрации NEWS

    public void inputDateStart() {
        onView(allOf(withId(NewsElements.ID_DATE_START)))
                .perform(ViewActions.replaceText(NewsData.DATE_START_TEST_DATA));
    }

    public void inputDateEnd() {
        onView(allOf(withId(NewsElements.ID_DATE_END)))
                .perform(ViewActions.replaceText(NewsData.DATE_END_TEST_DATA));
    }

    // OK
    public void clickButtonFilter_Filter() {
        ViewInteraction button = onView(
                allOf(withId(NewsElements.ID_BUTTON_FILTER), withText(NewsData.BUTTON_FILTER),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
        button.perform(click());
    }

    public void clickButtonCancel_Filter() {
        ViewInteraction button = onView(
                allOf(withId(NewsElements.ID_BUTTON_CANCEL), withText(NewsData.BUTTON_CANCEL),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
        button.perform(click());
    }



    // экран Control panel

    public void clickButtonSort() {
        ViewInteraction sort = onView(
                allOf(withId(NewsElements.ID_BUTTON_SORT), withContentDescription(NewsData.BUTTON_SORT),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.container_list_news_include),
                                        0),
                                1),
                        isDisplayed()));
        sort.perform(click());
    }

    // переход на экран CREATING NEWS
    public void clickButtonAddNews() {
        ViewInteraction add = onView(
                allOf(withId(NewsElements.ID_BUTTON_ADD_NEWS), withContentDescription(NewsData.BUTTON_ADD_NEWS),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        add.perform(click());
    }

    public void clickButtonDeleteNews() {
        ViewInteraction delete = onView(
                allOf(withId(NewsElements.ID_BUTTON_DELETE), withContentDescription(NewsData.BUTTON_DELETE),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.news_item_material_card_view),
                                        0),
                                14),
                        isDisplayed()));
        delete.perform(click());
    }

    public void clickButtonEditNews() {
        ViewInteraction edit = onView(
                allOf(withId(NewsElements.ID_BUTTON_EDIT), withContentDescription(NewsData.BUTTON_EDIT),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        edit.perform(click());
    }

    // резервный метод для раскрытия карточки
    public void clickButtonExpendNews() {
        ViewInteraction expend = onView(
                allOf(withId(NewsElements.ID_BUTTON_EXPEND), withContentDescription(NewsData.BUTTON_EXPEND),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        expend.perform(click());
    }

    // используем как основной (метод для клика по первой карточке в списке)
    public void clickExpendNews() {
        ViewInteraction expend = onView(
                allOf(withId(R.id.news_list_recycler_view),
                        childAtPosition(
                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                0)));
        expend.perform(actionOnItemAtPosition(0, click()));
    }


    // экран CREATING NEWS

    // выбор CATEGORY из выпадающего списка / atPosition(0) = первый в списке
    // не факт, что метод будет работать
    // в этом случае заменить на input
    public void choiceCategoryAdvertisement() {
        DataInteraction category = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(0);
        category.perform(click());
    }

    // если метод работает, спроецировать на остальные категории





    // набор методов input для создания Title
    // проверить ID_TITLE_INPUT так как взят с экрана EDITING
    public void inputTitleCreatedAdvertisement() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_CARD_ADVERTISEMENT));
    }

    public void inputTitleCreatedBirthday() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_CARD_BIRTHDAY));
    }

    public void inputTitleCreatedSalary() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_CARD_SALARY));
    }

    public void inputTitleCreatedTradeUnion() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_CARD_TRADE_UNION));
    }

    public void inputTitleCreatedHoliday() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_CARD_HOLIDAY));
    }

    public void inputTitleCreatedMassage() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_CARD_MASSAGE));
    }

    public void inputTitleCreatedGratitude() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_CARD_GRATITUDE));
    }

    public void inputTitleCreatedHelp() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_CARD_HELP));
    }


    // набор методов input для создания НЕВАЛИДНЫХ Title
    public void inputInvalidTitleCreated() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_CARD_INVALID));
    }

    public void inputEmptyTitleCreated() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_CARD_EMPTY));
    }




    // набор методов input для создания Description для всех категорий
    // проверить ID_DESCRIPTION_INPUT так как взят с экрана EDITING
    public void inputDescriptionCreatedAdvertisement() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_ADVERTISEMENT));
    }

    public void inputDescriptionCreatedBirthday() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_BIRTHDAY));
    }

    public void inputDescriptionCreatedSalary() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_SALARY));
    }

    public void inputDescriptionCreatedTradeUnion() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_TRADE_UNION));
    }

    public void inputDescriptionCreatedHoliday() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_HOLIDAY));
    }

    public void inputDescriptionCreatedMassage() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_MASSAGE));
    }

    public void inputDescriptionCreatedGratitude() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_GRATITUDE));
    }

    public void inputDescriptionCreatedHelp() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_HELP));
    }


    // набор методов input для создания НЕВАЛИДНЫХ Description
    // проверить ID_DESCRIPTION_INPUT так как взят с экрана EDITING
    public void inputInvalidDescription() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_INVALID));
    }

    public void inputEmptyDescription() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_EMPTY));
    }



    // методы создания ВАЛИДНЫХ даты и времени
    public void inputDateCreatedNews() {
        onView(allOf(withId(NewsElements.ID_DATE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DATE_CREATED));
    }

    public void inputTimeCreatedNews() {
        onView(allOf(withId(NewsElements.ID_TIME_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TIME_CREATED));
    }



    // методы создания НЕВАЛИДНЫХ даты и времени
    public void inputInvalidDateCreatedNews() {
        onView(allOf(withId(NewsElements.ID_DATE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DATE_INVALID));
    }

    public void inputInvalidTimeCreatedNews() {
        onView(allOf(withId(NewsElements.ID_TIME_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TIME_INVALID));
    }

    public void inputEmptyDateCreatedNews() {
        onView(allOf(withId(NewsElements.ID_DATE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DATE_EMPTY));
    }

    public void inputEmptyTimeCreatedNews() {
        onView(allOf(withId(NewsElements.ID_TIME_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TIME_EMPTY));
    }




    // экран EDITING NEWS

    public void clickEditeNews() {
        ViewInteraction edite = onView(
                allOf(withId(NewsElements.ID_BUTTON_EDIT), withContentDescription(NewsData.BUTTON_EDIT),
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
    public void inputTitleEditedAdvertisement() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_EDIT_ADVERTISEMENT));
    }

    public void inputTitleEditedBirthday() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_EDIT_BIRTHDAY));
    }

    public void inputTitleEditedSalary() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_EDIT_SALARY));
    }

    public void inputTitleEditedTradeUnion() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_EDIT_TRADE_UNION));
    }

    public void inputTitleEditedHoliday() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_EDIT_HOLIDAY));
    }

    public void inputTitleEditedMassage() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_EDIT_MASSAGE));
    }

    public void inputTitleEditedGratitude() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_EDIT_GRATITUDE));
    }

    public void inputTitleEditedHelp() {
        onView(allOf(withId(NewsElements.ID_TITLE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TITLE_EDIT_HELP));
    }



    // набор методов input для редактирования Description
    // попробовать редактирование через добавление "Редактирование", а не через замену полного текста

    public void inputDescriptionEditedAdvertisement() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_EDIT_ADVERTISEMENT));
    }

    public void inputDescriptionEditedBirthday() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_EDIT_BIRTHDAY));
    }

    public void inputDescriptionEditedSalary() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_EDIT_SALARY));
    }

    public void inputDescriptionEditedTradeUnion() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_EDIT_TRADE_UNION));
    }

    public void inputDescriptionEditedHoliday() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_EDIT_HOLIDAY));
    }

    public void inputDescriptionEditedMassage() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_EDIT_MASSAGE));
    }

    public void inputDescriptionEditedGratitude() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_EDIT_GRATITUDE));
    }

    public void inputDescriptionEditedHelp() {
        onView(allOf(withId(NewsElements.ID_DESCRIPTION_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DESCRIPTION_EDIT_HELP));
    }


    // методы РЕДАКТИРОВАНИЯ даты и времени
    public void inputDateEditedNews() {
        onView(allOf(withId(NewsElements.ID_DATE_INPUT)))
                .perform(ViewActions.replaceText(NewsData.DATE_EDITED));
    }

    public void inputTimeEditedNews() {
        onView(allOf(withId(NewsElements.ID_TIME_INPUT)))
                .perform(ViewActions.replaceText(NewsData.TIME_EDITED));
    }


    // для ON и OFF
    public void clickSwitch() {
        ViewInteraction switch_= onView(
                allOf(withId(NewsElements.ID_SWITCH),
                        withText(NewsData.SWITCH_TEXT),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                5)));
        switch_.perform(scrollTo(), click());
    }

    public void clickSaveEditing() {
        ViewInteraction save = onView(
                allOf(withId(NewsElements.ID_SAVE_EDITING),
                        withText(NewsData.SAVE_BUTTON),
                        withContentDescription(NewsData.SAVE_BUTTON),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                6)));
        save.perform(scrollTo(), click());
    }

    public void clickCancelEditing() {
        ViewInteraction cancel = onView(
                allOf(withId(NewsElements.ID_CANCEL_EDITING),
                        withText(NewsData.CANCEL_BUTTON),
                        withContentDescription(NewsData.CANCEL_BUTTON),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                7)));
        cancel.perform(scrollTo(), click());
    }



    // модальное окно предупреждение EDIT

    public void clickCancelModalEditing() {
        ViewInteraction cancel = onView(
                allOf(withId(NewsElements.ID_MODAL_CANCEL),
                        withText(NewsData.CANCEL_BUTTON),
                        childAtPosition(
                                childAtPosition(
                                        withId(com.google.android.material.R.id.buttonPanel),
                                        0),
                                2)));
        cancel.perform(scrollTo(), click());
    }

    public void clickOkModalEditing() {
        ViewInteraction cancel = onView(
                allOf(withId(NewsElements.ID_MODAL_OK),
                        withText(NewsData.OK_MODAL),
                        childAtPosition(
                                childAtPosition(
                                        withId(com.google.android.material.R.id.buttonPanel),
                                        0),
                                1)));
        cancel.perform(scrollTo(), click());
    }



    // модальное окно предупреждение DELETE

    public void clickCancelModalDelete() {
        ViewInteraction cancel = onView(
                allOf(withId(NewsElements.ID_MODAL_CANCEL), withText(NewsData.CANCEL_BUTTON),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        cancel.perform(scrollTo(), click());
    }

    public void clickOklModalDelete() {
        ViewInteraction ok = onView(
                allOf(withId(NewsElements.ID_MODAL_OK), withText(NewsData.OK_MODAL),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                1)));
        ok.perform(scrollTo(), click());
    }

}
