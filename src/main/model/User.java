package main.model;

import main.model.assets.Portfolio;
import main.model.assets.WatchList;

import java.awt.*;
import java.util.UUID;



// a class representing a User
public class User {
    private String userName;
    private UUID uuid;
    private Image profilePicture;
    private Portfolio portfolio;
    private WatchList watchList;


    // Constructor for creating user from scratch
    public User(String userName) {
        this.userName = userName;
        uuid = UUID.randomUUID();
        portfolio = new Portfolio();
        watchList = new WatchList();
    }

    // Constructor for recreating user from JSON
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

}
