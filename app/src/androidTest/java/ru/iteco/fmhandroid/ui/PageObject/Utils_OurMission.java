package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static ru.iteco.fmhandroid.ui.PageObject.Utils_Helper.childAtPosition;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Main;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_OurMission;
import ru.iteco.fmhandroid.ui.testData.Data_Main;

public class Utils_OurMission {
    @DisplayName("экран Main / открываем экран Our Mission")
    public void clickIconOurMission() {
        ViewInteraction icon = onView(
                allOf(withId(Elements_Main.ID_BUTTERFLY), withContentDescription(Data_Main.DESCRIPTION_MISSION),
                        childAtPosition(
                                allOf(withId(R.id.container_custom_app_bar_include_on_fragment_main),
                                        childAtPosition(
                                                withClassName(is("android.widget.LinearLayout")),
                                                0)),
                                6),
                        isDisplayed()));
        icon.perform(click());
    }

    @DisplayName("экран Our Mission / 1-я карточка в списке / раскрываем карточку")
    public void expendCard_1() {
        onView(allOf(withId(Elements_OurMission.ID_LIST),
                childAtPosition(
                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                        0)))
                .perform(actionOnItemAtPosition(0, click()));
    }

    @DisplayName("экран Our Mission / 2-я карточка в списке / раскрываем карточку")
    public void expendCard_2() {
        onView(allOf(withId(Elements_OurMission.ID_LIST),
                childAtPosition(
                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                        0)))
                .perform(actionOnItemAtPosition(1, click()));
    }

    @DisplayName("экран Our Mission / 3-я карточка в списке / раскрываем карточку")
    public void expendCard_3() {
        onView(allOf(withId(Elements_OurMission.ID_LIST),
                childAtPosition(
                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                        0)))
                .perform(actionOnItemAtPosition(2, click()));
    }

    @DisplayName("экран Our Mission / 4-я карточка в списке / раскрываем карточку")
    public void expendCard_4() {
        onView(allOf(withId(Elements_OurMission.ID_LIST),
                childAtPosition(
                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                        0)))
                .perform(actionOnItemAtPosition(3, click()));
    }

    @DisplayName("экран Our Mission / 5-я карточка в списке / раскрываем карточку")
    public void expendCard_5() {
        onView(allOf(withId(Elements_OurMission.ID_LIST),
                childAtPosition(
                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                        0)))
                .perform(actionOnItemAtPosition(4, click()));
    }

    @DisplayName("экран Our Mission / 6-я карточка в списке / раскрываем карточку")
    public void expendCard_6() {
        onView(allOf(withId(Elements_OurMission.ID_LIST),
                childAtPosition(
                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                        0)))
                .perform(actionOnItemAtPosition(5, click()));
    }

    @DisplayName("экран Our Mission / 7-я карточка в списке / раскрываем карточку")
    public void expendCard_7() {
        onView(allOf(withId(Elements_OurMission.ID_LIST),
                childAtPosition(
                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                        0)))
                .perform(actionOnItemAtPosition(6, click()));
    }

    @DisplayName("экран Our Mission / 8-я карточка в списке / раскрываем карточку")
    public void expendCard_8() {
        onView(allOf(withId(Elements_OurMission.ID_LIST),
                childAtPosition(
                        withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                        0)))
                .perform(actionOnItemAtPosition(7, click()));
    }

    @DisplayName("экран Our Mission / скроллинг списка")
    public void swipeUp() {
        onView(withId(Elements_OurMission.ID_LIST))
                .perform(ViewActions.swipeUp());
    }

    @DisplayName("экран Our Mission / скроллинг списка")
    public void swipeDown() {
        onView(withId(Elements_OurMission.ID_LIST))
                .perform(ViewActions.swipeDown());
    }
}
