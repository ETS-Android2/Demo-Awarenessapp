package pg.abir.awarenesscampaignapp;


import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class NewDataAddStatisticActivity extends AppCompatActivity {

    private static String TAG = NewDataAddStatisticActivity.class.getSimpleName();

    private String insertDataURL = "https://covid-19awarenessapp.000webhostapp.com/addDailyUpdateData.php";
    //private String insertDataURL = "https://www.bpsoft.xyz/MVarsity/addDailyUpdateData.php";

    EditText txtDate,txtCases,txtDeaths,txtRecovered;
    Button btnDatePicker,btnView,btnSubmit;

    private int mYear, mMonth, mDay, mHour, mMinute;
    final Calendar datec = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statisticnewdataadd);

        txtDate=(EditText) findViewById(R.id.txtDate);
        txtCases=(EditText) findViewById(R.id.txtCases);
        txtDeaths=(EditText) findViewById(R.id.txtDeaths);
        txtRecovered=(EditText) findViewById(R.id.txtRecovered);
        btnDatePicker=(Button) findViewById(R.id.btnDate);
        btnSubmit=(Button) findViewById(R.id.btnsave);


        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<small><font color='#000' >Coronavirus (Statistic) </font></small>"));



        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDatePickerEvent();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkEmpty()){
                    insertDataForConfrim();
                }
            }
        });


    }


    public void insertDataForConfrim() {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, insertDataURL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //progressBar.setVisibility(View.GONE);
                txtDate.setText("");
                txtCases.setText("");
                txtDeaths.setText("");
                txtRecovered.setText("");
                System.out.println("response "+response);
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_LONG).show();


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
                System.out.println("error "+error.getMessage());
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {


                Map<String, String> parameters = new HashMap<String, String>();

                System.out.println("Date"+txtDate.getText().toString());

                parameters.put("Date", txtDate.getText().toString());

                parameters.put("Cases", txtCases.getText().toString().trim());
                parameters.put("Deaths", txtDeaths.getText().toString().trim());
                parameters.put("Recovered", txtRecovered.getText().toString().trim());



/*

                Calendar calendar = getCalendarForNow();
                calendar.set(Calendar.DAY_OF_MONTH,
                        calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

                Date begining = calendar.getTime();

                String begDate=new SimpleDateFormat("yyyy-MM-dd").format(begining);
                System.out.println("begDate "+begDate);


                Calendar endcalendar = getCalendarForNow();
                endcalendar.set(Calendar.DAY_OF_MONTH,
                        endcalendar.getActualMaximum(Calendar.DAY_OF_MONTH));

                Date enddate = endcalendar.getTime();

                String endDate=new SimpleDateFormat("yyyy-MM-dd").format(enddate);
                System.out.println("endDate "+endDate);

                parameters.put("StartDate",begDate);
                parameters.put("EndDate",endDate);
*/

                return parameters;
            }
        };

        AppSingleton1.getInstance(this).addToRequestQueue(stringRequest, TAG);

    }

    private static Calendar getCalendarForNow() {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new Date());
        return calendar;
    }

    private boolean checkEmpty(){
        if(!txtDate.getText().toString().isEmpty()){
            if(!txtCases.getText().toString().isEmpty()){
                if(!txtDeaths.getText().toString().isEmpty()){
                    if(!txtRecovered.getText().toString().isEmpty()){
                        return true;
                    }
                    else{
                        Toast.makeText(getApplication(), "Provide Number of recovered", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplication(), "Provide Number of deaths", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(getApplication(), "Provide Number of cases", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(getApplication(), "Provide Date", Toast.LENGTH_SHORT).show();
        }
        return false;
    }


    private void btnDatePickerEvent(){

        mYear = datec.get(Calendar.YEAR);
        mMonth = datec.get(Calendar.MONTH);
        mDay = datec.get(Calendar.DAY_OF_MONTH);


        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {

                        txtDate.setText( year+ "-" + (monthOfYear+1) + "-" + dayOfMonth);

                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }


}
