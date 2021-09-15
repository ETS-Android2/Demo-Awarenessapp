package pg.abir.awarenesscampaignapp;


import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class TreatmentActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<small><font color='#000' >Coronavirus (Treatment) </font></small>"));


        tv=(TextView) findViewById(R.id.tvTreatment);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tv.setText(Html.fromHtml("<html>" +
                    "<br/> <p>To date, there are no specific vaccines or medicines for COVID-19. Treatments are under investigation, and will be tested through clinical trials <a href =\"https://www.who.int/\">(@World Health Organization)</a>.</p>" +

                    " <br/><br/><p><b>Self care</b></p><br/>" +
                    " \n<p>If you feel sick you should rest, drink plenty of fluid, and eat nutritious food. Stay in a separate room from other family members, and use a dedicated bathroom if possible. Clean and disinfect frequently touched surfaces.</p>" +
                    " <br/><br/><p><b>Healthy lifestyle</b></p><br/>" +
                    " \n<p>Everyone should keep a healthy lifestyle at home. Maintain a healthy diet, sleep, stay active, and make social contact with loved ones through the phone or internet. Children need extra love and attention from adults during difficult times. Keep to regular routines and schedules as much as possible.</p>" +
                    " <br/><br/><p><b>Connet with others</b></p><br/>" +
                    " \n<p>It is normal to feel sad, stressed, or confused during a crisis. Talking to people you trust, such as friends and family, can help. If you feel overwhelmed, talk to a health worker or counsellor.</p>" +

                    "</html>", Html.FROM_HTML_MODE_COMPACT));
        } else {
            tv.setText(Html.fromHtml("<html>\" +\n" +
                    "<br <p>To date, there are no specific vaccines or medicines for COVID-19. Treatments are under investigation, and will be tested through clinical trials. World Health Organization</p>" +

                    " <br/><br/<p>Self care</p>" +
                    " \n<p>If you feel sick you should rest, drink plenty of fluid, and eat nutritious food. Stay in a separate room from other family members, and use a dedicated bathroom if possible. Clean and disinfect frequently touched surfaces.</p>" +
                    " \n<p>Everyone should keep a healthy lifestyle at home. Maintain a healthy diet, sleep, stay active, and make social contact with loved ones through the phone or internet. Children need extra love and attention from adults during difficult times. Keep to regular routines and schedules as much as possible.</p>" +
                    " \n<p>It is normal to feel sad, stressed, or confused during a crisis. Talking to people you trust, such as friends and family, can help. If you feel overwhelmed, talk to a health worker or counsellor.</p>" +

                    "                    \"</html>"));
        }
    }
}
