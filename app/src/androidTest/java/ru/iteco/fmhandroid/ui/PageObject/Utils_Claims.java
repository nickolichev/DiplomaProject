package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static org.hamcrest.Matchers.allOf;
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

import java.util.NoSuchElementException;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Claim;
import ru.iteco.fmhandroid.ui.testData.Data_Claim;

// Define an IdlingResource

public class Utils_Claims {
//    private static final String REFRESH_IDLING_RESOURCE = "refreshIdlingResource";
//    private final CountingIdlingResource refreshIdlingResource = new CountingIdlingResource(REFRESH_IDLING_RESOURCE);

//    CardIdlingResource cardIdlingResource = new CardIdlingResource();

    // утилиты
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

    @DisplayName("экран CLAIMS / раскрытая карточка CLAIM / клик по кнопке Close/")
    public void clickCloseClaim() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_Claim.ID_BUTTON_CLOSE),
                        withContentDescription(Data_Claim.BUTTON_CLOSE)));
        button.perform(scrollTo(), click());
    }

    // развернуть карточку претензии

//    int cardIndex = 0;
//    String cardText = ClaimData.TOPIC_3;

    // исходный код ранее работал

//    public void clickExpend(CardIdlingResource cardIdlingResource) {
////        new UtilsHelper().waitAsynchOperation2000();
//        cardIdlingResource.setIdle(false);
//        cardIdlingResource.waitUntilIdle();
//        cardIdlingResource.setIdle(true);
//
//        ViewInteraction recyclerView = onView(
//                allOf(withId(ClaimElements.ID_LIST_CARDS),
//                        childAtPosition(
//                                withId(R.id.all_claims_cards_block_constraint_layout),
//                                4)));
//        recyclerView.perform(actionOnItemAtPosition(0, click()));
//        cardIdlingResource.setIdle(false);
//        cardIdlingResource.waitUntilIdle();
//        cardIdlingResource.setIdle(true);
//    }

    // кликает по первой карточке в общем списке
//    public void clickExpend() {                  // int cardIndex в аргументах возможно необходима
//
//            // Выполняем клик на элементе RecyclerView с указанным индексом
//            onView(withId(ClaimElements.ID_LIST_CARDS)).perform(actionOnItemAtPosition(4, click()));
//    }


//    public void clickExpend(CardIdlingResource cardIdlingResource, int cardIndex) {
//        // Подготовка к ожиданию асинхронных операций
//        cardIdlingResource.setIdle(false);
//
//        // Ожидание завершения асинхронных операций
//        cardIdlingResource.waitUntilIdle();
//
//        // Ожидание, пока ресурс ожидания карты не станет неактивным (idle)
//        cardIdlingResource.setIdle(true);
//
//        // Выполняем клик на элементе RecyclerView с указанным индексом
//        onView(withId(ClaimElements.ID_LIST_CARDS)).perform(actionOnItemAtPosition(cardIndex, click()));
//    }


//    public void clickExpend(CardIdlingResource cardIdlingResource) {
//        ViewInteraction recyclerView = onView(
//                allOf(withId(ClaimElements.ID_LIST_CARDS),
//                        childAtPosition(
//                                withId(R.id.all_claims_cards_block_constraint_layout),
//                                4)));
//        cardIdlingResource.setIdle(false);
//        cardIdlingResource.setIdle(true);
//        new UtilsHelper().waitAsynchOperation2000();
//
//        boolean clickOnPosition0Successful = false;
//
//        // Попытка клика на позиции 0
//        try {
//            recyclerView.perform(actionOnItemAtPosition(0, click()));
//            clickOnPosition0Successful = true;
//        } catch (NoMatchingViewException e) {
//            // Клик на позиции 0 неуспешен
//        }
//
//        // Если клик на позиции 0 был неуспешным, то выполняем клик на позиции 1
//        if (!clickOnPosition0Successful) {
//            recyclerView.perform(actionOnItemAtPosition(1, click()));
//        }
//
//        cardIdlingResource.waitUntilIdle();
//    }


    // не работает клик
