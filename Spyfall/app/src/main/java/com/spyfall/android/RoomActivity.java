package com.spyfall.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;


public class RoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        TextView accessKeyTitle = (TextView) findViewById(R.id.access_key_title);
        TextView accessKey = (TextView) findViewById(R.id.access_key);
        TextView playersTitle = (TextView) findViewById(R.id.players_title);

        RecyclerView playersRV = (RecyclerView) findViewById(R.id.player_recycler_view);
    }
}
