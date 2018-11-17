package ina.devera.com.beemi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, bgService.class);
        startService(i);
        /* Intent i = new Intent(this, bgService.class);
        startService(i); */
    }


    public void checkBMI(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.checkbmi){
            i = new Intent(this, InputActivity.class);
            startActivity(i); }
        /*else if(v.getId() == R.id.act2map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5889, 120.9753"));
            chooser = Intent.createChooser(i, "Choose App to be Used");
            startActivity(chooser); } */
    }

}
