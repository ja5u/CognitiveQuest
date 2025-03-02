// Generated by view binder compiler. Do not edit!
package com.example.cognitive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cognitive.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button blackbtn;

  @NonNull
  public final Button bluebtn;

  @NonNull
  public final ConstraintLayout constraintLayout3;

  @NonNull
  public final Button graybtn;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final Button whitebtn;

  private ActivitySettingsBinding(@NonNull ConstraintLayout rootView, @NonNull Button blackbtn,
      @NonNull Button bluebtn, @NonNull ConstraintLayout constraintLayout3, @NonNull Button graybtn,
      @NonNull ConstraintLayout main, @NonNull Button whitebtn) {
    this.rootView = rootView;
    this.blackbtn = blackbtn;
    this.bluebtn = bluebtn;
    this.constraintLayout3 = constraintLayout3;
    this.graybtn = graybtn;
    this.main = main;
    this.whitebtn = whitebtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.blackbtn;
      Button blackbtn = ViewBindings.findChildViewById(rootView, id);
      if (blackbtn == null) {
        break missingId;
      }

      id = R.id.bluebtn;
      Button bluebtn = ViewBindings.findChildViewById(rootView, id);
      if (bluebtn == null) {
        break missingId;
      }

      id = R.id.constraintLayout3;
      ConstraintLayout constraintLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout3 == null) {
        break missingId;
      }

      id = R.id.graybtn;
      Button graybtn = ViewBindings.findChildViewById(rootView, id);
      if (graybtn == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.whitebtn;
      Button whitebtn = ViewBindings.findChildViewById(rootView, id);
      if (whitebtn == null) {
        break missingId;
      }

      return new ActivitySettingsBinding((ConstraintLayout) rootView, blackbtn, bluebtn,
          constraintLayout3, graybtn, main, whitebtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
