package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;
import static ru.iteco.fmhandroid.ui.PageObject.Utils_Helper.childAtPosition;

import android.view.View;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;

import java.util.NoSuchElementException;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Claim;
import ru.iteco.fmhandroid.ui.testData.Data_Claim;

// Define an IdlingResource

public class Utils_Claims {

    @DisplayName("экран CLAIMS / клик по иконке FILTER / открытие модального окна FILTERING /")
    public void clickIconFilter_View_Claims() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_Claim.ID_FILTERS_BUTTON),
                        withContentDescription(Data_Claim.FILTER_DESCRIPTION)));

        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }
    @DisplayName("экран CLAIMS / модальное окно FILTERING / клик по check-box Open/")
    public void clickCheckBox_Open() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_Claim.ID_OPEN_CHECK_BOX),
                        withText(Data_Claim.OPEN_STATUS_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }
    @DisplayName("экран CLAIMS / модальное окно FILTERING / клик по check-box InProgress/")
    public void clickCheckBox_InProgress() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_Claim.ID_IN_PROGRESS_CHECK_BOX),
                        withText(Data_Claim.IN_PROGRESS_STATUS_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }
    @DisplayName("экран CLAIMS / модальное окно FILTERING / клик по check-box Executed/")
    public void clickCheckBox_Executed() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_Claim.ID_EXECUTED_CHECK_BOX),
                        withText(Data_Claim.EXECUTED_STATUS_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }
    @DisplayName("экран CLAIMS / модальное окно FILTERING / клик по check-box Cancelled/")
    public void clickCheckBox_Cancelled() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_Claim.ID_CANCELLED_CHECK_BOX),
                        withText(Data_Claim.CANCELLED_STATUS_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }
    @DisplayName("экран CLAIMS / модальное окно FILTERING / клик по кнопке OK/")
    public void clickButton_Ok() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_Claim.ID_OK_BUTTON),
                        withText(Data_Claim.OK_BUTTON_TEXT)));

        button.perform(scrollTo(), click());
    }

    @DisplayName("экран CLAIMS / модальное окно FILTERING / клик по кнопке Cancel/")
    public void clickButton_Cancel() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_Claim.ID_CANCEL_BUTTON),
                        withText(Data_Claim.CANCEL_BUTTON_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }
    @DisplayName("экран CLAIMS / 1-я нераскрытая карточка CLAIM в списке/ клик по кнопке Expend/")
    public void clickExpendClaim() {
        new Utils_Helper().timerWaitingAsyncOperation3000();
        onView(allOf(isDisplayed(), withId(Elements_Claim.ID_LIST_CARDS)))
                .perform(actionOnItemAtPosition(0, click()));

    }
    @DisplayName("экран CLAIMS / раскрытая карточка CLAIM / клик по кнопке Close/")
    public void clickCloseClaim() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_Claim.ID_BUTTON_CLOSE),
                        withContentDescription(Data_Claim.BUTTON_CLOSE)));
        button.perform(scrollTo(), click());
    }

    public void clickLastVisibleItem() {
        onData(anything())
                .inAdapterView(withId(Elements_Claim.ID_LIST_CARDS)) // Замените R.id.yourListViewId на реальный идентификатор вашего ListView
                .atPosition(-1) // -1 указывает на последний элемент в списке
                .perform(click());
    }

    // Creating Claim
    @DisplayName("экран Claims / клик по кнопке ADD New Claim")
    public void clickCreateClaim() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_Claim.ID_ADD_NEW_CLAIM),
                        withContentDescription(Data_Claim.ADD_NEW_CLAIM_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }

    // набор методов для заполнения валидными TITLE для каждого отдельного test-case
    // ПОСЛЕ отработки теста, в методе inputTestDataInTitleNewClaim_1() заменить FAKE_TITLE на valid DATA TITLE_1
    @DisplayName("test-case #7 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTitleNewClaim_7() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.FAKE_TITLE));
    }
    @DisplayName("test-case #8 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTitleNewClaim_8() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_8));
    }
    @DisplayName("test-case #9 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTitleNewClaim_9() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_9));
    }

    @DisplayName("test-case #10 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTitleNewClaim_10() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_10));
    }

    @DisplayName("test-case #11 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTitleNewClaim_11() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_11));
    }

    @DisplayName("test-case #12 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTestDataInTitleNewClaim_12() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_12));
    }

    @DisplayName("test-case #13 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTestDataInTitleNewClaim_13() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_13));
    }
    @DisplayName("test-case #15 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTestDataInTitleNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_7));
    }
