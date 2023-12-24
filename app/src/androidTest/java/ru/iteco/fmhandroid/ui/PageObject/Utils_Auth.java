package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import io.qameta.allure.kotlin.Allure;
import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Auth;
import ru.iteco.fmhandroid.ui.testData.Data_Auth;

public class Utils_Auth {
    ProjectIdlingResources idlingResource = new ProjectIdlingResources();
    public void inputValidLogin() {
        Allure.step("экран AUTHORIZATION / заполнение поля Login валидными тестовыми данными");
        onView(allOf(withId(Elements_Auth.ID_FIELD_LOGIN)));
        onView(allOf(withHint(Data_Auth.FIELD_LOGIN)))
                .perform(ViewActions.replaceText(Data_Auth.VALID_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputValidPassword() {
        Allure.step("экран AUTHORIZATION / заполнение поля Password валидными тестовыми данными");
        onView(allOf(withId(Elements_Auth.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(Data_Auth.VALID_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputInvalidLogin() {
        Allure.step("экран AUTHORIZATION / заполнение поля Login НЕвалидными тестовыми данными");
        onView(allOf(withId(Elements_Auth.ID_FIELD_LOGIN)));
        onView(allOf(withHint(Data_Auth.FIELD_LOGIN)))
                .perform(ViewActions.replaceText(Data_Auth.INVALID_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputInvalidCyrillicLogin() {
        Allure.step("экран AUTHORIZATION / заполнение поля Login НЕвалидными Cyrillic тестовыми данными");
        onView(allOf(withId(Elements_Auth.ID_FIELD_LOGIN)));
        onView(allOf(withHint(Data_Auth.FIELD_LOGIN)))
                .perform(ViewActions.replaceText(Data_Auth.CYRILLIC_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputInvalidPassword() {
        Allure.step("экран AUTHORIZATION / заполнение поля Password НЕвалидными тестовыми данными");
        onView(allOf(withId(Elements_Auth.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(Data_Auth.INVALID_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputInvalidCyrillicPassword() {
        Allure.step("экран AUTHORIZATION / заполнение поля Password НЕвалидными Cyrillic тестовыми данными");
        onView(allOf(withId(Elements_Auth.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(Data_Auth.CYRILLIC_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void clearFieldLogin() {
        Allure.step("экран AUTHORIZATION / очистить заполненное поле Login от тестовых данных");
        onView(allOf(withId(Elements_Auth.ID_FIELD_LOGIN)));
        onView(allOf(withHint(Data_Auth.FIELD_LOGIN)))
                .perform(clearText());
    }
    public void clearFieldPassword() {
        Allure.step("экран AUTHORIZATION / очистить заполненное поле Password от тестовых данных");
        onView(allOf(withId(Elements_Auth.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD)))
                .perform(clearText());
    }

    public void logOut() {
        Allure.step("выход из авторизованной сессии");
        onView(allOf(withId(Elements_Auth.ID_IMAGE_LOG_OUT))).perform(click());
        onView(allOf(withText(Data_Auth.BUTTON_LOG_OUT))).perform(click());
    }
    public void clickButtonSignIn() {
        Allure.step("клик по кнопке авторизации Sign In");
        onView(allOf(withId(Elements_Auth.ID_BUTTON_SIGN_IN)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(click());
    }
    public void authorizationUtility() {
        Allure.step("набор утилит для авторизации в Before тестовых классов");
        new Utils_Helper().timerWaitingAsyncOperation3000();
        new Utils_Helper().startTimer(idlingResource);
        onView(allOf(withId(Elements_Auth.ID_FIELD_LOGIN)));
        onView(allOf(withHint(Data_Auth.FIELD_LOGIN)))
                .perform(ViewActions.replaceText(Data_Auth.VALID_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());
        onView(allOf(withId(Elements_Auth.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(Data_Auth.VALID_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());
        onView(allOf(withId(Elements_Auth.ID_BUTTON_SIGN_IN)))
                .check(matches(ViewMatchers.isDisplayed()))
                .perform(click());
        new Utils_Helper().endTimerAndSleep(idlingResource);
    }

    public void logOutUtility() {
        Allure.step("набор утилит завершения авторизованной сессии для Before в тестах");
        new Utils_Helper().startTimer(idlingResource);
        onView(allOf(withId(Elements_Auth.ID_IMAGE_LOG_OUT))).perform(click());
        onView(allOf(withText(Data_Auth.BUTTON_LOG_OUT))).perform(click());
        new Utils_Helper().endTimerAndSleep(idlingResource);
    }
}