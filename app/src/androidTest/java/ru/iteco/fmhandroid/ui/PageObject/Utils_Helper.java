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

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_About;
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

    public void buttonBackAboutUtility() {
        ViewInteraction clickLogOut = onView(
                allOf(withId(Elements_About.ID_BUTTON_BACK)));
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

    public void waitAsyncOperation120000() {
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
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
                allOf(withId(Elements_Main.ID_TRADE_MARK)));
        button.perform(click());
    }

    // вспомогательный метод
    public void swipeUpOnScreen() {
        onView(withId(Elements_Main.ID_TRADE_MARK))
                .check(matches(isDisplayed()))
                .perform(swipeUp());
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


    @DisplayName("скроллинг листа CLAIMS")
    public static boolean searchInClaimsList(Matcher<View> matcher, boolean endScroll) {
        int maxScrollAttempts = 100; // Максимальное количество попыток скроллинга
        boolean found = false; // Флаг для успешной попытки

        for (int attempt = 1; attempt <= maxScrollAttempts; attempt++) {

            try {
                // new UtilsHelper().beginAsyncOperation();
                // Проверяем, если элемент видим на экране
                onView(matcher).check(matches(allOf(isCompletelyDisplayed(), isDisplayed())));
                found = true;
                // new UtilsHelper().endAsyncOperation();
                break; // Элемент найден, выходим из цикла
            } catch (NoMatchingViewException ignored) {
                // Элемент не найден, продолжаем скроллинг
            }

            if (attempt < maxScrollAttempts) {
                // new UtilsHelper().beginAsyncOperation();
                // Делаем скроллинг только если не последняя попытка
                Espresso.onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed()))
                        .perform(RecyclerViewActions.scrollToPosition(attempt * 1));
                // new UtilsHelper().endAsyncOperation();
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

