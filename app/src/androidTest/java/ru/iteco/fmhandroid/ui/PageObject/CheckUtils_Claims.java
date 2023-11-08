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

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Claim;
import ru.iteco.fmhandroid.ui.testData.Data_Claim;

public class CheckUtils_Claims {
    // экран CLAIMS
    @DisplayName("экран CLAIM / проверка Title на экране")
    public void checkTitleClaims_Visibility() {
        ViewInteraction title = onView(allOf(withText(Data_Claim.TITLE_CLAIMS_TEXT),
                withParent(withParent(withId(Elements_Claim.ID_TITLE_CLAIMS))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_CLAIMS_TEXT)));
    }

    @DisplayName("проверка статуса OPEN в открытой краточке CLAIM")
    public void checkOpenStatusInCard() {
        onView(allOf(withId(R.id.status_label_text_view),
                withText(Data_Claim.OPEN_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class)))
                ))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.OPEN_STATUS_TEXT)));;
    }
    @DisplayName("проверка статуса IN PROGRESS в открытой краточке CLAIM")
    public void checkInProgressStatusInCard() {
        onView(allOf(withId(R.id.status_label_text_view),
                withText(Data_Claim.IN_PROGRESS_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.IN_PROGRESS_STATUS_TEXT)));;

    }
    @DisplayName("проверка статуса EXECUTED в открытой краточке CLAIM")
    public void checkExecutedStatus() {
//        new UtilsHelper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(R.id.status_label_text_view),
                withText(Data_Claim.EXECUTED_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.EXECUTED_STATUS_TEXT)));
    }
    @DisplayName("проверка статуса CANCELED в открытой краточке CLAIM")
    public void checkCanceledStatus() {
//        new UtilsHelper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(R.id.status_label_text_view),
                withText(Data_Claim.CANCELED_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CANCELED_STATUS_TEXT)));
    }
    @DisplayName("проверка кнопки Close в открытой карточке Claim")
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
    @DisplayName("экран Creating Claim / проверка TITLE экрана")
    public void checkTitleAppBar() {
//        new DataHelper().waitAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_TITLE_APP_BAR),
                withText(Data_Claim.APP_BAR_CREATING_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.APP_BAR_CREATING_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_TITLE_APP_BAR),
                withText(Data_Claim.APP_BAR_CLAIMS_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.APP_BAR_CLAIMS_TEXT)));
    }
    @DisplayName("экран Creating Claim / проверка видимости поля Title для ввода тестовых данных")
    public void checkFieldTitle_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @DisplayName("экран Creating Claim / проверка видимости введенных тестовых данных в поле Title")
    public void checkTestDataTitle_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE),
                withText(Data_Claim.INPUT_TITLE_7),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_TITLE_7)));
    }
    @DisplayName("экран Creating Claim / проверка видимости поля Executor для ввода тестовых данных")
    public void checkFieldExecutor_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_EXECUTOR),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }
    @DisplayName("экран Creating Claim / проверка видимости введенных тестовых данных в поле Executor")
    public void checkTestDataExecutor_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_EXECUTOR),
                withText(Data_Claim.INPUT_EXECUTOR_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_EXECUTOR_TEXT)));
    }
    @DisplayName("экран Creating Claim / проверка видимости поля Date для ввода тестовых данных")
    public void checkFieldDate_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DATE),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }
    @DisplayName("экран Creating Claim / проверка видимости введенных тестовых данных в поле Date")
    public void checkTestDataDate_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DATE),
                withText(Data_Claim.INPUT_DATE),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DATE)));
    }
    @DisplayName("экран Creating Claim / проверка видимости поля Time для ввода тестовых данных")
    public void checkFieldTime_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TIME),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }
    @DisplayName("экран Creating Claim / проверка видимости введенных тестовых данных в поле Time")
    public void checkTestDataTime_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TIME),
                withText(Data_Claim.INPUT_TIME),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_TIME)));
    }
    @DisplayName("экран Creating Claim / проверка видимости поля Description для ввода тестовых данных")
    public void checkFieldDescription_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }
    @DisplayName("экран Creating Claim / проверка видимости введенных тестовых данных в поле Description")
    public void checkTestDataDescription_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION),
                withText(Data_Claim.INPUT_DESCRIPTION_7),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DESCRIPTION_7)));
    }

    @DisplayName("экран Creating Claim / проверка видимости кнопки SAVE")
    public void checkButtonSave_Visibility() {
//        new DataHelper().waitAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_SAVE_CREATING_Claims),
                withText(Data_Claim.SAVE_CREATING_CLAIMS),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.SAVE_CREATING_CLAIMS)));
    }
    @DisplayName("экран Creating Claim / проверка видимости кнопки CANCEL")
    public void checkButtonCancel_Visibility() {
//        new DataHelper().waitAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_CANCEL_CREATING_Claims),
                withText(Data_Claim.CANCEL_BUTTON_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CANCEL_BUTTON_TEXT)));
    }

    // НАБОР МЕТОДОВ для проверки Title во всех test-case:
    @DisplayName("экран Creating Claim / test-case #7 / проверка заполненного тестовыми данными поля Title")
    public void checkTitle_7_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_TEXT)));

