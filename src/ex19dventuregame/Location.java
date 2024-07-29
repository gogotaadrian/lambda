package ex19dventuregame;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private String description;
    private Integer id;
    private Map<String, Integer> exits;

    public Location(String description, Integer id) {
        this.description = description;
        this.exits = new HashMap<>();
        this.id = id;
        this.exits.put("Q",0);
    }

    public void addExit (String direction, Integer destinationId){
        exits.put(direction,destinationId);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }

    public void setExits(Map<String, Integer> exits) {
        this.exits = exits;
    }
}
