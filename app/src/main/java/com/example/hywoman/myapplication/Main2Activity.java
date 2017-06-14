package com.example.hywoman.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Toast.makeText(Main2Activity.this,"Touch Event Received",
                Toast.LENGTH_SHORT).show();
        return true;

    }
}

    TouchListenerClass TouchListener = new TouchListenerClass();


}

//  3.  액티비티가 리스터 구현


public class Main2Activity extends MainActivity implements View.OnTouchListener{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View vw = new View(this);
        vw.setOnTouchListener(this);
        setContentView(vw);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Toast.makeText(MainActivity.this,"Touch Event Received",
                Toast.LENGTH_SHORT).show();
        return true;
    }
}


// 4. View 가 listener 구현

public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyView vw = new MyView(this);

        vw.setOnTouchListener(vw);
        setContentView(vw);

    }

    protected class MyView extends View implements View.OnTouchListener {
        public MyView(Context context) {
            super(context);
        }

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            Toast.makeText(MainActivity.this, "Touch Event Received",
                    Toast.LENGTH_SHORT).show();
            return true;
        }
    }

}