//    @DisplayName("экран CREATING CLAIM / заполнение НЕвалидными тестовыми данными EMPTY поля TITLE")
//    public void inputEmptyInTitleNewClaim() {
//        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
//                .perform(ViewActions.replaceText(""));
//    }

    @DisplayName("экран CREATING CLAIM / заполнение валидными тестовыми данными поля EXECUTOR")
    public void inputExecutorNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_EXECUTOR)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_EXECUTOR_TEXT));
    }

    @DisplayName("экран CREATING CLAIM / заполнение НЕвалидными тестовыми данными поля EXECUTOR")
    public void inputCustomIExecutorNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_EXECUTOR)))
                .perform(ViewActions.replaceText(Data_Claim.INV_INPUT_EXECUTOR));
    }
//    @DisplayName("экран CREATING CLAIM / заполнение НЕвалидными тестовыми данными EMPTY поля EXECUTOR")
//    public void inputEmptyInExecutorNewClaim() {
//        onView(allOf(withId(Elements_Claim.ID_FIELD_EXECUTOR)))
//                .perform(ViewActions.replaceText(""));
//    }

    // методы полей Date и Time
    @DisplayName("экран CREATING CLAIM / заполнение валидными тестовыми данными поля Date")
    public void inputValidDate() {
        ViewInteraction date = onView(
                allOf(withId(Elements_Claim.ID_FIELD_DATE)));
        date.check(matches(isDisplayed()));
        date.perform(replaceText(Data_Claim.INPUT_DATE));
    }

    // для Negative test
    @DisplayName("экран CREATING CLAIM / заполнение НЕвалидными тестовыми данными поля Date")
    public void inputInvalidTestDataDate() {
        ViewInteraction date = onView(
                allOf(withId(Elements_Claim.ID_FIELD_DATE)));
        date.check(matches(isDisplayed()));
        date.perform(replaceText(Data_Claim.INV_INPUT_DATE));
    }

    // для Negative test
//    public void inputEmptyTestDataDate() {
//        ViewInteraction date = onView(
//                allOf(withId(Elements_Claim.ID_FIELD_DATE)));
//        date.perform(replaceText(""));
//        date.check(matches(isDisplayed()));
//    }

    @DisplayName("экран CREATING CLAIM / заполнение валидными тестовыми данными поля Time")
    public void inputValidTime() {
        ViewInteraction time = onView(
                allOf(withId(Elements_Claim.ID_FIELD_TIME)));
        time.check(matches(isDisplayed()));
        time.perform(replaceText(Data_Claim.INPUT_TIME));
    }

    @DisplayName("экран CREATING CLAIM / заполнение НЕвалидными тестовыми данными поля Time")
    public void inputInvalidTestDataTime() {
        ViewInteraction time = onView(
                allOf(withId(Elements_Claim.ID_FIELD_TIME)));
        time.check(matches(isDisplayed()));
        time.perform(replaceText(Data_Claim.INV_INPUT_TIME));
    }

    // для Negative test
