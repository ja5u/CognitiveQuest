// Generated by view binder compiler. Do not edit!
package com.example.cognitive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cognitive.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout3;

  @NonNull
  public final RatingBar feedbackRating;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final Button rateBtn;

  @NonNull
  public final ImageView reactionImage;

  @NonNull
  public final ShapeableImageView shapeableImageView;

  private ActivityRateBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout3, @NonNull RatingBar feedbackRating,
      @NonNull ConstraintLayout main, @NonNull Button rateBtn, @NonNull ImageView reactionImage,
      @NonNull ShapeableImageView shapeableImageView) {
    this.rootView = rootView;
    this.constraintLayout3 = constraintLayout3;
    this.feedbackRating = feedbackRating;
    this.main = main;
    this.rateBtn = rateBtn;
    this.reactionImage = reactionImage;
    this.shapeableImageView = shapeableImageView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_rate, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout3;
      ConstraintLayout constraintLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout3 == null) {
        break missingId;
      }

      id = R.id.feedback_rating;
      RatingBar feedbackRating = ViewBindings.findChildViewById(rootView, id);
      if (feedbackRating == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.rateBtn;
      Button rateBtn = ViewBindings.findChildViewById(rootView, id);
      if (rateBtn == null) {
        break missingId;
      }

      id = R.id.reaction_image;
      ImageView reactionImage = ViewBindings.findChildViewById(rootView, id);
      if (reactionImage == null) {
        break missingId;
      }

      id = R.id.shapeableImageView;
      ShapeableImageView shapeableImageView = ViewBindings.findChildViewById(rootView, id);
      if (shapeableImageView == null) {
        break missingId;
      }

      return new ActivityRateBinding((ConstraintLayout) rootView, constraintLayout3, feedbackRating,
          main, rateBtn, reactionImage, shapeableImageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
