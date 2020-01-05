package com.example.lammas20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lammas20.EventList.Event10Activity;
import com.example.lammas20.EventList.Event11Activity;
import com.example.lammas20.EventList.Event12Activity;
import com.example.lammas20.EventList.Event13Activity;
import com.example.lammas20.EventList.Event14Activity;
import com.example.lammas20.EventList.Event15Activity;
import com.example.lammas20.EventList.Event1Activity;
import com.example.lammas20.EventList.Event2Activity;
import com.example.lammas20.EventList.Event3Activity;
import com.example.lammas20.EventList.Event4Activity;
import com.example.lammas20.EventList.Event5Activity;
import com.example.lammas20.EventList.Event6Activity;
import com.example.lammas20.EventList.Event7Activity;
import com.example.lammas20.EventList.Event8Activity;
import com.example.lammas20.EventList.Event9Activity;

public class EventListActivity extends AppCompatActivity {

    private ListView listView;
    private String[] eventName = {"1.Solo Dance", "2.Face Painting", "3.Art out of Waste", "4.Bride / Bridegroom Dressing", "5.Pencil sketch ",
            "6.Vegetable Carving", "7.Photo Shoot", "8.Pongal ", "9.Short Film", "10.Group Dance", "11.Mime", "12.Dumb’C", "13.Pair Dance"
            , "14.Light Music", "15.Street Play"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        listView = findViewById(R.id.listView);

        final ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(this, R.layout.event_list, R.id.event, eventName);
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String result = listViewAdapter.getItem(position);

                if (result != null) {
                    String[] split = result.split("[.]");
                    String no = split[0];
                    switch (no) {

                        case "1":
                            startActivity(new Intent(EventListActivity.this, Event1Activity.class));
                            break;
                        case "2":
                            startActivity(new Intent(EventListActivity.this, Event2Activity.class));
                            break;
                        case "3":
                            startActivity(new Intent(EventListActivity.this, Event3Activity.class));
                            break;
                        case "4":
                            startActivity(new Intent(EventListActivity.this, Event4Activity.class));
                            break;
                        case "5":
                            startActivity(new Intent(EventListActivity.this, Event5Activity.class));
                            break;
                        case "6":
                            startActivity(new Intent(EventListActivity.this, Event6Activity.class));
                            break;
                        case "7":
                            startActivity(new Intent(EventListActivity.this, Event7Activity.class));
                            break;
                        case "8":
                            startActivity(new Intent(EventListActivity.this, Event8Activity.class));
                            break;
                        case "9":
                            startActivity(new Intent(EventListActivity.this, Event9Activity.class));
                            break;
                        case "10":
                            startActivity(new Intent(EventListActivity.this, Event10Activity.class));
                            break;
                        case "11":
                            startActivity(new Intent(EventListActivity.this, Event11Activity.class));
                            break;
                        case "12":
                            startActivity(new Intent(EventListActivity.this, Event12Activity.class));
                            break;
                        case "13":
                            startActivity(new Intent(EventListActivity.this, Event13Activity.class));
                            break;
                        case "14":
                            startActivity(new Intent(EventListActivity.this, Event14Activity.class));
                            break;
                        case "15":
                            startActivity(new Intent(EventListActivity.this, Event15Activity.class));
                            break;


                    }
                }

            }
        });

    }
}