//    public void inputEmptyTestDataTime() {
//        ViewInteraction time = onView(
//                allOf(withId(Elements_Claim.ID_FIELD_TIME)));
//        time.perform(replaceText(""));
//        time.check(matches(isDisplayed()));
//    }

    // для Negative test
    @DisplayName("экран CREATING CLAIM / клик по кнопке OK в модальном окне WARNING")
    public void clickButtonOkInModalViewWarning() {
        ViewInteraction button = onView(
                allOf(withId(Elements_Claim.ID_OK_MODAL_VIEWS), withText(Data_Claim.OK_BUTTON_TEXT),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        button.perform(scrollTo(), click());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("экран CREATING CLAIM / клик по кнопке OK в модальном окне QUESTION")
    public void clickButtonOkInModalViewQuestion() {
        ViewInteraction ok = onView(
                allOf(withId(Elements_Claim.ID_OK_MODAL_VIEWS), withText(Data_Claim.OK_BUTTON_TEXT),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                1)));
        ok.perform(scrollTo(), click());
    }

    @DisplayName("экран CREATING CLAIM / клик по кнопке CANCEL в модальном окне QUESTION")
    public void clickButtonCancelInModalViewQuestion() {
        ViewInteraction ok = onView(
                allOf(withId(Elements_Claim.ID_CANCEL_MODAL_VIEWS), withText(Data_Claim.CANCEL_MODAL_VIEW_TEXT),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        ok.perform(scrollTo(), click());
    }

    @DisplayName("экран CREATING CLAIM/ очистить заполненное поле от тестовых данных в Title")
    public void clearTitleField_CreateNews() {
        onView(withId(Elements_Claim.ID_FIELD_TITLE))
                .perform(clearText());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("экран CREATING CLAIM/ очистить заполненное поле от тестовых данных в Executor")
    public void clearExecutorField_CreateNews() {
        onView(withId(Elements_Claim.ID_FIELD_EXECUTOR))
                .perform(clearText());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("экран CREATING CLAIM/ очистить заполненное поле от тестовых данных в Date")
    public void clearDateField_CreateNews() {
        onView(withId(Elements_Claim.ID_FIELD_DATE))
                .perform(clearText());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("экран CREATING CLAIM/ очистить заполненное поле от тестовых данных в Time")
    public void clearTimeField_CreateNews() {
        onView(withId(Elements_Claim.ID_FIELD_TIME))
                .perform(clearText());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("экран CREATING CLAIM/ очистить заполненное поле от тестовых данных в Description")
    public void clearDescriptionField_CreateNews() {
        onView(withId(Elements_Claim.ID_FIELD_DESCRIPTION))
                .perform(clearText());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    // набор методов для заполнения валидными DESCRIPTION для каждого отдельного test-case
    @DisplayName("test-case #7 заполняем поле Description тестовыми данными")
    public void inputTestDataInDescription_7() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_7));
//                .perform(ViewActions.closeSoftKeyboard());
    }

    @DisplayName("test-case #8 заполняем поле Description тестовыми данными")
    public void inputTestDataInDescription_8() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_8));
    }

    @DisplayName("test-case #9 заполняем поле Description тестовыми данными")
    public void inputTestDataInDescription_9() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_9));
    }

    public void inputTestDataInDescription_10() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_10));
//                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDescription_11() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_11));
//                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDescription_12() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_12));
//                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDescription_13() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_13));
//                .perform(ViewActions.closeSoftKeyboard());
    }


    // для Negative test (пустое поле Description)
