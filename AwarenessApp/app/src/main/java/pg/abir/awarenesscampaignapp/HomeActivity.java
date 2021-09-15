package pg.abir.awarenesscampaignapp;

import android.content.Intent;
import android.os.Bundle;

import android.text.Html;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView gridView;
    private GridViewAdapter gridViewAdapter6;
    private ArrayList<RecyclerViewItem> operatingSystems;

    String Type="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        Type=getIntent().getStringExtra("Type")==null?"":getIntent().getStringExtra("Type");

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<small><font color='#000' >COVID-19 Awareness</font></small>"));


        gridView = (RecyclerView) findViewById(R.id.grid);
        setMyApplicationData();
        gridView.setHasFixedSize(true);


        gridView.addOnItemTouchListener(new RecyclerViewTouchListener(getApplicationContext(), gridView, new RecyclerViewClickListener() {

            public void onClick(View view, int position) {


               if(operatingSystems.get(position).getName().equalsIgnoreCase("Overview")){

                    Intent myIntent = new Intent(getApplicationContext(),
                            OverviewActivity.class);
                    startActivity(myIntent);
                }

               else if(operatingSystems.get(position).getName().equalsIgnoreCase("Symptoms")){

                    Intent myIntent = new Intent(getApplicationContext(),
                            SymptomsActivity.class);
                    startActivity(myIntent);
                }

               else if(operatingSystems.get(position).getName().equalsIgnoreCase("Prevention")){

                   Intent myIntent = new Intent(getApplicationContext(),
                           PreventionActivity.class);
                   startActivity(myIntent);
               }

               else if(operatingSystems.get(position).getName().equalsIgnoreCase("Treatment")){

                   Intent myIntent = new Intent(getApplicationContext(),
                           TreatmentActivity.class);
                   startActivity(myIntent);
               }

               else if(operatingSystems.get(position).getName().equalsIgnoreCase("Descent")){

                   Intent myIntent = new Intent(getApplicationContext(),
                           DesentActivity.class);
                   startActivity(myIntent);
               }

               else if(operatingSystems.get(position).getName().equalsIgnoreCase("Question & Answer")){

                   Intent myIntent = new Intent(getApplicationContext(),
                           QuestionAnswerActivity.class);
                   startActivity(myIntent);
               }

               else if(operatingSystems.get(position).getName().equalsIgnoreCase("Statistic")){

                   if(Type.equals("Admin")){
                       Intent myIntent = new Intent(getApplicationContext(),
                               StatisticForAdmin.class);
                       startActivity(myIntent);
                       System.out.println("Type "+Type);
                   }
                   else{
                       Intent myIntent = new Intent(getApplicationContext(),
                               StatisticActivity.class);
                       startActivity(myIntent);
                       System.out.println("Type "+Type);
                   }

               }
            }


            public void onLongClick(View view, int position) {
                // Toast.makeText(getApplicationContext(), book4List.get(position).getAuthor() + " is long pressed!", Toast.LENGTH_SHORT).show();

            }
        }));


        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        gridView.setLayoutManager(layoutManager);
        gridViewAdapter6 = new GridViewAdapter(HomeActivity.this, operatingSystems);
        gridView.setAdapter(gridViewAdapter6);
    }

    private void setMyApplicationData() {

        operatingSystems = new ArrayList<>();
        operatingSystems.add(new RecyclerViewItem(R.drawable.desent, "Descent"));
        operatingSystems.add(new RecyclerViewItem(R.drawable.overview, "Overview"));
        operatingSystems.add(new RecyclerViewItem(R.drawable.symptoms, "Symptoms"));
        operatingSystems.add(new RecyclerViewItem(R.drawable.prevention, "Prevention"));
        operatingSystems.add(new RecyclerViewItem(R.drawable.treatment, "Treatment"));
        operatingSystems.add(new RecyclerViewItem(R.drawable.statistic, "Statistic"));
       // operatingSystems.add(new RecyclerViewItem(R.drawable.advice, "Advice"));
        operatingSystems.add(new RecyclerViewItem(R.drawable.question, "Question & Answer"));
    }
}
