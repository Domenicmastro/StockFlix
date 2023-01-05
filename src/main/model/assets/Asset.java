package main.model.assets;

import java.sql.Time;
import java.util.Date;

public class Asset implements Tradable {

    private String ticker;
    private String name;
    private Date purchaseDate;
    private Time purchaseTime;
    private float purchasePrice;

    public Asset(String ticker, String name) {
        this.ticker = ticker;
        this.name = name;
    }


}
