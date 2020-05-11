package sg.edu.rp.c346.id17032457.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Step1: Declare the fields variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgnBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2: Link the field variables to UI components in layout
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.btnDisplay);
        etInput = findViewById(R.id.editTextInput);
        tgnBtn = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String t = etInput.getText().toString();
                tvDisplay.setText(t);


            }
        });

        tgnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code
                if (tgnBtn.isChecked()) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }
            }
        });
    }
}













