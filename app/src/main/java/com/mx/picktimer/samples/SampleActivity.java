package com.mx.picktimer.samples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mx.picktimer.R;

public class SampleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samples);

        findViewById(R.id.btnDark).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SampleActivity.this, DarkThemeActivity.class));
            }
        });

        findViewById(R.id.btnLight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SampleActivity.this, LightThemeActivity.class));
            }
        });
    }
}
