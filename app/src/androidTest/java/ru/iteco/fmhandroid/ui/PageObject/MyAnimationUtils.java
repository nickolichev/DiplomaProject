package ru.iteco.fmhandroid.ui.PageObject;


import android.app.Instrumentation;
import android.app.UiAutomation;

public class MyAnimationUtils {
    public static void disableAnimations(Instrumentation instrumentation) {
        UiAutomation uiAutomation = instrumentation.getUiAutomation();
        uiAutomation.executeShellCommand("settings put global window_animation_scale 0");
        uiAutomation.executeShellCommand("settings put global transition_animation_scale 0");
        uiAutomation.executeShellCommand("settings put global animator_duration_scale 0");
    }

    public static void enableAnimations(Instrumentation instrumentation) {
        UiAutomation uiAutomation = instrumentation.getUiAutomation();
        uiAutomation.executeShellCommand("settings put global window_animation_scale 1");
        uiAutomation.executeShellCommand("settings put global transition_animation_scale 1");
        uiAutomation.executeShellCommand("settings put global animator_duration_scale 1");
    }

//    public static ViewAction waitForView() {
//        return new ViewAction() {
//            @Override
//            public Matcher<View> getConstraints() {
//                return isAssignableFrom(View.class);
//            }
//
//            @Override
//            public void perform(UiController uiController, View view) {
//
//            }
//
//            @Override
//            public String getDescription() {
//                return "Wait for a specific view";
//            }
//
//            @Override
//            public void perform(UiController uiController, View view) {
//                uiController.loopMainThreadUntilIdle();
//            }
//        };
//    }
}