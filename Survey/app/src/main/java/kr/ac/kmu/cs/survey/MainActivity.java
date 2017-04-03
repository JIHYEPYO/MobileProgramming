package kr.ac.kmu.cs.survey;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton1,radioButton2,radioButton3;
    Button button;
    ImageView imageView;

    View.OnClickListener radio_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (radioGroup.getCheckedRadioButtonId()){
                case R.id.radio1:
                    imageView.setImageResource(R.drawable.image0);
                    break;
                case R.id.radio2:
                    imageView.setImageResource(R.drawable.image1);
                    break;
                case R.id.radio3:
                    imageView.setImageResource(R.drawable.image2);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioButton1=(RadioButton)findViewById(R.id.radio1);
        radioButton2=(RadioButton)findViewById(R.id.radio2);
        radioButton3=(RadioButton)findViewById(R.id.radio3);
        button=(Button)findViewById(R.id.button);
        imageView=(ImageView) findViewById(R.id.image);

        radioButton1.setOnClickListener(radio_listener);
        radioButton2.setOnClickListener(radio_listener);
        radioButton3.setOnClickListener(radio_listener);
    }
}
