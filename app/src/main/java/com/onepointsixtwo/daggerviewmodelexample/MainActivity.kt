package com.onepointsixtwo.daggerviewmodelexample

import android.os.Bundle
import android.widget.TextView

import androidx.fragment.app.FragmentActivity

import com.onepointsixtwo.dagger_viewmodel.InjectViewModel

class MainActivity : FragmentActivity() {

    @field:InjectViewModel
    lateinit var testViewModel: TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = testViewModel.getValueFromDependency()
    }
}
