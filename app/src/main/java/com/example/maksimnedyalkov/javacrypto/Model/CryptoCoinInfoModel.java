package com.example.maksimnedyalkov.javacrypto.Model;

/**
 * Created by georgievn on 8/22/17.
 */

public class CryptoCoinInfoModel {

    public String image;
    public String symbol;
    public String price;
    public String change24hour;


    // constructor
    public CryptoCoinInfoModel(String _symbol, String _image, String _price, String _change24hour){
        this.symbol = _symbol;
        this.image = _image;
        this.price = _price;
        this.change24hour = _change24hour;

    }
}
