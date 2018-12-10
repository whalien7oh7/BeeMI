package ina.devera.com.beemi;

import android.content.Intent;
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
    }


    public void checkBMI(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.checkbmi){
            i = new Intent(this, InputActivity.class);
            startActivity(i); }
    }

    public void checkList(View v){
        Intent i = null;
        if (!InputActivity.eval.equals("")) {
            i = new Intent(this, ListActivity.class);
            startActivity(i); }
        else {
            Toast.makeText(MainActivity.this,
                    R.string.error2,
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d ("Log: ","onStart() session has been initiated"); }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d ("Log: ","onResume() session has been initiated"); }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d ("Log: ","onStop() session has been initiated"); }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d ("Log: ","onPause() session has been initiated"); }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d ("Log: ","onRestart() session has been initiated"); }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d ("Log: ","onDestroy() session has been initiated"); }
}
