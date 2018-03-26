package com.example.shuangzhecheng.deeplinktest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeeponeActivity extends AppCompatActivity {
    Button btn_deep_one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deepone);
        btn_deep_one = findViewById(R.id.btn_deep_1);
        btn_deep_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DeeponeActivity.this, DeeptwoActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(getIntent().getData() != null && isTaskRoot()) {
            Intent parentIntent = new Intent(this, MainActivity.class);
            startActivity(parentIntent);
            finish();
        }
        else {
            super.onBackPressed();
        }
    }
}
