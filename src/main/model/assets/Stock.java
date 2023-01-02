package main.model.assets;

public class Stock extends Asset {
    private float close;
    private float high;
    private float low;
    private float open;
    private long volume;

    public Stock(float close, float high, float low, float open, long volume) {
        super();
        this.close = close;
        this.high = high;
        this.low = low;
        this.open = open;
        this.volume = volume;

    }
}