//    public void inputEmptyInDescriptionNewClaim() {
//        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
//                .perform(ViewActions.replaceText(""))
//                .perform(ViewActions.closeSoftKeyboard());
//    }
    @DisplayName("Тап по кнопке SAVE / Сохранить new Claim")
    public void clickButtonSaveNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_SAVE_CREATING_Claims),
                withText(Data_Claim.SAVE_CREATING_CLAIMS),
                withContentDescription(Data_Claim.SAVE_CREATING_CLAIMS)))
                .perform(scrollTo(), click());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @DisplayName("Тап по кнопке CANCEL / Отменить сохранение new Claim")
    public void clickButtonCancelNewClaim() {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_Claim.ID_CANCEL_CREATING_Claims),
                        withText(Data_Claim.CANCEL_CREATING_CLAIMS),
                        withContentDescription(Data_Claim.CANCEL_CREATING_CLAIMS)));
        cancel.perform(scrollTo(), click());
    }


    // Редактирование Claim
    // добавить комментарий к Claim
    @DisplayName("экран Claims / раскрытая карточка / клик по кнопке Add Comment")
    public void clickAddComment() {
//        onView(Matchers.allOf(withId(Elements_Claim.ID_ADD_COMMENT_BUTTON_CARD),
//                withContentDescription(Data_Claim.ADD_COMMENT_BUTTON_TEXT_CARD)))
//                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
//                .perform(click());
        onView(allOf(withId(Elements_Claim.ID_ADD_COMMENT_BUTTON_CARD),
                withContentDescription(Data_Claim.ADD_COMMENT_BUTTON_TEXT_CARD)))
                .perform(click());
    }

    // набор методов для заполнения валидными COMMENT для каждого отдельного test-case
    @DisplayName("экран Create + Edit Comment / вставить тестовые данные в поле Comment")
    public void inputComment_7() {
//        onView(allOf(childAtPosition(
//                childAtPosition(
//                        withId(Elements_Claim.ID_INPUT_COMMENT),
//                                        0),
//                                0),
//                        isDisplayed()))
//                .perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_7));

//        onView(allOf(withId(Elements_Claim.ID_INPUT_COMMENT), withHint(Data_Claim.FIELD_COMMENT),
//                childAtPosition(
//                        childAtPosition(
//                                withClassName(is("com.google.android.material.card.MaterialCardView")),
//                                0),
//                        0)))
//                .perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_7));

        onView(allOf(withHint(Data_Claim.FIELD_COMMENT),
                withParent(withParent(withId(Elements_Claim.ID_INPUT_COMMENT))),
                isDisplayed()))
                .perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_7));
    }

    @DisplayName("экран Create + Edit Comment / вставить тестовые данные EDIT в поле Comment")
    public void inputEditComment_7() {
        onView(allOf(withHint(Data_Claim.FIELD_COMMENT),
                withParent(withParent(withId(Elements_Claim.ID_INPUT_COMMENT))),
                isDisplayed()))
                .perform(replaceText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_7));
    }

//    public void inputComment_10() {
//        ViewInteraction text_comment = onView(
//                allOf(childAtPosition(
//                                childAtPosition(
//                                        withId(Elements_Claim.ID_INPUT_COMMENT),
//                                        0),
//                                0),
//                        isDisplayed()));
//        text_comment.perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_10),
//                closeSoftKeyboard());
//    }

    public void inputComment_11() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(Elements_Claim.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_11),
                closeSoftKeyboard());
    }

    public void inputComment_12() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(Elements_Claim.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_12),
                closeSoftKeyboard());
    }

    public void inputComment_13() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(Elements_Claim.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_13),
                closeSoftKeyboard());
    }

    @DisplayName("экран Create + Edit Comment / клик по кнопке CANCEL")
    public void clickCancelComment() {
       onView(allOf(withId(R.id.cancel_button), withText("CANCEL"), withContentDescription("Cancel"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()))
        .perform(scrollTo(), click());
    }

    @DisplayName("экран Create + Edit Comment / клик по кнопке SAVE")
    public void clickSaveComment() {
        onView(allOf(withId(R.id.save_button), withText("SAVE"), withContentDescription("Save"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()))
        .perform(scrollTo(), click());
    }

    // поиск comment_7 внутри Claim
    public boolean searchComment_7_ByContent() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_CONTENT_COMMENT), withText(Data_Claim.COMMENT_CONTENT_CARD_7), isDisplayed());
        boolean found = Utils_Helper.searchInCommentList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.COMMENT_CONTENT_CARD_7 + "is not successful");
        }
    }


    // поиск редактированного comment_7 внутри Claim
    public boolean searchComment_7_EditByContent() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_CONTENT_COMMENT), withText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_7), isDisplayed());
        boolean found = Utils_Helper.searchInCommentList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.COMMENT_CONTENT_EDIT_CARD_7 + "is not successful");
        }
    }

    public void clickIconEditComment() {
        ViewInteraction save = onView(
                allOf(withId(Elements_Claim.ID_ICON_EDIT_COMMENT), withText(Data_Claim.ICON_EDIT_COMMENT_TEXT), withContentDescription(Data_Claim.ICON_EDIT_COMMENT_TEXT),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                1)));
        save.perform(scrollTo(), click());
    }


    // редактируем Comment для test-case #7
    public void inputEditComment_9() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(Elements_Claim.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_7),
                closeSoftKeyboard());
