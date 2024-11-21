// Generated by view binder compiler. Do not edit!
package com.example.cognitive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cognitive.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomScoreHistoryBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView scoreText;

  @NonNull
  public final TextView titleText;

  @NonNull
  public final TextView usernameText;

  private CustomScoreHistoryBinding(@NonNull CardView rootView, @NonNull TextView scoreText,
      @NonNull TextView titleText, @NonNull TextView usernameText) {
    this.rootView = rootView;
    this.scoreText = scoreText;
    this.titleText = titleText;
    this.usernameText = usernameText;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomScoreHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomScoreHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_score_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomScoreHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.scoreText;
      TextView scoreText = ViewBindings.findChildViewById(rootView, id);
      if (scoreText == null) {
        break missingId;
      }

      id = R.id.titleText;
      TextView titleText = ViewBindings.findChildViewById(rootView, id);
      if (titleText == null) {
        break missingId;
      }

      id = R.id.usernameText;
      TextView usernameText = ViewBindings.findChildViewById(rootView, id);
      if (usernameText == null) {
        break missingId;
      }

      return new CustomScoreHistoryBinding((CardView) rootView, scoreText, titleText, usernameText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
