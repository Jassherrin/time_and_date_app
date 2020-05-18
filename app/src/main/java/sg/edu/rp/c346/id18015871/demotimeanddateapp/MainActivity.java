package sg.edu.rp.c346.id18015871.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2:Linking of UI elements (Section B Q2)
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.buttonReset);

        //Write code to handle the "Display Time" button click event.
        //The text should show "Time is H:m", e.g., "Time is 16:35"
        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Time is " +tp.getCurrentHour() +":"+ tp.getCurrentMinute());
            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Date is " +dp.getDayOfMonth()+"/"+dp.getMonth()+"/"+dp.getYear());
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDisplayTime.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvDisplay.setText("Time is " +tp.getCurrentHour() +":"+ tp.getCurrentMinute());
                    }
                });
                btnDisplayDate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvDisplay.setText("Date is " +dp.getDayOfMonth()+"/"+dp.getMonth()+"/"+dp.getYear());
                    }
                });
            }
        });
    }
}