//        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
//                withText(Data_Claim.INPUT_TITLE_7),
//                isDisplayed()))
//                .check(matches(isDisplayed()))
//                .check(matches(withText(Data_Claim.INPUT_TITLE_7)));

        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.FAKE_TITLE),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.FAKE_TITLE)));
    }
    @DisplayName("экран Creating Claim / test-case #8 / проверка заполненного тестовыми данными поля Title")
    public void checkTitle_8_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.INPUT_TITLE_8),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_TITLE_8)));
    }
    @DisplayName("экран Creating Claim / test-case #9 / проверка заполненного тестовыми данными поля Title")
    public void checkTitle_9_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.INPUT_TITLE_9),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_TITLE_9)));
    }

    @DisplayName("экран Creating Claim / test-case #10 / проверка заполненного тестовыми данными поля Title")
    public void checkTitle_10_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.INPUT_TITLE_10),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_TITLE_10)));
    }

    @DisplayName("экран Creating Claim / test-case #11 / проверка заполненного тестовыми данными поля Title")
    public void checkTitle_11_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.INPUT_TITLE_11),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_TITLE_11)));
    }

    @DisplayName("экран Creating Claim / test-case #12 / проверка заполненного тестовыми данными поля Title")
    public void checkTitle_12_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.INPUT_TITLE_12),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_TITLE_12)));
    }

    @DisplayName("экран Creating Claim / test-case #13 / проверка заполненного тестовыми данными поля Title")
    public void checkTitle_13_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.TITLE_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.INPUT_TITLE_7),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_TITLE_7)));
    }
    @DisplayName("в раскрытой карточке проверяем что Executor и что видимо его содержание NOT ASSIGNED")
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
    @DisplayName("в раскрытой карточке проверяем что Executor и что видимо его содержание Ivanov Ivan Ivanovich")
    public void checkDefinedExecutor_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_EXECUTOR_CARD),
                withText(Data_Claim.EXECUTOR_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.EXECUTOR_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_EXECUTOR_VALUE_CARD),
                withText(Data_Claim.INPUT_EXECUTOR_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_EXECUTOR_TEXT)));
    }
    @DisplayName("в раскрытой карточке проверяем что Plan Date видим и что видимы значения Date и Time")
    public void checkValidPlanDate_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_CARD),
                withText(Data_Claim.PLAN_DATE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.PLAN_DATE_TEXT)));

        ViewInteraction date = onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_IN_CARD),
                withText(Data_Claim.INPUT_DATE),
                isDisplayed()));
        new Utils_Helper().timerWaitingAsyncOperation1000();
        date.check(matches(isDisplayed())).check(matches(withText(Data_Claim.INPUT_DATE)));

        onView(allOf(withId(Elements_Claim.ID_PLAN_TIME_IN_CARD),
                withText(Data_Claim.INPUT_TIME),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_TIME)));

