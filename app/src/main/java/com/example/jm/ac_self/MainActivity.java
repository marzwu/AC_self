package com.example.jm.ac_self;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xpg.common.system.IntentUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                IntentUtils.getInstance().startActivity(MainActivity.this, LoginActivity.class);
                break;
        }
    }
}
