package main.persistence;

// Represents a reader that reads user from JSON data stored in file

import main.model.User;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JsonReader {
    private String source;

    // EFFECTS: constructs reader to read from source file
    public JsonReader(String source) {
        this.source = source;
    }

    // EFFECTS: reads source file as string and returns it
    private String readFile(String source) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(source), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s));
        }

        return contentBuilder.toString();
    }


    // EFFECTS: reads user from file and returns it;
    // throws IOException if an error occurs reading data from file
    /*public User readUser() throws IOException {
        String jsonData = readFile(source);
        JSONObject jsonObject = new JSONObject(jsonData);
        return parseUser(jsonObject);
    }*/

    // EFFECTS: reads user list from file and returns it;
    // throws IOException if an error occurs reading data from file
    public List<User> readAccountList() throws IOException {
        List<User> accountList = new ArrayList<>();
        String jsonData = readFile(source);
        JSONObject jsonObject = new JSONObject(jsonData);

        JSONArray jsonArray = jsonObject.getJSONArray("users");
        for (Object json : jsonArray) {
            JSONObject nextUser = (JSONObject) json;
            accountList.add(parseUser(nextUser));
        }

        return accountList;
    }


    // EFFECTS: parses user from JSON object and returns it
    private User parseUser(JSONObject jsonObject) {
        String name = jsonObject.getString("userName");
        String uuid = jsonObject.getString("uuid");



        User user = new User(name);
        addAssetsToPortfolio(user, jsonObject);
        return user;

        //User(String userName, UUID uuid, Image profilePicture, Portfolio portfolio, WatchList watchList)
    }

    // MODIFIES: user
    // EFFECTS: parses companies from JSON object and adds them to user
    private void addAssetsToPortfolio(User user, JSONObject jsonObject) {
        JSONArray jsonArray = jsonObject.getJSONArray("portfolio");
        for (Object json : jsonArray) {
            JSONObject nextCompany = (JSONObject) json;
            addAsset(user, nextCompany);
        }
    }

    // MODIFIES: user
    // EFFECTS: parses company from JSON object and adds it to user
    private void addAsset(User user, JSONObject jsonObject) {
        String symbol = jsonObject.getString("symbol");
        String name = jsonObject.getString("name");
        String sector = jsonObject.getString("sector");
        String industry = jsonObject.getString("industry");
        String city = jsonObject.getString("city");
        String state = jsonObject.getString("state");
        String country = jsonObject.getString("country");
        int employees = jsonObject.getInt("employees");
        float sharePrice = jsonObject.getFloat("sharePrice");
        double marketCap = jsonObject.getDouble("marketCap");
        double earningsBefore = jsonObject.getDouble("earningsBefore");
        float revGrowth = jsonObject.getFloat("revGrowth");

        /*Company company = new Company(symbol, name, sector,
                industry,
                city,
                state,
                country,
                employees,
                sharePrice,
                marketCap,
                earningsBefore,
                revGrowth);
        user.addToPortfolio(company);*/
    }
}
