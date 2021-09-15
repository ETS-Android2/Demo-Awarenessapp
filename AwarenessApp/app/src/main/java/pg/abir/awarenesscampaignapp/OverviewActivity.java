package pg.abir.awarenesscampaignapp;

import android.os.Bundle;
import android.text.Html;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


public class OverviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<small><font color='#000' >Coronavirus (Overview) </font></small>"));

    }
}
