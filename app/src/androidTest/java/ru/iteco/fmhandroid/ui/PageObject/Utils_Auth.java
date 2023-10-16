package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Auth;
import ru.iteco.fmhandroid.ui.testData.Data_Auth;

public class Utils_Auth {
    public void checkTitleOnAuthView() {

        onView(allOf(withId(Elements_Auth.ID_TITLE_AUTHORIZATION),
                hasDescendant(withText(Data_Auth.TITLE_AUTHORIZATION))));

    }

//    public void loginFieldCheck() {
//
//        onView(allOf(withId(AuthorizationElements.ID_FIELD_LOGIN),
//                hasDescendant(withText(AuthorizationPage.FIELD_LOGIN))));
//
//    }
    public void inputValidLogin() {

        onView(allOf(withId(Elements_Auth.ID_FIELD_LOGIN)));
                onView(allOf(withHint(Data_Auth.FIELD_LOGIN)))
                        .perform(ViewActions.replaceText(Data_Auth.VALID_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputValidPassword() {
        onView(allOf(withId(Elements_Auth.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(Data_Auth.VALID_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputInvalidLogin() {
        onView(allOf(withId(Elements_Auth.ID_FIELD_LOGIN)));
        onView(allOf(withHint(Data_Auth.FIELD_LOGIN)))
                .perform(ViewActions.replaceText(Data_Auth.INVALID_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputInvalidPassword() {
        onView(allOf(withId(Elements_Auth.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(Data_Auth.INVALID_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputEmptyLogin() {
        onView(allOf(withId(Elements_Auth.ID_FIELD_LOGIN)));
        onView(allOf(withHint(Data_Auth.FIELD_LOGIN)))
                .perform(ViewActions.replaceText(Data_Auth.EMPTY_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void inputEmptyPassword() {
        onView(allOf(withId(Elements_Auth.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(Data_Auth.EMPTY_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());
    }
    public void logOut() {
        ViewInteraction clickLogOut = onView(
                allOf(withId(Elements_Auth.ID_IMAGE_LOG_OUT)));
        clickLogOut.perform(click());

        ViewInteraction buttonLogOut = onView(
                allOf(withText(Data_Auth.BUTTON_LOG_OUT)));
        buttonLogOut.perform(click());
        }

    public void buttonSignIn() {

        ViewInteraction button = onView(
                allOf(withId(Elements_Auth.ID_BUTTON_SIGN_IN)));
        button.check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        button.perform(click());

    }
    public void authorizationUtility() {

        onView(allOf(withId(Elements_Auth.ID_FIELD_LOGIN)));
        onView(allOf(withHint(Data_Auth.FIELD_LOGIN)))
                .perform(ViewActions.replaceText(Data_Auth.VALID_LOGIN))
                .perform(ViewActions.closeSoftKeyboard());

        onView(allOf(withId(Elements_Auth.ID_FIELD_PASSWORD)));
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD)))
                .perform(ViewActions.replaceText(Data_Auth.VALID_PASSWORD))
                .perform(ViewActions.closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(Elements_Auth.ID_BUTTON_SIGN_IN)));
        button.check(matches(ViewMatchers.isDisplayed()));
        button.perform(click());
    }
    public void logOutUtility() {
        ViewInteraction clickLogOut = onView(
                allOf(withId(Elements_Auth.ID_IMAGE_LOG_OUT)));
        clickLogOut.perform(click());

        ViewInteraction buttonLogOut = onView(
                allOf(withText(Data_Auth.BUTTON_LOG_OUT)));
        buttonLogOut.perform(click());
    }
}