package ru.iteco.fmhandroid.ui.PageObject;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;

import ru.iteco.fmhandroid.ui.resourceIDData.Elements_About;
import ru.iteco.fmhandroid.ui.testData.Data_About;

public class CheckUtils_About {

    // экран ABOUT
    // набор всех проверок
    public void checkTitleAbout_Visibility() {
        onView(allOf(withText(Data_About.TITLE_VERSION_TEXT),
                withParent(withParent(withId(Elements_About.ID_TITLE_VERSION))),
                isDisplayed()));
    }

    public void checkVersionValueVisibility() {
        onView(allOf(withText(Data_About.VERSION_VALUE_TEXT),
                withParent(withParent(withId(Elements_About.ID_VERSION_VALUE))),
                isDisplayed()));
    }

    public void checkPrivacyPolicyVisibility() {
        onView(allOf(withText(Data_About.PRIVACY_POLICY_TEXT),
                withParent(withParent(withId(Elements_About.ID_PRIVACY_POLICY))),
                isDisplayed()));
    }

    public void checkTermsOfUseVisibility() {
        onView(allOf(withText(Data_About.TERMS_OF_USE_TEXT),
                withParent(withParent(withId(Elements_About.ID_TERMS_OF_USE))),
                isDisplayed()));
    }

}
