package com.dalen.mhlifecyclemvpdemo.mhmvp;

import android.arch.lifecycle.Lifecycle;
import android.support.annotation.NonNull;

/**
 * Created by munin on 2018/3/23.
 * * BaseView 用来控制view的层显示
 * Data 是真实反馈数据
 */

public abstract class BasePresenter<BaseView extends IBaseView, Data> implements IBasePresenter, IBaseCallback<Data> {

    private Lifecycle lifecycle;
    protected BaseView baseView;

    private boolean isLifeCycle = false;

    @Override
    public void attachIBaseView(@NonNull IBaseView iBaseView, Lifecycle lifecycle) {
        baseView = (BaseView) iBaseView;
        this.lifecycle = lifecycle;
        if (null != lifecycle)
            isLifeCycle = true;
    }

}
