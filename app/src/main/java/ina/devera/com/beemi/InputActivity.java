package ina.devera.com.beemi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class InputActivity extends AppCompactActivity {
    private EditText age;
    private EditText height;
    private EditText weight;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        age = (EditText) findViewById(R.id.age);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        result = (TextView) findViewById(R.id.result);
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

        String getrec=bmiLabel;

//Create the bundle
        Bundle bundle = new Bundle();

//Add your data to bundle
        bundle.putString("stuff", getrec);

//Add the bundle to the intent
        i.putExtras(bundle);

//Fire that second activity

        startActivity(i);

    }

    public void inputBack(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.inputback){
            i = new Intent(this, MainActivity.class);
            startActivity(i); }
        /*else if(v.getId() == R.id.act2map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5889, 120.9753"));
            chooser = Intent.createChooser(i, "Choose App to be Used");
            startActivity(chooser); } */
    }


}