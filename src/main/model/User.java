package main.model;

import main.model.assets.Portfolio;
import main.model.assets.WatchList;
import main.persistence.Writable;
import org.json.JSONObject;

import java.awt.*;
import java.util.UUID;



// a class representing a User
public class User implements Writable {
    private String userName;
    private UUID uuid;
    private Image profilePicture;
    private Portfolio portfolio;
    private WatchList watchList;

    public User(String userName) {
        this.userName = userName;
        uuid = UUID.randomUUID();
        portfolio = new Portfolio();
        watchList = new WatchList();
    }

    public User(String userName, UUID uuid, Image profilePicture, Portfolio portfolio, WatchList watchList) {
        this.userName = userName;
        this.uuid = uuid;
        this.profilePicture = profilePicture;
        this.portfolio = portfolio;
        this.watchList = watchList;
    }

    public String getUserName() {
        return userName;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public WatchList getWatchList() {
        return watchList;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }
}
