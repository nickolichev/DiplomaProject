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

import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Auth;
import ru.iteco.fmhandroid.ui.testData.Data_Auth;

public class Utils_Auth {
    @Step("экран AUTHORIZATION / заполнение поля Login валидными тестовыми данными")
    public void inputValidLogin() {
        onView(allOf(withId(Elements_Auth.ID_FIELD_LOGIN)));
        onView(allOf(withHint(Data_Auth.FIELD_LOGIN)))
                .perform(ViewActions.replaceText(Data_Auth.VALID_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());
    }

    @Step("экран AUTHORIZATION / заполнение поля Password валидными тестовыми данными")
    public void inputValidPassword() {
        onView(allOf(withId(Elements_Auth.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(Data_Auth.VALID_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());
    }

    @Step("экран AUTHORIZATION / заполнение поля Login НЕвалидными тестовыми данными")
    public void inputInvalidLogin() {
        onView(allOf(withId(Elements_Auth.ID_FIELD_LOGIN)));
        onView(allOf(withHint(Data_Auth.FIELD_LOGIN)))
                .perform(ViewActions.replaceText(Data_Auth.INVALID_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());
    }

    @Step("экран AUTHORIZATION / заполнение поля Password НЕвалидными тестовыми данными")
    public void inputInvalidPassword() {
        onView(allOf(withId(Elements_Auth.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(Data_Auth.INVALID_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());
    }

    @Step("экран AUTHORIZATION / очистить заполненное поле Login от тестовых данных")
    public void clearFieldLogin() {
        onView(allOf(withId(Elements_Auth.ID_FIELD_LOGIN)));
        onView(allOf(withHint(Data_Auth.FIELD_LOGIN)))
                .perform(clearText());
    }

    @Step("экран AUTHORIZATION / очистить заполненное поле Password от тестовых данных")
    public void clearFieldPassword() {
        onView(allOf(withId(Elements_Auth.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD)))
                .perform(clearText());
    }

    @Step("выход из авторизованной сессии")
    public void logOut() {
        ViewInteraction clickLogOut = onView(
                allOf(withId(Elements_Auth.ID_IMAGE_LOG_OUT)));
        clickLogOut.perform(click());

        ViewInteraction buttonLogOut = onView(
                allOf(withText(Data_Auth.BUTTON_LOG_OUT)));
        buttonLogOut.perform(click());
    }

    @Step("клик по кнопке авторизации Sign In")
    public void clickButtonSignIn() {
        ViewInteraction button = onView(
                allOf(withId(Elements_Auth.ID_BUTTON_SIGN_IN)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());

    }

    @Step("набор утилит для авторизации для Before в тестах")
    public void authorizationUtility() {
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
    }

    @Step("набор утилит завершения авторизованной сессии для Before в тестах")
    public void logOutUtility() {
        onView(allOf(withId(Elements_Auth.ID_IMAGE_LOG_OUT))).perform(click());
        onView(allOf(withText(Data_Auth.BUTTON_LOG_OUT))).perform(click());
    }
}