//    public void clickExpend(CardIdlingResource cardIdlingResource) {
//        // Ищем карточку Claim с нужным текстом
//        Matcher<View> matcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_3));
//        int position = UtilsHelper.getPositionOfClaim(matcher);
//
//        if (position >= 0) {
//            ViewInteraction recyclerView = onView(allOf(withId(ClaimElements.ID_LIST_CARDS),
//                    childAtPosition(withId(R.id.all_claims_cards_block_constraint_layout), 4)));
//
//            cardIdlingResource.setIdle(false);
//            cardIdlingResource.setIdle(true);
//            new UtilsHelper().waitAsynchOperation2000();
//
//            // Выполняем клик по карточке с найденной позицией
//            recyclerView.perform(actionOnItemAtPosition(position, click()));
//        } else {
//            // Обработка случая, когда карточка не найдена
//            // Можете бросить исключение или выполнить другие действия
//        }
//    }

    @DisplayName("экран CLAIMS / нераскрытая карточка CLAIM / клик по кнопке Expend/")
    public void clickExpendClaim() {
        new Utils_Helper().timerWaitingAsyncOperation3000();
        // Ищем элемент с заданным текстом, который виден на экране, и кликаем по нему
        onView(allOf(isDisplayed(), withId(Elements_Claim.ID_LIST_CARDS), withText(Data_Claim.TOPIC_3)))
                .perform(actionOnItemAtPosition(4, click()));

    }

//    public void clickExpend() {
//        new UtilsHelper().timerWaitingAsynchOperation5000();
//        int position = getPositionOfClaim(allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_3), isDisplayed()));
//        // Находим позицию карточки
//        new UtilsHelper().timerWaitingAsyncOperation5000();
//
//        // Открываем карточку на заданной позиции
//        onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed()))
//                .perform(actionOnItemAtPosition(position, click()));
//    }

    // в этом методе карточка не полностью появляется на экране нет клика
//    public void clickExpend() {
//        boolean claimFound = searchClaimByTopic_3(); // Выполняем поиск карточки
//
//        if (claimFound) {
//            // Карточка найдена, продолжаем выполнение
////            new UtilsHelper().waitAsyncOperation2000();
//
//            // Открываем карточку
//            // ...
//
//            // Устанавливаем состояния для IdlingResource
////            cardIdlingResource.setIdle(false);
////            cardIdlingResource.setIdle(true);
////            cardIdlingResource.waitUntilIdle();
//        } else {
//            // Карточка не найдена, обрабатываем это как ошибку
//            throw new NoSuchElementException("Card with topic " + ClaimData.TOPIC_3 + " not found");
//        }
//    }

//    public void clickExpend(CardIdlingResource cardIdlingResource) {
//        boolean claimFound = searchClaimByTopic_3(); // Выполняем поиск карточки
//
////        cardIdlingResource.setIdle(true);
//
//        if (claimFound) {
//            // Карточка найдена, продолжаем выполнение
//
//            // Пока карточка не станет полностью видимой, прокручиваем вниз
//            while (!isCardFullyVisible()) {
//                // Прокручиваем вниз
//                onView(withId(ClaimElements.ID_LIST_CARDS)).perform(swipeUp());
//                // Проверяем снова, когда карточка полностью видна
//                claimFound = searchClaimByTopic_2();
//                if (!claimFound) {
//                    // Если карточка больше не найдена, можно выбросить исключение или выполнить другое действие
//                    throw new NoSuchElementException("Card with topic " + ClaimData.TOPIC_2 + " not found");
//                }
//            }
//
////            cardIdlingResource.setIdle(false);
////            cardIdlingResource.setIdle(true);
//            new UtilsHelper().waitAsynchOperation2000();
//
//            // Открываем карточку
//            ViewInteraction recyclerView4 = onView(
//                    allOf(withId(R.id.claim_list_recycler_view),
//                            childAtPosition(
//                                    withId(R.id.all_claims_cards_block_constraint_layout),
//                                    4)));
//            recyclerView4.perform(actionOnItemAtPosition(4, click()));
//
//            // Устанавливаем состояния для IdlingResource
////            cardIdlingResource.setIdle(false);
////            cardIdlingResource.setIdle(true);
////            cardIdlingResource.waitUntilIdle();
//        } else {
//            // Карточка не найдена, обрабатываем это как ошибку
//            throw new NoSuchElementException("Card with topic " + ClaimData.TOPIC_2 + " not found");
//        }
//    }

