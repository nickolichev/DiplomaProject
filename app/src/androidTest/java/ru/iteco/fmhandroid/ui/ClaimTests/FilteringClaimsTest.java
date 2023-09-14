package ru.iteco.fmhandroid.ui.ClaimTests;

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
import ru.iteco.fmhandroid.ui.PageObject.ClaimUtils;
import ru.iteco.fmhandroid.ui.PageObject.MenuUtils;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class FilteringClaimsTest {
//    CardIdlingResource cardIdlingResource = new CardIdlingResource();
    @Rule
    public ActivityTestRule<AppActivity> mActivityScenarioRule =
            new ActivityTestRule<>(AppActivity.class);

    @Before
    public void registerIdlingResources() {

//        IdlingRegistry.getInstance().register(ProjectIdlingResources.idlingResource);

        try {
            new AuthUtils().titleCheck();
        } catch (NoMatchingViewException e) {
            new AuthUtils().logOut();
        }
        new AuthUtils().authorizationUtility();
        new MenuUtils().buttonMenu();
        new MenuUtils().buttonClaims();
        new CheckUtils().checkTitleVisibilityClaims();
    }

    @After
    public void unregisterIdlingResources() {
//        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
        new AuthUtils().logOutUtility();
    }

    @Test
    public void filteringClaimsByStatusTest() {
        // фильтрация по статусу Open
        new ClaimUtils().clickFilters();
        new ClaimUtils().clickInProgress();
        new ClaimUtils().clickOk();
//        new ClaimUtils().clickExpend(cardIdlingResource);
        new CheckUtils().checkOpenStatusInCard();
        new ClaimUtils().clickClose();

        // фильтрация по статусу InProgress
        new ClaimUtils().clickFilters();
        new ClaimUtils().clickOpen();
        new ClaimUtils().clickInProgress();
        new ClaimUtils().clickOk();
//        new ClaimUtils().clickExpend(cardIdlingResource);
        new CheckUtils().checkInProgressStatusInCard();
        new ClaimUtils().clickClose();

        // фильтрация по статусу Executed
        new ClaimUtils().clickFilters();
        new ClaimUtils().clickInProgress();
        new ClaimUtils().clickExecuted();
        new ClaimUtils().clickOk();
//        new ClaimUtils().clickExpend(cardIdlingResource);
        new CheckUtils().checkExecutedStatus();
        new ClaimUtils().clickClose();

        // фильтрация по статусу Cancelled
        new ClaimUtils().clickFilters();
        new ClaimUtils().clickExecuted();
        new ClaimUtils().clickCancelled();
        new ClaimUtils().clickOk();
//        new ClaimUtils().clickExpend(cardIdlingResource);
        new CheckUtils().checkCanceledStatus();
        new ClaimUtils().clickClose();

    }
}
