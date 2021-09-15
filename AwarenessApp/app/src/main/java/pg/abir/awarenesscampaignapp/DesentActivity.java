package pg.abir.awarenesscampaignapp;


import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DesentActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desent);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<small><font color='#000' >Coronavirus (Desent) </font></small>"));


        tv=(TextView) findViewById(R.id.tvDesent);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tv.setText(Html.fromHtml("<html>" +
                    "<br <p>The 2019 novel coronavirus has the potential to be a global pandemic. Health officials say it originated in a market in Wuhan, China that sold live and dead wild animals that people ate for food, improved health and vitality and a number of other purposes. The virus has now been detected in Australia, Canada, Finland, France, India, Italy, Japan, Nepal, Russia, Singapore, Spain, Taiwan, Thailand, Vietnam, the United States and over a dozen other countries. </p>" +

                    " <br/><br/><br/><p><b>Coronavirus effects country</b></p><br/>" +
                    " \n<p>New cases of the novel coronavirus that emerged in the central Chinese city of Wuhan in late December are being reported daily around the world.</p>" +
                    " \n<br/><p>More than 1,200,000 people have died from COVID-19, the disease caused by the new coronavirus, while five million infections have been confirmed in at least 188 countries and territories. Nearly 41.10 million people have recovered to date.</p>" +

                    "</html>", Html.FROM_HTML_MODE_COMPACT));
        } else {
            tv.setText(Html.fromHtml("<html>\" +\n" +
                    "<br <p>The 2019 novel coronavirus has the potential to be a global pandemic. Health officials say it originated in a market in Wuhan, China that sold live and dead wild animals that people ate for food, improved health and vitality and a number of other purposes. The virus has now been detected in Australia, Canada, Finland, France, India, Italy, Japan, Nepal, Russia, Singapore, Spain, Taiwan, Thailand, Vietnam, the United States and over a dozen other countries. </p>" +

                    " <br/><br/><p>Coronavirus effects country list</p>" +
                    " \n<p>New cases of the novel coronavirus that emerged in the central Chinese city of Wuhan in late December are being reported daily around the world.</p>" +
                    " \n<br/><p>More than 335,000 people have died from COVID-19, the disease caused by the new coronavirus, while five million infections have been confirmed in at least 188 countries and territories. Nearly 1.96 million people have recovered to date.</p>" +

                    "                    \"</html>"));
        }
    }
}

