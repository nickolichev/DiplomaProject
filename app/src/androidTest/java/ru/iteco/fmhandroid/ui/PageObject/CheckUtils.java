package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewInteraction;

import org.hamcrest.core.IsInstanceOf;
import org.junit.After;
import org.junit.Before;

import ru.iteco.fmhandroid.ProjectIdlingResources;
import ru.iteco.fmhandroid.ui.resourceIDData.AboutElements;
import ru.iteco.fmhandroid.ui.resourceIDData.AuthorizationElements;
import ru.iteco.fmhandroid.ui.resourceIDData.ClaimElements;
import ru.iteco.fmhandroid.ui.resourceIDData.MainElements;
import ru.iteco.fmhandroid.ui.resourceIDData.MenuElelements;
import ru.iteco.fmhandroid.ui.resourceIDData.NewsElements;
import ru.iteco.fmhandroid.ui.testData.AboutData;
import ru.iteco.fmhandroid.ui.testData.ClaimData;
import ru.iteco.fmhandroid.ui.testData.MainData;
import ru.iteco.fmhandroid.ui.testData.MenuData;
import ru.iteco.fmhandroid.ui.testData.NewsData;

public class CheckUtils {

    @Before
    public void registerIdlingResources() {
        IdlingRegistry.getInstance().register(ProjectIdlingResources.idlingResource);

        try {
//            new AuthUtils().titleCheck();
        } catch (NoMatchingViewException e) {
            new AuthUtils().logOut();
        }
    }

    @After
    public void unregisterIdlingResources() {
        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
    }

    // MainPage
    public void checkAllIconsVisibilityOnMainPage() {
        new CheckUtils().checkIconVisibilityMenu();
        new CheckUtils().checkIconVisibilityTradeMark();
        new CheckUtils().checkIconVisibilityButterFly();
        new CheckUtils().checkIconVisibilityNews();
        new CheckUtils().checkIconVisibilityAllNews();
        new CheckUtils().checkIconVisibilityClaims();
        new CheckUtils().checkIconVisibilityAllClaims();
        new CheckUtils().checkIconVisibilityLogOut();
    }

    public void checkIconVisibilityMenu() {
        ViewInteraction iconMenu = onView(withId(MainElements.ID_MAIN_MENU));
        iconMenu.check(matches(isDisplayed()));
        ViewInteraction descriptionMenu = onView(allOf(
                withId(MainElements.ID_MAIN_MENU),
                withContentDescription(MainData.DESCRIPTION_MENU)
        ));
        descriptionMenu.check(matches(isDisplayed()));
    }

    public void checkIconVisibilityTradeMark() {
        ViewInteraction iconTradMark = onView(withId(MainElements.ID_TRADE_MARK));
        iconTradMark.check(matches(isDisplayed()));
    }

    public void checkIconVisibilityButterFly() {
        ViewInteraction iconButterFly = onView(withId(MainElements.ID_BUTTERFLY));
        iconButterFly.check(matches(isDisplayed()));
        ViewInteraction descriptionMission = onView(allOf(
                withId(MainElements.ID_BUTTERFLY),
                withContentDescription(MainData.DESCRIPTION_MISSION)
        ));
        descriptionMission.check(matches(isDisplayed()));
    }

