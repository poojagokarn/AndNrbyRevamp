package com.ascentsmartwaves.andnrbyrevamp.activities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ascentsmartwaves.andnrbyrevamp.R;

public class AndNrByFragmentDetailActivity extends AppCompatActivity {

    private ImageView detailsBackground,brandLogo,like,map,call;
    private TextView tittle,desc,like_tv,redeem_tv, endDate,locality_tv,merchant_name;
    ActionBar actionBar;
    String messageToShare;
    RelativeLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andnrby_fragment_detail);

        customActionBar();
        findViews();
        setViews();
    }

    private void findViews()
    {
        detailsBackground = (ImageView) findViewById(R.id.details_background_andnrby_details_activityIV);
        brandLogo = (ImageView) findViewById(R.id.anbys_logo);
        merchant_name = (TextView) findViewById(R.id.brandName);
        like = (ImageView) findViewById(R.id.like_image_included);
        map=(ImageView)findViewById(R.id.mapview);
        main=(RelativeLayout)findViewById(R.id.andnrby_main_layout);
        tittle= (TextView)findViewById(R.id.deal_name_text_andnrby_fragment);
        locality_tv = (TextView) findViewById(R.id.deal_description_text_andnrby_fragment);
        desc = (TextView) findViewById(R.id.deals_details_text_andnrby_fragment_details_activity);
        like_tv = (TextView) findViewById(R.id.likes_counter_text_details_bottom_strip);
        endDate = (TextView) findViewById(R.id.enddate_textview);
        redeem_tv = (TextView) findViewById(R.id.redeem_counter_text_details_bottom_strip);
        call = (ImageView) findViewById(R.id.call_image_included);
    }

    private void customActionBar()
    {
        actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.logo);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
//        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(" Details");
    }



    private void setViews()
    {
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_and_nr_by_fragment_detail, menu);
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
