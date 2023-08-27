package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import ru.iteco.fmhandroid.ui.resourceIDData.AuthorizationElements;
import ru.iteco.fmhandroid.ui.testData.AuthorizationData;

public class AuthUtils {
    public void titleCheck() {

        onView(allOf(withId(AuthorizationElements.ID_TITLE_AUTHORIZATION),
                hasDescendant(withText(AuthorizationData.TITLE_AUTHORIZATION))));

    }

//    public void loginFieldCheck() {
//
//        onView(allOf(withId(AuthorizationElements.ID_FIELD_LOGIN),
//                hasDescendant(withText(AuthorizationPage.FIELD_LOGIN))));
//
//    }
    public void inputValidLogin() {

        onView(allOf(withId(AuthorizationElements.ID_FIELD_LOGIN)));
                onView(allOf(withHint(AuthorizationData.FIELD_LOGIN)))
                        .perform(ViewActions.replaceText(AuthorizationData.VALID_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputValidPassword() {
        onView(allOf(withId(AuthorizationElements.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(AuthorizationData.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(AuthorizationData.VALID_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputInvalidLogin() {
        onView(allOf(withId(AuthorizationElements.ID_FIELD_LOGIN)));
        onView(allOf(withHint(AuthorizationData.FIELD_LOGIN)))
                .perform(ViewActions.replaceText(AuthorizationData.INVALID_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputInvalidPassword() {
        onView(allOf(withId(AuthorizationElements.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(AuthorizationData.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(AuthorizationData.INVALID_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void inputEmptyLogin() {
        onView(allOf(withId(AuthorizationElements.ID_FIELD_LOGIN)));
        onView(allOf(withHint(AuthorizationData.FIELD_LOGIN)))
                .perform(ViewActions.replaceText(AuthorizationData.EMPTY_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputEmptyPassword() {
        onView(allOf(withId(AuthorizationElements.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(AuthorizationData.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(AuthorizationData.EMPTY_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());
    }

    public void logOut() {
        ViewInteraction clickLogOut = onView(
                allOf(withId(AuthorizationElements.ID_IMAGE_LOG_OUT)));
        clickLogOut.perform(click());

        ViewInteraction buttonLogOut = onView(
                allOf(withText(AuthorizationData.BUTTON_LOG_OUT)));
        buttonLogOut.perform(click());
        }

    public void buttonSignIn() {

        ViewInteraction button = onView(
                allOf(withId(AuthorizationElements.ID_BUTTON_SIGN_IN)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());

    }
}