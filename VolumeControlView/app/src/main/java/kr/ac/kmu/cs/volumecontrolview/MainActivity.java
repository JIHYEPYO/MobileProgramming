package kr.ac.kmu.cs.volumecontrolview;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VolumeControlView view = (VolumeControlView) findViewById(R.id.volume);
        view.setKnobListner(new VolumeControlView.KnobListener() {
            @Override
            public void onChanged(double angle) {
                if (angle > 0)
                    ;
                else
                    ;
            }
        });
    }
}
