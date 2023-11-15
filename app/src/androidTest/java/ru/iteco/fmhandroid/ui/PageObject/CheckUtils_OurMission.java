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

import io.qameta.allure.kotlin.junit4.DisplayName;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_OurMission;
import ru.iteco.fmhandroid.ui.testData.Data_OurMission;

public class CheckUtils_OurMission {

    @DisplayName("экран Our Mission / проверяем отображение Title экрана Our Mission")
    public void checkTitleView_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_VIEW), withText(Data_OurMission.TITLE_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_TEXT)));
    }

    @DisplayName("экран Our Mission / проверяем отображение эмоджи в 1-й карточке")
    public void checkEmoji_1_Visibility() {
        onView(new RecyclerViewMatcher(Elements_OurMission.ID_LIST)
                .atPositionOnView(0, Elements_OurMission.ID_EMOJI))
                .check(matches(isDisplayed()));
    }

    @DisplayName("экран Our Mission / проверяем отображение эмоджи в 2-й карточке")
    public void checkEmoji_2_Visibility() {
        onView(new RecyclerViewMatcher(Elements_OurMission.ID_LIST)
                .atPositionOnView(1, Elements_OurMission.ID_EMOJI))
                .check(matches(isDisplayed()));
    }

    @DisplayName("экран Our Mission / проверяем отображение эмоджи в 3-й карточке")
    public void checkEmoji_3_Visibility() {
        onView(new RecyclerViewMatcher(Elements_OurMission.ID_LIST)
                .atPositionOnView(2, Elements_OurMission.ID_EMOJI))
                .check(matches(isDisplayed()));
    }

    @DisplayName("экран Our Mission / проверяем отображение эмоджи в 4-й карточке")
    public void checkEmoji_4_Visibility() {
        onView(new RecyclerViewMatcher(Elements_OurMission.ID_LIST)
                .atPositionOnView(3, Elements_OurMission.ID_EMOJI))
                .check(matches(isDisplayed()));
    }

    @DisplayName("экран Our Mission / проверяем отображение эмоджи в 5-й карточке")
    public void checkEmoji_5_Visibility() {
        onView(new RecyclerViewMatcher(Elements_OurMission.ID_LIST)
                .atPositionOnView(4, Elements_OurMission.ID_EMOJI))
                .check(matches(isDisplayed()));
    }

    @DisplayName("экран Our Mission / проверяем отображение эмоджи в 6-й карточке")
    public void checkEmoji_6_Visibility() {
        onView(new RecyclerViewMatcher(Elements_OurMission.ID_LIST)
                .atPositionOnView(5, Elements_OurMission.ID_EMOJI))
                .check(matches(isDisplayed()));
    }

    @DisplayName("экран Our Mission / проверяем отображение эмоджи в 7-й карточке")
    public void checkEmoji_7_Visibility() {
        onView(new RecyclerViewMatcher(Elements_OurMission.ID_LIST)
                .atPositionOnView(6, Elements_OurMission.ID_EMOJI))
                .check(matches(isDisplayed()));
    }

    @DisplayName("экран Our Mission / проверяем отображение эмоджи в 8-й карточке")
    public void checkEmoji_8_Visibility() {
        onView(new RecyclerViewMatcher(Elements_OurMission.ID_LIST)
                .atPositionOnView(7, Elements_OurMission.ID_EMOJI))
                .check(matches(isDisplayed()));
    }

    @DisplayName("экран Our Mission / 1-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_1_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD), withText(Data_OurMission.TITLE_CARD_1),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_1)));
    }

    @DisplayName("экран Our Mission / 2-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_2_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD), withText(Data_OurMission.TITLE_CARD_2),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_2)));
    }

    @DisplayName("экран Our Mission / 3-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_3_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD), withText(Data_OurMission.TITLE_CARD_3),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_3)));
    }

    @DisplayName("экран Our Mission / 4-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_4_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD), withText(Data_OurMission.TITLE_CARD_4),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_4)));
    }

    @DisplayName("экран Our Mission / 5-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_5_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD), withText(Data_OurMission.TITLE_CARD_5),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_5)));
    }

    @DisplayName("экран Our Mission / 6-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_6_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD), withText(Data_OurMission.TITLE_CARD_6),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_6)));
    }

    @DisplayName("экран Our Mission / 7-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_7_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD), withText(Data_OurMission.TITLE_CARD_7),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_7)));
    }

    @DisplayName("экран Our Mission / 8-я карточка в списке / проверяем отображение текста Title")
    public void checkTitleCard_8_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_TITLE_CARD), withText(Data_OurMission.TITLE_CARD_8),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.TITLE_CARD_8)));
    }

    @DisplayName("экран Our Mission / 1-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_1_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD), withText(Data_OurMission.DESCRIPTION_CARD_1),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_1)));
    }

    @DisplayName("экран Our Mission / 2-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_2_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD), withText(Data_OurMission.DESCRIPTION_CARD_2),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_2)));
    }

    @DisplayName("экран Our Mission / 3-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_3_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD), withText(Data_OurMission.DESCRIPTION_CARD_3),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_3)));
    }

    @DisplayName("экран Our Mission / 4-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_4_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD), withText(Data_OurMission.DESCRIPTION_CARD_4),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_4)));
    }

    @DisplayName("экран Our Mission / 5-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_5_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD), withText(Data_OurMission.DESCRIPTION_CARD_5),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_5)));
    }

    @DisplayName("экран Our Mission / 6-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_6_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD), withText(Data_OurMission.DESCRIPTION_CARD_6),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_6)));
    }

    @DisplayName("экран Our Mission / 7-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_7_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD), withText(Data_OurMission.DESCRIPTION_CARD_7),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_7)));
    }

    @DisplayName("экран Our Mission / 8-я карточка в списке / проверяем отображение текста DESCRIPTION")
    public void checkDescriptionCard_8_Visibility() {
        onView(allOf(withId(Elements_OurMission.ID_DESCRIPTION_CARD), withText(Data_OurMission.DESCRIPTION_CARD_8),
                withParent(withParent(withId(Elements_OurMission.ID_CARD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_OurMission.DESCRIPTION_CARD_8)));
    }
}