//    public void clickExpend(CardIdlingResource cardIdlingResource) {
//        boolean claimFound = searchClaimByTopic_3(); // Выполняем поиск карточки
//
//        if (claimFound) {
//            // Карточка найдена, продолжаем выполнение
//
//            // Ожидаем появления элемента внутри RecyclerView
//            onView(withParent(withParent(withId(R.id.claim_list_card))))
//                    .perform(RecyclerViewActions.actionOnItemAtPosition(4, scrollTo()));
//
//            // Выполняем клик
//            onView(withParent(withParent(withId(R.id.claim_list_card))))
//                    .perform(RecyclerViewActions.actionOnItemAtPosition(4, click()));
//
//            // После клика также может потребоваться ожидание завершения асинхронной операции
//            new UtilsHelper().waitAsynchOperation2000();
//
//        } else {
//            // Карточка не найдена, обрабатываем это как ошибку
//            throw new NoSuchElementException("Card with topic " + ClaimData.TOPIC_2 + " not found");
//        }
//    }
//    private boolean isCardFullyVisible() {
//        try {
//           onView(allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_3)))
//                    .inRoot(RootMatchers.isPlatformPopup())
//                    .check(matches(isDisplayed()));
//            return true;
//        } catch (NoMatchingViewException e) {
//            // Карточка не видна
//            return false;
//        }
//    }


    // Creating Claim
    public void clickCreateClaim() {
//        cardIdlingResource.setIdle(false);
        ViewInteraction button = onView(
                Matchers.allOf(withId(Elements_Claim.ID_ADD_NEW_CLAIM),
                        withContentDescription(Data_Claim.ADD_NEW_CLAIM_TEXT)));

//        cardIdlingResource.setIdle(true);
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
//        cardIdlingResource.setIdle(false);
//        cardIdlingResource.setIdle(true);
    }

    // набор методов для заполнения валидными TITLE для каждого отдельного test-case
    // ПОСЛЕ отработки теста, в методе inputTestDataInTitleNewClaim_1() заменить FAKE_TITLE на valid DATA TITLE_1
    @DisplayName("test-case #7 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTestDataInTitleNewClaim_1() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.FAKE_TITLE));
    }

    @DisplayName("test-case #8 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTestDataInTitleNewClaim_2() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_2));
        //                .perform(ViewActions.closeSoftKeyboard());
    }
    @DisplayName("test-case #9 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTestDataInTitleNewClaim_3() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_3));
    }

    @DisplayName("test-case #10 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTestDataInTitleNewClaim_4() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_4));
    }

    @DisplayName("test-case #11 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTestDataInTitleNewClaim_5() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_5));
    }

    @DisplayName("test-case #12 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTestDataInTitleNewClaim_6() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_6));
    }

    @DisplayName("test-case #13 / экран CREATING CLAIM / заполнение поля TITLE")
    public void inputTestDataInTitleNewClaim_7() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_TITLE_7));
    }
    @DisplayName("экран CREATING CLAIM / заполнение НЕвалидными тестовыми данными EMPTY поля TITLE")
    public void inputEmptyInTitleNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(""));
    }

    @DisplayName("экран CREATING CLAIM / заполнение валидными тестовыми данными поля EXECUTOR")
    public void inputTestDataInExecutorNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_EXECUTOR)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_EXECUTOR_TEXT));
