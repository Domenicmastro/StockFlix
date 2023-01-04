package main;

import main.GUI.LoginPage;

import static main.persistence.CSVTickerReader.createTickerList;

public class Main {
    public static void main(String[] args) {
        // load ticker data
        //(these need to be merged)
        createTickerList("data/nasdaq-listed-symbols.csv");
        createTickerList("data/nyse-listed.csv");

        new LoginPage();
    }
}
