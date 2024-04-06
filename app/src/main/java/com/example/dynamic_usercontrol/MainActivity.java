package com.example.dynamic_usercontrol;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout customControlsContainer;
    private int controlCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customControlsContainer = findViewById(R.id.customControlsContainer);
        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(v -> addCustomControl());
    }

    private void addCustomControl() {
        CustomControl customControl = new CustomControl(this);
        customControl.setId(controlCount++);
        customControl.setBuyButtonClickListener(v -> {
            String text = customControl.getText();
            Toast.makeText(MainActivity.this, "Текст: " + text, Toast.LENGTH_SHORT).show();
        });

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0, 16, 0, 0);

        customControlsContainer.addView(customControl, params);
    }
}