    public void checkIconVisibilityNews() {
        ViewInteraction iconNews = onView(withId(MainElements.ID_NEWS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textNews = onView(allOf(
                withId(MainElements.ID_NEWS),
                hasDescendant(withText(MainData.TEXT_NEWS))
        ));
        textNews.check(matches(isDisplayed()));
    }

    // иконка на Main
    public void checkIconVisibilityAllNews() {
        ViewInteraction iconNews = onView(withId(MainElements.ID_ALL_NEWS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textAllNews = onView(allOf(
                withId(MainElements.ID_ALL_NEWS),
                withParent(allOf(
                        withId(MainElements.ID_NEWS),
                        withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout.class))
                )),
                withText(MainData.TEXT_ALL_NEWS)
        ));
        textAllNews.check(matches(isDisplayed()));
    }

    // иконка на Main
    public void checkIconVisibilityClaims() {
        ViewInteraction iconNews = onView(withId(MainElements.ID_CLAIMS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textClaims = onView(allOf(
                withId(MainElements.ID_CLAIMS),
                hasDescendant(withText(MainData.TEXT_CLAIMS))
        ));
        textClaims.check(matches(isDisplayed()));
    }

    public void checkIconVisibilityAllClaims() {
        ViewInteraction iconNews = onView(withId(MainElements.ID_ALL_CLAIMS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textAllClaims = onView(allOf(
                withId(MainElements.ID_ALL_CLAIMS),
                withParent(allOf(
                        withId(MainElements.ID_CLAIMS),
                        withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout.class))
                )),
                withText(MainData.TEXT_ALL_CLAIMS)
        ));
        textAllClaims.check(matches(isDisplayed()));
    }

    // На странице Claims проверка Title
    public void checkTitleVisibilityClaims() {
        ViewInteraction title = onView(allOf(withText(ClaimData.TITLE_TEXT_CLAIMS),
                withParent(withParent(withId(ClaimElements.ID_TITLE_CLAIMS))),
                isDisplayed()));
        title.check(matches(withText(ClaimData.TITLE_TEXT_CLAIMS)));
    }

    public void checkIconVisibilityLogOut() {
        ViewInteraction iconLogOut = onView(withId(AuthorizationElements.ID_IMAGE_LOG_OUT));
        iconLogOut.check(matches(isDisplayed()));
        ViewInteraction descriptionMission = onView(allOf(
                withId(AuthorizationElements.ID_IMAGE_LOG_OUT),
                withContentDescription(MainData.DESCRIPTION_LOG_OUT)
        ));
        descriptionMission.check(matches(isDisplayed()));
    }

    // MenuList
    // Утилиты проверок, что в списке есть все строки меню
    public void checkLineVisibilityNews() {
        ViewInteraction news = onView(
                allOf(withId(MenuElelements.ID_TITLE_MENU), withText(MenuData.NEWS_TEXT),
                        withParent(withParent(withId(MenuElelements.ID_PARENT_TITLE))),
                        isDisplayed()));
        news.check(matches(withText(MenuData.NEWS_TEXT)));
    }

    public void checkLineVisibilityClaims() {
        ViewInteraction claims = onView(
                allOf(withId(MenuElelements.ID_TITLE_MENU), withText(MenuData.CLAIMS_TEXT),
                        withParent(withParent(withId(MenuElelements.ID_PARENT_TITLE))),
                        isDisplayed()));
        claims.check(matches(withText(MenuData.CLAIMS_TEXT)));
    }

    public void checkLineVisibilityAbout() {
        ViewInteraction about = onView(
                allOf(withId(MenuElelements.ID_TITLE_MENU), withText(MenuData.ABOUT_TEXT),
                        withParent(withParent(withId(MenuElelements.ID_PARENT_TITLE))),
                        isDisplayed()));
        about.check(matches(withText(MenuData.ABOUT_TEXT)));
    }

    // На странице News проверка Title
    public void checkTitleVisibilityNews() {
        ViewInteraction title = onView(allOf(withText(NewsData.TITLE_TEXT_NEWS),
                withParent(withParent(withId(NewsElements.ID_TITLE_NEWS))),
                isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_TEXT_NEWS)));
    }

    // На странице About проверка Title
    public void checkTitleVisibilityAbout() {
        ViewInteraction title = onView(allOf(withText(AboutData.TITLE_VERSION_TEXT),
                withParent(withParent(withId(AboutElements.ID_TITLE_VERSION))),
                isDisplayed()));
//        title.check(matches(withText(AboutData.TITLE_VERSION_TEXT)));
    }

}