//        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_VALUE_DATE_CARD),
//                withText("11.10.2023"),
//                isDisplayed()))
//                .check(matches(isDisplayed()))
//                .check(matches(withText("11.10.2023")));
//        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_VALUE_TIME_CARD),
//                withText("09:36"),
//                isDisplayed()))
//                .check(matches(isDisplayed()))
//                .check(matches(withText("09:36")));
    }
    @DisplayName("в раскрытой карточке проверяем что Invalid Plan Date отображается и что видимы значения Invalid Date и Invalid Time")
    public void checkInvalidPlanDate_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_CARD),
                withText(Data_Claim.PLAN_DATE_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.PLAN_DATE_TEXT)));
        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_VALUE_DATE_CARD),
                withText(Data_Claim.INV_PLAN_DATE_DATE),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INV_PLAN_DATE_DATE)));
        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_VALUE_TIME_CARD),
                withText(Data_Claim.PLAN_DATE_VALUE_TIME),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.PLAN_DATE_VALUE_TIME)));
    }

    // НАБОР МЕТОДОВ для проверки Description во всех test-case:
    @DisplayName("test-case #7 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_7_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_7),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DESCRIPTION_7)));

//        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
//                withText("Тестовое описание 11.10.2023 22:36"),
//                isDisplayed()))
//                .check(matches(isDisplayed()))
//                .check(matches(withText("Тестовое описание 11.10.2023 22:36")));
    }
    @DisplayName("test-case #8 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_8_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_8),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DESCRIPTION_8)));
    }

    @DisplayName("test-case #9 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_9_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_9),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DESCRIPTION_9)));
    }

    @DisplayName("test-case #11 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_11_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_11),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DESCRIPTION_11)));
    }

    @DisplayName("test-case #12 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_12_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_12),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DESCRIPTION_12)));
    }

    @DisplayName("test-case #13 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_13_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_13),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.INPUT_DESCRIPTION_13)));
    }

    @DisplayName("в раскрытой карточке проверяем что строка Created для Description отображается")
    public void checkCreatedDescription_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CREATED_DESCRIPTION_CARD),
                withText(Data_Claim.CREATED_TEXT),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CREATED_TEXT)));
    }

    @DisplayName("в раскрытой карточке проверяем что поле Comment НЕ отображается")
    public void checkFieldComment_NotVisibility() {
//        onView(allOf(withId(Elements_Claim.ID_COMMENT_VALUE_CARD),
//                withParent(withParent(withId(R.id.claim_comments_list_recycler_view))),
//                not(isDisplayed())));
//                .check(matches(not(isDisplayed())));
        onView(withText(COMMENT_CONTENT_CARD_7))
                .check(doesNotExist());
    }

    @DisplayName("в раскрытой карточке проверяем что поле Comment заполнено тестовыми данными")
    public void checkComment_Visibility_7() {
        onView(allOf(withId(Elements_Claim.ID_COMMENT_VALUE_CARD), withText(COMMENT_CONTENT_CARD_7),
                withParent(withParent(withId(R.id.claim_comments_list_recycler_view))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }

    @DisplayName("в раскрытой карточке проверяем что после редактирования поле Comment заполнено тестовыми данными")
    public void checkEditComment_Visibility_7() {
        onView(allOf(withId(Elements_Claim.ID_COMMENT_VALUE_CARD), withText(COMMENT_CONTENT_CARD_7),
                withParent(withParent(withId(R.id.claim_comments_list_recycler_view))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }




    // набор методов для Negative tests на экране Creating Claims
    @DisplayName("экран CREATING CLAIMS / проверяем модальное окно WARNING, что оно отображается и что отображается текст")
    public void checkModalViewWarningText_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_MODAL_VIEWS),
                withText(Data_Claim.MODAL_VIEW_OK),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.MODAL_VIEW_WARNING)));
    }
    @DisplayName("экран CREATING CLAIMS / проверяем модальное окно WARNING, что в нем отображается кнопка OK")
    public void checkModalViewWarningButtonOk_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_OK_MODAL_VIEWS),
                withText(Data_Claim.MODAL_VIEW_OK),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.MODAL_VIEW_OK)));
    }
    @DisplayName("экран CREATING CLAIMS / проверяем модальное окно QUESTION, что оно отображается и что отображается текст")
    public void checkModalViewQuestionText_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_MODAL_VIEWS),
                withText(Data_Claim.MODAL_VIEW_QUESTION),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.MODAL_VIEW_QUESTION)));
    }
    @DisplayName("экран CREATING CLAIMS / проверяем модальное окно QUESTION, что в нем отображается кнопка OK")
    public void checkModalViewQuestionButtonOk_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_OK_MODAL_VIEWS),
                withText(Data_Claim.MODAL_VIEW_OK),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.MODAL_VIEW_OK)));
    }
    @DisplayName("экран CREATING CLAIMS / проверяем модальное окно QUESTION, что в нем отображается кнопка CANCEL")
    public void checkModalViewQuestionButtonCancel_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CANCEL_MODAL_VIEWS),
                withText(Data_Claim.MODAL_VIEW_CANCEL),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.MODAL_VIEW_CANCEL)));
    }

    // проверить этот метод. Объединяет обе проверки. Что именно в этом поле отображается иконка
    // изменить все остальные методы, если этот будет работать
    @DisplayName("экран CREATING CLAIMS / проверка отображения иконки-предупреждения о пустом поле")
    public void checkIconEmptyField_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_ICON_EMPTY_FIELD),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()));
    }



