package ina.devera.com.beemi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class InputActivity extends AppCompatActivity {
    private EditText age;
    private EditText height;
    private EditText weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
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
    }

    private void displayBMI(float bmi) {
        String bmiLabel = "";

        if (Float.compare(bmi, 15f) <= 0) {
            bmiLabel = getString(R.string.underweight);
        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
            bmiLabel = getString(R.string.normal);
        } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
            bmiLabel = getString(R.string.overweight);
        } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
            bmiLabel = getString(R.string.obese);
        } else {
            bmiLabel = getString(R.string.extremelyobese);
        }

        bmiLabel = bmi + "\n\n" + bmiLabel;

        Intent i = new Intent(this, ResultActivity.class);
        String ageStr = age.getText().toString();
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();
        String getresult=bmiLabel;



//Create the bundle
        Bundle bundle = new Bundle();

//Add your data to bundle
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
        /*else if(v.getId() == R.id.act2map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5889, 120.9753"));
            chooser = Intent.createChooser(i, "Choose App to be Used");
            startActivity(chooser); } */
    }


}