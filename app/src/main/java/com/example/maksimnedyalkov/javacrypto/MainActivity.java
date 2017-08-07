package com.example.maksimnedyalkov.javacrypto;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ExpandableListView listView;
private ExpandableListAdapter listAdapter;
private List<String> listDataHeader;
private HashMap<String,List<String>> listHash;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ExpandableListView)findViewById(R.id.listExp);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Bitcoin");
        listDataHeader.add("XEM");
        listDataHeader.add("Ethereum");
        listDataHeader.add("Dash");
        List<String> Bitcoin = new ArrayList<>();
        Bitcoin.add("Buy / Sell");

        List<String> XEM = new ArrayList<>();
        XEM.add("Buy / Sell");

        List<String> Ethereum = new ArrayList<>();
        Ethereum.add("Buy / Sell");

        List<String> Dash = new ArrayList<>();
        Dash.add("Buy / Sell");
listHash.put(listDataHeader.get(0),Bitcoin);
        listHash.put(listDataHeader.get(1),XEM);
        listHash.put(listDataHeader.get(2),Ethereum);
        listHash.put(listDataHeader.get(3),Dash);
    }
}
