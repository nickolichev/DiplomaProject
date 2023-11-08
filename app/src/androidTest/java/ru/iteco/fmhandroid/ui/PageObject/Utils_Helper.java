package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.swipeUp;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.contrib.RecyclerViewActions.scrollToPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.PerformException;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.idling.CountingIdlingResource;
import androidx.test.espresso.matcher.BoundedMatcher;
import androidx.test.espresso.matcher.ViewMatchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Claim;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Main;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_News;


public class Utils_Helper {

    public static void swipeDown() {
        // Найдите элемент, на котором хотите выполнить свайп
        ViewInteraction elementToSwipe = onView(allOf(withId(Elements_Main.ID_TRADE_MARK), isDisplayed()));

        // Выполните свайп вниз
        elementToSwipe.perform(ViewActions.swipeDown());

        // Дождитесь завершения асинхронных операций
//        cardIdlingResource.waitUntilIdle();
    }

    public static int getPositionOfClaim(Matcher<View> matcher) {
        // Создаем Matcher для элемента внутри RecyclerView
        Matcher<View> recyclerViewItemMatcher = allOf(
                isDescendantOfA(withId(Elements_Claim.ID_LIST_CARDS)),
                matcher
        );

        // Проверяем каждый элемент RecyclerView
        for (int i = 0; ; i++) {
            try {
                // Пробуем найти элемент на текущей позиции
                onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed()))
                        .check(matches(atPosition(i, recyclerViewItemMatcher)));

                // Если элемент найден, возвращаем его позицию
                return i;
            } catch (NoMatchingViewException e) {
                // Если элемент не найден, то продолжаем поиск
            }
        }
    }

    public static int getPositionOfItemInView(Matcher<View> matcher) {
    // Ищем элемент внутри RecyclerView, соответствующий заданному Matcher
    onData(matcher).inAdapterView(withId(R.id.claim_list_recycler_view)).atPosition(0).check(matches(isDisplayed()));

    // Возвращаем позицию элемента
    return 0; // Здесь пока просто возвращается 0, нужно дополнить код для получения позиции
}
    public static Matcher<View> atPosition(final int position, final Matcher<View> itemMatcher) {
        return new BoundedMatcher<View, RecyclerView>(RecyclerView.class) {
            @Override
            public void describeTo(Description description) {
                description.appendText("has item at position " + position + ": ");
                itemMatcher.describeTo(description);
            }

            @Override
            protected boolean matchesSafely(RecyclerView recyclerView) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null && position >= 0 && position < adapter.getItemCount()) {
                    RecyclerView.ViewHolder viewHolder = recyclerView.findViewHolderForAdapterPosition(position);
                    return viewHolder != null && itemMatcher.matches(viewHolder.itemView);
                }
                return false;
            }
        };
    }

    public static boolean isViewDisplayed(Matcher<View> matcher) {
        try {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } catch (NoMatchingViewException | AssertionError e) {
            return false;
        }
    }

    @DisplayName("метод ожидания по таймеру с инкрементацией + декрементацией счетчика ассинхронных операций на 500 мс")
    public void timerWaitingAsyncOperation500() {
        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;

        // Увеличьте счетчик асинхронных операций перед началом ожидания
        idlingResource.increment();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Уменьшите счетчик асинхронных операций после окончания ожидания
            idlingResource.decrement();
        }
    }

    @DisplayName("метод ожидания по таймеру с инкрементацией + декрементацией счетчика ассинхронных операций на 1000 мс")
    public void timerWaitingAsyncOperation1000() {
        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;

        // Увеличьте счетчик асинхронных операций перед началом ожидания
        idlingResource.increment();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Уменьшите счетчик асинхронных операций после окончания ожидания
            idlingResource.decrement();
        }
    }

    @DisplayName("метод ожидания по таймеру с инкрементацией + декрементацией счетчика ассинхронных операций на 2000 мс")
    public void timerWaitingAsyncOperation2000() {
        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;

        // Увеличьте счетчик асинхронных операций перед началом ожидания
        idlingResource.increment();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Уменьшите счетчик асинхронных операций после окончания ожидания
            idlingResource.decrement();
        }
    }

    @DisplayName("метод ожидания по таймеру с инкрементацией + декрементацией счетчика ассинхронных операций на 3000 мс")
    public void timerWaitingAsyncOperation3000() {
        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;

        // Увеличьте счетчик асинхронных операций перед началом ожидания
        idlingResource.increment();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Уменьшите счетчик асинхронных операций после окончания ожидания
            idlingResource.decrement();
        }
    }

    @DisplayName("метод ожидания по таймеру с инкрементацией + декрементацией счетчика ассинхронных операций на 5000 мс")
    public void timerWaitingAsyncOperation5000() {
        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;

        // Увеличьте счетчик асинхронных операций перед началом ожидания
        idlingResource.increment();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Уменьшите счетчик асинхронных операций после окончания ожидания
            idlingResource.decrement();
        }
    }

    @DisplayName("метод ожидания по таймеру с инкрементацией + декрементацией счетчика ассинхронных операций на 20000 мс")
    public void timerWaitingAsyncOperation20000() {
        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;

        // Увеличьте счетчик асинхронных операций перед началом ожидания
        idlingResource.increment();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Уменьшите счетчик асинхронных операций после окончания ожидания
            idlingResource.decrement();
        }
    }
    @DisplayName("вспомогательный метод для взаимодействия с view при открытом модальном окне")
    public void backSystemButton() {
        Espresso.pressBack();
    }

    public static boolean isItemAtPositionVisible(int position) {
        try {
            onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed()))
                    .perform(scrollToPosition(position));
            return true;
        } catch (NoMatchingViewException e) {
            return false;
        }
    }

    @DisplayName("скроллинг листа NEWS")
    public static boolean searchTopicInNewsList(Matcher<View> matcher, boolean endScroll) {
        try {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } catch (NoMatchingViewException ignored) {
        }

        boolean invisible = true;
        int n = 1;
        while (invisible && n <= 100) {
            try {
                onView(allOf(withId(Elements_News.ID_LIST_NEWS), isDisplayed())).perform(actionOnItemAtPosition(n, swipeUp()));
            } catch (PerformException e) {
                return false;
            }

            try {
                onView(matcher).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
                return true;
            } catch (NoMatchingViewException ignored) {
            }

            n++;

            if (endScroll) {
                try {
                    onView(allOf(withId(Elements_News.ID_LIST_NEWS), isDisplayed())).perform(actionOnItemAtPosition(n, swipeUp()));
                } catch (PerformException e) {
                    return false;
                }
            }
        }

        return false;
    }

    @DisplayName("скроллинг листа CLAIMS")
    public static boolean searchInClaimsList(Matcher<View> matcher, boolean endScroll) {
        int maxScrollAttempts = 400; // Максимальное количество попыток скроллинга
        boolean found = false; // Флаг для успешной попытки

        for (int attempt = 1; attempt <= maxScrollAttempts; attempt++) {

            try {
                // Проверяем, если элемент видим на экране
                onView(matcher).check(matches(allOf(isCompletelyDisplayed(), isDisplayed())));
                found = true;
                break; // Элемент найден, выходим из цикла
            } catch (NoMatchingViewException ignored) {
                // Элемент не найден, продолжаем скроллинг
            }

            if (attempt < maxScrollAttempts) {
                // new UtilsHelper().beginAsyncOperation();
                // Делаем скроллинг только если не последняя попытка
                Espresso.onView(allOf(
                        withId(Elements_Claim.ID_LIST_CARDS),
                                isDisplayed()))
                        .perform(RecyclerViewActions.scrollToPosition(attempt));
            } else {
                if (!endScroll && !found) {
                    break;               // Карточка не найдена после нескольких попыток и endScroll=false, выходим из цикла
                }
            }
        }
        return found;
    }

