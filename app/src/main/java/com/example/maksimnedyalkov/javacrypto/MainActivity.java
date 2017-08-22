package com.example.maksimnedyalkov.javacrypto;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;

import com.example.maksimnedyalkov.javacrypto.Model.CryptoCoinInfoModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ExpandableListView listView;
private ExpandableListAdapter listAdapter;
private List<String> listDataHeader;
private HashMap<String,CryptoCoinInfoModel> listHash;

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
        listDataHeader.add("Ethereum");
        listDataHeader.add("XEM");
        listDataHeader.add("Monero");
        listDataHeader.add("Litecoin");

        List<String> BitcoinList = new ArrayList<>();
        BitcoinList.add("Buy / Sell");
        BitcoinList.add("bitcoin");

        List<String> EthereumList = new ArrayList<>();
        EthereumList.add("Buy / Sell");
        EthereumList.add("ethereum");

        List<String> XEMList = new ArrayList<>();
        XEMList.add("Buy / Sell");
        XEMList.add("nem");

        List<String> MoneroList = new ArrayList<>();
        MoneroList.add("Buy / Sell");
        MoneroList.add("monero");

        List<String> LitecoinList = new ArrayList<>();
        LitecoinList.add("Buy / Sell");
        LitecoinList.add("litecoin");


        CryptoCoinInfoModel bitcoinModel = new CryptoCoinInfoModel("BTC","bitcoin","4500$","2.5");
        CryptoCoinInfoModel ethereumModel = new CryptoCoinInfoModel("ETCH","ethereum","4500$","2.5");
        CryptoCoinInfoModel nemModel = new CryptoCoinInfoModel("XEM","nem","4500$","2.5");
        CryptoCoinInfoModel moneroModel = new CryptoCoinInfoModel("BTC","monero","4500$","2.5");
        CryptoCoinInfoModel litecoinModel = new CryptoCoinInfoModel("BTC","litecoin","4500$","2.5");
        listHash.put(listDataHeader.get(0),bitcoinModel);
        listHash.put(listDataHeader.get(1),ethereumModel);
        listHash.put(listDataHeader.get(2),nemModel);
        listHash.put(listDataHeader.get(3),moneroModel);
        listHash.put(listDataHeader.get(4),litecoinModel);
        //listHash.put(listDataHeader.get(0),BitcoinList);
        //listHash.put(listDataHeader.get(1),XEMList);
        //listHash.put(listDataHeader.get(2),EthereumList);
        //listHash.put(listDataHeader.get(3),LitecoinList);
        //listHash.put(listDataHeader.get(4),MoneroList);


    }
}
