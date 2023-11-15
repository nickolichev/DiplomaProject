package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.swipeUp;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.contrib.RecyclerViewActions.scrollToPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.IdlingResource;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.PerformException;
import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.idling.CountingIdlingResource;
import androidx.test.espresso.matcher.BoundedMatcher;
import androidx.test.espresso.matcher.ViewMatchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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

    @DisplayName("метод обхода BUG в test-case #7 / При создании Claim вставляем дату, но при проверке созданной Claim видим Time +1 час")
        public static String addOneHour(String inputTime) {
        DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
            // Преобразование строки в LocalTime
            LocalTime time = LocalTime.parse(inputTime, TIME_FORMATTER);

            // Увеличение времени на 1 час
            LocalTime newTime = time.plusHours(2);

            // Форматирование нового времени в строку
            return newTime.format(TIME_FORMATTER);
        }

    @DisplayName("метод обхода BUG в test-case #7 / При создании Comment / генерируется дата -1 день к дате создания Claim, хотя Comment создается в эту же дату")
    public static String subtractOneDay(String inputDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());

        try {
            // Преобразование строки в Date
            Date date = dateFormat.parse(inputDate);

            // Уменьшение даты на 1 день
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, -1);

            // Получение новой даты
            Date newDate = calendar.getTime();

            // Форматирование новой даты в строку
            return dateFormat.format(newDate);
        } catch (ParseException e) {
            e.printStackTrace(); // Обработка или логирование исключения
            return null; // или другой подходящий результат в случае ошибки
        }
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

    public static boolean tryClickOnListItemByTextWithoutScrolling(String topicText)  {
        try {
            Matcher<View> topicTextMatcher = ViewMatchers.hasDescendant(
                    ViewMatchers.withText(topicText)
            );

            System.out.println("tryClickOnListItemByTextWithoutScrolling - start: " + topicText);

            onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed()))
                    .perform(RecyclerViewActions.actionOnItem(topicTextMatcher, click()));

            System.out.println("tryClickOnListItemByTextWithoutScrolling - clicked!");
            return true;
        } catch (NoMatchingViewException ex) {
            System.out.println("tryClickOnListItemByTextWithoutScrolling - didn't find");
            System.out.println("exc:" + ex.toString());
            return false;
        }
    }

    @DisplayName("скроллинг листа CLAIMS")
    public static int findListItemByText(String topicText) {
        int maxScrollAttempts = 400; // Максимальное количество попыток скроллинга

        Matcher<View> topicTextMatcher = allOf(
                withId(Elements_Claim.ID_TOPIC_TEXT_LIST),
                withText(topicText),
                isDisplayed());
        int pos;
        System.out.println("start scrolling");
        for (pos = 0; pos <= maxScrollAttempts; pos++) {
            onView(allOf(
                    withId(Elements_Claim.ID_LIST_CARDS),
                    isDisplayed()))
                    .perform(RecyclerViewActions.scrollToPosition(pos));
            try {
                System.out.println("on position " + pos);
                onView(withIndex(topicTextMatcher, 0))
                        .check(matches(isDisplayed()));
                System.out.println("Found position " + pos+", break");
                break; // Элемент найден, выходим из цикла
            } catch (NoMatchingViewException ex) {
                // Элемент не найден, продолжаем скроллинг
            }
        }

        if (pos > maxScrollAttempts) {
            System.out.println("Did not find position");
            return -1;
        }
        System.out.println("Exiting with found position " + pos);
        return pos;
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

    static Matcher<View> childAtPositionCalendar(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
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

    @DisplayName("Под WaitFor, который не является стандартным методом Espresso")
    public static ViewAction waitFor(final Matcher<View> viewMatcher, final long millis) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return ViewMatchers.isAssignableFrom(View.class);
            }

            @Override
            public String getDescription() {
                return "Wait for " + millis + " milliseconds.";
            }

            @Override
            public void perform(UiController uiController, View view) {
                final IdlingResource idlingResource = new ViewIdlingResource(viewMatcher, view);
                try {
                    IdlingRegistry.getInstance().register(idlingResource);
                    uiController.loopMainThreadForAtLeast(millis);
                } finally {
                    IdlingRegistry.getInstance().unregister(idlingResource);
                }
            }
        };
    }

    @DisplayName("Под public static ViewAction waitFor")
    private static class ViewIdlingResource implements IdlingResource {
        private final Matcher<View> viewMatcher;
        private final View view;
        private ResourceCallback resourceCallback;

        ViewIdlingResource(Matcher<View> viewMatcher, View view) {
            this.viewMatcher = viewMatcher;
            this.view = view;
        }

        @Override
        public String getName() {
            return "ViewIdlingResource";
        }

        @Override
        public boolean isIdleNow() {
            boolean idle = viewMatcher.matches(view);
            if (idle && resourceCallback != null) {
                resourceCallback.onTransitionToIdle();
            }
            return idle;
        }

        @Override
        public void registerIdleTransitionCallback(ResourceCallback resourceCallback) {
            this.resourceCallback = resourceCallback;
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

