package c.hernanrazo.sensorapp;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        //set up all button instances
        Button dataBtn = findViewById(R.id.mainBtn);
        Button referencesBtn = findViewById(R.id.referenceBtn);
        Button themeBtn = findViewById(R.id.themeBtn);

        dataBtn.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                //add intent that takes use to the sensor's activity if the button pressed
                Intent mainIntent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

        referencesBtn.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                //add intent that takes use to the sensor's activity if the button pressed
                Intent referencesIntent = new Intent(MainActivity2.this, references.class);
                startActivity(referencesIntent);
            }
        });

        themeBtn.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                //add intent that takes use to the sensor's activity if the button pressed
                Intent switchIntent = new Intent(MainActivity2.this, SwitchActivity.class);
                startActivity(switchIntent);
            }
        });



    }
}
