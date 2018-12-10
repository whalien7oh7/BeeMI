package ina.devera.com.beemi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ListActivity extends AppCompatActivity {
    private static String input= "";
    private EditText Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Search = (EditText) findViewById(R.id.Searcc);
    }


    public void search (View v) {
        input = Search.getText().toString();
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/search-recipes/?q="+ListActivity.input));
        startActivity(i);
    }

    public void inputBack(View v){
        Intent i = null;

            i = new Intent(this, MainActivity.class);
            startActivity(i);

    }

    public void normal (View v) {
        if(v.getId() == R.id.normal1) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/fast-healthy-high-fibre-pasta/0a0b06cf-358e-4cc7-8d07-592874e5f7e7"));
            startActivity(i); }
        else if(v.getId() == R.id.normal2) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/one-pot-beef-beer-stew-horseradish-dumplings/4xr1kz6z?r=recipes%2Fbeefrecipes&c=ed77f9a0-ff56-40d0-b903-b24e86c38152%2FBeef%20recipes"));
            startActivity(i); }
        else if(v.getId() == R.id.normal3) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/chilli-beef-stir-fry-broccoli-peanuts/a64bdecd-dbfb-441e-896b-9d837013fc0b?r=recipes%2Fr0Ny8kvb"));
            startActivity(i); }


        else if(v.getId() == R.id.overweight1) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/chicken-mango-salad-walnuts/882c1230-3469-4859-8263-691eaa3a267d"));
            startActivity(i); }

        else if(v.getId() == R.id.overweight2) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/creamy-mixed-vegetable-pesto-bake/28b6b8cc-f756-4e4e-b710-1818ab5e0895"));
            startActivity(i); }

        else if(v.getId() == R.id.overweight3) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/salmon-spinach-edamame-rice/70b315f3-fa10-46d6-ac80-b2883c4172c9"));
            startActivity(i); }


        else if(v.getId() == R.id.underweight1) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/maple-bacon-rissoles-sweet-potato-hash/g530aa5h?r=recipes%2Fbeefrecipes&c=ed77f9a0-ff56-40d0-b903-b24e86c38152%2FBeef%20recipes"));
            startActivity(i); }

        else if(v.getId() == R.id.underweight2) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/easy-beef-stroganoff-cottage-pie/pr30a5r1?r=recipes%2Fbeefrecipes&c=ed77f9a0-ff56-40d0-b903-b24e86c38152%2FBeef%20recipes"));
            startActivity(i); }

        else if(v.getId() == R.id.underweight3) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/beef-soboro/9xlgizjq"));
            startActivity(i); }


        else if(v.getId() == R.id.exobese1) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/chicken-cauliflower-fried-rice/7866abf9-352a-4276-8031-38e87dd87dfd"));
            startActivity(i); }

        else if(v.getId() == R.id.exobese2) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/pork-tacos-grilled-peach-salsa/30c3ee17-4534-48c9-a4de-b89a0fbce219"));
            startActivity(i); }

        else if(v.getId() == R.id.exobese3) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/rainbow-slaw-tahini-dressing/ca9da0a0-8064-420e-be2c-57e8ad3a04fc?r=recipes%2Flowcarbrecipes&c=269eb9df-317c-4f35-94e2-085a6a7a1341%2FLow%20carb%20recipes"));
            startActivity(i); }


        else if(v.getId() == R.id.obese1) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/avocado-yoghurt-dip-vegetables/7344c161-514d-440c-9265-784d79b01b05"));
            startActivity(i); }

        else if(v.getId() == R.id.obese1) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/miso-eggplant-pickled-vegetables/08dcdecd-b834-45e7-9210-31bcf567a93e"));
            startActivity(i); }

        else if(v.getId() == R.id.obese1) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/vegetable-haloumi-fritter-salad/b4uedd61"));
            startActivity(i); }

    }
}