//        ViewInteraction textInputEditText11 = onView(
//                allOf(withId(ClaimElements.ID_INPUT_EDIT_COMMENT), withText(ClaimData.COMMENT_CONTENT_CARD_3),
//                        childAtPosition(
//                                childAtPosition(
//                                        withId(ClaimElements.ID_INPUT_EDIT_COMMENT_PARENT),
//                                        0),
//                                1),
//                        isDisplayed()));
//        textInputEditText11.perform(replaceText(ClaimData.COMMENT_CONTENT_EDIT_CARD_3));
    }

    // клик по Edit внутри нужного comment (метод для всех comment)
    public void clickEditInComment(ViewInteraction comment) {
        ViewInteraction editButton = onView(allOf(
                withId(Elements_Claim.ID_COMMENT_BUTTON_EDIT),
                isDescendantOfA(allOf(
                        withId(Elements_Claim.ID_CONTAINER_COMMENT_CARD),
                        isDisplayed()))));
        editButton.perform(click());
    }

    // клик по Edit внутри COMMENT_7
    public void clickEditInsideComment_9() {
        String commentContent = Data_Claim.COMMENT_CONTENT_CARD_7;
        ViewInteraction comment = new CheckUtils_Claims().checkInsideComment_Visibility(commentContent);
        new Utils_Claims().clickEditInComment(comment);
    }
//    public void searchAndOpenClaimByTopic_7() {
////        int position = Utils_Helper.findListItemByText(Data_Claim.TOPIC_7);
////        if (position != -1) {
////            // Открываем карточку на заданной позиции
////            onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed()))
////                    .perform(actionOnItemAtPosition(position, click()));
//            new Utils_Helper().timerWaitingAsyncOperation5000();
////
////        } else {
////            throw new NoSuchElementException("topic search:" + Data_Claim.TOPIC_7 + "is not successful");
////        }
//
//        int position = Utils_Helper.findListItemByText(Data_Claim.FAKE_TITLE);
//        if (position != -1) {
//            // Открываем карточку на заданной позиции
//            onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed()))
//                    .perform(actionOnItemAtPosition(position, click()));
//            new Utils_Helper().timerWaitingAsyncOperation5000();
//
//        } else {
//            throw new NoSuchElementException("topic search:" + Data_Claim.FAKE_TITLE + "is not successful");
//        }
//    }

