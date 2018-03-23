package com.dalen.mhlifecyclemvpdemo.mhmvp;

/**
 * Created by munin on 2018/3/23.
 */

public interface IBaseCallback<T> {
    void onCallbackSuccess(String tag, T data);

    void onCallbackError(boolean isException, Object error);
}
