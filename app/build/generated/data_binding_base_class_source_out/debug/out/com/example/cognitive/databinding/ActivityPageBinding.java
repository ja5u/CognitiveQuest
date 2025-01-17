// Generated by view binder compiler. Do not edit!
package com.example.cognitive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cognitive.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ProgressBar loader;

  @NonNull
  public final Button next;

  @NonNull
  public final Button option1;

  @NonNull
  public final Button option2;

  @NonNull
  public final Button option3;

  @NonNull
  public final Button option4;

  @NonNull
  public final Button prev;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView question;

  private ActivityPageBinding(@NonNull LinearLayout rootView, @NonNull ProgressBar loader,
      @NonNull Button next, @NonNull Button option1, @NonNull Button option2,
      @NonNull Button option3, @NonNull Button option4, @NonNull Button prev,
      @NonNull ProgressBar progressBar, @NonNull TextView question) {
    this.rootView = rootView;
    this.loader = loader;
    this.next = next;
    this.option1 = option1;
    this.option2 = option2;
    this.option3 = option3;
    this.option4 = option4;
    this.prev = prev;
    this.progressBar = progressBar;
    this.question = question;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.loader;
      ProgressBar loader = ViewBindings.findChildViewById(rootView, id);
      if (loader == null) {
        break missingId;
      }

      id = R.id.next;
      Button next = ViewBindings.findChildViewById(rootView, id);
      if (next == null) {
        break missingId;
      }

      id = R.id.option1;
      Button option1 = ViewBindings.findChildViewById(rootView, id);
      if (option1 == null) {
        break missingId;
      }

      id = R.id.option2;
      Button option2 = ViewBindings.findChildViewById(rootView, id);
      if (option2 == null) {
        break missingId;
      }

      id = R.id.option3;
      Button option3 = ViewBindings.findChildViewById(rootView, id);
      if (option3 == null) {
        break missingId;
      }

      id = R.id.option4;
      Button option4 = ViewBindings.findChildViewById(rootView, id);
      if (option4 == null) {
        break missingId;
      }

      id = R.id.prev;
      Button prev = ViewBindings.findChildViewById(rootView, id);
      if (prev == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.question;
      TextView question = ViewBindings.findChildViewById(rootView, id);
      if (question == null) {
        break missingId;
      }

      return new ActivityPageBinding((LinearLayout) rootView, loader, next, option1, option2,
          option3, option4, prev, progressBar, question);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
