package kr.ac.kmu.cs.soccergame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final int GET_LEVEL = 1;
    Button buttonIntro;
    Button buttonSetup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonIntro = (Button) findViewById(R.id.intro);
        buttonSetup = (Button) findViewById(R.id.setup);

        buttonIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntroActivity.class);
                startActivity(intent);
            }
        });

        buttonSetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SetupActivity.class);
                startActivityForResult(intent, GET_LEVEL);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == GET_LEVEL) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(this, "난이도는 "+data.getStringExtra("LEVEL")+"로 설정되었습니다.", Toast.LENGTH_LONG).show();
            }
        }
    }
}
