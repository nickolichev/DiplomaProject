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
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.PerformException;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.idling.CountingIdlingResource;
import androidx.test.espresso.matcher.BoundedMatcher;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.platform.app.InstrumentationRegistry;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.resourceIDData.AboutElements;
import ru.iteco.fmhandroid.ui.resourceIDData.ClaimElements;
import ru.iteco.fmhandroid.ui.resourceIDData.MainElements;
import ru.iteco.fmhandroid.ui.resourceIDData.NewsElements;


public class UtilsHelper {

    public static void swipeDown() {
        // Найдите элемент, на котором хотите выполнить свайп
        ViewInteraction elementToSwipe = onView(allOf(withId(MainElements.ID_TRADE_MARK), isDisplayed()));

        // Выполните свайп вниз
        elementToSwipe.perform(ViewActions.swipeDown());

        // Дождитесь завершения асинхронных операций
//        cardIdlingResource.waitUntilIdle();
    }


    public void animation_0() {
        // Отключить анимацию на устройстве
        InstrumentationRegistry.getInstrumentation().getUiAutomation().executeShellCommand("settings put global window_animation_scale 0");
        InstrumentationRegistry.getInstrumentation().getUiAutomation().executeShellCommand("settings put global transition_animation_scale 0");
        InstrumentationRegistry.getInstrumentation().getUiAutomation().executeShellCommand("settings put global animator_duration_scale 0");
    }

    public void animation_1() {
        // восстановить анимацию
        InstrumentationRegistry.getInstrumentation().getUiAutomation().executeShellCommand("settings put global window_animation_scale 1");
        InstrumentationRegistry.getInstrumentation().getUiAutomation().executeShellCommand("settings put global transition_animation_scale 1");
        InstrumentationRegistry.getInstrumentation().getUiAutomation().executeShellCommand("settings put global animator_duration_scale 1");
    }







    public void testLaunchAppActivity() {
        // Запускаем активность AppActivity
        ActivityScenario.launch(AppActivity.class);
    }


//    public void beginAsyncOperation() {
//        // Установить состояние ожидания в false перед началом асинхронной операции
//        ProjectIdlingResources.setIdle(false);
//        // Увеличить счетчик асинхронных операций
//        ProjectIdlingResources.increment();
//        // Зарегистрировать ресурс ожидания
//        IdlingRegistry.getInstance().register(ProjectIdlingResources.idlingResource);
//    }
//
//    public void endAsyncOperation() {
//        // Уменьшить счетчик асинхронных операций
//        ProjectIdlingResources.decrement();
//        // Проверить, если состояние ожидания теперь idle, то сбросить его
//
//        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
//
//        if (ProjectIdlingResources.idlingResource.isIdleNow()) {
////            // Сбросить состояние ожидания
//            ProjectIdlingResources.setIdle(true);
////            // Отменить регистрацию ресурса ожидания
//            IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
//        }
//    }


    public static int getPositionOfClaim(Matcher<View> matcher) {
        // Создаем Matcher для элемента внутри RecyclerView
        Matcher<View> recyclerViewItemMatcher = allOf(
                isDescendantOfA(withId(ClaimElements.ID_LIST_CARDS)),
                matcher
        );

        // Проверяем каждый элемент RecyclerView
        for (int i = 0; ; i++) {
            try {
                // Пробуем найти элемент на текущей позиции
                onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed()))
                        .check(matches(atPosition(i, recyclerViewItemMatcher)));

                // Если элемент найден, возвращаем его позицию
                return i;
            } catch (NoMatchingViewException e) {
                // Если элемент не найден, то продолжаем поиск
            }
        }
    }
//
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

    public void buttonBackAboutUtility() {
        ViewInteraction clickLogOut = onView(
                allOf(withId(AboutElements.ID_BUTTON_BACK)));
        clickLogOut.perform(click());
    }

