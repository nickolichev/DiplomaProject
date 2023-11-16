package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.RootMatchers.isPlatformPopup;
import static androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static ru.iteco.fmhandroid.ui.PageObject.Utils_Helper.childAtPosition;

import android.view.View;
import android.widget.EditText;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;

import java.util.NoSuchElementException;

import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Claim;
import ru.iteco.fmhandroid.ui.testData.Data_Claim;

public class Utils_Claims {
    private int characterCount = 0;
    @Step("экран CLAIMS / клик по иконке FILTER / открытие модального окна FILTERING /")
    public void clickIconFilter_View_Claims() {
        onView(Matchers.allOf(withId(Elements_Claim.ID_FILTERS_BUTTON),
                withContentDescription(Data_Claim.FILTER_DESCRIPTION)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(click());
    }

    @Step("экран CLAIMS / модальное окно FILTERING / клик по check-box Open/")
    public void clickCheckBox_Open() {
        onView(Matchers.allOf(withId(Elements_Claim.ID_OPEN_CHECK_BOX),
                withText(Data_Claim.OPEN_STATUS_TEXT)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(scrollTo(), click());
    }

    @Step("экран CLAIMS / модальное окно FILTERING / клик по check-box InProgress/")
    public void clickCheckBox_InProgress() {
        onView(Matchers.allOf(withId(Elements_Claim.ID_IN_PROGRESS_CHECK_BOX),
                withText(Data_Claim.IN_PROGRESS_STATUS_TEXT)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(scrollTo(), click());
    }

    @Step("экран CLAIMS / модальное окно FILTERING / клик по check-box Executed/")
    public void clickCheckBox_Executed() {
        onView(Matchers.allOf(withId(Elements_Claim.ID_EXECUTED_CHECK_BOX),
                withText(Data_Claim.EXECUTED_STATUS_TEXT)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(scrollTo(), click());
    }

    @Step("экран CLAIMS / модальное окно FILTERING / клик по check-box Cancelled/")
    public void clickCheckBox_Cancelled() {
        onView(Matchers.allOf(withId(Elements_Claim.ID_CANCELLED_CHECK_BOX),
                withText(Data_Claim.CANCELLED_STATUS_TEXT)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(scrollTo(), click());
    }

    @Step("экран CLAIMS / модальное окно FILTERING / клик по кнопке OK/")
    public void clickButton_Ok() {
        onView(Matchers.allOf(withId(Elements_Claim.ID_OK_BUTTON),
                withText(Data_Claim.OK_BUTTON_TEXT)))
                .perform(scrollTo(), click());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @Step("экран CLAIMS / 1-я нераскрытая карточка CLAIM в списке/ клик по кнопке Expend/")
    public void clickExpendClaim() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        onView(allOf(isDisplayed(),
                withId(Elements_Claim.ID_LIST_CARDS)))
                .perform(actionOnItemAtPosition(0, click()));
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @Step("экран CLAIMS / раскрытая карточка CLAIM / клик по кнопке Close/")
    public void clickCloseClaim() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        onView(Matchers.allOf(withId(Elements_Claim.ID_BUTTON_CLOSE),
                withContentDescription(Data_Claim.BUTTON_CLOSE)))
                .perform(click());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @Step("экран Claims / клик по кнопке ADD New Claim")
    public void clickCreateClaim() {
        onView(allOf(withId(Elements_Claim.ID_ADD_NEW_CLAIM),
                withContentDescription(Data_Claim.ADD_NEW_CLAIM_TEXT)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(click());
    }

    @Step("test-case #7 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTitleNewClaim_7() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_7));
    }

    @Step("test-case #11 / экран CREATING CLAIM / заполнение поля TITLE НЕвалидными данными 51 знак + подсчет знаков")
    public void inputInvalidTitleNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INV_INPUT_TITLE));
        // Обновляем счетчик после ввода текста
        int characterCount = updateCharacterCount();
        new Utils_Helper().timerWaitingAsyncOperation500();
        new CheckUtils_Claims().checkCounterValue_Visibility(characterCount);
    }
    @Step("test-case #8 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTitleNewClaim_8() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.FAKE_TITLE_8));
    }

    @Step("test-case #9 + #10 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTitleNewClaim_9_10() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.FAKE_TITLE_9_10));
    }

    @Step("test-case #15 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTestDataInTitleNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_7));
    }

    // методы полей Date и Time
    @Step("экран CREATING CLAIM / заполнение валидными тестовыми данными поля Date")
    public void inputValidDate() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DATE)))
                .check(matches(isDisplayed()))
                .perform(replaceText(Data_Claim.INPUT_DATE));
    }

    @Step("экран CREATING CLAIM / заполнение валидными тестовыми данными поля Time")
    public void inputValidTime() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TIME)))
                .check(matches(isDisplayed()))
                .perform(replaceText(Data_Claim.INPUT_TIME));
    }

    @Step("экран CREATING CLAIM / клик по кнопке OK в модальном окне WARNING")
    public void clickButtonOkInModalViewWarning() {
        onView(allOf(withId(Elements_Claim.ID_OK_MODAL_VIEWS), withText(Data_Claim.OK_BUTTON_TEXT),
                childAtPosition(
                        childAtPosition(
                                withClassName(is("android.widget.ScrollView")),
                                0),
                        3)))
                .perform(scrollTo(), click());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @Step("экран CREATING CLAIM/ очистить заполненное поле от тестовых данных в Date")
    public void clearDateField_CreateNews() {
        onView(withId(Elements_Claim.ID_FIELD_DATE))
                .perform(clearText());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @Step("экран CREATING CLAIM/ очистить заполненное поле от тестовых данных в Time")
    public void clearTimeField_CreateNews() {
        onView(withId(Elements_Claim.ID_FIELD_TIME))
                .perform(clearText());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    @Step("экран CREATING CLAIM/ очистить заполненное поле от тестовых данных в Description")
    public void clearDescriptionField_CreateNews() {
        onView(withId(Elements_Claim.ID_FIELD_DESCRIPTION))
                .perform(clearText());
        new Utils_Helper().timerWaitingAsyncOperation1000();
    }

    // набор методов для заполнения валидными DESCRIPTION для каждого отдельного test-case
    @Step("test-case #7 заполняем поле Description тестовыми данными")
    public void inputTestDataInDescription_7() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_7));
    }

    @Step("test-case #8 заполняем поле Description тестовыми данными")
    public void inputTestDataInDescription_8() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_8));
    }

    @Step("test-case #9 заполняем поле Description тестовыми данными")
    public void inputTestDataInDescription_9() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_9));
    }

    @Step("test-case #10 заполняем поле Description тестовыми данными")
    public void inputTestDataInDescription_10() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_10));
    }

    @Step("Тап по кнопке SAVE / Сохранить new Claim")
    public void clickButtonSaveNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_SAVE_CREATING_Claims),
                withText(Data_Claim.SAVE_CREATING_CLAIMS),
                withContentDescription(Data_Claim.SAVE_CREATING_CLAIMS)))
                .perform(click());
        new Utils_Helper().timerWaitingAsyncOperation2000();
    }

    @Step("Тап по кнопке CANCEL / Отменить сохранение new Claim")
    public void clickButtonCancelNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_CANCEL_CREATING_CLAIMS),
                withText(Data_Claim.CANCEL_CREATING_CLAIMS),
                withContentDescription(Data_Claim.CANCEL_CREATING_CLAIMS)))
                .perform(click());
    }

    @Step("экран CREATING + EDITING CLAIM / выбрать из списка EXECUTOR")
    public void selectExecutorClaim() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        onView(allOf(withId(Elements_Claim.ID_DROPDOWN_EXECUTOR),
                withContentDescription(Data_Claim.DROPDOWN_EXECUTOR),
                childAtPosition(
                        childAtPosition(
                                withClassName(is("android.widget.LinearLayout")),
                                1),
                        0),
                isDisplayed()))
                .perform(click());
        new Utils_Helper().timerWaitingAsyncOperation500();
        onData(allOf(is(instanceOf(String.class)), is(Data_Claim.INPUT_EXECUTOR_TEXT)))
                .inRoot(isPlatformPopup())
                .perform(click());
    }

    @Step("test-case #8 / экран EDITING CLAIM / очистить TITLE")
    public void clearTitleClaim_8() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(clearText());
    }

    @Step("метод для подсчета количества знаков в поле Title")
    public int updateCharacterCount() {
        // Получаем текст из поля
        onView(withId(Elements_Claim.ID_FIELD_TITLE))
                .check(matches(isDisplayed()))
                .check(matches(isAssignableFrom(EditText.class)))
                .perform(new ViewAction() {
                    @Override
                    public Matcher<View> getConstraints() {
                        return isAssignableFrom(EditText.class);
                    }

                    @Override
                    public String getDescription() {
                        return "getting text from EditText";
                    }

                    @Override
                    public void perform(UiController uiController, View view) {
                        EditText editText = (EditText) view;
                        characterCount = editText.getText().length();
                    }
                })
                .toString();
        return characterCount;
    }

    @Step("test-case #8 / экран EDITING CLAIM / заполнение поля TITLE отредактированными данными + подсчет количества знаков")
    public void inputTitleEditingClaim_8() {
        String testData = Data_Claim.FAKE_EDITING_TITLE_8;
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(testData));
        // Обновляем счетчик после ввода текста
       int characterCount = updateCharacterCount();
        new Utils_Helper().timerWaitingAsyncOperation500();
        new CheckUtils_Claims().checkCounterValue_Visibility(characterCount);
    }

    @Step("test-case #8 / экран EDITING CLAIM / очистить DESCRIPTION")
    public void clearDescriptionClaim_8() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(clearText());
    }

    @Step("test-case #8 / экран EDITING CLAIM /заполнение поля DESCRIPTION отредактированными данными")
    public void inputDescriptionEditingClaim_8() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_EDITING_DESCRIPTION_8));
    }

    @Step("экран Claims / раскрытая карточка / клик по кнопке Add Comment")
    public void clickAddComment() {
        onView(allOf(withId(Elements_Claim.ID_ADD_COMMENT_BUTTON_CARD),
                withContentDescription(Data_Claim.ADD_COMMENT_BUTTON_TEXT_CARD)))
                .perform(click());
    }

    @Step("экран Create + Edit Comment / вставить тестовые данные в поле Comment")
    public void inputComment_7() {
        onView(allOf(withHint(Data_Claim.FIELD_COMMENT),
                withParent(withParent(withId(Elements_Claim.ID_INPUT_COMMENT))),
                isDisplayed()))
                .perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_7));
    }

    @Step("экран Create + Edit Comment / вставить тестовые данные EDIT в поле Comment")
    public void inputEditComment_7() {
        onView(allOf(withHint(Data_Claim.FIELD_COMMENT),
                withParent(withParent(withId(Elements_Claim.ID_INPUT_COMMENT))),
                isDisplayed()))
                .perform(replaceText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_7));
    }

    @Step("экран Create + Edit Comment / клик по кнопке CANCEL")
    public void clickCancelComment() {
        onView(allOf(withId(Elements_Claim.ID_CANCEL_CREATING_CLAIMS),
                withText(Data_Claim.BUTTON_CANCEL_COMMENT),
                withContentDescription(Data_Claim.BUTTON_CANCEL_COMMENT_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .perform(scrollTo(), click());
    }

    @Step("экран Create + Edit Comment / клик по кнопке SAVE")
    public void clickSaveComment() {
        onView(allOf(withId(Elements_Claim.ID_SAVE_CREATING_Claims),
                withText(Data_Claim.BUTTON_SAVE_COMMENT),
                withContentDescription(Data_Claim.BUTTON_SAVE_COMMENT_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .perform(scrollTo(), click());
    }

    @Step("модальное окно Comment / вставить тестовые данные")
    public void inputComment_Open_ModalView() {
        onView(allOf(withId(Elements_Claim.ID_MODAL_VIEW_INPUT_COMMENT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .perform(replaceText(Data_Claim.COMMENT_OPEN_INPUT_MODAL_VIEW));
    }

    @Step("модальное окно Comment / вставить тестовые данные")
    public void inputComment_Executed_ModalView() {
        onView(allOf(withId(Elements_Claim.ID_MODAL_VIEW_INPUT_COMMENT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .perform(replaceText(Data_Claim.COMMENT_EXECUTED_INPUT_MODAL_VIEW));
    }

    @Step("модальное окно Comment / клик по кнопке CANCEL")
    public void clickCancel_ModalViewComment() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        onView(allOf(withId(Elements_Claim.ID_CANCEL_MODAL_VIEWS),
                withText(Data_Claim.CANCEL_CLICK_MODAL_VIEW)))
                .perform(scrollTo(), click());
    }

    @Step("модальное окно Comment / клик по кнопке OK")
    public void clickOK_ModalViewComment() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        onView(allOf(withId(Elements_Claim.ID_OK_MODAL_VIEWS),
                withText(Data_Claim.OK_TEXT_MODAL_VIEW)))
                .perform(scrollTo(), click());
    }

    @Step("поиск comment_7 в раскрытой карточке Claim")
    public boolean searchComment_7_ByContent() {
        new Utils_Helper().timerWaitingAsyncOperation2000();
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_CARD_7),
                isDisplayed());
        boolean found = Utils_Helper.searchInCommentList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.COMMENT_CONTENT_CARD_7 + "is not successful");
        }
    }

    @Step("поиск редактированного comment_7 в раскрытой карточке Claim")
    public boolean searchComment_7_EditByContent() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_7),
                isDisplayed());
        boolean found = Utils_Helper.searchInCommentList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.COMMENT_CONTENT_EDIT_CARD_7 + "is not successful");
        }
    }

    @Step("клик по кнопке Edit в раскрытой карточке Claim")
    public void clickIconEditComment() {
        onView(allOf(
                withId(Elements_Claim.ID_ICON_EDIT_COMMENT),
                withContentDescription(Data_Claim.ICON_EDIT_COMMENT_TEXT),
                childAtPosition(
                        childAtPosition(
                                withId(Elements_Claim.ID_CONTAINER_COMMENT_CARD),
                                0),
                        1)))
                .perform(click());
    }

    @Step("test-case #7 / поиск карточки в списке Claims и открытие карточки")
    public void searchAndOpenClaimByTopic_7() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        if (Utils_Helper.tryClickOnListItemByTextWithoutScrolling(Data_Claim.FAKE_TITLE)) {
            return;
        }

        int position = Utils_Helper.findListItemByText(Data_Claim.FAKE_TITLE);
        if (position != -1) {
            // Открываем карточку на заданной позиции
            onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed()))
                    .perform(actionOnItemAtPosition(position, click()));
            new Utils_Helper().timerWaitingAsyncOperation5000();

        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.FAKE_TITLE + "is not successful");
        }
    }

    @Step("test-case #8 / поиск карточки в списке Claims и открытие карточки")
    public void searchAndOpenClaimByTopic_8() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        if (Utils_Helper.tryClickOnListItemByTextWithoutScrolling(Data_Claim.FAKE_TITLE_8)) {
            return;
        }

        int position = Utils_Helper.findListItemByText(Data_Claim.FAKE_TITLE_8);
        if (position != -1) {
            onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed()))
                    .perform(actionOnItemAtPosition(position, click()));
            new Utils_Helper().timerWaitingAsyncOperation5000();

        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.FAKE_TITLE_8 + "is not successful");
        }
    }

    @Step("test-case #8 / поиск отредактированной карточки в списке Claims и открытие карточки")
    public void searchAndOpenClaimAfterEditing_8() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        if (Utils_Helper.tryClickOnListItemByTextWithoutScrolling(Data_Claim.FAKE_EDITING_TITLE_8)) {
            return;
        }

        int position = Utils_Helper.findListItemByText(Data_Claim.FAKE_EDITING_TITLE_8);
        if (position != -1) {
            onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed()))
                    .perform(actionOnItemAtPosition(position, click()));
            new Utils_Helper().timerWaitingAsyncOperation5000();

        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.FAKE_EDITING_TITLE_8 + "is not successful");
        }
    }

    @Step("test-case #9 +#10 / поиск карточки в списке Claims и открытие карточки")
    public void searchAndOpenClaimByTopic_9() {
        if (Utils_Helper.tryClickOnListItemByTextWithoutScrolling(Data_Claim.FAKE_TITLE_9_10)) {
            return;
        }

        int position = Utils_Helper.findListItemByText(Data_Claim.FAKE_TITLE_9_10);
        if (position != -1) {
            onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed()))
                    .perform(actionOnItemAtPosition(position, click()));
            new Utils_Helper().timerWaitingAsyncOperation5000();

        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.FAKE_TITLE_9_10 + "is not successful");
        }
    }

    @Step("экран Claims / раскрытая карточка / клик по кнопке Edite Claim")
    public void clickEditClaim() {
        onView(allOf(withId(Elements_Claim.ID_EDIT_CARD_BUTTON_CARD),
                withContentDescription(Data_Claim.EDIT_CARD_BUTTON_TEXT_CARD),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран Claims / раскрытая карточка / клик по иконке Смена статуса")
    public void clickChangeStatusClaim() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_STATUS_ICON_CARD),
                withContentDescription(Data_Claim.CHANGE_STATUS_TEXT_CARD),
                childAtPosition(
                        childAtPosition(
                                withClassName(is("com.google.android.material.card.MaterialCardView")),
                                0),
                        24),
                isDisplayed()))
                .perform(click());

    }

    @Step("экран Claims / раскрытая карточка / клик по строке THROW_OFF в модальном окне Смена статуса в карточке In Progress")
    public void clickChangeStatusThrowOff() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_THROW_OFF_CARD),
                withText(Data_Claim.CHANGE_THROW_OFF_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран Claims / раскрытая карточка / клик по строке EXECUTE в модальном окне Смена статуса в карточке In Progress")
    public void clickChangeStatusToExecute() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_TO_EXECUTE_CARD),
                withText(Data_Claim.CHANGE_TO_EXECUTE_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран Claims / раскрытая карточка / клик по строке TAKE_TO_WORK в модальном окне Смена статуса в карточке Open")
    public void clickChangeStatusTakeToWork() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_TAKE_TO_WORK_CARD),
                withText(Data_Claim.CHANGE_TAKE_TO_WORK_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран Claims / раскрытая карточка / клик по строке CANCEL в модальном окне Смена статуса в карточке Open")
    public void clickChangeStatusCancel() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_CANCEL_CARD),
                withText(Data_Claim.CHANGE_CANCEL_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .perform(click());
    }

    @Step("экран Creating Claim / модальное окно предупреждения / клик по кнопке CANCEL")
    public void clickInModalViewButtonCancel() {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_Claim.ID_CANCEL_MODAL_VIEW),
                        withText(Data_Claim.CANCEL_MODAL_VIEW_TEXT)));
        cancel.perform(scrollTo(), click());
    }

    @Step("экран Creating Claim / модальное окно предупреждения / клик по кнопке OK")
    public void clickInModalViewButtonOk() {
        onView(allOf(withId(Elements_Claim.ID_OK_MODAL_VIEW),
                withText(Data_Claim.OK_MODAL_VIEW_TEXT)))
                .perform(scrollTo(), click());
    }
}


