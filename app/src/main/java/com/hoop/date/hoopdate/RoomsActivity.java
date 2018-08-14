package com.hoop.date.hoopdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RoomsActivity extends Activity {
    Button testingButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.rooms);

        testingButton = (Button) findViewById(R.id.testing_button);
        testingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Context context = getApplicationContext();
                CharSequence text = "You are Juked!";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            });
    }
}
