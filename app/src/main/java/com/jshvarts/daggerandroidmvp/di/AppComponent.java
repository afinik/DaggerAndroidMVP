package com.jshvarts.daggerandroidmvp.di;

import com.jshvarts.daggerandroidmvp.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
//        /* Use AndroidInjectionModule.class if you're not using support library */
//        AndroidSupportInjectionModule.class,
        AppModule.class,
        BuildersModule.class})
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(App application);
        AppComponent build();
    }
    void inject(App app);
}
