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
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_About;
import ru.iteco.fmhandroid.ui.testData.Data_About;

public class CheckUtils_About {

    @Step("экран About / проверка отображения Title экрана")
    public void checkTitleAbout_Visibility() {
        onView(allOf(withId(Elements_About.ID_TITLE_VERSION),
                withText(Data_About.TITLE_VERSION_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_About.TITLE_VERSION_TEXT)));
    }

    @Step("экран About / проверяем отображение Version")
    public void checkVersionValue_Visibility() {
        onView(allOf(withId(Elements_About.ID_VERSION_VALUE),
                withText(Data_About.VERSION_VALUE_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_About.VERSION_VALUE_TEXT)));
    }

    @Step("экран About / проверка отображения текста и ссылки Privacy Policy")
    public void checkPrivacyPolicy_Visibility() {
        onView(allOf(withId(Elements_About.ID_PRIVACY_POLICY),
                withText(Data_About.PRIVACY_POLICY_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_About.PRIVACY_POLICY_TEXT)));
        onView(allOf(withId(Elements_About.ID_PRIVACY_POLICY_VALUE),
                withText(Data_About.PRIVACY_POLICY_VALUE_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_About.PRIVACY_POLICY_VALUE_TEXT)));
    }

    @Step("экран About / проверка отображения текста и ссылки Terms Of Use")
    public void checkTermsOfUse_Visibility() {
        onView(allOf(withId(Elements_About.ID_TERMS_OF_USE),
                withText(Data_About.TERMS_OF_USE_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_About.TERMS_OF_USE_TEXT)));
        onView(allOf(withId(Elements_About.ID_TERMS_OF_USE_VALUE),
                withText(Data_About.TERMS_OF_USE_VALUE_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_About.TERMS_OF_USE_VALUE_TEXT)));
    }
}
