package com.burnweb.rnpermissions;

import android.app.Activity;

import java.util.*;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

public class RNPermissionsPackage implements ReactPackage {

    public RNPermissionsPackage() {}

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new RNPermissionsModule(reactContext));

        return modules;
    }

    // @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    public static void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        RNPermissionsModule.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

}
