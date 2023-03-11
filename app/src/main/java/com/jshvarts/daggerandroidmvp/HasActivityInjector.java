package com.jshvarts.daggerandroidmvp;

import android.app.Activity;

import dagger.android.AndroidInjector;

public interface HasActivityInjector {
    public AndroidInjector<Activity> activityInjector();
}
