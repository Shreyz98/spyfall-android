package com.spyfall.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.firebase.client.Firebase;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView welcomeText = (TextView) findViewById(R.id.welcome_text);
        ImageView logo = (ImageView) findViewById(R.id.logo);
        Button newGame = (Button) findViewById(R.id.new_game);
        Button joinGame = (Button) findViewById(R.id.join_game);

        newGame.setOnClickListener(this);
        joinGame.setOnClickListener(this);
        Firebase.setAndroidContext(this);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.new_game:
                break;
            case R.id.join_game:
                break;
        }
    }
}