//                .perform(ViewActions.closeSoftKeyboard());
    }

    @DisplayName("экран CREATING CLAIM / заполнение НЕвалидными тестовыми данными поля EXECUTOR")
    public void inputInvalidTestDataInExecutorNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_EXECUTOR)))
                .perform(ViewActions.replaceText(Data_Claim.INV_INPUT_EXECUTOR));
    }
    @DisplayName("экран CREATING CLAIM / заполнение НЕвалидными тестовыми данными EMPTY поля EXECUTOR")
    public void inputEmptyInExecutorNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_EXECUTOR)))
                .perform(ViewActions.replaceText(""));
    }

    // методы полей Date и Time
    @DisplayName("экран CREATING CLAIM / заполнение НЕвалидными тестовыми данными EMPTY поля EXECUTOR")
    public void inputOnTestDataDate() {
        ViewInteraction date = onView(
                allOf(withId(Elements_Claim.ID_FIELD_DATE)));
        date.perform(replaceText(Data_Claim.FAKE_DATE)); // заменить на валидную дату
        date.check(matches(isDisplayed()));
    }

    // для Negative test
    public void inputInvalidTestDataDate() {
        ViewInteraction date = onView(
                allOf(withId(Elements_Claim.ID_FIELD_DATE)));
        date.perform(replaceText(Data_Claim.INV_INPUT_DATE));
        date.check(matches(isDisplayed()));
    }

    // для Negative test
    public void inputEmptyTestDataDate() {
        ViewInteraction date = onView(
                allOf(withId(Elements_Claim.ID_FIELD_DATE)));
        date.perform(replaceText(""));
        date.check(matches(isDisplayed()));
    }

    public void inputOnTestDataTime() {
        ViewInteraction time = onView(
                allOf(withId(Elements_Claim.ID_FIELD_TIME)));
        time.perform(replaceText(Data_Claim.FAKE_TIME)); // заменить на валидное время
        time.check(matches(isDisplayed()));
    }

    // для Negative test
    public void inputInvalidTestDataTime() {
        ViewInteraction time = onView(
                allOf(withId(Elements_Claim.ID_FIELD_TIME)));
        time.perform(replaceText(Data_Claim.INV_INPUT_TIME));
        time.check(matches(isDisplayed()));
    }

    // для Negative test
    public void inputEmptyTestDataTime() {
        ViewInteraction time = onView(
                allOf(withId(Elements_Claim.ID_FIELD_TIME)));
        time.perform(replaceText(""));
        time.check(matches(isDisplayed()));
    }

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


    // набор методов для заполнения валидными DESCRIPTION для каждого отдельного test-case
    // в методе inputTestDataInDescriptionNewClaim_1() заменить на DESCRIPTION_1
    public void inputTestDataInDescription_1() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_1))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDescription_2() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_2))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDescription_3() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_3))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDescription_4() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_4))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDescription_5() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_5))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDescription_6() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_6))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDescription_7() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(Data_Claim.INPUT_DESCRIPTION_7))
                .perform(ViewActions.closeSoftKeyboard());
    }



    // для Negative test (пустое поле Description)
    public void inputEmptyInDescriptionNewClaim() {
        onView(allOf(withId(Elements_Claim.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(""))
                .perform(ViewActions.closeSoftKeyboard());
    }

    // кнопка Save на странице Creating Claim
    public void clickButtonSaveNewClaim () {
//        new UtilsHelper().beginAsyncOperation();
        ViewInteraction save = onView(
                allOf(withId(Elements_Claim.ID_SAVE_CREATING_Claims),
                        withText(Data_Claim.SAVE_CREATING_CLAIMS),
                        withContentDescription(Data_Claim.SAVE_CREATING_CLAIMS)));
        save.perform(scrollTo(), click());
//        new UtilsHelper().endAsyncOperation();
    }

    // кнопка Cancel на странице Creating Claim
    public void clickButtonCancelNewClaim () {
//        new UtilsHelper().beginAsyncOperation();
        ViewInteraction cancel = onView(
                allOf(withId(Elements_Claim.ID_CANCEL_CREATING_Claims),
                        withText(Data_Claim.CANCEL_CREATING_CLAIMS),
                        withContentDescription(Data_Claim.CANCEL_CREATING_CLAIMS)));
        cancel.perform(scrollTo(), click());
//        new UtilsHelper().endAsyncOperation();
    }


    // Редактирование Claim
    // добавить комментарий к Claim
    public void clickAddComment() {
        ViewInteraction add = onView(
                Matchers.allOf(withId(Elements_Claim.ID_ADD_COMMENT_BUTTON_CARD),
                        withContentDescription(Data_Claim.ADD_COMMENT_BUTTON_TEXT_CARD)));
//        cardIdlingResource.setIdle(false);
//        new UtilsHelper().timerWaitingAsynchOperation2000();
//        cardIdlingResource.setIdle(true);
        add.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        add.perform(click());
    }


    // набор методов для заполнения валидными COMMENT для каждого отдельного test-case
    public void inputComment_3() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(Elements_Claim.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_3),
                closeSoftKeyboard());
    }

    public void inputComment_4() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(Elements_Claim.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_4),
                closeSoftKeyboard());
    }

    public void inputComment_5() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(Elements_Claim.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_5),
                closeSoftKeyboard());
    }

    public void inputComment_6() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(Elements_Claim.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_6),
                closeSoftKeyboard());
    }

    public void inputComment_7() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(Elements_Claim.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(Data_Claim.COMMENT_CONTENT_CARD_7),
                closeSoftKeyboard());
    }

    public void clickCancelComment() {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_Claim.ID_CANCEL_COMMENT), withText(Data_Claim.BUTTON_CANCEL_COMMENT), withContentDescription(Data_Claim.BUTTON_CANCEL_COMMENT),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                2)));
        cancel.perform(scrollTo(), click());
    }

    public void clickSaveComment() {
        ViewInteraction save = onView(
                allOf(withId(Elements_Claim.ID_SAVE_COMMENT), withText(Data_Claim.BUTTON_SAVE_COMMENT), withContentDescription(Data_Claim.BUTTON_SAVE_COMMENT),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                1)));
        save.perform(scrollTo(), click());
    }

    // поиск comment_3 внутри Claim
    public boolean searchComment_3_ByContent() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_CONTENT_COMMENT), withText(Data_Claim.COMMENT_CONTENT_CARD_3), isDisplayed());
        boolean found = Utils_Helper.searchInCommentList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.COMMENT_CONTENT_CARD_3 + "is not successful");
        }
    }




    // поиск редактированного comment_3 внутри Claim
    public boolean searchComment_3_EditByContent() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_CONTENT_COMMENT), withText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_3), isDisplayed());
        boolean found = Utils_Helper.searchInCommentList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.COMMENT_CONTENT_EDIT_CARD_3 + "is not successful");
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


    // редактируем Comment для test-case #9
    public void inputEditComment_3() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(Elements_Claim.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(Data_Claim.COMMENT_CONTENT_EDIT_CARD_3),
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
                withId(Elements_Claim.ID_COMMENT_BUTTON_EDIT), // Замените на реальный идентификатор кнопки Edit
                isDescendantOfA(allOf(
                        withId(Elements_Claim.ID_CONTAINER_COMMENT_CARD), // Замените на ваш идентификатор контейнера комментариев
                        isDisplayed())
                )
        ));

        editButton.perform(click());
    }

    // клик по Edit внутри COMMENT_3
    public void clickEditInsideComment_3() {
        String commentContent = Data_Claim.COMMENT_CONTENT_CARD_3;
        ViewInteraction comment = new CheckUtils_Claims().checkInsideCommentContent_Visibility(commentContent);
        new Utils_Claims().clickEditInComment(comment);
    }





    // набор методов поиска (скроллинга списка) карточек по значению TOPIC
    // в каждом отдельном методе поиска соответствующие тестовые данные

    // в  методе searchClaimByTopic_1() после предварительного тестирования заменить на valid TOPIC_1
    public boolean searchClaimByTopic_1() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_TOPIC_TEXT_LIST), withText(Data_Claim.FAKE_TITLE), isDisplayed());
        boolean found = Utils_Helper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.FAKE_TITLE + "is not successful");
        }
    }

    public boolean searchClaimByTopic_2() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_TOPIC_TEXT_LIST), withText(Data_Claim.TOPIC_2), isDisplayed());
        boolean found = Utils_Helper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.TOPIC_2 + "is not successful");
        }
    }

    // исходный код раньше работал
