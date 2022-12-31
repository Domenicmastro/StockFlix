package model;

import java.sql.Time;
import java.util.Date;

// an extension of the Company class with a purchase date, time, and price for portfolios
public class PurchasedCompany extends Company {
    private Date purchaseDate;
    private Time purchaseTime;

    // split to avoid rounding errors
    private int purchasePriceDollars;
    private int purchasePriceCents;

    public PurchasedCompany(Date purchaseDate, Time purchaseTime, int purchasePriceDollars, int purchasePriceCents) {
        super();
        this.purchaseDate = purchaseDate;
        this.purchaseTime = purchaseTime;
        this.purchasePriceDollars = purchasePriceDollars;
        this.purchasePriceCents = purchasePriceCents;
    }
}
