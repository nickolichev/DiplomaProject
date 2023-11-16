package ru.iteco.fmhandroid;


import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.IdlingResource;
import androidx.test.espresso.idling.CountingIdlingResource;


// вариант от 12.09.23 не работает (анимация в том числе)

//public class ProjectIdlingResources implements IdlingResource {
//    private ResourceCallback callback;
//    private boolean isIdle = true;
//
//    @Override
//    public String getName() {
//        return ProjectIdlingResources.class.getName();
//    }
//
//    @Override
//    public boolean isIdleNow() {
//        return isIdle;
//    }
//
//    @Override
//    public void registerIdleTransitionCallback(ResourceCallback callback) {
//        this.callback = callback;
//    }
//
//    public void setBusy() {
//        isIdle = false;
//    }
//
//    public void setIdle() {
//        isIdle = true;
//        if (callback != null) {
//            callback.onTransitionToIdle();
//        }
//    }
//}










//public class ProjectIdlingResources {
//    private static final String RESOURCE = "GLOBAL";
//    public static CountingIdlingResource idlingResource = new CountingIdlingResource(RESOURCE);
//
//    public static void increment() {
//        idlingResource.increment();
//    }
//
//    public static void decrement() {
//        if (!idlingResource.isIdleNow()) {
//            idlingResource.decrement();
//        }
//    }
//
//}




public class ProjectIdlingResources {
    private static final String RESOURCE = "GLOBAL";
    public static CountingIdlingResource idlingResource = new CountingIdlingResource(RESOURCE);
    private static boolean isIdle = true;

    public static void increment() {
        if (isIdle) {
            idlingResource.increment();
        }
    }

    public static void decrement() {
        if (isIdle) {
            idlingResource.decrement();
        }
    }

    public static void setIdle(boolean isIdleState) {
        isIdle = isIdleState;
    }

    public void waitForIdle() {
        IdlingRegistry.getInstance().register(idlingResource);
    }
}


