package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;

import androidx.test.espresso.ViewInteraction;

import org.hamcrest.core.IsInstanceOf;

import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Auth;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Main;
import ru.iteco.fmhandroid.ui.testData.Data_Main;

public class CheckUtils_Main {
    ProjectIdlingResources projectIdlingResources = new ProjectIdlingResources();

    // экран MAIN PAGE

    public void checkIconMenu_Visibility() {
        ViewInteraction iconMenu = onView(withId(Elements_Main.ID_MAIN_MENU));
        iconMenu.check(matches(isDisplayed()));
        ViewInteraction descriptionMenu = onView(allOf(
                withId(Elements_Main.ID_MAIN_MENU),
                withContentDescription(Data_Main.DESCRIPTION_MENU)
        ));
        descriptionMenu.check(matches(isDisplayed()));
    }

    public void checkIconTradeMark_Visibility() {
        ViewInteraction iconTradMark = onView(withId(Elements_Main.ID_TRADE_MARK));
        iconTradMark.check(matches(isDisplayed()));
    }

    public void checkIconButterFly_Visibility() {
        ViewInteraction iconButterFly = onView(withId(Elements_Main.ID_BUTTERFLY));
        iconButterFly.check(matches(isDisplayed()));
        ViewInteraction descriptionMission = onView(allOf(
                withId(Elements_Main.ID_BUTTERFLY),
                withContentDescription(Data_Main.DESCRIPTION_MISSION)
        ));
        descriptionMission.check(matches(isDisplayed()));
    }

    public void checkIconNews_Visibility() {
        ViewInteraction iconNews = onView(withId(Elements_Main.ID_NEWS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textNews = onView(allOf(
                withId(Elements_Main.ID_NEWS),
                hasDescendant(withText(Data_Main.TEXT_NEWS))
        ));
        textNews.check(matches(isDisplayed()));
    }

    // иконка на Main
    public void checkIconAllNews_Visibility() {
        ViewInteraction iconNews = onView(withId(Elements_Main.ID_ALL_NEWS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textAllNews = onView(allOf(
                withId(Elements_Main.ID_ALL_NEWS),
                withParent(allOf(
                        withId(Elements_Main.ID_NEWS),
                        withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout.class))
                )),
                withText(Data_Main.TEXT_ALL_NEWS)
        ));
        textAllNews.check(matches(isDisplayed()));
    }

    public void checkIconClaims_Visibility() {
        ViewInteraction iconNews = onView(withId(Elements_Main.ID_CLAIMS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textClaims = onView(allOf(
                withId(Elements_Main.ID_CLAIMS),
                hasDescendant(withText(Data_Main.TEXT_CLAIMS))
        ));
        textClaims.check(matches(isDisplayed()));
    }

    // иконка на Main
    public void checkIconAllClaims_Visibility() {
        ViewInteraction iconNews = onView(withId(Elements_Main.ID_ALL_CLAIMS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textAllClaims = onView(allOf(
                withId(Elements_Main.ID_ALL_CLAIMS),
                withParent(allOf(
                        withId(Elements_Main.ID_CLAIMS),
                        withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout.class))
                )),
                withText(Data_Main.TEXT_ALL_CLAIMS)
        ));
        textAllClaims.check(matches(isDisplayed()));
    }

    public void checkIconLogOut_Visibility() {
        ViewInteraction iconLogOut = onView(withId(Elements_Auth.ID_IMAGE_LOG_OUT));
        iconLogOut.check(matches(isDisplayed()));
        ViewInteraction descriptionMission = onView(allOf(
                withId(Elements_Auth.ID_IMAGE_LOG_OUT),
                withContentDescription(Data_Main.DESCRIPTION_LOG_OUT)
        ));
        descriptionMission.check(matches(isDisplayed()));
    }
}
