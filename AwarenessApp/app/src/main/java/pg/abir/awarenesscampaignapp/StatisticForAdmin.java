package pg.abir.awarenesscampaignapp;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class StatisticForAdmin extends AppCompatActivity {

    EditText txtDate;
    Button btnDatePicker,btnView,btnNewData;

    private int mYear, mMonth, mDay, mHour, mMinute;
    final Calendar datec = Calendar.getInstance();

    private String getTotalStatistics = "https://covid-19awarenessapp.000webhostapp.com/getTotalStatistics.php";
    //private String getTotalStatistics = "https://www.bpsoft.xyz/MVarsity/getTotalStatistics.php";

    private String getDateWiseStatus = "https://covid-19awarenessapp.000webhostapp.com/getDateWiseStatus.php";
    //private String getDateWiseStatus = "https://www.bpsoft.xyz/MVarsity/getDateWiseStatus.php";


    String Cases="";
    String Deaths="";
    String Recovered="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic_admin);


        btnView = findViewById(R.id.btnView);
        txtDate=(EditText) findViewById(R.id.txtDate);
        btnDatePicker=(Button) findViewById(R.id.btndatepicker);
        btnNewData=(Button) findViewById(R.id.btnNewDataAdd);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<small><font color='#000' >Coronavirus (Statistic) </font></small>"));



        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDatePickerEvent();
            }
        });

        btnNewData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(getApplicationContext(),
                        NewDataAddStatisticActivity.class);
                startActivity(myIntent);
            }
        });

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txtDate.getText().toString().trim().isEmpty()){
                    loadDateWiseStatus();
                    loadCurrentStatus();
                }
                else{
                    Toast.makeText(getApplication(), "Provide Date", Toast.LENGTH_SHORT).show();
                    loadCurrentStatus();
                }


            }
        });


        loadCurrentStatus();

    }

    private void loadCurrentStatus(){
        //creating a string request to send request to the url
        StringRequest stringRequest = new StringRequest(Request.Method.POST, getTotalStatistics,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //hiding the progressbar after completion

                        System.out.println("response "+response);

                        try {
                            JSONObject obj = new JSONObject(response);
                            JSONArray productArray = obj.getJSONArray("result");
                            for (int i = 0; i < productArray.length(); i++) {
                                JSONObject dataObject = productArray.getJSONObject(i);
                                Cases=dataObject.getString("Cases");
                                Deaths=dataObject.getString("Deaths");
                                Recovered=dataObject.getString("Recovered");
                                pieGraphForCurrentStatistic(Cases,Deaths,Recovered);
                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                            System.out.println("Errpr "+e.getMessage());
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //displaying the error in toast if occurrs
                        Toast.makeText(getApplicationContext(), "connection lost", Toast.LENGTH_SHORT).show();
                    }
                });

        //creating a request queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        //adding the string request to request queue
        requestQueue.add(stringRequest);
    }


    private void loadDateWiseStatus(){
        //creating a string request to send request to the url
        StringRequest stringRequest = new StringRequest(Request.Method.POST, getDateWiseStatus,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //hiding the progressbar after completion

                        System.out.println("response "+response);

                        try {
                            JSONObject obj = new JSONObject(response);
                            JSONArray productArray = obj.getJSONArray("result");
                            for (int i = 0; i < productArray.length(); i++) {
                                JSONObject dataObject = productArray.getJSONObject(i);
                                Cases=dataObject.getString("Cases").equals("null")?"0":dataObject.getString("Cases");
                                Deaths=dataObject.getString("Deaths").equals("null")?"0":dataObject.getString("Deaths");
                                Recovered=dataObject.getString("Recovered").equals("null")?"0":dataObject.getString("Recovered");
                                pieGraphForDateWiseStatistic(Cases,Deaths,Recovered);
                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                            System.out.println("Errpr "+e.getMessage());
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //displaying the error in toast if occurrs
                        Toast.makeText(getApplicationContext(), "connection lost", Toast.LENGTH_SHORT).show();
                    }
                })        {
            protected Map<String, String> getParams() {

                Map<String, String> params = new HashMap<String, String>();
                params.put("Date",txtDate.getText().toString().trim());


                return params;
            }

        };

        //creating a request queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        //adding the string request to request queue
        requestQueue.add(stringRequest);
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


    public void pieGraphForCurrentStatistic(String Cases,String Deaths,String Recovered)
    {


        PieChartView pieChartView = findViewById(R.id.chartovelall);
        List<SliceValue> pieData = new ArrayList<>();


        //---------2----------
        pieData.add(new SliceValue(Integer.parseInt(Cases), Color.BLUE).setLabel("Cases \n"+Cases));
        pieData.add(new SliceValue(Integer.parseInt(Deaths), Color.RED).setLabel("Deaths\n"+Deaths));
        pieData.add(new SliceValue(Integer.parseInt(Recovered), Color.GRAY).setLabel("Recovered\n"+Recovered));


        PieChartData pieChartData = new PieChartData(pieData);

        pieChartData.setHasLabels(true);
        pieChartData.setHasLabels(true).setValueLabelTextSize(14);
        pieChartView.setPieChartData(pieChartData);


    }

    public void pieGraphForDateWiseStatistic(String Cases,String Deaths,String Recovered)
    {


        PieChartView pieChartView = findViewById(R.id.chart);
        List<SliceValue> pieData = new ArrayList<>();


        //---------2----------
        pieData.add(new SliceValue(Integer.parseInt(Cases), Color.BLUE).setLabel("Cases \n"+Cases));
        pieData.add(new SliceValue(Integer.parseInt(Deaths), Color.RED).setLabel("Deaths\n"+Deaths));
        pieData.add(new SliceValue(Integer.parseInt(Recovered), Color.GRAY).setLabel("Recovered\n"+Recovered));


        PieChartData pieChartData = new PieChartData(pieData);

        pieChartData.setHasLabels(true);
        pieChartData.setHasLabels(true).setValueLabelTextSize(14);
        pieChartView.setPieChartData(pieChartData);


    }
}