//    public void timerWaitingAsynchOperation500() {
////        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;
//
//        // Увеличьте счетчик асинхронных операций перед началом ожидания
//        idlingResource.increment();
//
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            // Уменьшите счетчик асинхронных операций после окончания ожидания
//            idlingResource.decrement();
//        }
//    }


    public void timerWaitingAsynchOperation1000() {
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

    public void waitAsynchOperation120000() {
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void timerWaitingAsynchOperation2000() {
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

    public void timerWaitingAsynchOperation3000() {
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

    public void timerWaitingAsynchOperation5000() {
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





//    public void timerWaitingAsynchOperation5000() {
//        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;
//
//        // Увеличьте счетчик асинхронных операций перед началом ожидания
//        idlingResource.increment();
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            // Уменьшите счетчик асинхронных операций после окончания ожидания
//            idlingResource.decrement();
//        }
//    }

    // вспомогательный метод
    public void clickTradeMark() {
        ViewInteraction button = onView(
                allOf(withId(MainElements.ID_TRADE_MARK)));
        button.perform(click());
    }

    // вспомогательный метод
    public void swipeUpOnScreen() {
        onView(withId(MainElements.ID_TRADE_MARK))
                .check(matches(isDisplayed()))
                .perform(swipeUp());
    }

    // вспомогательный метод
    public void backSystemButton() {
        Espresso.pressBack();
    }

    public static boolean isItemAtPositionVisible(int position) {
        try {
            onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed()))
                    .perform(scrollToPosition(position));
            return true;
        } catch (NoMatchingViewException e) {
            return false;
        }
    }
    // скроллинг листа News
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
                onView(allOf(withId(NewsElements.ID_LIST_NEWS), isDisplayed())).perform(actionOnItemAtPosition(n, swipeUp()));
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
                    onView(allOf(withId(NewsElements.ID_LIST_NEWS), isDisplayed())).perform(actionOnItemAtPosition(n, swipeUp()));
                } catch (PerformException e) {
                    return false;
                }
            }
        }

        return false;
    }

    // скроллинг листа Claims
//    public static boolean searchInClaimsList(Matcher<View> matcher, boolean endScroll) {
//        try {
//            onView(matcher).check(matches(isDisplayed()));
//            return true;
//        } catch (NoMatchingViewException ignored) {
//        }
//
//        boolean invisible = true;
//        int n = 1;
//        while (invisible && n <= 100) {
//            try {
//                onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed())).perform(actionOnItemAtPosition(n, swipeUp()));
//            } catch (PerformException e) {
//                return false;
//            }
//
//            try {
//                onView(matcher).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
//                return true;
//            } catch (NoMatchingViewException ignored) {
//            }
//
//            n++;
//
//            if (endScroll) {
//                try {
//                    onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed())).perform(actionOnItemAtPosition(n, swipeUp()));
//                    // Добавляем ожидание, чтобы убедиться, что карточка осталась на экране после скроллинга
//                    onView(matcher).check(matches(isDisplayed()));
//                } catch (PerformException e) {
//                    return false;
//                }
//            }
//
////            new UtilsHelper().waitAsynchOperation2000();
//        }
//
//        return false;
//    }

    // метод очень хорошо скроллит, но не останавливается Доработать
//    public static boolean searchInClaimsList(Matcher<View> matcher, boolean endScroll) {
//        int maxScrollAttempts = 100; // Максимальное количество попыток скроллинга
//
//        for (int attempt = 1; attempt <= maxScrollAttempts; attempt++) {
//            try {
//                // Прокручиваем список к элементу совпадающему с матчером
//                Espresso.onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed()))
//                        .perform(RecyclerViewActions.scrollTo(matcher));
//
//                // Проверяем видимость элемента
//                onView(matcher).check(matches(isDisplayed()));
//                return true; // Найдена карточка
//            } catch (NoMatchingViewException ignored) {
//            } catch (PerformException e) {
//                // Достигнут конец списка, продолжаем скроллинг
//                if (attempt < maxScrollAttempts) {
//                    Espresso.onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed()))
//                            .perform(RecyclerViewActions.scrollToPosition(attempt * 1));
//                } else {
//                    return false; // Карточка не найдена после нескольких попыток
//                }
//            }
//
//            // Добавляем ожидание между попытками скроллинга
//            try {
//                Thread.sleep(500); // Подождать 2 секунды перед следующей попыткой
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        return false; // Карточка не найдена после нескольких попыток
//    }

    // метод от 6 сентября Перестал останавливаться скроллинг До этого вроде работал
