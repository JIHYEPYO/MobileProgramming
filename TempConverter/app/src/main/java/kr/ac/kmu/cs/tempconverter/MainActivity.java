package kr.ac.kmu.cs.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(EditText) findViewById(R.id.editText2);
    }

    public void onClicked(View view){
        switch (view.getId()){
            case R.id.buttonChange:
                RadioButton celsiusButton = (RadioButton)findViewById(R.id.radioButtonC);
                RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radioButtonF);

                if(text.getText().length()==0){
                    Toast.makeText(this,"정확한 값을 입력하시오.",Toast.LENGTH_LONG).show();
                    celsiusButton.setChecked(false);
                    fahrenheitButton.setChecked(false);
                    return;
                }else{
                    String convert = text.getText().toString();
                    float inputValue;
                    switch (convert.charAt(convert.length()-1)){
                        case 'C':
                        case 'c':
                            inputValue=Float.parseFloat(convert.substring(0,convert.length()-1));
                            text.setText(String.valueOf(convertCelsiusToFahrenheit(inputValue)));
                            celsiusButton.setChecked(false);
                            fahrenheitButton.setChecked(true);
                            break;
                        case 'F':
                        case 'f':
                            inputValue=Float.parseFloat(convert.substring(0,convert.length()-1));
                            text.setText(String.valueOf(convertFahrenheitToCelsius(inputValue)));
                            celsiusButton.setChecked(true);
                            fahrenheitButton.setChecked(false);
                            break;
                    }
                }
                break;
        }
    }

    private float convertFahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit -32)*5/9);
    }

    private float convertCelsiusToFahrenheit(float celsius){
        return ((celsius*9)/5+32);
    }
}
