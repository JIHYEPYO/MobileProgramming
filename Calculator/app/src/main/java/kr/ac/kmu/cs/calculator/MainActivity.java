package kr.ac.kmu.cs.calculator;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonPlus;
    Button buttonMinus;
    Button buttonMul;
    Button buttonDiv;

    EditText editTextNum1;
    EditText editTextNum2;
    EditText editTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPlus=(Button)findViewById(R.id.buttonPlus);
        buttonMinus=(Button)findViewById(R.id.buttonMinus);
        buttonMul=(Button)findViewById(R.id.buttonMul);
        buttonDiv=(Button)findViewById(R.id.buttonDiv);

        editTextNum1=(EditText)findViewById(R.id.editTextNum1);
        editTextNum2=(EditText)findViewById(R.id.editTextNum2);
        editTextResult=(EditText)findViewById(R.id.editTextResult);

    }

    public void onButtonClick(View v){
        int num1 = Integer.parseInt(editTextNum1.getText().toString());
        int num2 = Integer.parseInt(editTextNum2.getText().toString());

        switch (((Button) v).getText().toString()){
            case "+":
                editTextResult.setText(Integer.toString(num1+num2));
                break;
            case "-":
                editTextResult.setText(Integer.toString(num1-num2));
                break;
            case "*":
                editTextResult.setText(Integer.toString(num1*num2));
                break;
            case "/":
                editTextResult.setText(Integer.toString(num1/num2));
                break;
        }
    }
}
