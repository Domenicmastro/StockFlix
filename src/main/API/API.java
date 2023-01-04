package main.API;

import main.model.assets.Ticker;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static main.API.APIKey.APIKey.APIkey;

public class API {

    public static List<Ticker> queryAllStockTickers() {
        List<Ticker> tickerList = new ArrayList<>();
        try {
            JSONObject json = new JSONObject(IOUtils.toString(new URL("https://api.polygon.io/v3/reference/tickers?market=stocks&active=true&apiKey=" + APIkey),
                    Charset.forName("UTF-8")));

            JSONArray jsonArray = json.getJSONArray("results");

            for (Object ticker : jsonArray) {
                JSONObject nextTicker = (JSONObject) ticker;
                tickerList.add(new Ticker(nextTicker.getString("ticker"),
                        nextTicker.getString("name")));
            }
        } catch (Exception e) {
            // something
        }
        return tickerList;
    }

    public static JSONObject queryTicker(String ticker) {
        return null;
    }
}
