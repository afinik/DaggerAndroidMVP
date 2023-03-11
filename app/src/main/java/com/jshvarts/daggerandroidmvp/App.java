package com.jshvarts.daggerandroidmvp;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import timber.log.Timber;

public class App extends Application implements  HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant();
        }

//        DaggerAppComponent
//                .builder()
//                .application(this)
//                .build()
//                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
