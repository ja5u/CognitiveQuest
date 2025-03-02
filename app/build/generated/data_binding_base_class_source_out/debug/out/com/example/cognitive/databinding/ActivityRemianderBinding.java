// Generated by view binder compiler. Do not edit!
package com.example.cognitive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cognitive.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRemianderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final Button setReminderButton;

  @NonNull
  public final TextView timeDetails;

  @NonNull
  public final TimePicker timePicker;

  private ActivityRemianderBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout main,
      @NonNull Button setReminderButton, @NonNull TextView timeDetails,
      @NonNull TimePicker timePicker) {
    this.rootView = rootView;
    this.main = main;
    this.setReminderButton = setReminderButton;
    this.timeDetails = timeDetails;
    this.timePicker = timePicker;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRemianderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRemianderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_remiander, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRemianderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout main = (LinearLayout) rootView;

      id = R.id.set_reminder_button;
      Button setReminderButton = ViewBindings.findChildViewById(rootView, id);
      if (setReminderButton == null) {
        break missingId;
      }

      id = R.id.time_details;
      TextView timeDetails = ViewBindings.findChildViewById(rootView, id);
      if (timeDetails == null) {
        break missingId;
      }

      id = R.id.time_picker;
      TimePicker timePicker = ViewBindings.findChildViewById(rootView, id);
      if (timePicker == null) {
        break missingId;
      }

      return new ActivityRemianderBinding((LinearLayout) rootView, main, setReminderButton,
          timeDetails, timePicker);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
