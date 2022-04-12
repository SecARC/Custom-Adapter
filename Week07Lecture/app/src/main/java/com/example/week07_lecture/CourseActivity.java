package com.example.week07_lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CourseActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        Intent getIntent = getIntent();
        MathTopic topic = (MathTopic) getIntent.getSerializableExtra(MathTopic.EXTRA_MATHTOPIC);

        init_UI();

        textView.setText(topic.getName());
        Glide.with(this).load(topic.getUrl()).into(imageView);
    }

    private void init_UI() {
        imageView = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.textView);
    }
}