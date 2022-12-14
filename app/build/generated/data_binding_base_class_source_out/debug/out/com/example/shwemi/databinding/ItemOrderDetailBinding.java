// Generated by view binder compiler. Do not edit!
package com.example.shwemi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shwemi.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemOrderDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CheckBox checkBox2;

  @NonNull
  public final EditText editTextNumber;

  @NonNull
  public final EditText editTextNumberSigned;

  private ItemOrderDetailBinding(@NonNull ConstraintLayout rootView, @NonNull CheckBox checkBox2,
      @NonNull EditText editTextNumber, @NonNull EditText editTextNumberSigned) {
    this.rootView = rootView;
    this.checkBox2 = checkBox2;
    this.editTextNumber = editTextNumber;
    this.editTextNumberSigned = editTextNumberSigned;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemOrderDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemOrderDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_order_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemOrderDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checkBox2;
      CheckBox checkBox2 = ViewBindings.findChildViewById(rootView, id);
      if (checkBox2 == null) {
        break missingId;
      }

      id = R.id.editTextNumber;
      EditText editTextNumber = ViewBindings.findChildViewById(rootView, id);
      if (editTextNumber == null) {
        break missingId;
      }

      id = R.id.editTextNumberSigned;
      EditText editTextNumberSigned = ViewBindings.findChildViewById(rootView, id);
      if (editTextNumberSigned == null) {
        break missingId;
      }

      return new ItemOrderDetailBinding((ConstraintLayout) rootView, checkBox2, editTextNumber,
          editTextNumberSigned);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
