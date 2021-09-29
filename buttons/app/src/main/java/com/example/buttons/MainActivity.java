package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView txtMejor;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMejor = (TextView) findViewById(R.id.txtMejor);
        txtResult = (TextView) findViewById(R.id.txtResult);
    }



    public void onDefaultToggleClick(View view) {
        Toast.makeText(this, "Toggle por default", Toast.LENGTH_SHORT).show();

    }

    public void onCustomToggleClick(View view) {
        Toast.makeText(this, "Toggle personalizado", Toast.LENGTH_SHORT).show();

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    txtMejor.setText("Piratas son mejores");
                    break;
            case R.id.radio_ninjas:
                if (checked)
                    txtMejor.setText("Ninjas son mejores");
                    break;
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_meat:
                if (checked) {
                    txtResult.setText("pon algo de carne en el sandwich");
                }
                else {
                    txtResult.setText("quita la carne del sandwich");
                }
                break;
            case R.id.checkbox_cheese:
                if (checked) {
                    txtResult.setText("pon queso");
                }
                else {
                    txtResult.setText("sin queso");
                    break;
                }

        }

    }
}