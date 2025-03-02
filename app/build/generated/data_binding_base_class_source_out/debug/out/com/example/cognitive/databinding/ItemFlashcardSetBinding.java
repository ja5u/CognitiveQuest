// Generated by view binder compiler. Do not edit!
package com.example.cognitive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cognitive.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemFlashcardSetBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final FloatingActionButton addCards;

  @NonNull
  public final LinearLayout contributorsLayout;

  @NonNull
  public final LinearLayout phraseAndArrowLayout;

  @NonNull
  public final ImageView semiCircle;

  @NonNull
  public final TextView tvCount;

  @NonNull
  public final TextView tvPartsTitle;

  private ItemFlashcardSetBinding(@NonNull CardView rootView,
      @NonNull FloatingActionButton addCards, @NonNull LinearLayout contributorsLayout,
      @NonNull LinearLayout phraseAndArrowLayout, @NonNull ImageView semiCircle,
      @NonNull TextView tvCount, @NonNull TextView tvPartsTitle) {
    this.rootView = rootView;
    this.addCards = addCards;
    this.contributorsLayout = contributorsLayout;
    this.phraseAndArrowLayout = phraseAndArrowLayout;
    this.semiCircle = semiCircle;
    this.tvCount = tvCount;
    this.tvPartsTitle = tvPartsTitle;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemFlashcardSetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemFlashcardSetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_flashcard_set, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemFlashcardSetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_cards;
      FloatingActionButton addCards = ViewBindings.findChildViewById(rootView, id);
      if (addCards == null) {
        break missingId;
      }

      id = R.id.contributorsLayout;
      LinearLayout contributorsLayout = ViewBindings.findChildViewById(rootView, id);
      if (contributorsLayout == null) {
        break missingId;
      }

      id = R.id.phraseAndArrowLayout;
      LinearLayout phraseAndArrowLayout = ViewBindings.findChildViewById(rootView, id);
      if (phraseAndArrowLayout == null) {
        break missingId;
      }

      id = R.id.semiCircle;
      ImageView semiCircle = ViewBindings.findChildViewById(rootView, id);
      if (semiCircle == null) {
        break missingId;
      }

      id = R.id.tvCount;
      TextView tvCount = ViewBindings.findChildViewById(rootView, id);
      if (tvCount == null) {
        break missingId;
      }

      id = R.id.tvPartsTitle;
      TextView tvPartsTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvPartsTitle == null) {
        break missingId;
      }

      return new ItemFlashcardSetBinding((CardView) rootView, addCards, contributorsLayout,
          phraseAndArrowLayout, semiCircle, tvCount, tvPartsTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
