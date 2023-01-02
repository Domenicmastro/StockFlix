package model.assets;

import java.sql.Time;
import java.util.Date;

public class PurchasedStock extends Stock {
    public class PurchasedCompany {
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

}
