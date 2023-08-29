package ru.iteco.fmhandroid.ui.AboutTests;

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
import ru.iteco.fmhandroid.ui.PageObject.AboutUtils;
import ru.iteco.fmhandroid.ui.PageObject.AuthUtils;
import ru.iteco.fmhandroid.ui.PageObject.CardIdlingResource;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils;
import ru.iteco.fmhandroid.ui.PageObject.DataHelper;
import ru.iteco.fmhandroid.ui.PageObject.MenuUtils;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AboutTests {
    CardIdlingResource cardIdlingResource = new CardIdlingResource();
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
        new DataHelper().authorizationUtility();
    }

    @After
    public void unregisterIdlingResources() {
        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
        new DataHelper().logOutUtility();
    }

    @Test
    public void pageAboutTest() {
        new MenuUtils().buttonMenu();
        new MenuUtils().buttonAbout();
        new CheckUtils().checkTitleVisibilityAbout();
        new CheckUtils().checkVersionValueVisibility();
        new CheckUtils().checkPrivacyPolicyVisibility();
        new CheckUtils().checkTermsOfUseVisibility();
        new AboutUtils().clickPrivacyPolicy();
        new AboutUtils().returnFromBrowserToApp();
        new AboutUtils().clickTermsOfUse();
        new AboutUtils().returnFromBrowserToApp();
        new DataHelper().buttonBackAboutUtility();

    }
}


