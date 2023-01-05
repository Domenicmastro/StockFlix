package main;

import main.model.assets.DetailedTicker;
import main.model.assets.Ticker;

import java.util.ArrayList;
import java.util.List;

import static main.API.API.queryTicker;
import static main.persistence.CSVReader.createTickerList;

public class Main {
    public static void main(String[] args) {
        // load user list

        // load ticker data
        List<Ticker> nasdaq = createTickerList("data/nasdaq-listed-symbols.csv");
        List<Ticker> nyse = createTickerList("data/nyse-listed.csv");

        List<Ticker> merged = new ArrayList<>();
        merged.addAll(nasdaq);
        merged.addAll(nyse);

        DetailedTicker test = queryTicker("AAPL");

        //new LoginPage();
    }
}
