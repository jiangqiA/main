
package com.practice.cardview;

import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNCardViewModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCardViewModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNToast";
  }

  @ReactMethod
  public void showToast(String message, int duration) {
    Toast.makeText(getReactApplicationContext(), message, duration).show();
  }
}
