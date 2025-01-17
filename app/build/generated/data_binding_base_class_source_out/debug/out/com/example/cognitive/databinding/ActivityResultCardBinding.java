// Generated by view binder compiler. Do not edit!
package com.example.cognitive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cognitive.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityResultCardBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView correct;

  @NonNull
  public final Button homebtn;

  @NonNull
  public final TextView incorrect;

  @NonNull
  public final LinearLayout layout;

  @NonNull
  public final Button materialsBtn;

  @NonNull
  public final TextView none;

  @NonNull
  public final Button resultbtn;

  @NonNull
  public final TextView textPerformance;

  @NonNull
  public final TextView textScore;

  private ActivityResultCardBinding(@NonNull LinearLayout rootView, @NonNull TextView correct,
      @NonNull Button homebtn, @NonNull TextView incorrect, @NonNull LinearLayout layout,
      @NonNull Button materialsBtn, @NonNull TextView none, @NonNull Button resultbtn,
      @NonNull TextView textPerformance, @NonNull TextView textScore) {
    this.rootView = rootView;
    this.correct = correct;
    this.homebtn = homebtn;
    this.incorrect = incorrect;
    this.layout = layout;
    this.materialsBtn = materialsBtn;
    this.none = none;
    this.resultbtn = resultbtn;
    this.textPerformance = textPerformance;
    this.textScore = textScore;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResultCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResultCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_result_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResultCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.correct;
      TextView correct = ViewBindings.findChildViewById(rootView, id);
      if (correct == null) {
        break missingId;
      }

      id = R.id.homebtn;
      Button homebtn = ViewBindings.findChildViewById(rootView, id);
      if (homebtn == null) {
        break missingId;
      }

      id = R.id.incorrect;
      TextView incorrect = ViewBindings.findChildViewById(rootView, id);
      if (incorrect == null) {
        break missingId;
      }

      id = R.id.layout;
      LinearLayout layout = ViewBindings.findChildViewById(rootView, id);
      if (layout == null) {
        break missingId;
      }

      id = R.id.materialsBtn;
      Button materialsBtn = ViewBindings.findChildViewById(rootView, id);
      if (materialsBtn == null) {
        break missingId;
      }

      id = R.id.none;
      TextView none = ViewBindings.findChildViewById(rootView, id);
      if (none == null) {
        break missingId;
      }

      id = R.id.resultbtn;
      Button resultbtn = ViewBindings.findChildViewById(rootView, id);
      if (resultbtn == null) {
        break missingId;
      }

      id = R.id.text_performance;
      TextView textPerformance = ViewBindings.findChildViewById(rootView, id);
      if (textPerformance == null) {
        break missingId;
      }

      id = R.id.text_score;
      TextView textScore = ViewBindings.findChildViewById(rootView, id);
      if (textScore == null) {
        break missingId;
      }

      return new ActivityResultCardBinding((LinearLayout) rootView, correct, homebtn, incorrect,
          layout, materialsBtn, none, resultbtn, textPerformance, textScore);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
