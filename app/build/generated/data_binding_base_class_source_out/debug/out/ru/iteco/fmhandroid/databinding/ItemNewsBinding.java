// Generated by view binder compiler. Do not edit!
package ru.iteco.fmhandroid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ru.iteco.fmhandroid.R;

public final class ItemNewsBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView categoryIconImageView;

  @NonNull
  public final ImageView newsDividerImageView;

  @NonNull
  public final TextView newsItemCategoryTextView;

  @NonNull
  public final TextView newsItemDateTextView;

  @NonNull
  public final TextView newsItemDescriptionTextView;

  @NonNull
  public final Group newsItemGroup;

  @NonNull
  public final MaterialCardView newsItemMaterialCardView;

  @NonNull
  public final TextView newsItemTitleTextView;

  @NonNull
  public final ImageView viewNewsItemImageView;

  private ItemNewsBinding(@NonNull MaterialCardView rootView,
      @NonNull ImageView categoryIconImageView, @NonNull ImageView newsDividerImageView,
      @NonNull TextView newsItemCategoryTextView, @NonNull TextView newsItemDateTextView,
      @NonNull TextView newsItemDescriptionTextView, @NonNull Group newsItemGroup,
      @NonNull MaterialCardView newsItemMaterialCardView, @NonNull TextView newsItemTitleTextView,
      @NonNull ImageView viewNewsItemImageView) {
    this.rootView = rootView;
    this.categoryIconImageView = categoryIconImageView;
    this.newsDividerImageView = newsDividerImageView;
    this.newsItemCategoryTextView = newsItemCategoryTextView;
    this.newsItemDateTextView = newsItemDateTextView;
    this.newsItemDescriptionTextView = newsItemDescriptionTextView;
    this.newsItemGroup = newsItemGroup;
    this.newsItemMaterialCardView = newsItemMaterialCardView;
    this.newsItemTitleTextView = newsItemTitleTextView;
    this.viewNewsItemImageView = viewNewsItemImageView;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemNewsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemNewsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_news, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemNewsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.category_icon_image_view;
      ImageView categoryIconImageView = ViewBindings.findChildViewById(rootView, id);
      if (categoryIconImageView == null) {
        break missingId;
      }

      id = R.id.news_divider_image_view;
      ImageView newsDividerImageView = ViewBindings.findChildViewById(rootView, id);
      if (newsDividerImageView == null) {
        break missingId;
      }

      id = R.id.news_item_category_text_view;
      TextView newsItemCategoryTextView = ViewBindings.findChildViewById(rootView, id);
      if (newsItemCategoryTextView == null) {
        break missingId;
      }

      id = R.id.news_item_date_text_view;
      TextView newsItemDateTextView = ViewBindings.findChildViewById(rootView, id);
      if (newsItemDateTextView == null) {
        break missingId;
      }

      id = R.id.news_item_description_text_view;
      TextView newsItemDescriptionTextView = ViewBindings.findChildViewById(rootView, id);
      if (newsItemDescriptionTextView == null) {
        break missingId;
      }

      id = R.id.news_item_group;
      Group newsItemGroup = ViewBindings.findChildViewById(rootView, id);
      if (newsItemGroup == null) {
        break missingId;
      }

      MaterialCardView newsItemMaterialCardView = (MaterialCardView) rootView;

      id = R.id.news_item_title_text_view;
      TextView newsItemTitleTextView = ViewBindings.findChildViewById(rootView, id);
      if (newsItemTitleTextView == null) {
        break missingId;
      }

      id = R.id.view_news_item_image_view;
      ImageView viewNewsItemImageView = ViewBindings.findChildViewById(rootView, id);
      if (viewNewsItemImageView == null) {
        break missingId;
      }

      return new ItemNewsBinding((MaterialCardView) rootView, categoryIconImageView,
          newsDividerImageView, newsItemCategoryTextView, newsItemDateTextView,
          newsItemDescriptionTextView, newsItemGroup, newsItemMaterialCardView,
          newsItemTitleTextView, viewNewsItemImageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
