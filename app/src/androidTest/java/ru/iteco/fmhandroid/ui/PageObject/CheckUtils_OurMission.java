package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import org.hamcrest.core.IsInstanceOf;

import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_OurMission;
import ru.iteco.fmhandroid.ui.testData.Data_OurMission;

public class CheckUtils_OurMission {

    @Step("экран Our Mission / проверяем отображение Title экрана Our Mission")
    public void checkTitleView_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_VIEW),
                withText(Data_OurMission.TITLE_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_TEXT)));
    }

    @Step("экран Our Mission / 1-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_1_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD),
                withText(Data_OurMission.TITLE_CARD_1),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_1)));
    }

    @Step("экран Our Mission / 2-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_2_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD),
                withText(Data_OurMission.TITLE_CARD_2),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_2)));
    }

    @Step("экран Our Mission / 3-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_3_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD),
                withText(Data_OurMission.TITLE_CARD_3),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_3)));
    }

    @Step("экран Our Mission / 4-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_4_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD),
                withText(Data_OurMission.TITLE_CARD_4),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_4)));
    }

    @Step("экран Our Mission / 5-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_5_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD),
                withText(Data_OurMission.TITLE_CARD_5),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_5)));
    }

    @Step("экран Our Mission / 6-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_6_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD),
                withText(Data_OurMission.TITLE_CARD_6),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_6)));
    }

    @Step("экран Our Mission / 7-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_7_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD),
                withText(Data_OurMission.TITLE_CARD_7),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_7)));
    }

    @Step("экран Our Mission / 8-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_8_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD),
                withText(Data_OurMission.TITLE_CARD_8),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_8)));
    }

    @Step("экран Our Mission / 1-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_1_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD),
                withText(Data_OurMission.DESCRIPTION_CARD_1),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_1)));
    }

    @Step("экран Our Mission / 2-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_2_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD),
                withText(Data_OurMission.DESCRIPTION_CARD_2),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_2)));
    }

    @Step("экран Our Mission / 3-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_3_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD),
                withText(Data_OurMission.DESCRIPTION_CARD_3),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_3)));
    }

    @Step("экран Our Mission / 4-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_4_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD),
                withText(Data_OurMission.DESCRIPTION_CARD_4),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_4)));
    }

    @Step("экран Our Mission / 5-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_5_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD),
                withText(Data_OurMission.DESCRIPTION_CARD_5),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_5)));
    }

    @Step("экран Our Mission / 6-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_6_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD),
                withText(Data_OurMission.DESCRIPTION_CARD_6),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_6)));
    }

    @Step("экран Our Mission / 7-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_7_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD),
                withText(Data_OurMission.DESCRIPTION_CARD_7),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_7)));
    }

    @Step("экран Our Mission / 8-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_8_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD),
                withText(Data_OurMission.DESCRIPTION_CARD_8),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_8)));
    }
}
