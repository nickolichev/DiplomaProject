package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static ru.iteco.fmhandroid.ui.PageObject.Utils_Helper.childAtPosition;
import static ru.iteco.fmhandroid.ui.testData.Data_Claim.COMMENT_CONTENT_CARD_3;

import android.view.View;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewInteraction;

import org.hamcrest.core.IsInstanceOf;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Claim;
import ru.iteco.fmhandroid.ui.testData.Data_Claim;

public class CheckUtils_Claims {
    Utils_Helper utilsHelper = new Utils_Helper();
    Utils_Auth utilsAuth = new Utils_Auth();
    Utils_Menu utilsMenu = new Utils_Menu();
//    CheckUtils_Claims checkUtilsClaims = new CheckUtils_Claims();
    Utils_Claims utilsClaims = new Utils_Claims();
//    @Rule
//    public ActivityTestRule<AppActivity> mActivityRule = new ActivityTestRule<>(AppActivity.class);
//    public ActivityTestRule<AppActivity> mActivityScenarioRule =
//            new ActivityTestRule<>(AppActivity.class);
//    CardIdlingResource cardIdlingResource = new CardIdlingResource();

//    @Before
//    public void registerIdlingResources() {
//        cardIdlingResource = new CardIdlingResource();
//        IdlingRegistry.getInstance().register(ProjectIdlingResources.idlingResource);
//
//        try {
//            new AuthUtils().titleCheck();
//        } catch (NoMatchingViewException e) {
//            new AuthUtils().logOut();
//        }
//    }
//
//    @After
//    public void unregisterIdlingResources() {
//        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
//    }

    // ГРУППА СВОДНЫХ МЕТОДОВ:
    //


    // экран CLAIMS
    @DisplayName("проверка Title в НЕраскрытой карточке CLAIM")
    public void checkTitleClaims_Visibility() {
        ViewInteraction title = onView(allOf(withText(Data_Claim.TITLE_CLAIMS_TEXT),
                withParent(withParent(withId(Elements_Claim.ID_TITLE_CLAIMS))),
                isDisplayed()));
        title.check(matches(withText(Data_Claim.TITLE_CLAIMS_TEXT)));
    }

    @DisplayName("проверка статуса OPEN в открытой краточке CLAIM")
    public void checkOpenStatusInCard() {
//        new UtilsHelper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_LIST_CARD),
                withText(Data_Claim.OPEN_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()));
    }
    @DisplayName("проверка статуса IN PROGRESS в открытой краточке CLAIM")
    public void checkInProgressStatusInCard() {
//        new UtilsHelper().timerWaitingAsyncOperation1000();
//            ViewInteraction textView3 =
//                    onView(
//                    allOf(withId(R.id.status_label_text_view), withText("In progress"),
//                            withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
//                            isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_LIST_CARD),
                withText(Data_Claim.IN_PROGRESS_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()));

    }
    @DisplayName("проверка статуса EXECUTED в открытой краточке CLAIM")
    public void checkExecutedStatus() {
//        new UtilsHelper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_STATUS_CARD),
                withText(Data_Claim.EXECUTED_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()));
    }
    @DisplayName("проверка статуса CANCELED в открытой краточке CLAIM")
    public void checkCanceledStatus() {
//        new UtilsHelper().timerWaitingAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_STATUS_CARD),
                withText(Data_Claim.CANCELED_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()));
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
                        isDisplayed()));
