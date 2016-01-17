package com.github.nantaphop.fluentviewdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.nantaphop.fluentview.Fluent;
import com.github.nantaphop.fluentview.FluentView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // FluentTextView
        Fluent.withTextView(this, R.id.text)
                .setText("Hello From FluentView")
                .setTextColor(Color.parseColor("#ff00ff"))
                .setAllCaps(true);

        // Or pass View Object (May be already injected by ButterKnife or etc.)
        TextView text = (TextView) findViewById(R.id.text);
        Fluent.with(text)
                .setText("Hello From FluentView")
                .setTextColor(Color.parseColor("#ff00ff"))
                .setAllCaps(true);

        // FluentImageView
        Fluent.withImageView(this, R.id.imageView)
                .setImageResource(R.drawable.ic_action_action_history)
                .setScaleType(ImageView.ScaleType.FIT_CENTER);

        // FluentButton
        Fluent.withButton(this, R.id.button)
                .setText("Hello From FluentButton")
                .setAllCaps(true);

    }
}
