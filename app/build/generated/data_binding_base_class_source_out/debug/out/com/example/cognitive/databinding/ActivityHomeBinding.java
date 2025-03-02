// Generated by view binder compiler. Do not edit!
package com.example.cognitive.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cognitive.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final FloatingActionButton addfab;

  @NonNull
  public final BottomNavigationView bottomNavigation;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final NavigationView navigationView;

  @NonNull
  public final RecyclerView quizList;

  @NonNull
  public final Toolbar topAppBar;

  private ActivityHomeBinding(@NonNull DrawerLayout rootView, @NonNull FloatingActionButton addfab,
      @NonNull BottomNavigationView bottomNavigation, @NonNull DrawerLayout drawerLayout,
      @NonNull ConstraintLayout main, @NonNull NavigationView navigationView,
      @NonNull RecyclerView quizList, @NonNull Toolbar topAppBar) {
    this.rootView = rootView;
    this.addfab = addfab;
    this.bottomNavigation = bottomNavigation;
    this.drawerLayout = drawerLayout;
    this.main = main;
    this.navigationView = navigationView;
    this.quizList = quizList;
    this.topAppBar = topAppBar;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addfab;
      FloatingActionButton addfab = ViewBindings.findChildViewById(rootView, id);
      if (addfab == null) {
        break missingId;
      }

      id = R.id.bottomNavigation;
      BottomNavigationView bottomNavigation = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigation == null) {
        break missingId;
      }

      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.main;
      ConstraintLayout main = ViewBindings.findChildViewById(rootView, id);
      if (main == null) {
        break missingId;
      }

      id = R.id.navigation_view;
      NavigationView navigationView = ViewBindings.findChildViewById(rootView, id);
      if (navigationView == null) {
        break missingId;
      }

      id = R.id.quizList;
      RecyclerView quizList = ViewBindings.findChildViewById(rootView, id);
      if (quizList == null) {
        break missingId;
      }

      id = R.id.topAppBar;
      Toolbar topAppBar = ViewBindings.findChildViewById(rootView, id);
      if (topAppBar == null) {
        break missingId;
      }

      return new ActivityHomeBinding((DrawerLayout) rootView, addfab, bottomNavigation,
          drawerLayout, main, navigationView, quizList, topAppBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
