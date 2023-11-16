package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.swipeUp;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.PerformException;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.idling.CountingIdlingResource;
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

import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Claim;


public class Utils_Helper {

    @Step("метод ожидания по таймеру с инкрементацией + декрементацией счетчика ассинхронных операций на 500 мс")
    public void timerWaitingAsyncOperation500() {
        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;

        // Увеличить счетчик асинхронных операций перед началом ожидания
        idlingResource.increment();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Уменьшить счетчик асинхронных операций после окончания ожидания
            idlingResource.decrement();
        }
    }

    @Step("метод ожидания по таймеру с инкрементацией + декрементацией счетчика ассинхронных операций на 1000 мс")
    public void timerWaitingAsyncOperation1000() {
        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;
        idlingResource.increment();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            idlingResource.decrement();
        }
    }

    @Step("метод ожидания по таймеру с инкрементацией + декрементацией счетчика ассинхронных операций на 2000 мс")
    public void timerWaitingAsyncOperation2000() {
        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;
        idlingResource.increment();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            idlingResource.decrement();
        }
    }

    @Step("метод ожидания по таймеру с инкрементацией + декрементацией счетчика ассинхронных операций на 3000 мс")
    public void timerWaitingAsyncOperation3000() {
        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;
        idlingResource.increment();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            idlingResource.decrement();
        }
    }

    @Step("метод ожидания по таймеру с инкрементацией + декрементацией счетчика ассинхронных операций на 5000 мс")
    public void timerWaitingAsyncOperation5000() {
        CountingIdlingResource idlingResource = ProjectIdlingResources.idlingResource;
        idlingResource.increment();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            idlingResource.decrement();
        }
    }

    @Step("вспомогательный метод для взаимодействия с view при открытом модальном окне")
    public void backSystemButton() {
        Espresso.pressBack();
    }

    @Step("метод обхода BUG в test-case #7 / При создании Claim вставляем дату, но при проверке созданной Claim видим Time +1 час")
    public static String addOneHour(String inputTime) {
        DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");
        // Преобразование строки в LocalTime
        LocalTime time = LocalTime.parse(inputTime, TIME_FORMATTER);

        // Увеличение времени на 1 час
        LocalTime newTime = time.plusHours(2);

        // Форматирование нового времени в строку
        return newTime.format(TIME_FORMATTER);
    }

    @Step("метод обхода BUG в test-case #7 / При создании Comment / генерируется дата -1 день к дате создания Claim, хотя Comment создается в эту же дату")
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

    @Step("проверка на соответствие тексту Topic + клик по найденной карточке Claim")
    public static boolean tryClickOnListItemByTextWithoutScrolling(String topicText) {
        try {
            Matcher<View> topicTextMatcher = ViewMatchers.hasDescendant(
                    ViewMatchers.withText(topicText)
            );

            onView(allOf(withId(Elements_Claim.ID_LIST_CARDS), isDisplayed()))
                    .perform(RecyclerViewActions.actionOnItem(topicTextMatcher, click()));
            return true;
        } catch (NoMatchingViewException ex) {
            return false;
        }
    }

    @Step("скроллинг листа CLAIMS")
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
                System.out.println("Found position " + pos + ", break");
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

    @Step("скроллинг списка Comment в раскрытой карточке CLAIM")
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

    @Step("создание Hamcrest матчера, который ищет дочерний элемент внутри родительского элемента на указанной позиции")
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

    @Step("матчер для поиска дочернего элемента по индексу внутри родительского элемента")
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
}
