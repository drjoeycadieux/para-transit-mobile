package com.example.para_transit;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TransportRequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_request);

        try {
            EditText etName = findViewById(R.id.et_name);
            EditText etPickupLocation = findViewById(R.id.et_pickup_location);
            EditText etDropoffLocation = findViewById(R.id.et_dropoff_location);
            EditText etDateTime = findViewById(R.id.et_date_time);
            Button btnSubmit = findViewById(R.id.btn_submit);

            // Ensure all views were found
            if (etName == null || etPickupLocation == null || etDropoffLocation == null || etDateTime == null || btnSubmit == null) {
                throw new NullPointerException("One or more views not found!");
            }

            btnSubmit.setOnClickListener(v -> {
                String name = etName.getText().toString().trim();
                String pickup = etPickupLocation.getText().toString().trim();
                String dropoff = etDropoffLocation.getText().toString().trim();
                String dateTime = etDateTime.getText().toString().trim();

                if (name.isEmpty() || pickup.isEmpty() || dropoff.isEmpty() || dateTime.isEmpty()) {
                    Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Request submitted!", Toast.LENGTH_SHORT).show();
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Error initializing views: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}