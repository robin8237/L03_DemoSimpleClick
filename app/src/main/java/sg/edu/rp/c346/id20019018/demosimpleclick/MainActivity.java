package sg.edu.rp.c346.id20019018.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //declaration
    TextView tvMsg;
    Button btnDisplay;
    EditText etData;
    ToggleButton tbEnabler;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link Java with UI
        btnDisplay = findViewById(R.id.btnDisplay);
        etData = findViewById(R.id.etData);
        tvMsg = findViewById(R.id.tvResult);
        tbEnabler = findViewById(R.id.tbEnabler);
        rgGender = findViewById(R.id.rgGender);

        //behaviour
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textEntered = etData.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.rbMale)
                {
                    textEntered = "He Says " + textEntered;
                }
                else
                {
                    textEntered = "She says " + textEntered;
                }

                tvMsg.setText(textEntered);
                /*Toast.makeText(MainActivity.this,
                        "My First Toast",
                        Toast.LENGTH_SHORT).show();
                 */
            }
        });

        tbEnabler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbEnabler.isChecked() == true)
                {
                    etData.setEnabled(true);
                    etData.setBackgroundColor(Color.TRANSPARENT);
                }
                else{
                    etData.setEnabled(false);
                    etData.setBackgroundColor(Color.RED);
                }
            }
        });
    }
}