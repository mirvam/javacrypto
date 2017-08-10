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
        listDataHeader.add("Monero");
        List<String> BitcoinList = new ArrayList<>();
        BitcoinList.add("Buy / Sell");

        List<String> XEMList = new ArrayList<>();
        XEMList.add("Buy / Sell");

        List<String> EthereumList = new ArrayList<>();
        EthereumList.add("Buy / Sell");

        List<String> DashList = new ArrayList<>();
        DashList.add("Buy / Sell");

        List<String> MoneroList = new ArrayList<>();
        MoneroList.add("Buy / Sell");


        listHash.put(listDataHeader.get(0),BitcoinList);
        listHash.put(listDataHeader.get(1),XEMList);
        listHash.put(listDataHeader.get(2),EthereumList);
        listHash.put(listDataHeader.get(3),DashList);
        listHash.put(listDataHeader.get(4),MoneroList);
    }
}