//    public boolean searchClaimByTopic_3() {
//        Matcher<View> matcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_3), isDisplayed());
//        new UtilsHelper().waitAsynchOperation1000();
//        boolean found = UtilsHelper.searchInClaimsList(matcher, false);
//
//        if (found) {
//            onView(matcher).check(matches(isDisplayed()));
//            return true;
//        } else {
//            throw new NoSuchElementException("topic search:" + ClaimData.TOPIC_3 + "is not successful");
//        }
//    }

    public boolean searchClaimByTopic_3() {
        Matcher<View> matcher = allOf(
                withId(Elements_Claim.ID_TOPIC_TEXT_LIST),
                withText(Data_Claim.TOPIC_3),
                isDisplayed()
        );

        boolean endScroll = true; // Проверьте, что этот флаг установлен в true


        boolean found = Utils_Helper.searchInClaimsList(matcher, endScroll);


        if (found) {

            onView(matcher).check(matches(isDisplayed()));
            new Utils_Helper().timerWaitingAsyncOperation3000();
            return true;
        } else {
            return false; // Вместо выброса исключения
        }
    }



    // версия на конец 07.09.23
//    public boolean searchClaimByTopic_3(CardIdlingResource cardIdlingResource) {
//        Matcher<View> matcher = allOf(
//                withId(ClaimElements.ID_TOPIC_TEXT_LIST),
//                withText(ClaimData.TOPIC_3),
//                isDisplayed()
//        );
//
//        new UtilsHelper().waitAsynchOperation500();
//
//        boolean endScroll = true; // Проверьте, что этот флаг установлен в true
//
//        new UtilsHelper().waitAsynchOperation1000();
//
//        boolean found = UtilsHelper.searchInClaimsList(matcher, endScroll);
//
//        // Ожидание завершения асинхронных операций
//        cardIdlingResource.waitUntilIdle();
//
//        if (found) {
//            onView(matcher).check(matches(isDisplayed()));
//            return true;
//        } else {
//            return false; // Вместо выброса исключения
//        }
//    }




    // проба клика по Topic неудачно
