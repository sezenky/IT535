package edu.sabanciuniv.newsstarterapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import edu.sabanciuniv.newsstarterapp.model.NewsItem;

/**
 * Created by Sezenky on 2017-04-30.
 */

public class newsAdp extends ArrayAdapter<newsAdp> {


    public newsAdp(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }





    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Holder1 holder =null;
        View row = convertView;

        if(row == null){

            row = ((Activity)getContext()).getLayoutInflater()
                    .inflate(R.layout.news_list_row_layout,
                            parent,false);

            holder = new Holder1(row);
            row.setTag(holder);

        }else{

            holder = (Holder1) row.getTag();


        }


        return row;



    }



    class Holder1{
        private View base;
        private TextView title;
        private TextView text ;
        private ImageView image;


        public Holder1(View base) {
            this.base = base;
        }

        public TextView getTxtOpName() {
            if(title == null){
                title = (TextView)base.findViewById(R.id.title);
            }


            return title;
        }

        public TextView getTxtOpRating() {
            if(text == null){
                text = (TextView)base.findViewById(R.id.text);
            }
            return text;
        }

        public ImageView getImgView() {

            if(image == null){
                image = (ImageView)base.findViewById(R.id.image);
            }
            return image;
        }







}
