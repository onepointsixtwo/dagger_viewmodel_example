package com.onepointsixtwo.daggerviewmodelexample

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.dagger_view_model.ViewModelInjectors


class App: Application(), Application.ActivityLifecycleCallbacks {

    lateinit var component: ViewModelComponent
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate() {
        super.onCreate()

        component = DaggerViewModelComponent.create()
        viewModelFactory = component.getFactory()

        registerActivityLifecycleCallbacks(this)
    }

    override fun onActivityCreated(p0: Activity, p1: Bundle?) {
        ViewModelInjectors.inject(p0, viewModelFactory)
    }

    override fun onActivityDestroyed(p0: Activity?) {

    }

    override fun onActivityPaused(p0: Activity?) {

    }

    override fun onActivityResumed(p0: Activity?) {

    }

    override fun onActivitySaveInstanceState(p0: Activity?, p1: Bundle?) {

    }

    override fun onActivityStarted(p0: Activity?) {

    }

    override fun onActivityStopped(p0: Activity?) {

    }
}