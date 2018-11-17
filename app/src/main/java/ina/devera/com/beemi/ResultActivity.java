package ina.devera.com.beemi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //Get the bundle
        Bundle bundle = getIntent().getExtras();
        display = (TextView) findViewById(R.id.result);

//Extract the data…
        String stuff = bundle.getString("stuff");
        display.setText(stuff);
    }
}
