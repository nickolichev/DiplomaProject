package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static ru.iteco.fmhandroid.ui.PageObject.Utils_Helper.childAtPosition;
import static ru.iteco.fmhandroid.ui.testData.Data_Claim.COMMENT_CONTENT_CARD_7;

import android.view.View;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewInteraction;

import org.hamcrest.core.IsInstanceOf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Claim;
import ru.iteco.fmhandroid.ui.testData.Data_Claim;

public class CheckUtils_Claims {

    @Step("экран CLAIM / проверка Title на экране")
    public void checkTitleClaims_Visibility() {
        onView(allOf(withText(Data_Claim.TITLE_CLAIMS_TEXT),
                withParent(withParent(withId(Elements_Claim.ID_TITLE_CLAIMS))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_CLAIMS_TEXT)));
    }

    @Step("проверка статуса OPEN в открытой краточке CLAIM")
    public void checkOpenStatusInCard() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(R.id.status_label_text_view),
                withText(Data_Claim.OPEN_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class)))
        ))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.OPEN_STATUS_TEXT)));
    }

    @Step("проверка статуса IN PROGRESS в открытой краточке CLAIM")
    public void checkInProgressStatusInCard() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(R.id.status_label_text_view),
                withText(Data_Claim.IN_PROGRESS_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.IN_PROGRESS_STATUS_TEXT)));
    }

    @Step("проверка статуса EXECUTED в открытой краточке CLAIM")
    public void checkExecutedStatus() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(R.id.status_label_text_view),
                withText(Data_Claim.EXECUTED_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.EXECUTED_STATUS_TEXT)));
    }

    @Step("проверка статуса CANCELED в открытой краточке CLAIM")
    public void checkCanceledStatus() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(R.id.status_label_text_view),
                withText(Data_Claim.CANCELED_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CANCELED_STATUS_TEXT)));
    }

    @Step("проверка кнопки Close в открытой карточке Claim")
    public void checkButtonClose_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_BUTTON_CLOSE),
                withContentDescription(Data_Claim.BUTTON_CLOSE),
                childAtPosition(
                        childAtPosition(
                                withClassName(is("com.google.android.material.card.MaterialCardView")),
                                0),
                        23),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_Claim.BUTTON_CLOSE)));
    }

    @Step("экран Creating Claim / проверка TITLE экрана")
    public void checkTitleAppBar() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_APP_BAR),
                withText(Data_Claim.APP_BAR_CREATING_TEXT),
                withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_claim),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(matches(withText("Creating")));

        onView(allOf(withId(Elements_Claim.ID_SUB_TITLE_APP_BAR), withText(Data_Claim.SUB_TITLE_CLAIMS),
                withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_claim),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(matches(withText("Claims")));
    }

    @Step("экран Creating Claim / проверка видимости НЕзаполненного поля Title для ввода тестовых данных")
    public void checkFieldTitle_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE), withHint(Data_Claim.TITLE_TEXT),
                withParent(withParent(withId(Elements_Claim.ID_PARENT_FIELD_TITLE))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_Claim.TITLE_TEXT)));
    }

    @Step("экран Creating Claim / проверка видимости введенных тестовых данных в поле Title")
    public void checkTestDataTitle_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE),
                withText(Data_Claim.INPUT_TITLE_7),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_TITLE_7)));
    }

    @Step("экран Creating Claim / проверка видимости введенных НЕвалидных тестовых данных в поле Title")
    public void checkTestInvalidDataTitle_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE),
                withText("Создание новой претензии в этом Title 51 знак     "),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText("Создание новой претензии в этом Title 51 знак     ")));
    }

    @Step("экран Creating Claim / проверка видимости примечания к полю Title")
    public void checkCharactersEntered_Visibility() {
        onView(allOf(withId(com.google.android.material.R.id.textinput_counter),
                withText("0/50"),
                withContentDescription("Characters entered 0 of 50"),
                withParent(withParent(withId(Elements_Claim.ID_PARENT_FIELD_TITLE))),
                isDisplayed()))
                .check(matches(withText("0/50")));
    }

    @Step("экран Creating Claim / проверка видимости НЕзаполненного поля Executor для ввода тестовых данных")
    public void checkFieldExecutor_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_EXECUTOR),
                withHint(Data_Claim.EXECUTOR_TEXT),
                withParent(withParent(withId(Elements_Claim.ID_PARENT_FIELD_EXECUTOR))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_Claim.EXECUTOR_TEXT)));
    }

    @Step("экран Creating Claim / проверка видимости введенных тестовых данных в поле Executor")
    public void checkTestDataExecutor_Visibility() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_FIELD_EXECUTOR),
                withText(Data_Claim.INPUT_EXECUTOR_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_EXECUTOR_TEXT)));
    }

    @Step("экран Creating Claim / проверка видимости кнопки \"Развернуть список\" в поле Executor")
    public void checkIconFieldExecutor_Visibility() {
        onView(allOf(withId(com.google.android.material.R.id.text_input_end_icon),
                withContentDescription("Show dropdown menu"),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription("Show dropdown menu")));
    }

    @Step("экран Creating Claim / проверка видимости НЕзаполненного поля Date для ввода тестовых данных")
    public void checkFieldDate_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DATE),
                withHint(Data_Claim.DATE_TEXT),
                withParent(withParent(withId(Elements_Claim.ID_PARENT_FIELD_DATE))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_Claim.DATE_TEXT)));
    }

    @Step("экран Creating Claim / проверка видимости введенных тестовых данных в поле Date")
    public void checkTestDataDate_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DATE),
                withText(Data_Claim.INPUT_DATE),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DATE)));
    }

    @Step("экран Creating Claim / проверка видимости НЕзаполненного поля Time для ввода тестовых данных")
    public void checkFieldTime_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TIME),
                withHint(Data_Claim.TIME_TEXT),
                withParent(withParent(withId(Elements_Claim.ID_PARENT_FIELD_TIME))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_Claim.TIME_TEXT)));
    }

    @Step("экран Creating Claim / проверка видимости введенных тестовых данных в поле Time")
    public void checkTestDataTime_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TIME),
                withText(Data_Claim.INPUT_TIME),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_TIME)));
    }

    @Step("экран Creating Claim / проверка видимости поля Description для ввода тестовых данных")
    public void checkFieldDescription_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION),
                withHint(Data_Claim.DESCRIPTION_TEXT),
                withParent(withParent(withId(Elements_Claim.ID_PARENT_FIELD_DESCRIPTION))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_Claim.DESCRIPTION_TEXT)));
    }

    @Step("экран Creating Claim / проверка видимости введенных тестовых данных в поле Description")
    public void checkTestDataDescription_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION),
                withText(Data_Claim.INPUT_DESCRIPTION_7),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DESCRIPTION_7)));
    }

    @Step("экран Creating Claim / проверка видимости кнопки SAVE")
    public void checkButtonSave_Visibility() {
//        new DataHelper().waitAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_SAVE_CREATING_Claims),
                withText(Data_Claim.SAVE_CREATING_CLAIMS),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.SAVE_CREATING_CLAIMS)));
    }

    @Step("экран Creating Claim / проверка видимости кнопки CANCEL")
    public void checkButtonCancel_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CANCEL_CREATING_CLAIMS),
                withText(Data_Claim.CANCEL_BUTTON_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CANCEL_BUTTON_TEXT)));
    }

    // НАБОР МЕТОДОВ для проверки Title во всех test-case:

    @Step("экран Creating Claim / test-case #9 / проверка заполненного тестовыми данными поля Title")
    public void checkTitle_9_10_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.FAKE_TITLE_9_10),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.FAKE_TITLE_9_10)));
    }

    @Step("test-case #7 / в раскрытой карточке проверяем строку Title и что видимо ее содержание")
    public void checkTitle_7_Visibility() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.FAKE_TITLE),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.FAKE_TITLE)));
    }

    @Step("test-case #8 / в раскрытой карточке проверяем строку Title и что видимо ее содержание")
    public void checkTitle_8_Visibility() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.FAKE_TITLE_8),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.FAKE_TITLE_8)));
    }

    @Step("test-case #8 / ПОСЛЕ редактирования в раскрытой карточке проверяем строку Title и что видимо ее содержание")
    public void checkEditingTitle_8_Visibility() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.FAKE_EDITING_TITLE_8),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.FAKE_EDITING_TITLE_8)));
    }

    @Step("в раскрытой карточке проверяем строку Executor и что видимо ее содержание NOT ASSIGNED")
    public void checkIndefinedExecutor_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_EXECUTOR_CARD),
                withText(Data_Claim.EXECUTOR_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.EXECUTOR_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_EXECUTOR_VALUE_CARD),
                withText(Data_Claim.EXECUTOR_VALUE_OPEN_STATUS),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.EXECUTOR_VALUE_OPEN_STATUS)));
    }

    @Step("в раскрытой карточке проверяем что Executor и что видимо его содержание Ivanov Ivan Ivanovich")
    public void checkDefinedExecutor_Visibility() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_EXECUTOR_CARD),
                withText(Data_Claim.EXECUTOR_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.EXECUTOR_TEXT)));
        new Utils_Helper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_EXECUTOR_VALUE_CARD),
                withText(Data_Claim.INPUT_EXECUTOR_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_EXECUTOR_TEXT)));
    }

    @Step("в раскрытой карточке проверяем что строка \"Plan Date\" видима и что видимы значения Date и Time")
    public void checkValidPlanDate_Visibility() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_CARD),
                withText(Data_Claim.PLAN_DATE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.PLAN_DATE_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_IN_CARD),
                withText(Data_Claim.INPUT_DATE),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DATE)));
    }

    // НАБОР МЕТОДОВ для проверки Description во всех test-case:
    @Step("test-case #7 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_7_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_7),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DESCRIPTION_7)));
    }

    @Step("test-case #8 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_8_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_8),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DESCRIPTION_8)));
    }

    @Step("test-case #8 / ПОСЛЕ редактирования в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkEditingDescription_8_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_EDITING_DESCRIPTION_8),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_EDITING_DESCRIPTION_8)));
    }

    @Step("test-case #9 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_9_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_9),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DESCRIPTION_9)));
    }

    @Step("в раскрытой карточке проверяем что строка Created для Description отображается")
    public void checkCreatedDescription_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CREATED_DESCRIPTION_CARD),
                withText(Data_Claim.CREATED_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CREATED_TEXT)));
    }

    @Step("генерируем значение Creation date")
    public static String getCurrentDate() {
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        Date currentDate = new Date(currentTimeMillis);
        return dateFormat.format(currentDate);
    }

    @Step("в раскрытой карточке проверяем что значение строки Created для Description отображается")
    public void checkCreatedDateDescription_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CREATED_DATE_VALUE_CARD),
                withText(getCurrentDate()),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(getCurrentDate())));
    }

    @Step("в раскрытой карточке проверяем что значение строки Created для Comment отображается")
    public void checkCreatedDateComment_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_COMMENT_DATE_VALUE_CARD),
                withText(Utils_Helper.subtractOneDay(getCurrentDate())),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Utils_Helper.subtractOneDay(getCurrentDate()))));
    }

    @Step("в раскрытой карточке проверяем что поле Comment НЕ отображается")
    public void checkFieldComment_NotVisibility() {
        onView(withText(COMMENT_CONTENT_CARD_7))
                .check(doesNotExist());
    }

    @Step("в раскрытой карточке проверяем что Author Comment отображается")
    public void checkAuthorComment_Visibility_7() {
        onView(allOf(withId(Elements_Claim.ID_COMMENTATOR_VALUE_CARD),
                withText(Data_Claim.COMMENTATOR_VALUE_CARD),
                withParent(withParent(withId(R.id.claim_comments_list_recycler_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.COMMENTATOR_VALUE_CARD)));
    }

    @Step("test-case #9 / в раскрытой карточке в модальном окне Comment проверяем что пустое поле Comment отображается")
    public void checkModalViewComment_FieldComment_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_MODAL_VIEW_COMMENT),
                withHint(Data_Claim.COMMENT_TEXT_MODAL_VIEW),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(withHint(Data_Claim.COMMENT_TEXT_MODAL_VIEW)));
    }

    @Step("test-case #9 / проверяем, что содержание Comment отображается в раскрытой Claim")
    public void checkComment_9_Visibility() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_OPEN_INPUT_MODAL_VIEW),
                withParent(withParent(withId(R.id.claim_comments_list_recycler_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.COMMENT_OPEN_INPUT_MODAL_VIEW)));
    }

    @Step("test-case #10 / проверяем, что содержание Comment отображается в раскрытой Claim")
    public void checkComment_10_Visibility() {
        new Utils_Helper().timerWaitingAsyncOperation500();
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_EXECUTED_INPUT_MODAL_VIEW),
                withParent(withParent(withId(R.id.claim_comments_list_recycler_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.COMMENT_EXECUTED_INPUT_MODAL_VIEW)));
    }


    @Step("в раскрытой карточке в модальном окне Comment проверяем что поле Comment отображается")
    public void checkModalViewComment_ButtonCancel_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_MODAL_VIEW_CANCEL),
                withText(Data_Claim.CANCEL_TEXT_MODAL_VIEW),
                withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @Step("в раскрытой карточке в модальном окне Comment проверяем что поле Comment отображается")
    public void checkModalViewComment_ButtonOK_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_MODAL_VIEW_OK),
                withText(Data_Claim.OK_TEXT_MODAL_VIEW),
                withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    // набор методов для Negative tests на экране Creating Claims
    @Step("экран CREATING CLAIMS / проверяем модальное окно WARNING, что оно отображается и что отображается текст")
    public void checkModalViewWarningText_Visibility() {
        new Utils_Helper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_MODAL_VIEWS),
                withText(Data_Claim.MODAL_VIEW_WARNING),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.MODAL_VIEW_WARNING)));
    }

    @Step("экран CREATING CLAIMS / проверяем модальное окно WARNING, что в нем отображается кнопка OK")
    public void checkModalViewWarningButtonOk_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_OK_MODAL_VIEWS),
                withText(Data_Claim.MODAL_VIEW_OK),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.MODAL_VIEW_OK)));
    }

    @Step("экран CREATING CLAIMS / проверяем модальное окно QUESTION, что оно отображается и что отображается текст")
    public void checkModalViewQuestionText_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_MODAL_VIEWS),
                withText(Data_Claim.MODAL_VIEW_QUESTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.MODAL_VIEW_QUESTION)));
    }

    @Step("экран CREATING CLAIMS / проверяем модальное окно QUESTION, что в нем отображается кнопка OK")
    public void checkModalViewQuestionButtonOk_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_OK_MODAL_VIEWS),
                withText(Data_Claim.MODAL_VIEW_OK),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.MODAL_VIEW_OK)));
    }

    @Step("экран CREATING CLAIMS / проверяем модальное окно QUESTION, что в нем отображается кнопка CANCEL")
    public void checkModalViewQuestionButtonCancel_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CANCEL_MODAL_VIEWS),
                withText(Data_Claim.MODAL_VIEW_CANCEL),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.MODAL_VIEW_CANCEL)));
    }

    @Step("экран CREATING CLAIMS / проверка отображения иконки-предупреждения о пустом поле")
    public void checkIconEmptyField_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_ICON_EMPTY_FIELD),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed(),
                not(withContentDescription("Show dropdown menu"))))
                .check(matches(isDisplayed()));
    }

    @Step("экран EDITING CLAIMS / проверка отображения Title экрана")
    public void checkTitleViewEditingClaims_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_EDITING), withText(Data_Claim.TITLE_EDITING),
                withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_claim),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_EDITING)));
        onView(allOf(withId(Elements_Claim.ID_SUB_TITLE_CLAIMS), withText(Data_Claim.SUB_TITLE_CLAIMS),
                withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_claim),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(matches(withText(Data_Claim.SUB_TITLE_CLAIMS)));
    }

    @Step("экран EDITING CLAIMS / проверка что Title экрана не отображается")
    public void checkTitleViewEditingClaims_NotVisibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_EDITING), withText(Data_Claim.TITLE_EDITING),
                withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_claim),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(doesNotExist());
        onView(allOf(withId(Elements_Claim.ID_SUB_TITLE_CLAIMS), withText(Data_Claim.SUB_TITLE_CLAIMS),
                withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_claim),
                        withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                isDisplayed()))
                .check(doesNotExist());
    }

    @Step("экран EDITING CLAIMS / проверка видимости ЗАПОЛНЕННОГО поля Title для ввода тестовых данных")
    public void checkFilledInputFieldTitle_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE),
                withText(Data_Claim.FAKE_TITLE_8),
                withParent(withParent(withId(Elements_Claim.ID_PARENT_FIELD_TITLE))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.FAKE_TITLE_8)));
    }

    @Step("экран EDITING CLAIMS / проверка видимости ЗАПОЛНЕННОГО поля Title для ввода тестовых данных")
    public void checkFilledInputFieldDescription_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION),
                withText(Data_Claim.INPUT_DESCRIPTION_8),
                withParent(withParent(withId(Elements_Claim.ID_PARENT_FIELD_DESCRIPTION))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DESCRIPTION_8)));
    }

    @Step("экран EDITING CLAIMS / проверка значения счетчика при вводе отредактированных данных в поле Title")
    public void checkCounterValue_Visibility(int actualCharacterCount) {
        Utils_Claims counter = new Utils_Claims();
        new Utils_Helper().timerWaitingAsyncOperation500();
        String expectedCounterText = actualCharacterCount + "/" + Data_Claim.MAX_ALLOWED_CHARACTERS;
        new Utils_Helper().timerWaitingAsyncOperation500();
        onView(allOf(
                withId(Elements_Claim.ID_COUNTER),
                withText(expectedCounterText),
                withContentDescription("Characters entered " + counter.updateCharacterCount() + " of " + Data_Claim.MAX_ALLOWED_CHARACTERS),
                withParent(withParent(withId(Elements_Claim.ID_PARENT_FIELD_TITLE))),
                isDisplayed()))
                .check(matches(withText(expectedCounterText)));
    }

    @Step("проверяем, что кнопка SAVE на экране создания COMMENT отображается")
    public void checkButtonSaveComment() {
        onView(allOf(withId(R.id.save_button),
                withText("SAVE"),
                withContentDescription("Save"),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()));

    }

    @Step("проверяем, что кнопка CANCEL на экране создания COMMENT отображается")
    public void checkButtonCancelComment() {
        onView(allOf(withId(R.id.cancel_button),
                withText("CANCEL"),
                withContentDescription("Cancel"),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @Step("экран EDIT COMMENT / test-case #7 / метод проверки отображения пустого поля COMMENT")
    public void checkFieldComment_Visibility() {
        onView(allOf(withHint(Data_Claim.FIELD_COMMENT),
                withParent(withParent(withId(Elements_Claim.ID_INPUT_COMMENT))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_Claim.FIELD_COMMENT)));
    }

    @Step("экран EDIT COMMENT / test-case #7 / метод проверки что перед редактированием содержание исходного COMMENT отображается корректно")
    public void checkComment_7_Visibility() {
        onView(allOf(withText(Data_Claim.COMMENT_CONTENT_CARD_7),
                withParent(withParent(withId(R.id.comment_text_input_layout))),
                isDisplayed()))
                .check(matches(withText(Data_Claim.COMMENT_CONTENT_CARD_7)));
    }

    @Step("экран EDIT COMMENT / test-case #7 / метод проверки что ПОСЛЕ вставки редактированного текста в поле COMMENT, текст отображается корректно")
    public void checkEditComment_7_Visibility() {
        onView(allOf(withText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_7),
                withParent(withParent(withId(R.id.comment_text_input_layout))),
                isDisplayed()))
                .check(matches(withText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_7)));
    }

    @Step("экран EDIT COMMENT / метод проверки что кнопка SAVE отображается")
    public void checkButtonSave_EditComment_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_SAVE_EDITING_COMMENT),
                withText(Data_Claim.SAVE_EDIT_COMMENT),
                withContentDescription(Data_Claim.SAVE_EDIT_COMMENT_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @Step("экран EDIT COMMENT / метод проверки что кнопка SAVE отображается")
    public void checkButtonCancel_EditComment_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CANCEL_EDITING_COMMENT),
                withText(Data_Claim.CANCEL_EDIT_COMMENT),
                withContentDescription(Data_Claim.CANCEL_EDIT_COMMENT_DESCRIPTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @Step("test-case #7 метод проверки видимости и содержания ОТРЕДАКТИРОВАННОГО Comment в раскрытой Claim")
    public void checkEditingComment_7_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_7),
                withParent(withParent(withId(R.id.claim_comments_list_recycler_view))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_7)));
    }

    @Step("метод проверки видимости и содержания Author в раскрытой Claim")
    public void checkAuthor_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_AUTHOR_CARD),
                withText(Data_Claim.AUTHOR_TEXT_CARD),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.AUTHOR_TEXT_CARD)));
        onView(allOf(withId(Elements_Claim.ID_AUTHOR_VALUE_CARD),
                withText(Data_Claim.AUTHOR_VALUE_CARD),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.AUTHOR_VALUE_CARD)));
    }

    @Step("в раскрытой карточке CLAIM проверяем что строка \"AddComment\"  отображается и кнопка AddComment отображается")
    public void checkAddComment_Visibility() {
        onView(allOf(withText(Data_Claim.ADD_COMMENT_TEXT_CARD),
                withParent(withParent(withId(Elements_Claim.ID_ADD_COMMENT_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.ADD_COMMENT_TEXT_CARD)));
        onView(allOf(withId(Elements_Claim.ID_ADD_COMMENT_BUTTON_CARD),
                withContentDescription(Data_Claim.ADD_COMMENT_BUTTON_TEXT_CARD),
                withParent(withParent(withId(Elements_Claim.ID_ADD_COMMENT_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_Claim.ADD_COMMENT_BUTTON_TEXT_CARD)));
    }

    @Step("в раскрытой карточке CLAIM проверяем что кнопка Edit comment отображается")
    public void checkButtonEditComment_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_COMMENT_BUTTON_EDIT),
                withContentDescription(Data_Claim.EDIT_COMMENT_BUTTON_TEXT_CARD),
                withParent(withParent(withId(Elements_Claim.ID_LIST_COMMENT_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.EDIT_COMMENT_BUTTON_TEXT_CARD)));
    }

    @Step("в раскрытой карточке CLAIM проверяем что кнопка Edit (Редактировать CLAIM) отображается")
    public void checkIconEditCard_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_EDIT_CARD_BUTTON_CARD),
                withContentDescription(Data_Claim.EDIT_CARD_BUTTON_TEXT_CARD),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_Claim.EDIT_CARD_BUTTON_TEXT_CARD)));
    }

    @Step("в раскрытой карточке CLAIM проверяем что кнопка Edit (Редактировать CLAIM) в статусе Disable")
    public void checkIconEditCard_Disable() {
        new Utils_Claims().clickEditClaim();
        new CheckUtils_Claims().checkTitleViewEditingClaims_NotVisibility();
    }

    @Step("в раскрытой карточке CLAIM проверяем что кнопка CHANGE STATUS (изменить статус CLAIM) отображается")
    public void checkButtonChangeStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_STATUS_ICON_CARD),
                withContentDescription(Data_Claim.CHANGE_STATUS_TEXT_CARD),
                childAtPosition(
                        childAtPosition(
                                withClassName(is("com.google.android.material.card.MaterialCardView")),
                                0),
                        24),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @Step("в модальном окне CHANGE STATUS (в статусе Open) проверяем что статус-опция TAKE TO WORK отображается")
    public void checkButtonTakeToWorkStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_TAKE_TO_WORK_CARD),
                withText(Data_Claim.CHANGE_TAKE_TO_WORK_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CHANGE_TAKE_TO_WORK_TEXT_CARD)));
    }

    @Step("в модальном окне CHANGE STATUS (в статусе Open) проверяем что статус-опция CANCEL отображается")
    public void checkButtonCancelStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_CANCEL_CARD),
                withText(Data_Claim.CHANGE_CANCEL_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CHANGE_CANCEL_TEXT_CARD)));
    }

    @Step("в модальном окне CHANGE STATUS (в статусе In Progress) проверяем что статус-опция THROW OFF отображается")
    public void checkButtonThrowOffStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_THROW_OFF_CARD),
                withText(Data_Claim.CHANGE_THROW_OFF_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CHANGE_THROW_OFF_TEXT_CARD)));
    }

    @Step("в модальном окне CHANGE STATUS (в статусе In Progress) проверяем что статус-опция TO EXECUTE отображается")
    public void checkButtonToExecuteStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_TO_EXECUTE_CARD),
                withText(Data_Claim.CHANGE_TO_EXECUTE_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CHANGE_TO_EXECUTE_TEXT_CARD)));
    }

    @Step("проверка состояния иконки CHANGE STATUS, что она Enable (true) / используем все статусы throw off, to execute, take to work, Cancel")
    public boolean checkEnableStateButtonChangeStatus() {
        ViewInteraction change = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_STATUS_ICON_CARD),
                        withContentDescription(Data_Claim.CHANGE_STATUS_TEXT_CARD),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                24),
                        isDisplayed()));
        change.perform(click());

        ViewInteraction throwOff = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_THROW_OFF_CARD),
                        withText(Data_Claim.CHANGE_THROW_OFF_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        ViewInteraction execute = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_TAKE_TO_WORK_CARD),
                        withText(Data_Claim.CHANGE_TO_EXECUTE_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        ViewInteraction takeToWork = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_TAKE_TO_WORK_CARD),
                        withText(Data_Claim.CHANGE_TAKE_TO_WORK_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        ViewInteraction cancel = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_CANCEL_CARD),
                        withText(Data_Claim.CHANGE_CANCEL_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        try {
            throwOff.check(matches(isDisplayed()));
            return true;
        } catch (NoMatchingViewException e) {
            try {
                execute.check(matches(isDisplayed()));
                return true;
            } catch (NoMatchingViewException ex) {
                try {
                    takeToWork.check(matches(isDisplayed()));
                    return true;
                } catch (NoMatchingViewException exx) {
                    try {
                        cancel.check(matches(isDisplayed()));
                        return true;
                    } catch (NoMatchingViewException exxx) {
                        return false;
                    }
                }
            }
        }
    }

    @Step("проверка состояния иконки CHANGE STATUS, что она Disable / используем все статусы throw off, to execute, take to work, Cancel")
    public boolean checkDisableStateButtonChangeStatus() {
        ViewInteraction change = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_STATUS_ICON_CARD),
                        withContentDescription(Data_Claim.CHANGE_STATUS_TEXT_CARD),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                24),
                        isDisplayed()));
        change.perform(click());

        ViewInteraction throwOff = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_THROW_OFF_CARD),
                        withText(Data_Claim.CHANGE_THROW_OFF_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        ViewInteraction execute = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_TAKE_TO_WORK_CARD),
                        withText(Data_Claim.CHANGE_TO_EXECUTE_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        ViewInteraction takeToWork = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_TAKE_TO_WORK_CARD),
                        withText(Data_Claim.CHANGE_TAKE_TO_WORK_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        ViewInteraction cancel = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_CANCEL_CARD),
                        withText(Data_Claim.CHANGE_CANCEL_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        try {
            throwOff.check(matches(isDisplayed()));
            return false;                           // Если "throwOff" видима, вернуть false
        } catch (NoMatchingViewException e) {
            try {
                execute.check(matches(isDisplayed()));
                return false;                       // Если "execute" видима, вернуть false
            } catch (NoMatchingViewException ex) {
                try {
                    takeToWork.check(matches(isDisplayed()));
                    return false;                   // Если "takeToWork" видима, вернуть false
                } catch (NoMatchingViewException exx) {
                    try {
                        cancel.check(matches(isDisplayed()));
                        return false;               // Если "cancel" видима, вернуть false
                    } catch (NoMatchingViewException exxx) {
                        return true;                // Если ни одна из кнопок не видима, вернуть true (состояние "Disable")
                    }
                }
            }
        }
    }
}



