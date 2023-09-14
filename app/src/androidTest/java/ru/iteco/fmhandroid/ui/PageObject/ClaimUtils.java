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
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static ru.iteco.fmhandroid.ui.PageObject.UtilsHelper.childAtPosition;

import android.view.View;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.NoSuchElementException;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.ClaimElements;
import ru.iteco.fmhandroid.ui.testData.ClaimData;

// Define an IdlingResource

public class ClaimUtils {
    UtilsHelper utilsHelper = new UtilsHelper();
//    private static final String REFRESH_IDLING_RESOURCE = "refreshIdlingResource";
//    private final CountingIdlingResource refreshIdlingResource = new CountingIdlingResource(REFRESH_IDLING_RESOURCE);

//    CardIdlingResource cardIdlingResource = new CardIdlingResource();

//    @Before
//    public void registerIdlingResources() {
//        IdlingRegistry.getInstance().register(refreshIdlingResource);
//    }
//
//    @After
//    public void unregisterIdlingResources() {
//        IdlingRegistry.getInstance().unregister(refreshIdlingResource);
//    }

    // кликаем на кнопку REFRESH, если только она присутствует на экране
    // + дожидаемся обновления страницы
//    public void clickRefreshButton() {
//        try {
//            onView(withId(ClaimElements.ID_REFRESH_BUTTON))
//                    .check(matches(isDisplayed()))
//                    .perform(click());
//
//            refreshIdlingResource.increment();
//
//            final long timeoutMillis = 4000;
//            final long startTime = System.currentTimeMillis();
//
//            while (!refreshIdlingResource.isIdleNow()) {
//                // Check if the timeout has been reached
//                if (System.currentTimeMillis() - startTime >= timeoutMillis) {
//                    throw new RuntimeException("Timeout while waiting for refresh to complete");
//                }
//
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        } catch (NoMatchingViewException e) {
//        }
//    }

    // утилиты модального окна FILTER
    public void clickFilters() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_FILTERS_BUTTON),
                        withContentDescription(ClaimData.FILTER_DESCRIPTION)));

        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }

    public void clickOpen() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_OPEN_CHECK_BOX),
                        withText(ClaimData.OPEN_STATUS_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }

    public void clickInProgress() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_IN_PROGRESS_CHECK_BOX),
                        withText(ClaimData.IN_PROGRESS_STATUS_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }

    public void clickExecuted() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_EXECUTED_CHECK_BOX),
                        withText(ClaimData.EXECUTED_STATUS_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }

    public void clickCancelled() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_CANCELLED_CHECK_BOX),
                        withText(ClaimData.CANCELLED_STATUS_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
    }

    // в модальном окне Filter
    public void clickOk() {
        // Установите состояние ожидания в false перед началом действия
//        ProjectIdlingResources.setIdle(false);

        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_OK_BUTTON),
                        withText(ClaimData.OK_BUTTON_TEXT)));

        button.perform(scrollTo(), click());

        // Установите состояние ожидания в true после завершения действия
//        ProjectIdlingResources.setIdle(true);

        // Ожидание завершения асинхронных операций (если необходимо)
//        cardIdlingResource.waitUntilIdle();
    }



    // в модальном окне Filter
    public void clickCancel() {
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_CANCEL_BUTTON),
                        withText(ClaimData.CANCEL_BUTTON_TEXT)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(scrollTo(), click());
//        cardIdlingResource.setIdle(false);
//        cardIdlingResource.setIdle(true);
//        cardIdlingResource.waitUntilIdle();
    }

    // закрыть развернутую карточку претензии
    public void clickClose() {
//        cardIdlingResource.setIdle(false);
//        new UtilsHelper().timerWaitingAsynchOperation1000();
        ViewInteraction button = onView(
                Matchers.allOf(withId(ClaimElements.ID_BUTTON_CLOSE),
                        withContentDescription(ClaimData.BUTTON_CLOSE)));

//        cardIdlingResource.setIdle(true);

        button.perform(scrollTo(), click());

//        cardIdlingResource.setIdle(false);
//        cardIdlingResource.setIdle(true);
//        cardIdlingResource.waitUntilIdle();
    }

    // развернуть карточку претензии

    int cardIndex = 0;
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

