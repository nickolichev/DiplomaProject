package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import ru.iteco.fmhandroid.ui.resourceIDData.AboutElements;
import ru.iteco.fmhandroid.ui.resourceIDData.AuthorizationElements;
import ru.iteco.fmhandroid.ui.testData.AuthorizationData;


public class DataHelper {

    public void authorizationUtility() {

            onView(allOf(withId(AuthorizationElements.ID_FIELD_LOGIN)));
            onView(allOf(withHint(AuthorizationData.FIELD_LOGIN)))
                    .perform(ViewActions.replaceText(AuthorizationData.VALID_LOGIN))
                    .perform(ViewActions.closeSoftKeyboard());

            onView(allOf(withId(AuthorizationElements.ID_FIELD_PASSWORD)));
            onView(allOf(withHint(AuthorizationData.FIELD_PASSWORD)))
                    .perform(ViewActions.replaceText(AuthorizationData.VALID_PASSWORD))
                    .perform(ViewActions.closeSoftKeyboard());

        ViewInteraction button = onView(
                allOf(withId(AuthorizationElements.ID_BUTTON_SIGN_IN)));
        button.check(matches(ViewMatchers.isDisplayed()));
        button.perform(click());
        }

    public void logOutUtility() {
        ViewInteraction clickLogOut = onView(
                allOf(withId(AuthorizationElements.ID_IMAGE_LOG_OUT)));
        clickLogOut.perform(click());

        ViewInteraction buttonLogOut = onView(
                allOf(withText(AuthorizationData.BUTTON_LOG_OUT)));
        buttonLogOut.perform(click());
    }
    public void buttonBackAboutUtility() {
        ViewInteraction clickLogOut = onView(
                allOf(withId(AboutElements.ID_BUTTON_BACK)));
        clickLogOut.perform(click());
    }

    public void waitAsynchOperation500() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitAsynchOperation1000() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitAsynchOperation2000() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
}

