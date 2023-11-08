package ru.iteco.fmhandroid.ui.PageObject;

import android.view.View;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

    public class ParentMatcher extends TypeSafeMatcher<View> {
        private final Matcher<View> parentMatcher;

        public ParentMatcher(Matcher<View> parentMatcher) {
            this.parentMatcher = parentMatcher;
        }

        @Override
        protected boolean matchesSafely(View view) {
            return parentMatcher.matches(view.getParent());
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("has parent: ");
            parentMatcher.describeTo(description);
        }

        // Factory method to create the matcher
        public static Matcher<View> hasParent(Matcher<View> parentMatcher) {
            return new ParentMatcher(parentMatcher);
        }
    }