//    ViewInteraction recyclerView = onView(
//            allOf(withId(ClaimElements.ID_LIST_CARDS),
//                    childAtPosition(
//                            withId(R.id.all_claims_cards_block_constraint_layout),
//                            4)));
//        recyclerView.perform(actionOnItemAtPosition(0, click()));
//

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
    public void clickExpend() {
        utilsHelper.timerWaitingAsynchOperation3000();
        // Ищем первый элемент с заданным текстом, который виден на экране, и кликаем по нему
        onView(allOf(isDisplayed(), withId(ClaimElements.ID_LIST_CARDS), withText(ClaimData.TOPIC_3)))
                .perform(actionOnItemAtPosition(4, click()));

    }

//    public void clickExpend() {
//        new UtilsHelper().timerWaitingAsynchOperation5000();
//        int position = getPositionOfClaim(allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_3), isDisplayed()));
//        // Находим позицию карточки
//        new UtilsHelper().timerWaitingAsynchOperation5000();
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
////            new UtilsHelper().waitAsynchOperation2000();
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
                Matchers.allOf(withId(ClaimElements.ID_ADD_NEW_CLAIM),
                        withContentDescription(ClaimData.ADD_NEW_CLAIM_TEXT)));

//        cardIdlingResource.setIdle(true);
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());
//        cardIdlingResource.setIdle(false);
//        cardIdlingResource.setIdle(true);
    }

    // набор методов для заполнения валидными TITLE для каждого отдельного test-case
    // в методе inputTestDataInTitleNewClaim_1() заменить на valid DATA TITLE_1
    public void inputTestDataInTitleNewClaim_1() {
        onView(allOf(withId(ClaimElements.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(ClaimData.FAKE_TITLE))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInTitleNewClaim_2() {
        onView(allOf(withId(ClaimElements.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_TITLE_2))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInTitleNewClaim_3() {
        onView(allOf(withId(ClaimElements.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_TITLE_3))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInTitleNewClaim_4() {
        onView(allOf(withId(ClaimElements.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_TITLE_4))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInTitleNewClaim_5() {
        onView(allOf(withId(ClaimElements.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_TITLE_5))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInTitleNewClaim_6() {
        onView(allOf(withId(ClaimElements.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_TITLE_6))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInTitleNewClaim_7() {
        onView(allOf(withId(ClaimElements.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_TITLE_7))
                .perform(ViewActions.closeSoftKeyboard());
    }

    // пустое поле TITLE
    public void inputEmptyInTitleNewClaim() {
        onView(allOf(withId(ClaimElements.ID_FIELD_TITLE)))
                .perform(ViewActions.replaceText(""))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInExecutorNewClaim() {
        onView(allOf(withId(ClaimElements.ID_FIELD_EXECUTOR)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_EXECUTOR_TEXT))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputInvalidTestDataInExecutorNewClaim() {
        onView(allOf(withId(ClaimElements.ID_FIELD_EXECUTOR)))
                .perform(ViewActions.replaceText(ClaimData.INV_INPUT_EXECUTOR))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputEmptyInExecutorNewClaim() {
        onView(allOf(withId(ClaimElements.ID_FIELD_EXECUTOR)))
                .perform(ViewActions.replaceText(""))
                .perform(ViewActions.closeSoftKeyboard());
    }

    // набор методов для заполнения валидными DISCRIPTION для каждого отдельного test-case
    // в методе inputTestDataInDiscriptionNewClaim_1() заменить на DISCRIPTION_1
    public void inputTestDataInDiscription_1_NewClaim() {
        onView(allOf(withId(ClaimElements.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_DESCRIPTION_1))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDiscription_2_NewClaim() {
        onView(allOf(withId(ClaimElements.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_DESCRIPTION_2))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDiscription_3_NewClaim() {
        onView(allOf(withId(ClaimElements.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_DESCRIPTION_3))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDiscription_4_NewClaim() {
        onView(allOf(withId(ClaimElements.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_DESCRIPTION_4))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDiscription_5_NewClaim() {
        onView(allOf(withId(ClaimElements.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_DESCRIPTION_5))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDiscription_6_NewClaim() {
        onView(allOf(withId(ClaimElements.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_DESCRIPTION_6))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputTestDataInDiscription_7_NewClaim() {
        onView(allOf(withId(ClaimElements.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(ClaimData.INPUT_DESCRIPTION_7))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputEmptyInDiscriptionNewClaim() {
        onView(allOf(withId(ClaimElements.ID_FIELD_DESCRIPTION)))
                .perform(ViewActions.replaceText(""))
                .perform(ViewActions.closeSoftKeyboard());
    }

    // добавить комментарий
    public void clickAddComment() {
        ViewInteraction add = onView(
                Matchers.allOf(withId(ClaimElements.ID_ADD_COMMENT_BUTTON_CARD),
                        withContentDescription(ClaimData.ADD_COMMENT_BUTTON_TEXT_CARD)));
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
                                        withId(ClaimElements.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(ClaimData.COMMENT_CONTENT_CARD_3),
                closeSoftKeyboard());
    }

    public void inputComment_4() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(ClaimElements.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(ClaimData.COMMENT_CONTENT_CARD_4),
                closeSoftKeyboard());
    }

    public void inputComment_5() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(ClaimElements.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(ClaimData.COMMENT_CONTENT_CARD_5),
                closeSoftKeyboard());
    }

    public void inputComment_6() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(ClaimElements.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(ClaimData.COMMENT_CONTENT_CARD_6),
                closeSoftKeyboard());
    }

    public void inputComment_7() {
        ViewInteraction text_comment = onView(
                allOf(childAtPosition(
                                childAtPosition(
                                        withId(ClaimElements.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(ClaimData.COMMENT_CONTENT_CARD_7),
                closeSoftKeyboard());
    }

    public void clickCancelComment() {
        ViewInteraction cancel = onView(
                allOf(withId(ClaimElements.ID_CANCEL_COMMENT), withText(ClaimData.BUTTON_CANCEL_COMMENT), withContentDescription(ClaimData.BUTTON_CANCEL_COMMENT),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                2)));
        cancel.perform(scrollTo(), click());
    }

    public void clickSaveComment() {
        ViewInteraction save = onView(
                allOf(withId(ClaimElements.ID_SAVE_COMMENT), withText(ClaimData.BUTTON_SAVE_COMMENT), withContentDescription(ClaimData.BUTTON_SAVE_COMMENT),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                1)));
        save.perform(scrollTo(), click());
    }

    // поиск comment_3 внутри Claim
    public boolean searchComment_3_ByContent() {
        Matcher<View> matcher = allOf(withId(ClaimElements.ID_CONTENT_COMMENT), withText(ClaimData.COMMENT_CONTENT_CARD_3), isDisplayed());
        boolean found = UtilsHelper.searchInCommentList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + ClaimData.COMMENT_CONTENT_CARD_3 + "is not successful");
        }
    }




    // поиск редактированного comment_3 внутри Claim
    public boolean searchComment_3_EditByContent() {
        Matcher<View> matcher = allOf(withId(ClaimElements.ID_CONTENT_COMMENT), withText(ClaimData.COMMENT_CONTENT_EDIT_CARD_3), isDisplayed());
        boolean found = UtilsHelper.searchInCommentList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + ClaimData.COMMENT_CONTENT_EDIT_CARD_3 + "is not successful");
        }
    }

    public void clickIconEditComment() {
        ViewInteraction save = onView(
                allOf(withId(ClaimElements.ID_ICON_EDIT_COMMENT), withText(ClaimData.ICON_EDIT_COMMENT_TEXT), withContentDescription(ClaimData.ICON_EDIT_COMMENT_TEXT),
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
                                        withId(ClaimElements.ID_INPUT_COMMENT),
                                        0),
                                0),
                        isDisplayed()));
        text_comment.perform(replaceText(ClaimData.COMMENT_CONTENT_EDIT_CARD_3),
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
                withId(ClaimElements.ID_COMMENT_BUTTON_EDIT), // Замените на реальный идентификатор кнопки Edit
                isDescendantOfA(allOf(
                        withId(ClaimElements.ID_CONTAINER_COMMENT_CARD), // Замените на ваш идентификатор контейнера комментариев
                        isDisplayed())
                )
        ));

        editButton.perform(click());
    }

    // клик по Edit внутри COMMENT_3
    public void clickEditInsideComment_3() {
        String commentContent = ClaimData.COMMENT_CONTENT_CARD_3;
        ViewInteraction comment = new CheckUtils().checkInsideCommentContentVisibility(commentContent);
        new ClaimUtils().clickEditInComment(comment);
    }

    public void inputOnTestDataDate() {
        ViewInteraction date = onView(
                allOf(withId(ClaimElements.ID_FIELD_DATE)));
        date.perform(replaceText(ClaimData.FAKE_DATE)); // заменить на валидную дату
        date.check(matches(isDisplayed()));
    }

    public void inputInvalidTestDataDate() {
        ViewInteraction date = onView(
                allOf(withId(ClaimElements.ID_FIELD_DATE)));
        date.perform(replaceText(ClaimData.INV_INPUT_DATE));
        date.check(matches(isDisplayed()));
    }

    public void inputOnTestDataTime() {
        ViewInteraction time = onView(
                allOf(withId(ClaimElements.ID_FIELD_TIME)));
        time.perform(replaceText(ClaimData.FAKE_TIME)); // заменить на валидное время
        time.check(matches(isDisplayed()));
    }

    public void inputInvalidTestDataTime() {
        ViewInteraction time = onView(
                allOf(withId(ClaimElements.ID_FIELD_TIME)));
        time.perform(replaceText(ClaimData.INV_INPUT_TIME));
        time.check(matches(isDisplayed()));
    }




    // набор методов для создания претензии в статусе Open без исполнителя без Comment
    // также использовать этот метод для тест-кейса #10 Перевод в статус In Progress через указание Executor
    // использовать valid Date
    // test-case #7
    public void creatingClaimOpenWithoutExecutor() {
        new ClaimUtils().clickCreateClaim();
        new CheckUtils().checkAllFieldsAndButtonsVisibility();
        new ClaimUtils().inputTestDataInTitleNewClaim_1();             // fake data заменить на valid Date
        new ClaimUtils().inputEmptyInExecutorNewClaim();               // оставляем пустым
        new ClaimUtils().inputOnTestDataDate();                        // fake data заменить на valid Date
        new ClaimUtils().inputOnTestDataTime();                        // fake data заменить на valid Date
        new ClaimUtils().inputTestDataInDiscription_1_NewClaim();       // fake data заменить на valid Date
        new CheckUtils().checkButtonSaveVisibility();
        new ClaimUtils().clickButtonSave();
    }

    // набор методов для создания претензии в статусе In Progress без Comment
    // использовать invalid Date для ускорения поиска в списке
    // test-case #8
    public void creatingClaimInProgress_8() {
        new ClaimUtils().clickCreateClaim();         //
        new CheckUtils().checkAllFieldsAndButtonsVisibility();         //
        new ClaimUtils().inputTestDataInTitleNewClaim_2();             //
        new ClaimUtils().inputTestDataInExecutorNewClaim();            //
        new ClaimUtils().inputInvalidTestDataDate();                   // не валидная DATE
        new ClaimUtils().inputOnTestDataTime();                        // валидное TIME
        new ClaimUtils().inputTestDataInDiscription_2_NewClaim();       // редактировать
        new CheckUtils().checkButtonSaveVisibility();
        new ClaimUtils().clickButtonSave();
        // актуальные данные 02.09.23
    }

    // набор методов для редактирования претензии в статусе Open через "take to work"
    // (предварительно в тесте создать new Claim Open без Executor)
    // создается Comment и редактируется
    // использовать invalid Date для ускорения поиска в списке
    // test-case #9
    public void editingClaimFromOpenToInProgress_9() {
        String cardText = ClaimData.TOPIC_3;
        int cardIndex = 0;
//        new ClaimUtils().clickCreateClaim();           // создаем новую Claim
//        new CheckUtils().checkAllFieldsAndButtonsVisibility();
//        new ClaimUtils().inputTestDataInTitleNewClaim_3();
////        new ClaimUtils().inputTestDataInExecutorNewClaim();            // создаем Open без Executor
//        new ClaimUtils().inputInvalidTestDataDate();                     // не валидная DATE
//        new ClaimUtils().inputOnTestDataTime();                          // валидное TIME
//        new ClaimUtils().inputTestDataInDiscription_3_NewClaim();
//        new CheckUtils().checkButtonSaveVisibility();
//        new ClaimUtils().clickButtonSave();

        // находим созданную Claim
        new ClaimUtils().clickFilters();
        new ClaimUtils().clickInProgress();                               // снимаем чек-бокс In Progress / включен Open
        new ClaimUtils().clickOk();
        new ClaimUtils().searchClaimByTopic_3();                          // ищем Claim по Topic
        new ClaimUtils().clickExpend();                 // открываем Claim

        // методы редактирования Claim: создание Comment
        new ClaimUtils().clickAddComment();
        new ClaimUtils().inputComment_3();                                // вводим текст Comment
        new CheckUtils().checkButtonSaveComment();                        // проверяем, что кнопка SAVE видна
        new CheckUtils().checkButtonCancelComment();                      // проверяем, что кнопка CANCEL видна
        new ClaimUtils().clickCancelComment();                            // тестируем отмену создания Comment
        new CheckUtils().checkComment_3_NotVisibility();                  // проверяем, что Comment НЕ отображается в раскрытой Claim
        new ClaimUtils().clickAddComment();                               // повторно создаем Comment
        new ClaimUtils().inputComment_3();                                // повторно вводим текст Comment
        new ClaimUtils().clickSaveComment();                              // сохраняем введенные значения Comment
        new ClaimUtils().searchComment_3_ByContent();                     // находим созданный Comment
        new CheckUtils().checkCommentContentVisibility_9();               // проверяем, что Comment отображается в раскрытой Claim

       // методы редактирования Claim: редактирование существующего Comment
        new ClaimUtils().clickEditInsideComment_3();                        // клик на  Edit в редактируемом Comment
        new ClaimUtils().inputEditComment_3();                              // редактируем созданный Comment
        new ClaimUtils().clickSaveComment();                                // сохраняем введенные значения Comment
        new ClaimUtils().searchComment_3_EditByContent();                   // проверяем, что отредактированный Comment отображается в Claim

        // методы изменения статуса Claim
        new ClaimUtils().clickChangeStatusClaimWithOpenStatus();            // клик по Change Status в раскрытой Claim
        new ClaimUtils().clickChangeStatusTakeToWork();                     // клик по take to work
        new ClaimUtils().clickClose();

    }

    // набор методов для редактирования претензии в статусе Open через назначение Executor
    // предварительно в тесте создать new Claim Open без Executor
    // использовать invalid Date для ускорения поиска в списке
//    public void editingClaimFromOpenToInProgressPart_2() {        // case #10
//        new ClaimUtils().clickCreateClaim(cardIdlingResource);
//        new CheckUtils().checkAllFieldsAndButtonsVisibility();
//        new ClaimUtils().inputTestDataInTitleNewClaim();          // редактировать на новый Title
//        new ClaimUtils().inputTestDataInExecutorNewClaim();
//        new ClaimUtils().inputOnTestDataDate();                   // редактировать
//        new ClaimUtils().inputOnTestDataTime();                   // редактировать
//        new ClaimUtils().inputTestDataInDiscriptionNewClaim();    // редактировать
//        new CheckUtils().checkButtonSaveVisibility();
//        new ClaimUtils().clickButtonSave();
//    }

    // набор методов для редактирования претензии в статусе In Progress через "Throw off"
    // предварительно в тесте создать new Claim In Progress
    // использовать invalid Date для ускорения поиска в списке
//    public void editingClaimFromInProgressToOpen() {              // case #11
//        new ClaimUtils().clickCreateClaim(cardIdlingResource);
//        new CheckUtils().checkAllFieldsAndButtonsVisibility();
//        new ClaimUtils().inputTestDataInTitleNewClaim();          // редактировать на новый Title
//        new ClaimUtils().inputTestDataInExecutorNewClaim();
//        new ClaimUtils().inputOnTestDataDate();                   // редактировать
//        new ClaimUtils().inputOnTestDataTime();                   // редактировать
//        new ClaimUtils().inputTestDataInDiscriptionNewClaim();    // редактировать
//        new CheckUtils().checkButtonSaveVisibility();
//        new ClaimUtils().clickButtonSave();
//    }


    // набор методов поиска (скроллинга списка) карточек по значению TOPIC
    // в каждом отдельном методе поиска соответствующие тестовые данные

    // в  методе searchClaimByTopic_1() после предварительного тестирования заменить на valid TOPIC_1
    public boolean searchClaimByTopic_1() {
        Matcher<View> matcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.FAKE_TITLE), isDisplayed());
        boolean found = UtilsHelper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + ClaimData.FAKE_TITLE + "is not successful");
        }
    }

    public boolean searchClaimByTopic_2() {
        Matcher<View> matcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_2), isDisplayed());
        boolean found = UtilsHelper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + ClaimData.TOPIC_2 + "is not successful");
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
                withId(ClaimElements.ID_TOPIC_TEXT_LIST),
                withText(ClaimData.TOPIC_3),
                isDisplayed()
        );

        boolean endScroll = true; // Проверьте, что этот флаг установлен в true


        boolean found = UtilsHelper.searchInClaimsList(matcher, endScroll);


        if (found) {

            onView(matcher).check(matches(isDisplayed()));
            utilsHelper.timerWaitingAsynchOperation3000();
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
        Matcher<View> matcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_4), isDisplayed());
        boolean found = UtilsHelper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + ClaimData.TOPIC_4 + "is not successful");
        }
    }

    public boolean searchClaimByTopic_5() {
        Matcher<View> matcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_5), isDisplayed());
        boolean found = UtilsHelper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + ClaimData.TOPIC_5 + "is not successful");
        }
    }

    public boolean searchClaimByTopic_6() {
        Matcher<View> matcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_6), isDisplayed());
        boolean found = UtilsHelper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + ClaimData.TOPIC_6 + "is not successful");
        }
    }

    public boolean searchClaimByTopic_7() {
        Matcher<View> matcher = allOf(withId(ClaimElements.ID_TOPIC_TEXT_LIST), withText(ClaimData.TOPIC_7), isDisplayed());
        boolean found = UtilsHelper.searchInClaimsList(matcher, false);

        if (found) {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } else {
            throw new NoSuchElementException("topic search:" + ClaimData.TOPIC_7 + "is not successful");
        }
    }

    // Editing Claim
    public void clickEditClaim() {
        ViewInteraction edit = onView(
                allOf(withId(ClaimElements.ID_EDIT_CARD_BUTTON_CARD),
                        withContentDescription(ClaimData.EDIT_CARD_BUTTON_TEXT_CARD),
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
                    allOf(withId(ClaimElements.ID_CHANGE_STATUS_ICON_CARD), withContentDescription(ClaimData.CHANGE_STATUS_TEXT_CARD),
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
                allOf(withId(ClaimElements.ID_CHANGE_THROW_OFF_CARD), withText(ClaimData.CHANGE_THROW_OFF_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        throwOff.perform(click());
    }

    // клик по строке execute в модальном окне Смена статуса в карточке In Progress
    public void clickChangeStatusToExecute () {
        ViewInteraction execute = onView(
                allOf(withId(ClaimElements.ID_CHANGE_TO_EXECUTE_CARD), withText(ClaimData.CHANGE_TO_EXECUTE_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        execute.perform(click());
    }

    // клик по строке в модальном окне Смена статуса в карточке Open
    public void clickChangeStatusTakeToWork () {
        ViewInteraction take_to_work = onView(
                allOf(withId(ClaimElements.ID_CHANGE_TAKE_TO_WORK_CARD), withText(ClaimData.CHANGE_TAKE_TO_WORK_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        take_to_work.perform(click());
    }

    // клик по строке cancel в модальном окне Смена статуса в карточке Open
    public void clickChangeStatusCancel () {
        ViewInteraction cancel = onView(
                allOf(withId(ClaimElements.ID_CHANGE_CANCEL_CARD), withText(ClaimData.CHANGE_CANCEL_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        cancel.perform(click());
    }

    // кнопка Save на странице Creating Claim
    public void clickButtonSave () {
//        new UtilsHelper().beginAsyncOperation();
        ViewInteraction save = onView(
                allOf(withId(ClaimElements.ID_SAVE_CREATING_Claims),
                        withText(ClaimData.SAVE_CREATING_CLAIMS),
                        withContentDescription(ClaimData.SAVE_CREATING_CLAIMS)));
        save.perform(scrollTo(), click());
//        new UtilsHelper().endAsyncOperation();
    }

    // кнопка Cancel на странице Creating Claim
    public void clickButtonCancel () {
//        new UtilsHelper().beginAsyncOperation();
        ViewInteraction cancel = onView(
                allOf(withId(ClaimElements.ID_CANCEL_CREATING_Claims),
                        withText(ClaimData.CANCEL_CREATING_CLAIMS),
                        withContentDescription(ClaimData.CANCEL_CREATING_CLAIMS)));
        cancel.perform(scrollTo(), click());
//        new UtilsHelper().endAsyncOperation();
    }

    // модальное окно предупреждения на странице Creating Claim
    public void clickInModalViewButtonCancel () {
//        new UtilsHelper().beginAsyncOperation();
        ViewInteraction cancel = onView(
                allOf(withId(ClaimElements.ID_CANCEL_MODAL_VIEW),
                        withText(ClaimData.CANCEL_MODAL_VIEW_TEXT)));
        cancel.perform(scrollTo(), click());
//        new UtilsHelper().endAsyncOperation();
    }

    // модальное окно предупреждения на странице Creating Claim
    public void clickInModalViewButtonOk () {
//        new UtilsHelper().beginAsyncOperation();
        ViewInteraction ok = onView(
                allOf(withId(ClaimElements.ID_OK_MODAL_VIEW),
                        withText(ClaimData.OK_MODAL_VIEW_TEXT)));
        ok.perform(scrollTo(), click());
//        new UtilsHelper().endAsyncOperation();
    }
}


