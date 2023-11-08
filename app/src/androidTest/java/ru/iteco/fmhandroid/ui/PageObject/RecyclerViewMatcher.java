package ru.iteco.fmhandroid.ui.PageObject;

import android.content.res.Resources;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class RecyclerViewMatcher {
    private final int recyclerViewId;

    public RecyclerViewMatcher(int recyclerViewId) {
        this.recyclerViewId = recyclerViewId;
    }

    public Matcher<View> atPositionOnView(final int position, final int targetViewId) {
        return new TypeSafeMatcher<View>() {
            Resources resources = null;
            View childView;

            @Override
            public void describeTo(Description description) {
                String idDescription = Integer.toString(targetViewId);
                if (this.resources != null) {
                    try {
                        idDescription = this.resources.getResourceName(targetViewId);
                    } catch (Resources.NotFoundException e) {
                        idDescription = String.format("%s (resource name not found)",
                                Integer.valueOf(targetViewId));
                    }
                }

                description.appendText("with id: " + idDescription);
            }

            @Override
            public boolean matchesSafely(View view) {
                this.resources = view.getResources();

                if (childView == null) {
                    RecyclerView recyclerView = view.getRootView().findViewById(recyclerViewId);
                    if (recyclerView != null && recyclerView.getId() == recyclerViewId) {
                        childView = recyclerView.findViewHolderForAdapterPosition(position).itemView;
                    } else {
                        return false;
                    }
                }

                if (targetViewId == -1) {
                    return view == childView;
                } else {
                    View targetView = childView.findViewById(targetViewId);
                    return view == targetView;
                }
            }
        };
    }
}

