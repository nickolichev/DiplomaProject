package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasData;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

import android.content.Intent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.intent.Intents;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;

import org.hamcrest.core.AllOf;

import io.qameta.allure.kotlin.Allure;
import io.qameta.allure.kotlin.Step;
import ru.iteco.fmhandroid.ui.resourceIDData.Elements_About;


public class Utils_About {

    public void clickPrivacyPolicy() {
        Allure.step("экран About / переход по гиперссылке на страницу Privacy Policy");
        ViewInteraction url = onView(
                AllOf.allOf(withId(Elements_About.ID_PRIVACY_POLICY_VALUE)));
        url.check(matches(isDisplayed()));
        Intents.init();
        url.perform(click());
        intended(hasData("https://vhospice.org/#/privacy-policy/"));
        intended(hasAction(Intent.ACTION_VIEW));
        Intents.release();
    }

    public void clickTermsOfUse() {
        Allure.step("экран About / переход по гиперссылке на страницу Terms Of Use");
        ViewInteraction url = onView(
                AllOf.allOf(withId(Elements_About.ID_TERMS_OF_USE_VALUE)));
        url.check(matches(isDisplayed()));
        Intents.init();
        url.perform(click());
        intended(hasData("https://vhospice.org/#/terms-of-use"));
        intended(hasAction(Intent.ACTION_VIEW));
        Intents.release();
    }

    public void returnFromBrowserToApp() {
        Allure.step("страница браузера / возврат в приложение");
        UiDevice app;
        app = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        app.pressBack();
    }

    public void clickButtonBackAboutView() {
        Allure.step("экран About / клик по кнопке Back");
        ViewInteraction clickLogOut = onView(
                allOf(withId(Elements_About.ID_BUTTON_BACK)));
        clickLogOut.perform(click());
    }
}
