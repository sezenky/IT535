package edu.sabanciuniv.newsstarterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import edu.sabanciuniv.newsstarterapp.model.category;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Categories = (Spinner)findViewById(R.id.spinnerid);

        final ArrayAdapter<category> adp
                = new ArrayAdapter<Meals>(this,
                android.R.layout.simple_spinner_item,
                category.getCategory());

        category.setAdapter(adp);

        category.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);
        final ListView lstView = (ListView)findViewById(R.id.lstOpSystem);

        newsAdp adp = new newsAdp(this,newsAdp.(adp));
        lstView.setAdapter(adp);


        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        ((newsAdp)lstView.getAdapter()
                                .getItem(position)).(),
                        Toast.LENGTH_SHORT)();
            }
        });



    }
}