//    @DisplayName("экран CREATING CLAIMS / проверка отображения иконки-предупреждения о пустом поле TITLE")
//    public void checkIconEmptyTitle_Visibility() {
//        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE),
//                isDisplayed()));
//        ViewInteraction icon = onView(
//                allOf(withId(Elements_Claim.ID_ICON_EMPTY_FIELD),
//                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
//                        isDisplayed()));
//        icon.check(matches(isDisplayed()));
//    }
//
//    @DisplayName("экран CREATING CLAIMS / проверка отображения иконки-предупреждения о пустом поле DATE")
//    public void checkIconEmptyDate_Visibility() {
//        onView(allOf(withId(Elements_Claim.ID_FIELD_DATE),
//                isDisplayed()));
//        ViewInteraction icon = onView(
//                allOf(withId(Elements_Claim.ID_ICON_EMPTY_FIELD),
//                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
//                        isDisplayed()));
//        icon.check(matches(isDisplayed()));
//    }

//    @DisplayName("экран CREATING CLAIMS / проверка отображения иконки-предупреждения о пустом поле TIME")
//    public void checkIconEmptyTime_Visibility() {
//        onView(allOf(withId(Elements_Claim.ID_FIELD_TIME),
//                isDisplayed()));
//        ViewInteraction icon = onView(
//                allOf(withId(Elements_Claim.ID_ICON_EMPTY_FIELD),
//                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
//                        isDisplayed()));
//        icon.check(matches(isDisplayed()));
//    }
//
//    @DisplayName("экран CREATING CLAIMS / проверка отображения иконки-предупреждения о пустом поле DESCRIPTION")
//    public void checkIconEmptyDescription_Visibility() {
//        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION),
//                isDisplayed()));
//        ViewInteraction icon = onView(
//                allOf(withId(Elements_Claim.ID_ICON_EMPTY_FIELD),
//                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
//                        isDisplayed()));
//        icon.check(matches(isDisplayed()));
//    }




    // EDITING CLAIMS / COMMENT
    // НАБОР МЕТОДОВ проверок содержания созданных / редактированных полей COMMENT:
    // в раскрытой карточке проверяем что содержание Comment  отображается
    @DisplayName("проверяем, что кнопка SAVE на экране создания COMMENT отображается")
    public void checkButtonSaveComment() {
//        onView(allOf(withId(Elements_Claim.ID_SAVE_COMMENT),
//                withText(Data_Claim.BUTTON_SAVE_COMMENT),
//                withContentDescription(Data_Claim.BUTTON_SAVE_COMMENT_DESCRIPTION),
//                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
//                isDisplayed()))
//                .check(matches(isDisplayed()))
//                .check(matches(withText(Data_Claim.BUTTON_SAVE_COMMENT)))
//                .check(matches(withContentDescription(Data_Claim.BUTTON_SAVE_COMMENT_DESCRIPTION)));
        ViewInteraction button = onView(
                allOf(withId(R.id.save_button), withText("SAVE"), withContentDescription("Save"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
        button.check(matches(isDisplayed()));

    }
    @DisplayName("проверяем, что кнопка CANCEL на экране создания COMMENT отображается")
    public void checkButtonCancelComment() {
//        onView(allOf(withId(Elements_Claim.ID_CANCEL_COMMENT),
//                withText(Data_Claim.BUTTON_CANCEL_COMMENT),
//                withContentDescription(Data_Claim.BUTTON_CANCEL_COMMENT_DESCRIPTION),
//                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
//                isDisplayed()))
//                .check(matches(isDisplayed()))
//                .check(matches(withText(Data_Claim.BUTTON_CANCEL_COMMENT)))
//                .check(matches(withContentDescription(Data_Claim.BUTTON_CANCEL_COMMENT_DESCRIPTION)));
        ViewInteraction button2 = onView(
                allOf(withId(R.id.cancel_button), withText("CANCEL"), withContentDescription("Cancel"),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));
    }
    @DisplayName("экран Edit comment / test-case #7 / метод проверки отображения пустого поля COMMENT")
    public void checkFieldComment_Visibility() {
        onView(allOf(withHint(Data_Claim.FIELD_COMMENT),
                withParent(withParent(withId(Elements_Claim.ID_INPUT_COMMENT))),
                        isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_Claim.FIELD_COMMENT)));
    }


    @DisplayName("экран Edit comment / test-case #7 / метод проверки что содержание COMMENT отображается")
    public void checkComment_7_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withHint(Data_Claim.COMMENT_CONTENT_CARD_7),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_Claim.COMMENT_CONTENT_CARD_7)));
    }

    // родительский метод, который используем для дальнейших проверок и кликов внутри комментария
    public  ViewInteraction checkInsideComment_Visibility(String commentContent) {
        // test-case #9
//        String commentContent = ClaimData.COMMENT_CONTENT_CARD_3;
        return onView(allOf(
                withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(commentContent),
                isDisplayed()));
    }

    // набор методов проверки видимости и содержания Comment в раскрытой Claim
    @DisplayName("test-case #7 метод проверки видимости и содержания ОТРЕДАКТИРОВАННОГО Comment в раскрытой Claim")
    public void checkEditingComment_7_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_7),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_7)));
    }