//    public void searchClaimByTopic_3() {
//        Matcher<View> matcher = allOf(
//                withId(R.id.description_material_text_view), // Topic
//                withText("#3 Editing claim status Open - In Progress+Comment"), // содержание Topic
//                withParent(withParent(withId(R.id.claim_list_card))),
//                isDisplayed()
//        );
//
//        boolean found = UtilsHelper.searchInClaimsList(matcher, false);
//
//        if (found) {
//            onView(matcher).check(matches(isDisplayed()));
//            new UtilsHelper().waitAsynchOperation2000();
//
//            // Выполняем клик на элементе
//            onView(matcher).perform(click());
//            new UtilsHelper().waitAsynchOperation5000();
//
//        } else {
//            throw new NoSuchElementException("Topic search: " + "#3 Editing claim status Open - In Progress+Comment" + " is not successful");
//        }
//    }





//    public boolean searchClaimByTopic_3() {
//        boolean found = false;
//        int scrollCount = 0;
//
//        while (scrollCount < 100 && !found) {
//            Matcher<View> matcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_3), isDisplayed());
//            // Выполняем скроллинг
//            found = UtilsHelper.searchInClaimsList(matcher, false);
//
//            // Проверяем элемент на позиции 0
//            try {
//                onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed()))
//                        .check(matches(atPosition(0, allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_3)))));
//                found = true;
//                break;
//            } catch (NoMatchingViewException e) {
//                // Карточка Claim не найдена на позиции 0, продолжаем поиск
//            }
//
//            // Проверяем элемент на позиции 1
//            try {
//                onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed()))
//                        .check(matches(atPosition(1, allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_3)))));
//                found = true;
//                break;
//            } catch (NoMatchingViewException e) {
//                // Карточка Claim не найдена на позиции 1, продолжаем поиск
//            }
//
//            // Увеличиваем счетчик скроллинга
//            scrollCount++;
//        }
//
//        if (!found) {
//            throw new NoSuchElementException("topic search:" + ClaimData.TOPIC_3 + " is not successful");
//        }
//
//        return true;
//    }


