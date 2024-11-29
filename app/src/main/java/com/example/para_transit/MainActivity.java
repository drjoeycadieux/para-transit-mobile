package com.example.para_transit;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Handle edge-to-edge insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Button to navigate to Transport Request Activity
        findViewById(R.id.btn_transport_request).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TransportRequestActivity.class);
            startActivity(intent);
        });

        // Button to navigate to other features (e.g., Settings)
        findViewById(R.id.btn_settings).setOnClickListener(v -> {
            // Replace with actual settings activity if implemented
        });
    }
}
