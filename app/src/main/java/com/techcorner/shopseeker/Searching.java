package com.techcorner.shopseeker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Searching extends AppCompatActivity {
    ListView lv;
    ArrayAdapter adapter;
    ArrayList<String> list;
    SearchView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);

        lv = (ListView) findViewById(R.id.list_1);
        sv = (SearchView) findViewById(R.id.search_bar);
        list = new ArrayList<String>();
        list.add("Grocery Shop1");
        list.add("Grocery Shop2");
        list.add("Grocery Shop3");
        list.add("Stationary Shop1");
        list.add("Stationary Shop2");
        list.add("Stationary Shop3");
        list.add("Convenience Shop1");
        list.add("Convenience Shop2");
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_selectable_list_item, list);
        lv.setAdapter(adapter);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

    }
}
