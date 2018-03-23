package com.dalen.mhlifecyclemvpdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dalen.mhlifecyclemvpdemo.mhmvp.IBaseView

class MainActivity : AppCompatActivity(),IBaseView {
    var test: TestPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test= TestPresenter()
        test?.attachIBaseView(this,lifecycle)
        lifecycle.addObserver(test)
    }
}
