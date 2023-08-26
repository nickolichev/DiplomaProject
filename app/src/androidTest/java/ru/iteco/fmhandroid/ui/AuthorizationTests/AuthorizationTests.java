package ru.iteco.fmhandroid.ui.AuthorizationTests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static java.util.EnumSet.allOf;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.AuthUtils;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils;
import ru.iteco.fmhandroid.ui.resourceIDData.AuthorizationElements;
import ru.iteco.fmhandroid.ui.testData.AuthorizationPage;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AuthorizationTests {

    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void registerIdlingResources() {
        IdlingRegistry.getInstance().register(ProjectIdlingResources.idlingResource);

        try {
            new AuthUtils().titleCheck();
        } catch (NoMatchingViewException e) {
            new AuthUtils().logOut();
        }
    }

    @After
    public void unregisterIdlingResources() {
        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
    }

    @Test
    public void validAuthorizationTest() {

        new AuthUtils().titleCheck();
        new AuthUtils().inputValidLogin();
        new AuthUtils().inputValidPassword();
        new AuthUtils().buttonSignIn();
        new CheckUtils().checkAllIconsVisibilityOnMainPage();
        new AuthUtils().logOut();
    }







    @Test
    public void invalidAuthorizationTest() {

        new AuthUtils().titleCheck();
        new AuthUtils().inputInvalidLogin();
        new AuthUtils().inputInvalidPassword();
    }

    @Test
    public void emptyAuthorizationTest() {

        new AuthUtils().titleCheck();
        new AuthUtils().inputInvalidLogin();
        new AuthUtils().inputInvalidPassword();
    }

}

