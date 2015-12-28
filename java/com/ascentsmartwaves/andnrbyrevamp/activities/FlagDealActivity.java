package com.ascentsmartwaves.andnrbyrevamp.activities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;

import com.ascentsmartwaves.andnrbyrevamp.R;

public class FlagDealActivity extends Activity {

    String dealID;
    int reason;
    Intent intent;
    RadioButton reason1,reason2,reason3,reason4,reason5;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_deal);

        findViews();
    }

    private void findViews()
    {
        reason1= (RadioButton) findViewById(R.id.reason1);
        reason2= (RadioButton) findViewById(R.id.reason2);
        reason3= (RadioButton) findViewById(R.id.reason3);
        reason4= (RadioButton) findViewById(R.id.reason4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_flag_deal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
