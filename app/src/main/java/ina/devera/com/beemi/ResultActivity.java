package ina.devera.com.beemi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView Age;
    private TextView Height;
    private TextView Weight;
    private TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //Get the bundle
        Bundle bundle = getIntent().getExtras();
        Result = (TextView) findViewById(R.id.Result);
        Age = (TextView) findViewById(R.id.Age);
        Height = (TextView) findViewById(R.id.Height);
        Weight = (TextView) findViewById(R.id.Weight);

//Extract the data…
        String Resulttext = bundle.getString("Result");
        String Agetext = bundle.getString("Age");
        String Heighttext = bundle.getString("Height");
        String Weighttext = bundle.getString("Weight");

        Result.setText("Result:" + Resulttext);
        Age.setText("Age:" + Agetext);
        Height.setText("Height:" + Heighttext);
        Weight.setText("Weight:" + Weighttext);
    }
}
