package com.dalen.mhlifecyclemvpdemo;

import com.dalen.mhlifecyclemvpdemo.mhmvp.BasePresenter;
import com.dalen.mhlifecyclemvpdemo.mhmvp.IBaseView;

/**
 * Created by munin on 2018/3/23.
 */

public class TestPresenter extends BasePresenter<IBaseView,String> {


    @Override
    public void onCallbackSuccess(String tag, String data) {

    }

    @Override
    public void onCallbackError(boolean isException, Object error) {

    }

    @Override
    public void onCreate() {
        System.out.println("onCreate");
    }

    @Override
    public void onStart() {
        System.out.println("onStart");
    }

    @Override
    public void onResume() {
        System.out.println("onResume");
    }

    @Override
    public void onPause() {
        System.out.println("onPause");
    }

    @Override
    public void onStop() {
        System.out.println("onStop");
    }

    @Override
    public void onDestroy() {
        System.out.println("onDestroy");
    }
}
