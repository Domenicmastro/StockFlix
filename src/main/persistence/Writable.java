package main.persistence;

public interface Writable {
    // EFFECTS: returns this as JSON object
    JSONObject toJson();
}