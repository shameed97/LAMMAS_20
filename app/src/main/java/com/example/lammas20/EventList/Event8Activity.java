package com.example.lammas20.EventList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.lammas20.EventListActivity;
import com.example.lammas20.R;

public class Event8Activity extends AppCompatActivity {

    private ImageView imageView,imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event8);

        imageView = findViewById(R.id.backArrow);
        imageView1 = findViewById(R.id.eventImage);
        imageView1.setBackgroundResource(R.drawable.pongal);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Event8Activity.this, EventListActivity.class));
                finish();
            }
        });
    }
}