//    @DisplayName("test-case #10 метод проверки видимости и содержания Comment в раскрытой Claim")
//    public void checkComment_10_Visibility() {
//        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
//                withText(Data_Claim.COMMENT_CONTENT_CARD_10),
//                isDisplayed()))
//                .check(matches(isDisplayed()))
//                .check(matches(withText(Data_Claim.COMMENT_CONTENT_CARD_10)));
//    }

    @DisplayName("test-case #11 метод проверки видимости и содержания Comment в раскрытой Claim")
    public void checkComment_11_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_CARD_11),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.COMMENT_CONTENT_CARD_11)));
    }

    @DisplayName("test-case #12 метод проверки видимости и содержания Comment в раскрытой Claim")
    public void checkComment_12_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_CARD_12),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.COMMENT_CONTENT_CARD_12)));
    }

    @DisplayName("test-case #13 метод проверки видимости и содержания Comment в раскрытой Claim")
    public void checkComment_13_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_CARD_13),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.COMMENT_CONTENT_CARD_13)));
    }
    @DisplayName("test-case #9 метод проверки что Comment в раскрытой Claim НЕвидим")
    public void checkComment_9_NotVisibility() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(COMMENT_CONTENT_CARD_7)))
                .check(matches(not(isDisplayed())));
    }
    @DisplayName("метод проверки видимости и содержания Author в раскрытой Claim")
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
    @DisplayName("в раскрытой карточке CLAIM проверяем что строка \"AddComment\"  отображается и кнопка AddComment отображается")
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

  // на всякий случай конструкция проверки содержания comment
