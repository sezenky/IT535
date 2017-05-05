package edu.sabanciuniv.newsstarterapp.model;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sezenky on 2017-05-01.
 */

public class category {

    private String category;

    public static void setAdapter(ArrayAdapter<Categories> adapter) {
        category.adapter = adapter;
    }

    public static void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        category.onItemSelectedListener = onItemSelectedListener;
    }


    public void getCategory(String category) {

        this.category = category;
    }



    public static String getCategory(){

        category All = new category();
        category Economics = new category();
        category Sports = new category();
        category Politics = new category();


        List<category> Categories = new ArrayList<>();
        Categories.add(All);
        Categories.add(Economics);
        Categories.add(Sports);
        Categories.add(Politics);


        return category;

    }
    @Override
    public String toString() {
        return category;
    }



}
