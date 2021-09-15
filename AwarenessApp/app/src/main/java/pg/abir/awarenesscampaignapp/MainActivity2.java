package pg.abir.awarenesscampaignapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputLayout;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {

    String loginUrl = "https://covid-19awarenessapp.000webhostapp.com/login.php";


    RadioButton btnAdministrator,btnGuest;
    ViewGroup tContainer;

    String Type="";

    EditText txtMobile,txtPassword;
    TextInputLayout inputMobile, inputPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<small><font color='#000' > COVID-19 Awareness App </font></small>"));

        txtMobile=(EditText) findViewById(R.id.txtMobile);
        txtPassword=(EditText) findViewById(R.id.txtPassword);

        inputMobile = findViewById(R.id.InputTextMobile);
        inputPassword = findViewById(R.id.InputTextPassword);

        //txtMobile.setText("01632123797");
        //txtPassword.setText("123");

        btnLogin=(Button) findViewById(R.id.btnLogin);

        btnAdministrator=(RadioButton) findViewById(R.id.btnAdministrator);
        btnGuest=(RadioButton) findViewById(R.id.btnGuest);

        btnAdministrator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnAdministrator.isChecked()){
                    inputMobile.setVisibility(View.VISIBLE);
                    inputPassword.setVisibility(View.VISIBLE);
                    txtMobile.setVisibility(View.VISIBLE);
                    txtPassword.setVisibility(View.VISIBLE);
                }
                else{
                    inputMobile.setVisibility(View.GONE);
                    inputPassword.setVisibility(View.GONE);
                    txtMobile.setVisibility(View.GONE);
                    txtPassword.setVisibility(View.GONE);
                }

            }
        });

        btnGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnAdministrator.isChecked()){
                    inputMobile.setVisibility(View.VISIBLE);
                    inputPassword.setVisibility(View.VISIBLE);
                    txtMobile.setVisibility(View.VISIBLE);
                    txtPassword.setVisibility(View.VISIBLE);
                }
                else{
                    inputMobile.setVisibility(View.GONE);
                    inputPassword.setVisibility(View.GONE);
                    txtMobile.setVisibility(View.GONE);
                    txtPassword.setVisibility(View.GONE);
                }

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnAdministrator.isChecked()){
                    if (checkEmpty()) {
                        AdminLogin();
                    }
                }
                else{
                    Intent intent = new Intent(MainActivity2.this, HomeActivity.class);
                    intent.putExtra("Type","Guest");
                    startActivity(intent);
                }

            }
        });


    }

    public void AdminLogin() {



        // Creating string request with post method.
        StringRequest stringRequest = new StringRequest(Request.Method.POST, loginUrl,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String ServerResponse) {

                        if(ServerResponse.equalsIgnoreCase("Data Matched")) {

                            Intent intent = new Intent(MainActivity2.this, HomeActivity.class);
                            intent.putExtra("Type","Admin");
                            startActivity(intent);
                        }
                        else {

                            Toast.makeText(MainActivity2.this, ServerResponse, Toast.LENGTH_LONG).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {


                        Toast.makeText(MainActivity2.this,"Erorr "+volleyError.toString(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() {

                Map<String, String> params = new HashMap<String, String>();

                params.put("Mobile", txtMobile.getText().toString().trim());
                params.put("Password", txtPassword.getText().toString().trim());


                return params;
            }

        };

        // Creating RequestQueue.
        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity2.this);

        // Adding the StringRequest object into requestQueue.
        requestQueue.add(stringRequest);

    }


    private boolean checkEmpty(){
        if(!txtMobile.getText().toString().isEmpty()){
            if(!txtPassword.getText().toString().isEmpty()){
                return true;
            }
            else{
                Toast.makeText(getApplication(), "Provide Password", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(getApplication(), "Provide Valid User Admin", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}