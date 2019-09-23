package de.fschlosser.clickcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView counterLabel;
    private Button plusButton;
    private Button minusButton;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterLabel = findViewById(R.id.label_count);
        plusButton = findViewById(R.id.button_plus);
        minusButton = findViewById(R.id.button_minus);

        plusButton.setOnClickListener(this);
        minusButton.setOnClickListener(this);
        updateTextView(count);
    }


    @Override
    public void onClick(View view) {

        if (view == plusButton) {
            updateTextView(count++);
        }
        if (view == minusButton) {
            if (count >= 0) {
                updateTextView(count--);
            }
        }
    }

    private void updateTextView(int count) {
        counterLabel.setText(count + "");
    }
}
