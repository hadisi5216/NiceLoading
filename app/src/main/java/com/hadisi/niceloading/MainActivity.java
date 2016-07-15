package com.hadisi.niceloading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.nice_loading)
    NiceLoadingView niceLoading;
    @BindView(R.id.start)
    Button start;
    @BindView(R.id.success)
    Button success;
    @BindView(R.id.failed)
    Button failed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.start, R.id.success, R.id.failed})
    public void onClick(View view) {
        if (view.getId() == R.id.start) {
            niceLoading.start();
            Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.success) {
            niceLoading.success();
            Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.failed) {
            niceLoading.failed();
            Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
        }
    }
}