//    public static boolean searchInClaimsList(Matcher<View> matcher, boolean endScroll) {
//        int maxScrollAttempts = 50; // Максимальное количество попыток скроллинга
//        boolean found = false; // Флаг для успешной попытки
//
//        for (int attempt = 1; attempt <= maxScrollAttempts; attempt++) {
//            try {
//                // Прокручиваем список к элементу совпадающему с матчером
//                Espresso.onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed()))
//                        .perform(RecyclerViewActions.scrollTo(matcher));
//
//                // Проверяем видимость элемента
//                onView(matcher).check(matches(isDisplayed()));
//                found = true; // Устанавливаем флаг успешной попытки
//                return true; // Найдена карточка
//            } catch (NoMatchingViewException ignored) {
//            } catch (PerformException e) {
//                // Достигнут конец списка, карточка не найдена
//                if (attempt < maxScrollAttempts) {
//                    Espresso.onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed()))
//                            .perform(RecyclerViewActions.scrollToPosition(attempt * 1));
//                } else {
//                    if (!endScroll && !found) {
//                        return false; // Карточка не найдена после нескольких попыток и endScroll=false
//                    }
//                }
//            }
//
//            // Добавляем ожидание между попытками скроллинга
//            try {
//                Thread.sleep(500); // Подождать 2 секунды перед следующей попыткой
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        return false; // Карточка не найдена после нескольких попыток
//    }

    // метод от 7 сентября 20.03
    // Исправляем ошибку остановки скроллинга
    // в составе двух других = скроллинг останавливается не сразу
    // открывается первая в общем списке карточка


    public static boolean searchInClaimsList(Matcher<View> matcher, boolean endScroll) {
        int maxScrollAttempts = 100; // Максимальное количество попыток скроллинга
        boolean found = false; // Флаг для успешной попытки

        for (int attempt = 1; attempt <= maxScrollAttempts; attempt++) {

            try {
//                new UtilsHelper().beginAsyncOperation();
                // Проверяем, если элемент видим на экране
                onView(matcher).check(matches(allOf(isCompletelyDisplayed(), isDisplayed())));
                found = true;
//                new UtilsHelper().endAsyncOperation();
                break; // Элемент найден, выходим из цикла
            } catch (NoMatchingViewException ignored) {
                // Элемент не найден, продолжаем скроллинг
            }

            if (attempt < maxScrollAttempts) {
//                new UtilsHelper().beginAsyncOperation();
                // Делаем скроллинг только если не последняя попытка
                Espresso.onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed()))
                        .perform(RecyclerViewActions.scrollToPosition(attempt * 1));
//                new UtilsHelper().endAsyncOperation();
            } else {
                if (!endScroll && !found) {
                    break; // Карточка не найдена после нескольких попыток и endScroll=false, выходим из цикла
                }
            }
        }

        return found;
    }














    // не скролит Попытка сделать более плавным скроллинг
//    public static boolean searchInClaimsList(Matcher<View> matcher, boolean endScroll) {
//        int maxScrollAttempts = 100;
//        int scrollStep = 1;
//
//        for (int scrollAttempt = 0; scrollAttempt < maxScrollAttempts; scrollAttempt++) {
//            try {
//                onView(matcher).check(matches(isDisplayed()));
//                return true;
//            } catch (NoMatchingViewException ignored) {
//            }
//
//            try {
//                // Выполняем плавный скроллинг вниз с использованием анимации прокрутки
//                onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed()))
//                        .perform(scrollTo())
//                        .check(matches(isDisplayed()))
//                        .perform(swipeUp());
//            } catch (PerformException e) {
//                return false; // Если не удалось прокрутить дальше, завершаем поиск
//            }
//
//            try {
//                onView(matcher).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
//                return true;
//            } catch (NoMatchingViewException ignored) {
//            }
//
//            scrollStep++;
//
//            if (!endScroll && scrollStep >= getItemCount()) {
//                return false; // Если достигнут конец списка и endScroll = false, завершаем поиск
//            }
//
//            new UtilsHelper().waitAsynchOperation2000(); // Добавьте ожидание по желанию
//        }
//
//        return false;
//    }
//
//
//    private static int getItemCount() {
//        // Реализуйте этот метод, чтобы получить общее количество элементов в списке.
//        // Это может потребовать чтения данных из вашего адаптера или списка.
//        // Верните 0, если количество элементов неизвестно.
//        return 0;
//    }

    // скроллинг списка Comment в раскрытой карточке
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
                onView(allOf(withId(ClaimElements.ID_LIST_COMMENT_CARD), isDisplayed())).perform(actionOnItemAtPosition(n, swipeUp()));
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
                    onView(allOf(withId(ClaimElements.ID_LIST_CARDS), isDisplayed())).perform(actionOnItemAtPosition(n, swipeUp()));
                } catch (PerformException e) {
                    return false;
                }
            }
        }

        return false;
    }

    public static Matcher<View> childAtPosition(
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

    public boolean isDescendantOfA(ViewInteraction child, Matcher<View> parentMatcher) {
        try {
            child.check(matches(isDescendantOfA(parentMatcher)));
            return true;
        } catch (NoMatchingViewException e) {
            return false;
        }
    }

    public static Matcher<View> isDescendantOfA(final Matcher<View> parentMatcher) {
        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("is descendant of a parent matching: ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                while (parent != null) {
                    if (parentMatcher.matches(parent)) {
                        return true;
                    }
                    parent = parent.getParent();
                }
                return false;
            }
        };
    }

}

