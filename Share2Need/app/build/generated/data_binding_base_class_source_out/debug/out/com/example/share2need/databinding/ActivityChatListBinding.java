// Generated by view binder compiler. Do not edit!
package com.example.share2need.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.share2need.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChatListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final ImageButton newChatButton;

  @NonNull
  public final RecyclerView recyclerViewChatList;

  @NonNull
  public final EditText searchBar;

  private ActivityChatListBinding(@NonNull LinearLayout rootView, @NonNull ImageButton backButton,
      @NonNull ImageButton newChatButton, @NonNull RecyclerView recyclerViewChatList,
      @NonNull EditText searchBar) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.newChatButton = newChatButton;
    this.recyclerViewChatList = recyclerViewChatList;
    this.searchBar = searchBar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChatListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChatListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_chat_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChatListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_button;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.new_chat_button;
      ImageButton newChatButton = ViewBindings.findChildViewById(rootView, id);
      if (newChatButton == null) {
        break missingId;
      }

      id = R.id.recyclerViewChatList;
      RecyclerView recyclerViewChatList = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewChatList == null) {
        break missingId;
      }

      id = R.id.searchBar;
      EditText searchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchBar == null) {
        break missingId;
      }

      return new ActivityChatListBinding((LinearLayout) rootView, backButton, newChatButton,
          recyclerViewChatList, searchBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