//// карточку нашел Отображалась внизу страницы полностью
//    public boolean searchClaimByTopic_3() {
//        Matcher<View> dateMatcher = allOf(
//                withId(ClaimElements.ID_PLAN_DATE_VALUE_DATE_LIST),
//                withText(ClaimData.INV_PLAN_DATE_DATE),
//                isDisplayed()
//        );
//
//        Matcher<View> topicMatcher = allOf(
//                withId(ClaimElements.ID_TOPIC_TEXT_LIST),
//                withText(ClaimData.TOPIC_3),
//                isDisplayed()
//        );
//
//        new UtilsHelper().waitAsynchOperation500();
//        boolean foundByDate = UtilsHelper.searchInClaimsList(dateMatcher, false);
//
//
//
//        if (foundByDate) {
//            new UtilsHelper().waitAsynchOperation500();
//            // Если нашли по дате, проверяем TOPIC
//            boolean foundByTopic = UtilsHelper.searchInClaimsList(topicMatcher, false);
//
//            if (foundByTopic) {
//                onView(topicMatcher).check(matches(isDisplayed()));
//                return true;
//            }
//        }
//
//        new UtilsHelper().waitAsynchOperation2000();
//        // Если не нашли, или не совпал TOPIC, возвращаем false
//        return false;
//
//    }





//    public boolean searchClaimByTopic_3() {
//        Matcher<View> matcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_3), isDisplayed());
//        boolean found = UtilsHelper.searchInClaimsList(matcher, false);
//
//        if (found) {
//            onView(matcher).check(matches(isDisplayed()));
//            // Сохраните позицию найденной карточки
//            int position = UtilsHelper.getPositionOfClaim(matcher);
//            // Возможно, сохраните эту позицию как переменную класса или возвращайте ее из метода
//            return true;
//        } else {
//            throw new NoSuchElementException("topic search:" + ClaimData.TOPIC_3 + " is not successful");
//        }
//    }

    public void scrollToPosition(int position) {
        onView(withId(R.id.claim_list_recycler_view)).perform(RecyclerViewActions.scrollToPosition(position));
    }

//    public boolean searchClaimByTopic_3() {
//        // Поиск элемента с именем "Тема 3" и проверка на его видимость
//        Matcher<View> topicMatcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_3), isDisplayed());
//        boolean topicFound = UtilsHelper.searchInClaimsList(topicMatcher, false);
//
//        if (topicFound) {
//            // Если найдена тема, выполняем прокрутку списка вниз и проверяем видимость элементов плана даты
//            while (true) {
//                // Проверяем видимость элементов плана даты
//                Matcher<View> planDateCardMatcher = allOf(withId(ClaimElements.ID_PLAN_DATE_CARD), withText(ClaimData.PLAN_DATE_TEXT));
//                Matcher<View> planDateValueMatcher = allOf(withId(ClaimElements.ID_PLAN_DATE_VALUE_DATE_CARD), withText(ClaimData.FAKE_DATE));
//
//                boolean planDateCardVisible = UtilsHelper.isViewDisplayed(planDateCardMatcher);
//                boolean planDateValueVisible = UtilsHelper.isViewDisplayed(planDateValueMatcher);
//
//                if (planDateCardVisible && planDateValueVisible) {
//                    // Если оба элемента плана даты видимы, возвращаем true
//                    return true;
//                }
//
//                // Прокручиваем список вниз
//                onView(withId(R.id.claim_list_recycler_view)).perform(swipeDown());
//
//                // Проверяем, виден ли элемент  (ID_PLAN_DATE_CARD) после прокрутки
//                Matcher<View> moreMatcher = allOf(withId(ClaimElements.ID_PLAN_DATE_CARD), withText(ClaimData.PLAN_DATE_TEXT), isDisplayed());
//                if (!UtilsHelper.isViewDisplayed(moreMatcher)) {
//                    // Если элемент "Ещё" скрылся, выполняем обратную прокрутку списка вверх
//                    onView(withId(R.id.claim_list_recycler_view)).perform(swipeUp());
//                }
//            }
//        } else {
//            throw new NoSuchElementException("Topic search: " + ClaimData.TOPIC_3 + " is not successful");
//        }
//    }

