package pg.abir.awarenesscampaignapp;


import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class PreventionActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<small><font color='#000' >Coronavirus (Prevention) </font></small>"));


        tv=(TextView) findViewById(R.id.tvPrevention);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tv.setText(Html.fromHtml("<html>" +
                    "<br/><p><b>To prevent infection and to slow transmission of COVID-19, do the following :</b></p>" +

                    " <br/><br/><ul><li>&nbsp;Wash your hands regularly with soap and water, or clean them with alcohol-based hand rub.<br/><br/></li>" +
                    " <li> &nbsp;Maintain at least 1 metre distance between you and people coughing or sneezing.<br/><br/></li>" +
                    " <li> &nbsp;Avoid touching your face.<br/><br/></li>" +
                    " <li> &nbsp;Cover your mouth and nose when coughing or sneezing.<br/><br/></li>" +
                    " <li> &nbsp;Stay home if you feel unwell.<br/><br/></li>" +
                    " <li> &nbsp;Refrain from smoking and other activities that weaken the lungs.<br/><br/></li>" +
                    " <li> &nbsp;Practice physical distancing by avoiding unnecessary travel and staying away from large groups of people.<br/><br/></li></ul>" +

                    "<br/><br/><p><b>Picture description :</b></p><br/>" +

                    "</html>", Html.FROM_HTML_MODE_COMPACT));
        } else {
            tv.setText(Html.fromHtml("<html>\" +\n" +
                    "<br/><p><b>To prevent infection and to slow transmission of COVID-19, do the following :</b></p>" +

                    " <br/><br/><ul><li>&nbsp;Wash your hands regularly with soap and water, or clean them with alcohol-based hand rub.<br/><br/></li>" +
                    " <li> &nbsp;Maintain at least 1 metre distance between you and people coughing or sneezing.<br/><br/></li>" +
                    " <li> &nbsp;Avoid touching your face.<br/><br/></li>" +
                    " <li> &nbsp;Cover your mouth and nose when coughing or sneezing.<br/><br/></li>" +
                    " <li> &nbsp;Stay home if you feel unwell.<br/><br/></li>" +
                    " <li> &nbsp;Refrain from smoking and other activities that weaken the lungs.<br/><br/></li>" +
                    " <li> &nbsp;Practice physical distancing by avoiding unnecessary travel and staying away from large groups of people.<br/><br/></li></ul>" +

                    "<br/><br/><p><b>Picture description :</b></p><br/>" +
                    "                    \"</html>"));
        }
    }
}