//    @DisplayName("скроллинг листа CLAIMS")
//    public static int findListItemByText(String topicText) {
//        int maxScrollAttempts = 400; // Максимальное количество попыток скроллинга
//
//        Matcher<View> topicTextMatcher = allOf(
//                withId(Elements_Claim.ID_TOPIC_TEXT_LIST),
//                withText(topicText),
//                isDisplayed());
//        int pos;
//        System.out.println("start scrolling");
//        pos = findListItemAmongVisible(topicText);
//        if (pos != -1) {
//            return pos;
//        }
//        for (pos = 0; pos <= maxScrollAttempts; pos++) {
//            onView(allOf(
//                    withId(Elements_Claim.ID_LIST_CARDS),
//                    isDisplayed()))
//                    .perform(RecyclerViewActions.scrollToPosition(pos));
//            try {
//                System.out.println("on position " + pos);
//                onView(withIndex(topicTextMatcher, 0))
//                        .check(matches(isDisplayed()));
//                System.out.println("Found position " + pos+", break");
//                break; // Элемент найден, выходим из цикла
//            } catch (NoMatchingViewException ex) {
//                // Элемент не найден, продолжаем скроллинг
//            }
//        }

//        if (pos > maxScrollAttempts) {
//            System.out.println("Did not find position");
//            return -1;
//        }
//        System.out.println("Exiting with found position " + pos);
//        return pos;
//    }

