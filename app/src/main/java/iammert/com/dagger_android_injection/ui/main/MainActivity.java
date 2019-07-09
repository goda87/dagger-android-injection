package iammert.com.dagger_android_injection.ui.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import iammert.com.dagger_android_injection.R;
import iammert.com.dagger_android_injection.ui.detail.DetailActivity;

public class MainActivity extends AppCompatActivity implements MainView{

    @Inject
    MainPresenterImpl mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.loadMain();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DetailActivity.class));
            }
        });
    }

    @Override
    public void onMainLoaded(String data) {
        TextView tv = findViewById(R.id.text);
        tv.setText(data);
        Log.v("TEST", "Main page is loaded.");
    }
}
