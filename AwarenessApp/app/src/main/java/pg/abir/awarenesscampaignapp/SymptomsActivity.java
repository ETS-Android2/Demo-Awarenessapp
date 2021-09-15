package pg.abir.awarenesscampaignapp;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SymptomsActivity extends AppCompatActivity {

    TextView tv;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<small><font color='#000' >Coronavirus (Symptoms) </font></small>"));


        tv=(TextView) findViewById(R.id.tvSymptoms);
        tv1=(TextView) findViewById(R.id.tvSymptoms1);
        tv2=(TextView) findViewById(R.id.tvSymptoms2);
        tv3=(TextView) findViewById(R.id.tvSymptoms3);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tv.setText(Html.fromHtml("<html>" +
                    "<br/><p> COVID-19 affects different people in different ways. Most infected people will develop mild to moderate illness and recover without hospitalization.</p>" +
                    " <br/><p><b>Most common symptoms :</b></p>" +
                    " <br/><li> &nbsp;fever.</li>" +
                    " <br/><li> &nbsp;dry cough.</li>" +
                    " <br/><li> &nbsp;Sore Throat.</li><br/>" +

                    "</html>", Html.FROM_HTML_MODE_COMPACT));

            tv1.setText(Html.fromHtml("<html>" +
                    " <br/><p><b>Less common symptoms :</b></p>" +
                    " <br/><li> &nbsp;aches and pains.</li>" +
                    " <br/><li> &nbsp;sore throat.</li>" +
                    " <br/><li> &nbsp;diarrhoea.</li>" +
                    " <br/><li> &nbsp;conjunctivitis.</li>" +
                    " <br/><li> &nbsp;headache.</li>" +
                    " <br/><li> &nbsp;loss of taste or smell.</li><br/>" +

                    "</html>", Html.FROM_HTML_MODE_COMPACT));

            tv2.setText(Html.fromHtml("<html>" +
                    " <br/><br/><p><b>Serious symptoms :</b></p>" +
                    " <br/><li> &nbsp;difficulty breathing or shortness of breath.</li>" +
                    " <br/><li> &nbsp;chest pain or pressure.</li>" +
                    " <br/><li> &nbsp;loss of speech or movement.</li><br/>" +

                    "</html>", Html.FROM_HTML_MODE_COMPACT));
            tv3.setText(Html.fromHtml("<html>" +
                    " <br/><br/><p><b>To do :</b></p>" +
                    " <br/><p>Seek immediate medical attention if you have serious symptoms.  Always call before visiting your doctor or health facility. </p>" +
                    " <br/><p>People with mild symptoms who are otherwise healthy should manage their symptoms at home. </p>" +
                    " <br/><p>On average it takes 5–6 days from when someone is infected with the virus for symptoms to show, however it can take up to 14 days. </p>" +
                    " <br/><p>Seek immediate medical attention if you have serious symptoms.  Always call before visiting your doctor or health facility. </p>" +
                    " <br/><p>People with mild symptoms who are otherwise healthy should manage their symptoms at home. </p>" +
                    " <br/><p>On average it takes 5–6 days from when someone is infected with the virus for symptoms to show, however it can take up to 14 days. </p>" +

                    "</html>", Html.FROM_HTML_MODE_COMPACT));
        } else {
            tv.setText(Html.fromHtml("<html>" +
                    "<br <p> COVID-19 affects different people in different ways. Most infected people will develop mild to moderate illness and recover without hospitalization.</p>" +
                    " <br/><p>Most common symptoms:</p>" +
                    " <br/><li>fever.</li>" +
                    " \n<li>dry cough.</li>" +
                    " \n<li>tiredness.</li>" +
                    " <br/><p>Less common symptoms:</p>" +
                    " <br/><li>aches and pains.</li>" +
                    " \n<li>sore throat.</li>" +
                    " \n<li>diarrhoea.</li>" +
                    " \n<li>conjunctivitis.</li>" +
                    " \n<li>headache.</li>" +
                    " \n<li>loss of taste or smell.</li>" +
                    " \n<li>a rash on skin, or discolouration of fingers or toes.</li>" +
                    " <br/><p>Serious symptoms:</p>" +
                    " \n<li>difficulty breathing or shortness of breath.</li>" +
                    " \n<li>chest pain or pressure.</li>" +
                    " \n<li>loss of speech or movement.</li>" +
                    " <br/><p>Seek immediate medical attention if you have serious symptoms.  Always call before visiting your doctor or health facility. </p>" +
                    " <br/><p>People with mild symptoms who are otherwise healthy should manage their symptoms at home. </p>" +
                    " <br/><p>On average it takes 5–6 days from when someone is infected with the virus for symptoms to show, however it can take up to 14 days. </p>" +
                    "</html>"));
        }
    }
}
