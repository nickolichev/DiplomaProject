package ru.iteco.fmhandroid.ui.AuthorizationTests;

import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.NoMatchingViewException;
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
// Сделано 26.08.23
    @Test
    public void validAuthorizationTest() {

        new AuthUtils().titleCheck();
        new AuthUtils().inputValidLogin();
        new AuthUtils().inputValidPassword();
        new AuthUtils().buttonSignIn();
        new CheckUtils().checkAllIconsVisibilityOnMainPage();
        new AuthUtils().logOut();
    }

    // Сделано 26.08.23
    @Test
    public void invalidAuthorizationTest() {

        new AuthUtils().titleCheck();
        new AuthUtils().inputInvalidLogin();
        new AuthUtils().inputInvalidPassword();
        new AuthUtils().buttonSignIn();
        new AuthUtils().titleCheck();
    }

    // Сделано 26.08.23
    @Test
    public void emptyAuthorizationTest() {

        new AuthUtils().titleCheck();
        new AuthUtils().inputEmptyLogin();
        new AuthUtils().inputEmptyPassword();
        new AuthUtils().buttonSignIn();
        new AuthUtils().titleCheck();
    }
}