//    // test-case #9
//    public void checkContentComment_Visibility_3() {
//        ViewInteraction edit = onView(
//                allOf(withId(ClaimElements.ID_CONTENT_COMMENT), withContentDescription(ClaimData.COMMENT_CONTENT_CARD_3),
//                        withParent(withParent(withId(ClaimElements.ID_LIST_COMMENT_CARD))),
//                        isDisplayed()));
//        edit.check(matches(isDisplayed()));
//    }
    @DisplayName("в раскрытой карточке CLAIM проверяем что кнопка Edit comment отображается")
    public void checkButtonEditComment_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_COMMENT_BUTTON_EDIT),
                withContentDescription(Data_Claim.EDIT_COMMENT_BUTTON_TEXT_CARD),
                withParent(withParent(withId(Elements_Claim.ID_LIST_COMMENT_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.EDIT_COMMENT_BUTTON_TEXT_CARD)));
    }
    @DisplayName("в раскрытой карточке CLAIM проверяем что кнопка Edit (Редактировать CLAIM) отображается")
    public void checkIconEditCard_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_EDIT_CARD_BUTTON_CARD),
                withContentDescription(Data_Claim.EDIT_CARD_BUTTON_TEXT_CARD),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withContentDescription(Data_Claim.EDIT_CARD_BUTTON_TEXT_CARD)));
    }

    @DisplayName("в раскрытой карточке CLAIM проверяем что кнопка Edit (Редактировать CLAIM) отображается")
    public void checkIconEditCard_NotVisibility() {
        onView(allOf(withId(Elements_Claim.ID_EDIT_CARD_BUTTON_CARD),
                withContentDescription(Data_Claim.EDIT_CARD_BUTTON_TEXT_CARD),
                isDisplayed()))
                .check(matches(not(isDisplayed())));
    }

    @DisplayName("в раскрытой карточке CLAIM проверяем что кнопка CHANGE STATUS (изменить статус CLAIM) отображается")
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
//                .check(matches(withContentDescription(Data_Claim.CHANGE_STATUS_TEXT_CARD)));
    }

    @DisplayName("в модальном окне CHANGE STATUS (в статусе Open) проверяем что статус-опция TAKE TO WORK отображается")
    public void checkButtonTakeToWorkStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_TAKE_TO_WORK_CARD),
                withText(Data_Claim.CHANGE_TAKE_TO_WORK_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CHANGE_TAKE_TO_WORK_TEXT_CARD)));
    }

    @DisplayName("в модальном окне CHANGE STATUS (в статусе Open) проверяем что статус-опция CANCEL отображается")
    public void checkButtonCancelStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_CANCEL_CARD),
                withText(Data_Claim.CHANGE_CANCEL_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CHANGE_CANCEL_TEXT_CARD)));
    }

    @DisplayName("в модальном окне CHANGE STATUS (в статусе In Progress) проверяем что статус-опция THROW OFF отображается")
    public void checkButtonThrowOffStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_THROW_OFF_CARD),
                withText(Data_Claim.CHANGE_THROW_OFF_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CHANGE_THROW_OFF_TEXT_CARD)));
    }

    @DisplayName("в модальном окне CHANGE STATUS (в статусе In Progress) проверяем что статус-опция TO EXECUTE отображается")
    public void checkButtonToExecuteStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_TO_EXECUTE_CARD),
                withText(Data_Claim.CHANGE_TO_EXECUTE_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Claim.CHANGE_TO_EXECUTE_TEXT_CARD)));
    }

    @DisplayName("проверка состояния иконки CHANGE STATUS, что она Enable (true) / используем все статусы throw off, to execute, take to work, Cancel")
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

    @DisplayName("проверка состояния иконки CHANGE STATUS, что она Disable / используем все статусы throw off, to execute, take to work, Cancel")
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



