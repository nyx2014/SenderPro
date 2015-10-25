package org.snc.senderpro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SendActivity extends AppCompatActivity {

    private static SharedPreferences mPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(mPreferences==null){
            mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        }

        String sharedText = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        Toast.makeText(this,sharedText,Toast.LENGTH_LONG).show();
    }
}