//    public boolean searchClaimByTopic_3() {
//        Matcher<View> matcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_3), isDisplayed());
//        boolean found = UtilsHelper.searchInClaimsList(matcher, false);
//
//        if (found) {
//            onView(matcher).check(matches(isDisplayed()));
//            return true; // Возвращаем true, если карточка найдена
//        } else {
//            return false; // Возвращаем false, если карточка не найдена
//        }
//    }


    // проба не проверено
//    public int searchClaimByTopic_3_Dop() {
//        Matcher<View> matcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_3), isDisplayed());
//        boolean found = UtilsHelper.searchInClaimsList(matcher, false);
//
//        if (found) {
//            onView(matcher).check(matches(isDisplayed()));
//            return UtilsHelper.getPositionOfClaim(matcher);
//        } else {
//            throw new NoSuchElementException("topic search:" + ClaimData.TOPIC_3 + "is not successful");
//        }
//    }






    public boolean searchClaimByTopic_4() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_TOPIC_TEXT_LIST), withText(Data_Claim.TOPIC_4), isDisplayed());
        boolean found = Utils_Helper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.TOPIC_4 + "is not successful");
        }
    }

    public boolean searchClaimByTopic_5() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_TOPIC_TEXT_LIST), withText(Data_Claim.TOPIC_5), isDisplayed());
        boolean found = Utils_Helper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.TOPIC_5 + "is not successful");
        }
    }

    public boolean searchClaimByTopic_6() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_TOPIC_TEXT_LIST), withText(Data_Claim.TOPIC_6), isDisplayed());
        boolean found = Utils_Helper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.TOPIC_6 + "is not successful");
        }
    }

    public boolean searchClaimByTopic_7() {
        Matcher<View> matcher = allOf(withId(Elements_Claim.ID_TOPIC_TEXT_LIST), withText(Data_Claim.TOPIC_7), isDisplayed());
        boolean found = Utils_Helper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + Data_Claim.TOPIC_7 + "is not successful");
        }
    }


    // Editing Claim
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


    // клик по иконке смена статуса в карточке OPEN
        public void clickChangeStatusClaimWithOpenStatus () {
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

    // клик по строке в модальном окне Смена статуса в карточке In Progress
    public void clickChangeStatusThrowOff () {
        ViewInteraction throwOff = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_THROW_OFF_CARD), withText(Data_Claim.CHANGE_THROW_OFF_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        throwOff.perform(click());
    }

    // клик по строке execute в модальном окне Смена статуса в карточке In Progress
    public void clickChangeStatusToExecute () {
        ViewInteraction execute = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_TO_EXECUTE_CARD), withText(Data_Claim.CHANGE_TO_EXECUTE_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        execute.perform(click());
    }

    // клик по строке в модальном окне Смена статуса в карточке Open
    public void clickChangeStatusTakeToWork () {
        ViewInteraction take_to_work = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_TAKE_TO_WORK_CARD), withText(Data_Claim.CHANGE_TAKE_TO_WORK_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        take_to_work.perform(click());
    }

    // клик по строке cancel в модальном окне Смена статуса в карточке Open
    public void clickChangeStatusCancel () {
        ViewInteraction cancel = onView(
                allOf(withId(Elements_Claim.ID_CHANGE_CANCEL_CARD), withText(Data_Claim.CHANGE_CANCEL_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        cancel.perform(click());
    }


    // модальное окно предупреждения на странице Creating Claim
    public void clickInModalViewButtonCancel () {
//        new UtilsHelper().beginAsyncOperation();
        ViewInteraction cancel = onView(
                allOf(withId(Elements_Claim.ID_CANCEL_MODAL_VIEW),
                        withText(Data_Claim.CANCEL_MODAL_VIEW_TEXT)));
        cancel.perform(scrollTo(), click());
//        new UtilsHelper().endAsyncOperation();
    }

    // модальное окно предупреждения на странице Creating Claim
    public void clickInModalViewButtonOk () {
//        new UtilsHelper().beginAsyncOperation();
        ViewInteraction ok = onView(
                allOf(withId(Elements_Claim.ID_OK_MODAL_VIEW),
                        withText(Data_Claim.OK_MODAL_VIEW_TEXT)));
        ok.perform(scrollTo(), click());
//        new UtilsHelper().endAsyncOperation();
    }

    public void clickButtonSave() {
    }
}


