package kr.ac.kmu.cs.calculator;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonClear;

    EditText editTextOK;
    Button buttonOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonClear = (Button) findViewById(R.id.buttonClear);

        editTextOK = (EditText) findViewById(R.id.editTextOk);
        buttonOK = (Button) findViewById(R.id.buttonOk);
    }

    public void onButtonNumberClick(View v) {
        String edit = editTextOK.getText().toString();
        switch (((Button) v).getText().toString()) {
            case "1":
                editTextOK.setText(edit + Integer.parseInt(button1.getText().toString()));
                break;
            case "2":
                editTextOK.setText(edit + Integer.parseInt(button2.getText().toString()));
                break;
            case "3":
                editTextOK.setText(edit + Integer.parseInt(button3.getText().toString()));
                break;
            case "4":
                editTextOK.setText(edit + Integer.parseInt(button4.getText().toString()));
                break;
            case "5":
                editTextOK.setText(edit + Integer.parseInt(button5.getText().toString()));
                break;
            case "6":
                editTextOK.setText(edit + Integer.parseInt(button6.getText().toString()));
                break;
            case "7":
                editTextOK.setText(edit + Integer.parseInt(button7.getText().toString()));
                break;
            case "8":
                editTextOK.setText(edit + Integer.parseInt(button8.getText().toString()));
                break;
            case "9":
                editTextOK.setText(edit + Integer.parseInt(button9.getText().toString()));
                break;
            case "0":
                editTextOK.setText(edit + Integer.parseInt(button0.getText().toString()));
                break;
            case "clear":
                editTextOK.setText("");
                break;
        }
    }
}
