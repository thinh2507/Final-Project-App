// Generated by view binder compiler. Do not edit!
package com.example.final_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.final_project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignupBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final Button btnSignUp;

  @NonNull
  public final EditText etConfPass;

  @NonNull
  public final EditText etSignMail;

  @NonNull
  public final EditText etSignName;

  @NonNull
  public final EditText etSignPass;

  @NonNull
  public final EditText etSignPhone;

  @NonNull
  public final ImageView imgLogo;

  @NonNull
  public final TextView tvLogin;

  private ActivitySignupBinding(@NonNull LinearLayout rootView, @NonNull ImageView btnBack,
      @NonNull Button btnSignUp, @NonNull EditText etConfPass, @NonNull EditText etSignMail,
      @NonNull EditText etSignName, @NonNull EditText etSignPass, @NonNull EditText etSignPhone,
      @NonNull ImageView imgLogo, @NonNull TextView tvLogin) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnSignUp = btnSignUp;
    this.etConfPass = etConfPass;
    this.etSignMail = etSignMail;
    this.etSignName = etSignName;
    this.etSignPass = etSignPass;
    this.etSignPhone = etSignPhone;
    this.imgLogo = imgLogo;
    this.tvLogin = tvLogin;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      ImageView btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnSignUp;
      Button btnSignUp = ViewBindings.findChildViewById(rootView, id);
      if (btnSignUp == null) {
        break missingId;
      }

      id = R.id.etConfPass;
      EditText etConfPass = ViewBindings.findChildViewById(rootView, id);
      if (etConfPass == null) {
        break missingId;
      }

      id = R.id.etSignMail;
      EditText etSignMail = ViewBindings.findChildViewById(rootView, id);
      if (etSignMail == null) {
        break missingId;
      }

      id = R.id.etSignName;
      EditText etSignName = ViewBindings.findChildViewById(rootView, id);
      if (etSignName == null) {
        break missingId;
      }

      id = R.id.etSignPass;
      EditText etSignPass = ViewBindings.findChildViewById(rootView, id);
      if (etSignPass == null) {
        break missingId;
      }

      id = R.id.etSignPhone;
      EditText etSignPhone = ViewBindings.findChildViewById(rootView, id);
      if (etSignPhone == null) {
        break missingId;
      }

      id = R.id.img_logo;
      ImageView imgLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgLogo == null) {
        break missingId;
      }

      id = R.id.tv_login;
      TextView tvLogin = ViewBindings.findChildViewById(rootView, id);
      if (tvLogin == null) {
        break missingId;
      }

      return new ActivitySignupBinding((LinearLayout) rootView, btnBack, btnSignUp, etConfPass,
          etSignMail, etSignName, etSignPass, etSignPhone, imgLogo, tvLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