//        appCompatImageButton3.perform(click());
    }
    @DisplayName("проверка текста TITLE на странице Creating Claim")
    public void checkTitleAppBar() {
//        new DataHelper().waitAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_TITLE_APP_BAR),
                withText(Data_Claim.APP_BAR_CREATING_TEXT),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_TITLE_APP_BAR),
                withText(Data_Claim.APP_BAR_CLAIMS_TEXT),
                isDisplayed()));
    }
    @DisplayName("проверка видимости поля Title для ввода тестовых данных на странице Creating Claim")
    public void checkFieldTitle_Visibility() {
//        new DataHelper().waitAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE),
                isDisplayed()));
    }
    @DisplayName("проверка видимости поля Executor для ввода тестовых данных на странице Creating Claim")
    public void checkFieldExecutor_Visibility() {
//        new DataHelper().waitAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_FIELD_EXECUTOR),
                isDisplayed()));
    }
    @DisplayName("проверка видимости поля Date для ввода тестовых данных на странице Creating Claim")
    public void checkFieldDate_Visibility() {
//        new DataHelper().waitAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_FIELD_DATE),
                isDisplayed()));
    }
    @DisplayName("проверка видимости поля Time для ввода тестовых данных на странице Creating Claim")
    public void checkFieldTime_Visibility() {
//        new DataHelper().waitAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_FIELD_TIME),
                isDisplayed()));
    }
    @DisplayName("проверка видимости поля Description для ввода тестовых данных на странице Creating Claim")
    public void checkFieldDescription_Visibility() {
//        new DataHelper().waitAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION),
                isDisplayed()));
    }
    @DisplayName("проверка видимости кнопки SAVE на странице Creating Claim")
    public void checkButtonSave_Visibility() {
//        new DataHelper().waitAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_SAVE_CREATING_Claims),
                isDisplayed()));
    }
    @DisplayName("проверка видимости кнопки CANCEL на странице Creating Claim")
    public void checkButtonCancel_Visibility() {
//        new DataHelper().waitAsyncOperation1000();
        onView(allOf(withId(Elements_Claim.ID_CANCEL_CREATING_Claims),
                isDisplayed()));
    }

    // НАБОР МЕТОДОВ для проверки Title во всех test-case:
    @DisplayName("test-case #7 проверка заполненного тестовыми данными поля Title на странице Creating Claim")
    public void checkTitle_1_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()));

        // заменить FAKE_TITLE на валидную (после отладки всех методов теста)
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.FAKE_TITLE),
                isDisplayed()));
    }
    @DisplayName("test-case #8 проверка заполненного тестовыми данными поля Title на странице Creating Claim")
    public void checkTitle_2_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.INPUT_TITLE_2),
                isDisplayed()));
    }
    @DisplayName("test-case #9 проверка заполненного тестовыми данными поля Title на странице Creating Claim")
    public void checkTitle_3_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.INPUT_TITLE_3),
                isDisplayed()));
    }

    @DisplayName("test-case #10 проверка заполненного тестовыми данными поля Title на странице Creating Claim")
    public void checkTitle_4_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.INPUT_TITLE_4),
                isDisplayed()));
    }

    @DisplayName("test-case #11 проверка заполненного тестовыми данными поля Title на странице Creating Claim")
    public void checkTitle_5_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.INPUT_TITLE_5),
                isDisplayed()));
    }

    @DisplayName("test-case #12 проверка заполненного тестовыми данными поля Title на странице Creating Claim")
    public void checkTitle_6_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.INPUT_TITLE_6),
                isDisplayed()));
    }

    @DisplayName("test-case #13 проверка заполненного тестовыми данными поля Title на странице Creating Claim")
    public void checkTitle_7_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_TITLE_CARD),
                withText(Data_Claim.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_TITLE_VALUE_CARD),
                withText(Data_Claim.INPUT_TITLE_7),
                isDisplayed()));
    }
    @DisplayName("в раскрытой карточке проверяем что Executor видим и что видимо его содержание")
    public void checkExecutor_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_EXECUTOR_CARD),
                withText(Data_Claim.EXECUTOR_TEXT),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_EXECUTOR_VALUE_CARD),
                withText(Data_Claim.EXECUTOR_VALUE_OPEN_STATUS),
                isDisplayed()));
    }
    @DisplayName("в раскрытой карточке проверяем что Plan Date видим и что видимо его содержание")
    public void checkValidPlanDate_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_CARD),
                withText(Data_Claim.PLAN_DATE_TEXT),
                isDisplayed()));

        // заменить FAKE_DATE на valid DATE
        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_VALUE_DATE_CARD),
                withText(Data_Claim.FAKE_DATE),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_VALUE_TIME_CARD),
                withText(Data_Claim.INPUT_TIME),
                isDisplayed()));
    }

    @DisplayName("в раскрытой карточке проверяем что Invalid Plan Date отображается и что отображается его содержание")
    public void checkInvalidPlanDate_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_CARD),
                withText(Data_Claim.PLAN_DATE_TEXT),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_VALUE_DATE_CARD),
                withText(Data_Claim.INV_PLAN_DATE_DATE),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_PLAN_DATE_VALUE_TIME_CARD),
                withText(Data_Claim.PLAN_DATE_VALUE_TIME),
                isDisplayed()));
    }


    // НАБОР МЕТОДОВ для проверки Description во всех test-case:

    @DisplayName("test-case #7 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_1_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_1),
                isDisplayed()));
    }
    @DisplayName("test-case #8 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_2_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_2),
                isDisplayed()));
    }

    @DisplayName("test-case #10 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_4_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_4),
                isDisplayed()));
    }

    @DisplayName("test-case #11 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_5_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_5),
                isDisplayed()));
    }

    @DisplayName("test-case #12 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_6_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_6),
                isDisplayed()));
    }

    @DisplayName("test-case #13 в раскрытой карточке проверяем что Description отображается и что отображается его содержание")
    public void checkDescription_7_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_DESCRIPTION_VALUE_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_7),
                isDisplayed()));
    }

    @DisplayName("в раскрытой карточке проверяем что Created Description отображается и что отображается его содержание")
    public void checkCreatedDescription_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CREATED_DESCRIPTION_CARD),
                withText(Data_Claim.INPUT_DESCRIPTION_7),
                isDisplayed()));
    }


    // набор методов для Negative tests на экране Creating Claims

    @DisplayName("экран CREATING CLAIMS / проверяем модальное окно WARNING, что оно отображается и что отображается текст")
    public void checkModalViewWarningText_Visibility() {
        ViewInteraction warning = onView(
                allOf(withId(Elements_Claim.ID_MODAL_VIEWS), withText(Data_Claim.MODAL_VIEW_OK),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                        isDisplayed()));
        warning.check(matches(withText(Data_Claim.MODAL_VIEW_WARNING)));
    }

    @DisplayName("экран CREATING CLAIMS / проверяем модальное окно WARNING, что в нем отображается кнопка OK")
    public void checkModalViewWarningButtonOk_Visibility() {
        ViewInteraction button = onView(
                allOf(withId(Elements_Claim.ID_OK_MODAL_VIEWS), withText(Data_Claim.MODAL_VIEW_OK),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                        isDisplayed()));
        button.check(matches(isDisplayed()));
    }

    @DisplayName("экран CREATING CLAIMS / проверяем модальное окно QUESTION, что оно отображается и что отображается текст")
    public void checkModalViewQuestionText_Visibility() {
        ViewInteraction question = onView(
                allOf(withId(Elements_Claim.ID_MODAL_VIEWS), withText(Data_Claim.MODAL_VIEW_QUESTION),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                        isDisplayed()));
        question.check(matches(withText(Data_Claim.MODAL_VIEW_QUESTION)));
    }

    @DisplayName("экран CREATING CLAIMS / проверяем модальное окно QUESTION, что в нем отображается кнопка OK")
    public void checkModalViewQuestionButtonOk_Visibility() {
        ViewInteraction ok = onView(
                allOf(withId(Elements_Claim.ID_OK_MODAL_VIEWS), withText(Data_Claim.MODAL_VIEW_OK),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                        isDisplayed()));
        ok.check(matches(isDisplayed()));
    }

    @DisplayName("экран CREATING CLAIMS / проверяем модальное окно QUESTION, что в нем отображается кнопка CANCEL")
    public void checkModalViewQuestionButtonCancel_Visibility() {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_Claim.ID_CANCEL_MODAL_VIEWS), withText(Data_Claim.MODAL_VIEW_CANCEL),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                        isDisplayed()));
        cancel.check(matches(isDisplayed()));
    }

    // проверить этот метод. Объединяет обе проверки. Что именно в этом поле отображается иконка
    // изменить все остальные методы, если этот будет работать
    @DisplayName("экран CREATING CLAIMS / проверка отображения иконки-предупреждения о пустом поле TITLE")
    public void checkUnionIconEmptyTitle_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE),
                isDisplayed())).check(matches(hasDescendant(allOf(withId(Elements_Claim.ID_ICON_EMPTY_FIELD),
                withParent(withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))));
    }

    @DisplayName("экран CREATING CLAIMS / проверка отображения иконки-предупреждения о пустом поле TITLE")
    public void checkIconEmptyTitle_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE),
                isDisplayed()));
        ViewInteraction icon = onView(
                allOf(withId(Elements_Claim.ID_ICON_EMPTY_FIELD),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        icon.check(matches(isDisplayed()));
    }

    @DisplayName("экран CREATING CLAIMS / проверка отображения иконки-предупреждения о пустом поле DATE")
    public void checkIconEmptyDate_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DATE),
                isDisplayed()));
        ViewInteraction icon = onView(
                allOf(withId(Elements_Claim.ID_ICON_EMPTY_FIELD),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        icon.check(matches(isDisplayed()));
    }

    @DisplayName("экран CREATING CLAIMS / проверка отображения иконки-предупреждения о пустом поле TIME")
    public void checkIconEmptyTime_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TIME),
                isDisplayed()));
        ViewInteraction icon = onView(
                allOf(withId(Elements_Claim.ID_ICON_EMPTY_FIELD),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        icon.check(matches(isDisplayed()));
    }

    @DisplayName("экран CREATING CLAIMS / проверка отображения иконки-предупреждения о пустом поле DESCRIPTION")
    public void checkIconEmptyDescription_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION),
                isDisplayed()));
        ViewInteraction icon = onView(
                allOf(withId(Elements_Claim.ID_ICON_EMPTY_FIELD),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        icon.check(matches(isDisplayed()));
    }




    // EDITING CLAIMS
    // НАБОР МЕТОДОВ проверок содержания созданных / редактированных полей COMMENT:
    // в раскрытой карточке проверяем что содержание Comment  отображается

    @DisplayName("проверяем, что кнопка SAVE на экране создания COMMENT отображается")
    public void checkButtonSaveComment() {
        ViewInteraction save = onView(
                allOf(withId(Elements_Claim.ID_SAVE_COMMENT),
                        withText(Data_Claim.BUTTON_SAVE_COMMENT),
                        withContentDescription(Data_Claim.BUTTON_SAVE_COMMENT_DESCRIPTION),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
        save.check(matches(isDisplayed()));
    }

    @DisplayName("проверяем, что кнопка CANCEL на экране создания COMMENT отображается")
    public void checkButtonCancelComment() {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_Claim.ID_CANCEL_COMMENT),
                        withText(Data_Claim.BUTTON_CANCEL_COMMENT),
                        withContentDescription(Data_Claim.BUTTON_CANCEL_COMMENT_DESCRIPTION),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
        cancel.check(matches(isDisplayed()));
    }

    @DisplayName("test-case #9 метод идентификации/поиска нужного COMMENT для последующего редактирования в раскрытой карточке CLAIM")
    public void checkCommentContent_Visibility_9() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_CARD_3),
                isDisplayed()));
    }

    // родительский метод, который используем для дальнейших проверок и кликов внутри комментария
    //
    public  ViewInteraction checkInsideCommentContent_Visibility(String commentContent) {
        // test-case #9
//        String commentContent = ClaimData.COMMENT_CONTENT_CARD_3;
        return onView(allOf(
                withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(commentContent),
                isDisplayed()));
    }

    // набор методов проверки видимости и содержания Comment в раскрытой Claim
    @DisplayName("test-case #9 метод проверки видимости и содержания ОТРЕДАКТИРОВАННОГО Comment в раскрытой Claim")
    public void checkEditComment_3_Content_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_3),
                isDisplayed()));
    }

    @DisplayName("test-case #9 метод проверки видимости и содержания Comment в раскрытой Claim")
    public void checkComment_4_Content_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_CARD_4),
                isDisplayed()));
    }

    @DisplayName("test-case #11 метод проверки видимости и содержания Comment в раскрытой Claim")
    public void checkComment_5_Content_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_CARD_5),
                isDisplayed()));
    }

    @DisplayName("test-case #12 метод проверки видимости и содержания Comment в раскрытой Claim")
    public void checkComment_6_Content_Visibility_12() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_CARD_6),
                isDisplayed()));
    }

    @DisplayName("test-case #13 метод проверки видимости и содержания Comment в раскрытой Claim")
    public void checkComment_7_Content_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(Data_Claim.COMMENT_CONTENT_CARD_7),
                isDisplayed()));
    }

    public void checkComment_3_Not_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CONTENT_COMMENT),
                withText(COMMENT_CONTENT_CARD_3)))
                .check(matches(not(isDisplayed())));
    }

    @DisplayName("метод проверки видимости и содержания Author в раскрытой Claim")
    public void checkAuthor_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_AUTHOR_CARD),
                withText(Data_Claim.AUTHOR_TEXT_CARD),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_AUTHOR_VALUE_CARD),
                withText(Data_Claim.AUTHOR_VALUE_CARD),
                isDisplayed()));
    }

    @DisplayName("в раскрытой карточке CLAIM проверяем что строка \"AddComment\"  отображается и кнопка AddComment отображается")
    public void checkAddComment_Visibility() {
        onView(allOf(withText(Data_Claim.ADD_COMMENT_TEXT_CARD),
                withParent(withParent(withId(Elements_Claim.ID_ADD_COMMENT_CARD))),
                isDisplayed()));
        onView(allOf(withId(Elements_Claim.ID_ADD_COMMENT_BUTTON_CARD),
                withContentDescription(Data_Claim.ADD_COMMENT_BUTTON_TEXT_CARD),
                withParent(withParent(withId(Elements_Claim.ID_ADD_COMMENT_CARD))),
                isDisplayed()));
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
        ViewInteraction edit = onView(
                allOf(withId(Elements_Claim.ID_COMMENT_BUTTON_EDIT),
                        withContentDescription(Data_Claim.EDIT_COMMENT_BUTTON_TEXT_CARD),
                        withParent(withParent(withId(Elements_Claim.ID_LIST_COMMENT_CARD))),
                        isDisplayed()));
        edit.check(matches(isDisplayed()));
    }

    @DisplayName("в раскрытой карточке CLAIM проверяем что кнопка Edit (Редактировать CLAIM) отображается")
    public void checkIconEditCard_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_EDIT_CARD_BUTTON_CARD),
                withContentDescription(Data_Claim.EDIT_CARD_BUTTON_TEXT_CARD),
                isDisplayed()));
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
                isDisplayed()));
    }

    @DisplayName("в модальном окне CHANGE STATUS (в статусе Open) проверяем что статус-опция TAKE TO WORK отображается")
    public void checkButtonTakeToWorkStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_TAKE_TO_WORK_CARD),
                withText(Data_Claim.CHANGE_TAKE_TO_WORK_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()));
    }

    @DisplayName("в модальном окне CHANGE STATUS (в статусе Open) проверяем что статус-опция CANCEL отображается")
    public void checkButtonCancelStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_CANCEL_CARD),
                withText(Data_Claim.CHANGE_CANCEL_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()));
    }

    @DisplayName("в модальном окне CHANGE STATUS (в статусе In Progress) проверяем что статус-опция THROW OFF отображается")
    public void checkButtonThrowOffStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_THROW_OFF_CARD),
                withText(Data_Claim.CHANGE_THROW_OFF_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()));
    }

    @DisplayName("в модальном окне CHANGE STATUS (в статусе In Progress) проверяем что статус-опция TO EXECUTE отображается")
    public void checkButtonToExecuteStatus_Visibility() {
        onView(allOf(withId(Elements_Claim.ID_CHANGE_TO_EXECUTE_CARD),
                withText(Data_Claim.CHANGE_TO_EXECUTE_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()));
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