//    public void searchAndOpenClaimByTopic_8() {
//        new Utils_Helper().timerWaitingAsyncOperation5000();
//        int position = Utils_Helper.findListItemByText(Data_Claim.TOPIC_8);
//        if (position != -1) {
//            // Открываем карточку на заданной позиции
//            onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed()))
//                    .perform(actionOnItemAtPosition(position, click()));
//            new Utils_Helper().timerWaitingAsyncOperation5000();
//
//        } else {
//            throw new NoSuchElementException("topic search:" + Data_Claim.TOPIC_8 + "is not successful");
//        }
//    }
    public boolean searchAndOpenClaimByTopic_9() {
        Matcher<View> matcher = allOf(
                withId(Elements_Claim.ID_TOPIC_TEXT_LIST),
                withText(Data_Claim.TOPIC_9),
                isDisplayed());
        boolean endScroll = true;
        boolean found = Utils_Helper.searchInClaimsList(matcher, endScroll);
        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            new Utils_Helper().timerWaitingAsyncOperation3000();
            return true;
        } else {
            return false;
        }
    }

    public void scrollToPosition(int position) {
        onView(withId(R.id.claim_list_recycler_view)).perform(RecyclerViewActions.scrollToPosition(position));
    }

    public boolean searchAndOpenClaimByTopic_10() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_TOPIC_TEXT_LIST),
                withText(Data_Claim.TOPIC_10), isDisplayed());
        boolean found = Utils_Helper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.TOPIC_10 + "is not successful");
        }
    }

    public boolean searchAndOpenClaimByTopic_11() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_TOPIC_TEXT_LIST),
                withText(Data_Claim.TOPIC_11), isDisplayed());
        boolean found = Utils_Helper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.TOPIC_11 + "is not successful");
        }
    }

    public boolean searchAndOpenClaimByTopic_12() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_TOPIC_TEXT_LIST),
                withText(Data_Claim.TOPIC_12), isDisplayed());
        boolean found = Utils_Helper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.TOPIC_12 + "is not successful");
        }
    }

    public boolean searchAndOpenClaimByTopic_13() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_TOPIC_TEXT_LIST),
                withText(Data_Claim.TOPIC_13), isDisplayed());
        boolean found = Utils_Helper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.TOPIC_13 + "is not successful");
        }
    }

    @DisplayName("экран Claims / раскрытая карточка / клик по кнопке Edite Claim")
    public void clickEditClaim() {
        ViewInteraction edit = onView(
                allOf(withId(Elements_Claim.ID_EDIT_CARD_BUTTON_CARD),
                        withContentDescription(Data_Claim.EDIT_CARD_BUTTON_TEXT_CARD),
//                        childAtPosition(
//                                childAtPosition(
//                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
//                                        0),
//                                25),
                        isDisplayed()));

        edit.perform(click());
    }
    @DisplayName("экран Claims / раскрытая карточка / клик по иконке смена статуса в карточке OPEN")
    public void clickChangeStatusClaim () {
            ViewInteraction change = onView(
                    allOf(withId(Elements_Claim.ID_CHANGE_STATUS_ICON_CARD), withContentDescription(Data_Claim.CHANGE_STATUS_TEXT_CARD),
                            childAtPosition(
                                    childAtPosition(
                                            withClassName(is("com.google.android.material.card.MaterialCardView")),
                                            0),
                                    24),
                            isDisplayed()));
            change.perform(click());

        }

    @DisplayName("экран Claims / раскрытая карточка / клик по строке THROW_OFF в модальном окне Смена статуса в карточке In Progress")
    public void clickChangeStatusThrowOff () {
        ViewInteraction throwOff = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_THROW_OFF_CARD), withText(Data_Claim.CHANGE_THROW_OFF_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        throwOff.perform(click());
    }

    @DisplayName("экран Claims / раскрытая карточка / клик по строке EXECUTE в модальном окне Смена статуса в карточке In Progress")
    public void clickChangeStatusToExecute () {
        ViewInteraction execute = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_TO_EXECUTE_CARD), withText(Data_Claim.CHANGE_TO_EXECUTE_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        execute.perform(click());
    }

    @DisplayName("экран Claims / раскрытая карточка / клик по строке TAKE_TO_WORK в модальном окне Смена статуса в карточке Open")
    public void clickChangeStatusTakeToWork () {
        ViewInteraction take_to_work = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_TAKE_TO_WORK_CARD), withText(Data_Claim.CHANGE_TAKE_TO_WORK_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        take_to_work.perform(click());
    }

    @DisplayName("экран Claims / раскрытая карточка / клик по строке CANCEL в модальном окне Смена статуса в карточке Open")
    public void clickChangeStatusCancel () {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_CANCEL_CARD), withText(Data_Claim.CHANGE_CANCEL_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        cancel.perform(click());
    }
    @DisplayName("экран Creating Claim / модальное окно предупреждения / клик по кнопке CANCEL")
    public void clickInModalViewButtonCancel () {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_Claim.ID_CANCEL_MODAL_VIEW),
                        withText(Data_Claim.CANCEL_MODAL_VIEW_TEXT)));
        cancel.perform(scrollTo(), click());
    }
    @DisplayName("экран Creating Claim / модальное окно предупреждения / клик по кнопке OK")
    public void clickInModalViewButtonOk () {
        ViewInteraction ok = onView(
                allOf(withId(Elements_Claim.ID_OK_MODAL_VIEW),
                        withText(Data_Claim.OK_MODAL_VIEW_TEXT)));
        ok.perform(scrollTo(), click());
    }

    public void clickButtonSave() {
    }
}


