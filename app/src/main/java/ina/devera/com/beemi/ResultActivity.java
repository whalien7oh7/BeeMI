package ina.devera.com.beemi;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

public class ResultActivity extends AppCompatActivity {
    private static String link = "";
    private static String link1 = "";
    private static String link2 = "";
    private TextView Age;
    private TextView Height;
    private TextView Weight;
    private TextView Result;
    private ImageView Gauge;
    private ImageView Recommendation;
    private TextView Name;
    private TextView Evaluation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d("Log: ", "onCreate() session has been initiated");

        //Get the bundle
        Bundle bundle = getIntent().getExtras();

        Result = (TextView) findViewById(R.id.Result);
        Age = (TextView) findViewById(R.id.Age);
        Height = (TextView) findViewById(R.id.Height);
        Weight = (TextView) findViewById(R.id.Weight);
        Gauge = (ImageView) findViewById(R.id.Gauge);
        Recommendation = (ImageView) findViewById(R.id.Recommendation);
        Name = (TextView) findViewById(R.id.FoodName);
        Evaluation = (TextView) findViewById(R.id.Evaluation);

//Extract the data…
        String Imageresult = bundle.getString("Gauge");
        String Resulttext = bundle.getString("Result");
        String Agetext = bundle.getString("Age");
        String Heighttext = bundle.getString("Height");
        String Weighttext = bundle.getString("Weight");
        String Evaluations = bundle.getString("Evaluation");

        Result.setText(" Result: " + Resulttext);
        Age.setText(" Age: " + Agetext);
        Height.setText("Height: " + Heighttext);
        Weight.setText("Weight: " + Weighttext);
        Evaluation.setText("" + Evaluations);

        if (Imageresult.equals("underweight")) {
            Gauge.setImageResource(R.drawable.underweight);
            Recommendation.setImageResource(R.drawable.underweightcake);
            Name.setText("Double-Chocolate and Raspberry Pavlova");
            link = "https://www.taste.com.au/recipes/double-chocolate-raspberry-pavlova/asylrp9t";
            link1 = "https://www.taste.com.au/recipes/beef-soboro/9xlgizjq";
            link2 = "https://www.taste.com.au/recipes/smoky-beef-ale-skewers-green-apple-salsa/exyil7wt?r=recipes%2Fbeefrecipes&c=ed77f9a0-ff56-40d0-b903-b24e86c38152%2FBeef%20recipes";
        } else if (Imageresult.equals("normal")) {
            Gauge.setImageResource(R.drawable.normal);
            Recommendation.setImageResource(R.drawable.normalpesto);
            Name.setText("Low-Fat Pesto Fettuccine");
            link = "https://www.taste.com.au/recipes/low-fat-pesto-fettuccine/ee405318-c29f-43e8-86ac-5bd6641ddc66";
            link1 = "https://www.taste.com.au/recipes/beef-soboro/9xlgizjq";
            link2 = "https://www.taste.com.au/recipes/smoky-beef-ale-skewers-green-apple-salsa/exyil7wt?r=recipes%2Fbeefrecipes&c=ed77f9a0-ff56-40d0-b903-b24e86c38152%2FBeef%20recipes";

        } else if (Imageresult.equals("overweight")) {
            Gauge.setImageResource(R.drawable.overweight);
            Recommendation.setImageResource(R.drawable.overweightchili);
            Name.setText("Blue-Eye with Green Chilli Nam Jim and Choy Sum");
            link = "https://www.taste.com.au/recipes/blue-eye-green-chilli-nam-jim-choy-sum/e5533259-5cdb-4775-9a62-da9b2e0e620c?r=recipes/lowcarbrecipes&c=269eb9df-317c-4f35-94e2-085a6a7a1341/Low%20carb%20recipes";
            link1 = "https://www.taste.com.au/recipes/fast-healthy-high-fibre-pasta/0a0b06cf-358e-4cc7-8d07-592874e5f7e7";
            link2 = "https://www.taste.com.au/recipes/healthier-vegetarian-pad-thai/0mu04srd";
        } else if (Imageresult.equals("obese")) {
            Gauge.setImageResource(R.drawable.obese);
            Recommendation.setImageResource(R.drawable.obeseballs);
            Name.setText("Surprise Matcha Balls");
            link = "https://www.taste.com.au/recipes/surprise-matcha-balls/9fa04939-eec1-4fdd-a52c-8233e456ba64?r=recipes/healthysnackrecipes&c=8dae2ea8-b38a-48a5-8d2a-85d92e17541d/Healthy%20snack%20recipes";
            link1 = "https://www.taste.com.au/recipes/vegetable-haloumi-fritter-salad/b4uedd61";
            link2 = "https://www.taste.com.au/recipes/avocado-yoghurt-dip-vegetables/7344c161-514d-440c-9265-784d79b01b05";
        } else {
            Gauge.setImageResource(R.drawable.extremelyobese);
            Recommendation.setImageResource(R.drawable.exobesekale);
            Name.setText("Dukkah and Lemon Salt Kale C  hips");
            link = "https://www.taste.com.au/recipes/dukkah-lemon-salt-kale-chips/7979edb9-ef1e-49f8-b807-0d125cb64c55?r=recipes/healthysnackrecipes&c=8dae2ea8-b38a-48a5-8d2a-85d92e17541d/Healthy%20snack%20recipes";
            link1 = "https://www.taste.com.au/recipes/chilli-beef-stir-fry-broccoli-peanuts/a64bdecd-dbfb-441e-896b-9d837013fc0b?r=recipes%2Fr0Ny8kvb";
            link2 = "https://www.taste.com.au/recipes/chicken-cauliflower-fried-rice/7866abf9-352a-4276-8031-38e87dd87dfd";
        }

    }
        public void clickLink (View v){
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(ResultActivity.link));
            startActivity(i);

        }

        public void clickExtraLink1 (View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(ResultActivity.link1));
        startActivity(i);
       }
    public void clickExtraLink2 (View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(ResultActivity.link2));
        startActivity(i);
    }

    }

