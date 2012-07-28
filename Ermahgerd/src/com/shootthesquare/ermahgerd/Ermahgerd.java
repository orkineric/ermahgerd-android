package com.shootthesquare.ermahgerd;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import com.google.ads.*;

public class Ermahgerd extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ermahgerd);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_ermahgerd, menu);
        return true;
    }

    
}
