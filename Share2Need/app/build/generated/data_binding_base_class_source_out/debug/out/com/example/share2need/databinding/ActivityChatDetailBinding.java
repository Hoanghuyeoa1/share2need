// Generated by view binder compiler. Do not edit!
package com.example.share2need.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.share2need.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChatDetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final EditText messageInput;

  @NonNull
  public final RecyclerView recyclerViewMessages;

  @NonNull
  public final ImageButton sendButton;

  @NonNull
  public final TextView userName;

  private ActivityChatDetailBinding(@NonNull LinearLayout rootView, @NonNull ImageButton backButton,
      @NonNull EditText messageInput, @NonNull RecyclerView recyclerViewMessages,
      @NonNull ImageButton sendButton, @NonNull TextView userName) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.messageInput = messageInput;
    this.recyclerViewMessages = recyclerViewMessages;
    this.sendButton = sendButton;
    this.userName = userName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChatDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChatDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_chat_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChatDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_button;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.messageInput;
      EditText messageInput = ViewBindings.findChildViewById(rootView, id);
      if (messageInput == null) {
        break missingId;
      }

      id = R.id.recyclerViewMessages;
      RecyclerView recyclerViewMessages = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewMessages == null) {
        break missingId;
      }

      id = R.id.sendButton;
      ImageButton sendButton = ViewBindings.findChildViewById(rootView, id);
      if (sendButton == null) {
        break missingId;
      }

      id = R.id.userName;
      TextView userName = ViewBindings.findChildViewById(rootView, id);
      if (userName == null) {
        break missingId;
      }

      return new ActivityChatDetailBinding((LinearLayout) rootView, backButton, messageInput,
          recyclerViewMessages, sendButton, userName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
