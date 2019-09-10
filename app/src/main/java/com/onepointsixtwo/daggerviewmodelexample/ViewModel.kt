package com.onepointsixtwo.daggerviewmodelexample

import androidx.lifecycle.ViewModel
import javax.inject.Inject


class TestViewModel @Inject constructor(): ViewModel() {

    @Inject
    lateinit var dependency: ViewModelDependency

    fun getValueFromDependency(): String {
        return dependency.value
    }
}


class ViewModelDependency @Inject constructor() {
    val value = "value"
}