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

import static ru.iteco.fmhandroid.ProjectIdlingResources.idlingResource;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.IdlingResource;
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

import io.qameta.allure.kotlin.Allure;
import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.ProjectIdlingResources;
//import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Claim;


public class Utils_Helper {

    private static long startTime;

    public void startTimer(ProjectIdlingResources idlingResource) {
        Allure.step("старт отсчета времени с начала ассинхронной операции");
        idlingResource.increment();
        startTime = System.currentTimeMillis();
    }

    public void endTimerAndSleep(ProjectIdlingResources idlingResource) {
        Allure.step("завершение отсчета времени с начала ассинхронной операции + включение таймера");
        long elapsedTime = System.currentTimeMillis() - startTime;
        long remainingTime = Math.max(5000 - elapsedTime, 0);
        if (remainingTime > 0) {
            try {
                Thread.sleep(remainingTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Уменьшаем счетчик асинхронных операций
        idlingResource.decrement();
    }


    public void timerWaitingAsyncOperation3000() {
        Allure.step("метод ожидания по таймеру с инкрементацией + декрементацией счетчика ассинхронных операций на 3000 мc");
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

    public void backSystemButton() {
        Allure.step("вспомогательный метод для взаимодействия с view при открытом модальном окне");
        Espresso.pressBack();
    }

    public static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {
        Allure.step("создание Hamcrest матчера, который ищет дочерний элемент внутри родительского элемента на указанной позиции");
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
}
