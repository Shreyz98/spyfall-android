package com.spyfall.android.model;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    //TODO: Define static ArrayList<String> for list of locations
    private static final String locations [] = {"Airplane", "Bank", "Beach", "Cathedral", "Circus Tent", "Corporate Party", "Crusader Army", "Casino",
            "Day Spa", "Embassy", "Hospital", "Hotel", "Military Base", "Movie Studio", "Ocean Liner", "Passenger Train", "Pirate Ship", "Polar Station",
            "Police Station", "Restraunt", "School", "Service Station", "Submarine", "Supermarket", "Theater", "University", "World War II Squad"};
    private String code;
    private ArrayList<String> players;
    private String spy;
    private String location;
    private String firstPlayer;

    public Game() {}

    public Game(String code, String player) {
        this.code = code;
        this.players = new ArrayList<>();
        this.players.add(player);

    }

    public Game(String code, ArrayList<String> players) {
        this.code = code;
        this.players = players;
        Random random = new Random();
        this.spy = players.get(random.nextInt(players.size()));
        this.firstPlayer = players.get(random.nextInt(players.size()));
        this.location = locations[random.nextInt(locations.length)];
        //TODO: Get random item from list of locations


    }

    public Game(String code, ArrayList<String> players, String spy, String location,
                String firstPlayer) {
        this.code = code;
        this.players = players;
        this.spy = spy;
        this.location = location;
        this.firstPlayer = firstPlayer;
    }

    public String getCode() {
        return this.code;
    }

    public ArrayList<String> getPlayers() {
        return this.players;
    }

    public String getSpy() {
        return this.spy;
    }

    public String getLocation() {
        return this.location;
    }

    public String getFirstPlayer() {
        return this.firstPlayer;
    }

}
