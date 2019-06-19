package com.onepointsixtwo.daggerviewmodelexample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import com.onepointsixtwo.dagger_viewmodel.InjectViewModel;

public class MainActivity extends FragmentActivity {

    @InjectViewModel
    public TestViewModel testViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        TextView textView = findViewById(R.id.text_view);
        textView.setText(testViewModel.getValueFromDependency());
    }
}