//    private static int findListItemAmongVisible(String topicText) {
//        Matcher<View> topicTextMatcher = allOf(
//                withId(Elements_Claim.ID_TOPIC_TEXT_LIST),
//                withText(topicText),
//                isDisplayed());
//        // Iterate through the cards
//        System.out.println("findListItemAmongVisible - start");
//        for (int i = 0; i < 7; i++) {
//            // Find the card view with the same id and index i
//            try {
//                System.out.println("on position " + i);
//                onView(childCardAtPositionWithTopicTextUnderParent(
//                        withId(R.id.claim_list_recycler_view),
//                        i,
//                        topicText))
//                        .check(matches(isDisplayed()));
////                onView(childCardAtPositionWithTopicText(topicTextMatcher, i))
////                        .check(matches(isDisplayed()));
//                System.out.println("Found position " + i+", break");
//                break; // Элемент найден, выходим из цикла
//            } catch (NoMatchingViewException ex) {
//                // Элемент не найден, продолжаем скроллинг
//                System.out.println("NoMatchingViewException " + ex.toString());
//            } catch (Exception ex) {
//                System.out.println("Exception found! " + ex.toString());
//                return -1;
//            }
//        }
//        return -1;
//    }

    private static int getParentLevel() {
        String topicText = "Fake Title iteration #2";
        try {
            onView(allOf(withId(R.id.description_material_text_view),
                    withText(topicText),
                    withParent(withParent(withParent(withId(R.id.claim_list_recycler_view))))
            ))
                    .check(matches(isDisplayed()));
            return 3;
        } catch (Exception ex) {
        }

        try {
            onView(allOf(withId(R.id.description_material_text_view),
                    withText(topicText),
                    withParent(withParent(withParent(withParent(withId(R.id.claim_list_recycler_view)))))
            ))
                    .check(matches(isDisplayed()));
            return 4;
        } catch (Exception ex) {
        }

        try {
            onView(allOf(withId(R.id.description_material_text_view),
                    withText(topicText),
                    withParent(withParent(withParent(withParent(withParent(withId(R.id.claim_list_recycler_view))))))
            ))
                    .check(matches(isDisplayed()));
            return 5;
        } catch (Exception ex) {
        }

        return -1;
    }

    // скроллинг списка Comment в раскрытой карточке
    @DisplayName("скроллинг списка Comment в раскрытой карточке CLAIM")
    public static boolean searchInCommentList(Matcher<View> matcher, boolean endScroll) {
        try {
            onView(matcher).check(matches(isDisplayed()));
            return true;
        } catch (NoMatchingViewException ignored) {
        }

        boolean invisible = true;
        int n = 1;
        while (invisible && n <= 5) {
            try {
                onView(allOf(withId(Elements_Claim.ID_LIST_COMMENT_CARD), isDisplayed())).perform(actionOnItemAtPosition(n, swipeUp()));
            } catch (PerformException e) {
                return false;
            }

            try {
                onView(matcher).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
                return true;
            } catch (NoMatchingViewException ignored) {
            }

            n++;

            if (endScroll) {
                try {
                    onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed())).perform(actionOnItemAtPosition(n, swipeUp()));
                } catch (PerformException e) {
                    return false;
                }
            }
        }
        return false;
    }

    @DisplayName("создание Hamcrest матчера, который ищет дочерний элемент внутри родительского элемента на указанной позиции")
    public static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {
        // Создание нового TypeSafeMatcher для работы с элементами пользовательского интерфейса
        return new TypeSafeMatcher<View>() {
            // Метод describeTo используется для описания ожидаемого поведения матчера
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                // Добавление описания родительского матчера в описание
                parentMatcher.describeTo(description);
            }
            // Метод matchesSafely проверяет, соответствует ли элемент view критериям поиска
            @Override
            public boolean matchesSafely(View view) {
                // Получение родительского элемента view
                ViewParent parent = view.getParent();
                // Проверка, что родитель - это ViewGroup и он соответствует критериям parentMatcher
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        // Проверка, что элемент view находится на указанной позиции внутри ViewGroup
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }

//    @DisplayName("создание Hamcrest матчера, который ищет дочерний элемент внутри родительского элемента на указанной позиции")
//    public static org.hamcrest.Matcher<View> childCardAtPositionWithTopicTextUnderParent(
//            final Matcher<View> parentMatcher,
//            final int position,
//            final String topicText) {
//        // Создание нового TypeSafeMatcher для работы с элементами пользовательского интерфейса
//        return new TypeSafeMatcher<View>() {
//            // Метод describeTo используется для описания ожидаемого поведения матчера
//            @Override
//            public void describeTo(Description description) {
//                description.appendText("Child with topic at position " + position + " in parent ");
//                // Добавление описания родительского матчера в описание
//                parentMatcher.describeTo(description);
//            }
//            // Метод matchesSafely проверяет, соответствует ли элемент view критериям поиска
//            @Override
//            public boolean matchesSafely(View view) {
//
//                if (!parentMatcher.matches(view)) {
//                    return false;
//                }
//                System.out.println("matchesSafely - start");
//                View container2 = ((ViewGroup) view).getChildAt(position);
//
//                try {
////                    onView(allOf(
////                            withId(R.id.description_material_text_view),
////                            withText(topicText),
////                            withParent(withParent(withId(R.id.claim_list_recycler_view)))
////                    ))
////                            .check(matches(isDisplayed()));
//                    ViewInteraction child = onView(allOf(
//                            withId(R.id.description_material_text_view),
//                            withText(topicText)));
//                    child.check(matches(isDescendantOfA(parentMatcher)));
//                    return true;
//                } catch (NoMatchingViewException ex) {
//                    return false;
//                }
//            }
//        };
//    }

    @DisplayName("создание Hamcrest матчера, который ищет дочерний элемент внутри родительского элемента на указанной позиции")
    public static Matcher<View> childCardAtPositionWithTopicText(
            final Matcher<View> parentMatcher, final int position) {
        // Создание нового TypeSafeMatcher для работы с элементами пользовательского интерфейса
        return new TypeSafeMatcher<View>() {
            // Метод describeTo используется для описания ожидаемого поведения матчера
            @Override
            public void describeTo(Description description) {
                description.appendText("Child with topic at position " + position + " in parent ");
                // Добавление описания родительского матчера в описание
                parentMatcher.describeTo(description);
            }
            // Метод matchesSafely проверяет, соответствует ли элемент view критериям поиска
            @Override
            public boolean matchesSafely(View view) {

                if (!parentMatcher.matches(view)) {
                    return false;
                }
                System.out.println("matchesSafely - start");
                System.out.println("matchesSafely - matches. " + view.getId());
                // Получение родительского элемента view
                ViewParent parentLevel2 = view.getParent().getParent(); // card
                ViewParent parentLevel3 = parentLevel2.getParent(); //recycler

                if (parentLevel2 instanceof View) {
                    System.out.println("matchesSafely - parentlevel2_id: " + ((View)parentLevel2).getId());
                }
                if (parentLevel3 instanceof View) {
                    System.out.println("matchesSafely - parentlevel3_id: " + ((View)parentLevel3).getId());
                }

                if (parentLevel3 instanceof ViewGroup) {
                    System.out.println("parentLevel3 instanceof ViewGroup:");
                }


                // Проверка, что родитель - это ViewGroup и он соответствует критериям parentMatcher
                return parentLevel3 instanceof ViewGroup
                    // Проверка, что элемент view находится на указанной позиции внутри ViewGroup
                    && parentLevel2.equals(
                        ((ViewGroup) parentLevel3).getChildAt(position)
                );
            }
        };
    }

    public static Matcher<View> withIndex(
            final Matcher<View> parentMatcher, final int index) {
        // Создание нового TypeSafeMatcher для работы с элементами пользовательского интерфейса
        return new TypeSafeMatcher<View>() {
            int curIndex = 0;

            // Метод describeTo используется для описания ожидаемого поведения матчера
            @Override
            public void describeTo(Description description) {
                description.appendText("with index: ");
                description.appendValue(index);
                // Добавление описания родительского матчера в описание
                parentMatcher.describeTo(description);
            }
            // Метод matchesSafely проверяет, соответствует ли элемент view критериям поиска
            @Override
            public boolean matchesSafely(View view) {
                return parentMatcher.matches(view) && curIndex++ == index;
            }
        };
    }

    @DisplayName("Метод проверяет, является ли элемент, представленный ViewInteraction child, потомком элемента, соответствующего parentMatcher")
    public boolean isDescendantOfA(ViewInteraction child, Matcher<View> parentMatcher) {
        try {
            // Проверка, является ли child потомком элемента, соответствующего parentMatcher
            child.check(matches(isDescendantOfA(parentMatcher)));
            // Если проверка успешна, элемент child является потомком элемента, соответствующего parentMatcher
            return true;
        } catch (NoMatchingViewException e) {
            // Если возникает исключение NoMatchingViewException, элемент child не является потомком искомого элемента
            return false;
        }
    }


    @DisplayName("определяется Hamcrest матчер, который проверяет, является ли элемент потомком родительского элемента, соответствующего переданному parentMatcher")
    public static Matcher<View> isDescendantOfA(final Matcher<View> parentMatcher) {
        // Создание нового TypeSafeMatcher для работы с элементами пользовательского интерфейса
        return new TypeSafeMatcher<View>() {
            // Метод describeTo используется для описания ожидаемого поведения матчера
            @Override
            public void describeTo(Description description) {
                description.appendText("is descendant of a parent matching: ");
                // Добавление описания родительского матчера в описание
                parentMatcher.describeTo(description);
            }

            // Метод matchesSafely проверяет, является ли элемент view потомком элемента, соответствующего parentMatcher
            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                // Перебор всех родительских элементов, пока не будет найден родитель, соответствующий parentMatcher
                while (parent != null) {
                    if (parentMatcher.matches(parent)) {
                        return true;
                    }
                    parent = parent.getParent();
                }
                // Если не найдено соответствующего родителя, элемент не является потомком искомого элемента
                return false;
            }
        };
    }
}

