package ru.iteco.fmhandroid.ui.MenuTests;

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
import ru.iteco.fmhandroid.ui.PageObject.CardIdlingResource;
import ru.iteco.fmhandroid.ui.PageObject.CheckUtils;
import ru.iteco.fmhandroid.ui.PageObject.DataHelper;
import ru.iteco.fmhandroid.ui.PageObject.MenuUtils;

@LargeTest
    @RunWith(AndroidJUnit4.class)
    public class NavigationTests {
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
        public void navigationTest() {
            new CheckUtils().checkIconVisibilityMenu();
            new MenuUtils().buttonMenu();
            new CheckUtils().checkLineVisibilityNews();
            new CheckUtils().checkLineVisibilityClaims();
            new CheckUtils().checkLineVisibilityAbout();
            new MenuUtils().buttonClaims();
            new CheckUtils().checkTitleVisibilityClaims();
            new MenuUtils().buttonMenu();
            new MenuUtils().buttonNews();
            new CheckUtils().checkTitleVisibilityNews();
            new MenuUtils().buttonMenu();
            new MenuUtils().buttonAbout();
            new CheckUtils().checkTitleVisibilityAbout();
            new DataHelper().buttonBackAboutUtility();
        }
    }


