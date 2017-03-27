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
    Button buttonPoint;
    Button buttonEqual;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMul;
    Button buttonDiv;
    Button buttonDelete;

    EditText editTextOK;

    double num;
    double result;
    String cal;
    boolean equalClick;
    boolean calClick;
    boolean pointClick;
    boolean editZero;

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
        buttonPoint = (Button) findViewById(R.id.buttonPoint);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);

        editTextOK = (EditText) findViewById(R.id.editTextOk);
        num = 0;
        result = 0;
        cal = "";
        equalClick = false;
        calClick = false;
        pointClick = false;
        editZero = true;
    }

    public void onButtonNumberClick(View v) {

        switch (((Button) v).getText().toString()) {
            case "1":
                PrintNum(1, button1);
                break;
            case "2":
                PrintNum(2, button2);
                break;
            case "3":
                PrintNum(3, button3);
                break;
            case "4":
                PrintNum(4, button4);
                break;
            case "5":
                PrintNum(5, button5);
                break;
            case "6":
                PrintNum(6, button6);
                break;
            case "7":
                PrintNum(7, button7);
                break;
            case "8":
                PrintNum(8, button8);
                break;
            case "9":
                PrintNum(9, button9);
                break;
            case "0":
                PrintNum(0, button0);
                break;
            case ".":
                if (!pointClick) {
                    editTextOK.setText(editTextOK.getText().toString() + ".");
                    pointClick = true;
                }
                break;
        }
    }

    public void onButtonCalculateClick(View v) {
        switch (((Button) v).getText().toString()) {
            case "+":
                Calculate();
                cal = "+";
                break;
            case "-":
                Calculate();
                cal = "-";
                break;
            case "*":
                Calculate();
                cal = "*";
                break;
            case "/":
                Calculate();
                cal = "/";
                break;
            case "=":
                Calculate();
                equalClick = true;
                pointClick = false;
                result = 0;
                num = 0;
                cal = "";
                break;
        }
    }

    public void onButtonDeleteClick(View v) {
        editTextOK.setText("0");
        editZero = true;
        pointClick = false;
        result = 0;
        num = 0;
    }

    public void Calculate() {
        switch (cal) {
            case "+":
                result += Double.parseDouble(editTextOK.getText().toString());
                break;
            case "-":
                result -= Double.parseDouble(editTextOK.getText().toString());
                break;
            case "*":
                result *= Double.parseDouble(editTextOK.getText().toString());
                break;
            case "/":
                result /= Double.parseDouble(editTextOK.getText().toString());
                break;
            case "":
                result = Double.parseDouble(editTextOK.getText().toString());
                break;
            default:
        }
        pointClick = false;
        calClick = true;
        editTextOK.setText(Double.toString(result));
        num = Double.parseDouble(editTextOK.getText().toString());
    }

    public void PrintNum(int num, Button btn) {
        String edit = editTextOK.getText().toString();

        if (equalClick || calClick || editZero) {
            editTextOK.setText(Integer.toString(num));
            editZero = false;
        } else {
            editTextOK.setText(edit + Integer.parseInt(btn.getText().toString()));
        }
        calClick = false;
        equalClick = false;
    }
}
