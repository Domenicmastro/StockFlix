package main.model.assets;

import java.sql.Time;
import java.util.Date;

public class PurchasedStock extends Stock {
    private Date purchaseDate;
    private Time purchaseTime;
    private float purchasePrice;

    public PurchasedStock() {
        super();

    }

}
