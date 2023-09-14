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
public class NegativeClaimsTests {
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
//        new DataHelper().logOutUtility();
    }

    @Test
    public void  creatingClaimWithEmptyFieldsTest() {
        new ClaimUtils().clickCreateClaim();
        new CheckUtils().checkAllFieldsAndButtonsVisibility();
        new ClaimUtils().inputEmptyInTitleNewClaim();
        new ClaimUtils().inputEmptyInExecutorNewClaim();
        new ClaimUtils().inputEmptyInDiscriptionNewClaim();
        // дописать методы проверки предупреждений / окна

    }

    @Test
    public void  creatingClaimWithInvalidDateTest() {
       // дата в прошлом
        // дописать методы

    }

    @Test
    public void  creatingClaimWithInvalidTitleTest() {
        // больше 50 знаков
        new ClaimUtils().clickCreateClaim();
        new CheckUtils().checkAllFieldsAndButtonsVisibility();
        new ClaimUtils().inputEmptyInTitleNewClaim();
        new ClaimUtils().inputEmptyInExecutorNewClaim();
        new ClaimUtils().inputEmptyInDiscriptionNewClaim();
        // дописать методы

    }

    @Test
    public void  creatingClaimWithInvalidExecutorTest() {
        // больше 50 знаков
        new ClaimUtils().clickCreateClaim();
        new CheckUtils().checkAllFieldsAndButtonsVisibility();
        new ClaimUtils().inputEmptyInTitleNewClaim();
        new ClaimUtils().inputEmptyInExecutorNewClaim();
        new ClaimUtils().inputEmptyInDiscriptionNewClaim();
        // дописать методы

    }



}
