package ru.iteco.fmhandroid.ui.PageObject;

import android.view.View;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.matcher.ViewMatchers;

import org.hamcrest.Matcher;

public class FocusAndPerformViewAction implements ViewAction {

    private final ViewAction innerAction;

    public FocusAndPerformViewAction(ViewAction action) {
        this.innerAction = action;
    }

    @Override
    public Matcher<View> getConstraints() {
        return ViewMatchers.isAssignableFrom(View.class);
    }

    @Override
    public String getDescription() {
        return "Focus on the view and then perform an action";
    }

    @Override
    public void perform(UiController uiController, View view) {
        view.requestFocus();
        uiController.loopMainThreadUntilIdle();
        innerAction.perform(uiController, view);
    }
}
