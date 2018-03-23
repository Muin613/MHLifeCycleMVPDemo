package com.dalen.mhlifecyclemvpdemo.mhmvp;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.NonNull;

/**
 * Created by munin on 2018/3/23.
 */

public interface IBasePresenter extends LifecycleObserver {

    void attachIBaseView(@NonNull IBaseView iBaseView, Lifecycle lifecycle);
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate();
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart();
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume();
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause();
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop();
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy();
}
