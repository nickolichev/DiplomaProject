package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import org.hamcrest.core.IsInstanceOf;

import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_Auth;
import ru.iteco.fmhandroid.ui.testData.Data_Auth;

public class CheckUtils_Auth {
    @Step("экран AUTHORIZATION / проверяем отображение Title экрана")
    public void checkTitleAuthView_Visibility() {
        onView(allOf(withText(Data_Auth.TITLE_AUTHORIZATION),
                withParent(withParent(withId(Elements_Auth.ID_TITLE_AUTHORIZATION))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Auth.TITLE_AUTHORIZATION)));
    }

    @Step("экран AUTHORIZATION / проверяем отображение поля ввода Login")
    public void checkFieldLoginAuthView_Visibility() {
        onView(allOf(withHint(Data_Auth.FIELD_LOGIN),
                withParent(withParent(withId(Elements_Auth.ID_FIELD_LOGIN))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_Auth.FIELD_LOGIN)));
    }

    @Step("экран AUTHORIZATION / проверяем отображение поля ввода Login")
    public void checkFieldPasswordAuthView_Visibility() {
        onView(allOf(withHint(Data_Auth.FIELD_PASSWORD),
                withParent(withParent(withId(Elements_Auth.ID_FIELD_PASSWORD))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withHint(Data_Auth.FIELD_PASSWORD)));
    }

    @Step("экран AUTHORIZATION / проверяем отображение кнопки SIGN IN")
    public void checkButtonSignInAuthView_Visibility() {
        onView(allOf(withId(Elements_Auth.ID_BUTTON_SIGN_IN),
                withText(Data_Auth.BUTTON_SIGN_IN),
                withContentDescription(Data_Auth.BUTTON_SAVE),
                withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class))),
                isDisplayed()))
                .check(matches(isDisplayed()))
                .check(matches(withText(Data_Auth.BUTTON_SIGN_IN)));
    }
}
