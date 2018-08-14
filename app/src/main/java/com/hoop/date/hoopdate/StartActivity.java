package com.hoop.date.hoopdate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity {
    Button startButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.main);

        // Locate the button in activity_main.xml
        startButton = (Button) findViewById(R.id.starting_button);

        // Capture button clicks
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(StartActivity.this,
                        LoginActivity.class);
                startActivity(myIntent);
            }
        });
    }

}
