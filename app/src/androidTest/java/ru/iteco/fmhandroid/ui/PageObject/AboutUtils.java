package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasData;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.content.Intent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.intent.Intents;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;

import org.hamcrest.core.AllOf;

import ru.iteco.fmhandroid.ui.resourceIDData.AboutElements;


public class AboutUtils {
    private UiDevice app;
    public void clickPrivacyPolicy() {
        ViewInteraction url = onView(
                AllOf.allOf(withId(AboutElements.ID_PRIVACY_POLICY_VALUE)));
        url.check(matches(isDisplayed()));
        Intents.init();
        url.perform(click());
        intended(hasData("https://vhospice.org/#/privacy-policy/"));
        intended(hasAction(Intent.ACTION_VIEW));
        Intents.release();
    }

    public void clickTermsOfUse() {
        ViewInteraction url = onView(
                AllOf.allOf(withId(AboutElements.ID_TERMS_OF_USE_VALUE)));
        url.check(matches(isDisplayed()));
        Intents.init();
        url.perform(click());
        intended(hasData("https://vhospice.org/#/terms-of-use"));
        intended(hasAction(Intent.ACTION_VIEW));
        Intents.release();
    }

    public void returnFromBrowserToApp() {
        app = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        app.pressBack();
    }
}
