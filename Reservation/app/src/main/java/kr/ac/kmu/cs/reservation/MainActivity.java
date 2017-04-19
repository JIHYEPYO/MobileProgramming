package kr.ac.kmu.cs.reservation;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private CalendarView calendarView;
    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timePicker = (TimePicker) findViewById(R.id.timePicker1);
        calendarView = (CalendarView) findViewById(R.id.calendarView1);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                editText1.setText(" " + year + " : " + (month+1) + " : " + dayOfMonth);
            }
        });

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                editText2.setText(" " + hourOfDay + " : " + minute);
            }
        });

        registerForContextMenu(editText1);
        registerForContextMenu(editText2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("색상을 골라주세요.");
        menu.add(0, 1, 0, "RED");
        menu.add(0, 2, 0, "GREEN");
        menu.add(0, 3, 0, "BLUE");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int color = 0;
        switch (item.getItemId()) {
            case 1:
                color = Color.RED;
                setColor(color);
                return true;
            case 2:
                color = Color.GREEN;
                setColor(color);
                return true;
            case 3:
                color = Color.BLUE;
                setColor(color);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    private void setColor(int color) {
        editText1.setTextColor(color);
        editText2.setTextColor(color);
    }
}
