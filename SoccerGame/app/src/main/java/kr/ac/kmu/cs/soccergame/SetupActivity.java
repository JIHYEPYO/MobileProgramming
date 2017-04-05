package kr.ac.kmu.cs.soccergame;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Administrator on 2017-04-05.
 */

public class SetupActivity extends AppCompatActivity {

    RadioButton radioButtonEasy;
    RadioButton radioButtonMid;
    RadioButton radioButtonHard;

    RadioGroup radioGroup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        radioButtonEasy=(RadioButton)findViewById(R.id.easy);
        radioButtonMid=(RadioButton)findViewById(R.id.mid);
        radioButtonHard=(RadioButton)findViewById(R.id.hard);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);

        radioButtonEasy.setOnClickListener(radioListener);
        radioButtonMid.setOnClickListener(radioListener);
        radioButtonHard.setOnClickListener(radioListener);
    }

    View.OnClickListener radioListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (radioGroup.getCheckedRadioButtonId()){
                case R.id.easy:
                    Intent intentEasy = new Intent();
                    intentEasy.putExtra("LEVEL", "초보자");
                    setResult(RESULT_OK,intentEasy);
                    finish();
                    break;
                case R.id.mid:
                    Intent intentMid = new Intent();
                    intentMid.putExtra("LEVEL", "중급");
                    setResult(RESULT_OK,intentMid);
                    finish();
                    break;
                case R.id.hard:
                    Intent intentHArd = new Intent();
                    intentHArd.putExtra("LEVEL", "고급");
                    setResult(RESULT_OK,intentHArd);
                    finish();
                    break;

            }
        }
    };
}
