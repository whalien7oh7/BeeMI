package ina.devera.com.beemi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.NumberFormat;


public class InputActivity extends AppCompatActivity {
    private EditText age;
    private EditText height;
    private EditText weight;
    public static String eval = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        Log.d("Log: ", "onCreate() session has been initiated");

        age = (EditText) findViewById(R.id.age);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
    }


    public void calculateBMI(View v) {
        String ageStr = age.getText().toString();
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if (heightStr != null && !"".equals(heightStr)
                && weightStr != null  &&  !"".equals(weightStr) && ageStr != null && !"".equals(ageStr)) {
            int ageValue = Integer.parseInt(ageStr);
            float heightValue = Float.parseFloat(heightStr) / 100;
            float weightValue = Float.parseFloat(weightStr);


            float bmi = weightValue / (heightValue * heightValue);

            displayBMI(bmi);
        }

        else {
            Toast.makeText(InputActivity.this,
                    R.string.error,
                    Toast.LENGTH_SHORT).show();
        }
    }

    private void displayBMI(float bmi) {
        String bmiLabel = "";
        String imageView = "";
        if (Float.compare(bmi, 0) >= 0 && Float.compare(bmi, 18.5f) <=0 ) {
            bmiLabel = "Underweight";
            imageView = "underweight";
        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
            bmiLabel = "Normal";
            imageView = "normal";
        } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
            bmiLabel = "Overweight";
            imageView = "overweight";
        } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
            bmiLabel = "Obese";
            imageView = "obese";
        } else {
            bmiLabel = "Extremely Obese";
            imageView = "extremelyobese";
        }
        eval = bmiLabel;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        bmiLabel = formatter.format(bmi) + "";



        Intent i = new Intent(this, ResultActivity.class);
        String ageStr = age.getText().toString();
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();
        String getresult=bmiLabel;

//Create the bundle
        Bundle bundle = new Bundle();

//Add your data to bundle
        bundle.putString("Evaluation", eval);
        bundle.putString("Gauge", imageView);
        bundle.putString("Result", getresult);
        bundle.putString("Age", ageStr);
        bundle.putString("Height", heightStr);
        bundle.putString("Weight", weightStr);
//Add the bundle to the intent
        i.putExtras(bundle);

//Fire that second activity

        startActivity(i);

    }

    public void inputBack(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.checklist){
            i = new Intent(this, MainActivity.class);
            startActivity(i); }

    }


}