package ru.iteco.fmhandroid.ui.AuthorizationTests;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.PageObject.AuthUtils;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AuthorizationTests {
//    CardIdlingResource cardIdlingResource = new CardIdlingResource();
    AuthUtils authUtils = new AuthUtils();
    CheckUtils checkUtils = new CheckUtils();
    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void registerIdlingResources() {
//        IdlingRegistry.getInstance().register(ProjectIdlingResources.idlingResource);

        try {
            authUtils.titleCheck();
        } catch (NoMatchingViewException e) {
            authUtils.logOut();
        }
    }

    @After
    public void unregisterIdlingResources() {
//        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
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

        authUtils.titleCheck();
        authUtils.inputInvalidLogin();
        authUtils.inputInvalidPassword();
        authUtils.buttonSignIn();
        authUtils.titleCheck();
    }

    @Test
    public void emptyAuthorizationTest() {

        new AuthUtils().titleCheck();
        new AuthUtils().inputEmptyLogin();
        new AuthUtils().inputEmptyPassword();
        new AuthUtils().buttonSignIn();
        new AuthUtils().titleCheck();
    }
}
