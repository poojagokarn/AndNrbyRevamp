package com.ascentsmartwaves.andnrbyrevamp.activities;

import android.app.ProgressDialog;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.ascentsmartwaves.andnrbyrevamp.R;

public class ProfileActivity extends AppCompatActivity {

    ActionBar actionBar;
    private RecyclerView dealsWalletRecyclerView; //myRecyclerView was its name
    private RecyclerView.Adapter dealsWalletAdapter;
    private RecyclerView.LayoutManager dealsWalletLayoutManager;
    ProgressDialog dialog;
    String imagepath;
    ImageView profileimg,editimg;
    LinearLayout profiledet,profileedit;
    String fname,lname,email,mobileno,dob,gender,userhandle,handle,photo;
    TextView name_tv,emailid_tv,mobileno_tv,dob_tv,gender_tv,dob_et;
    EditText handel_et,fname_et,lname_et, mobileno_et,merchantHandle_et;
    RadioButton male,female;
    //ImageLoader imageloader;
    String messageToShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        customActionBar();
        findViews();
    }

    private void customActionBar() {
        actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.logo);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(" Profile");
    }



    private void findViews()
    {
        //imageloader=new ImageLoader(getApplicationContext());

        male=(RadioButton)findViewById(R.id.radioM);
        female=(RadioButton)findViewById(R.id.radioF);

        profileimg=(ImageView)findViewById(R.id.profileimg);
        editimg=(ImageView)findViewById(R.id.editprofile);
        profiledet= (LinearLayout) findViewById(R.id.profile_details_layout);
        profileedit= (LinearLayout) findViewById(R.id.edit_profile_layout);

        handel_et= (EditText) findViewById(R.id.merchant_handle_profile);
        fname_et= (EditText) findViewById(R.id.user_firstname_activty_register);
        lname_et= (EditText) findViewById(R.id.user_lastname_activty_register);
        mobileno_et = (EditText) findViewById(R.id.user_mobile);
        merchantHandle_et=(EditText)findViewById(R.id.merchant_handle_profile);


        name_tv= (TextView) findViewById(R.id.user_name);
        emailid_tv= (TextView) findViewById(R.id.user_email_id_profile);
        mobileno_tv= (TextView) findViewById(R.id.user_mobile_profile);
        dob_tv= (TextView) findViewById(R.id.user_DOB_profile);
        gender_tv= (TextView) findViewById(R.id.user_gender_profile);
        dob_et= (TextView) findViewById(R.id.user_DOB);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile, menu);
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
