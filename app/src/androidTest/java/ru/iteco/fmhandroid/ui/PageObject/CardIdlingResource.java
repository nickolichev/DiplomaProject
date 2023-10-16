package ru.iteco.fmhandroid.ui.PageObject;

//    public class CardIdlingResource implements IdlingResource {
//
//        private ResourceCallback resourceCallback;
//        private boolean isIdle = true;
//
//        @Override
//        public String getName() {
//            return getClass().getName();
//        }
//
//        @Override
//        public boolean isIdleNow() {
//            return isIdle;
//        }
//
//        @Override
//        public void registerIdleTransitionCallback(ResourceCallback callback) {
//            this.resourceCallback = callback;
//        }
//
//        public void setIdle(boolean isIdle) {
//            this.isIdle = isIdle;
//            if (isIdle && resourceCallback != null) {
//                resourceCallback.onTransitionToIdle();
//            }
//            Log.d("CardIdlingResource", "Idle state set to: " + isIdle);
//        }
//        public void waitUntilIdle() {
//            IdlingRegistry.getInstance().register(this);
//        }
//    }
