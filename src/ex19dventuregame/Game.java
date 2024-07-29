package ex19dventuregame;

import java.util.List;

public class Game {

    private List<Location> locations;

    private Location currentLocation;

    public Game(List<Location> locations, Location initialLocation) {
        this.locations = locations;
        if (locations.contains(initialLocation)) {
            this.currentLocation = initialLocation;
        }
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void move (String command) throws Exception{
        Integer nextLocationId = 0;
        //daca command exista in exit-urile locatiei curente
        if (!currentLocation.getExits().containsKey(command)) {
            throw new Exception("comanda "+ command+ " nu e posibila");
        }
        //luam valoarea de la cheia command (id-ul urmatoarei locatii)
        nextLocationId = currentLocation.getExits().get(command);
        //cautam in locations locatia cu id 2
        //locatiaCurenta devine locatia gasita
        currentLocation = getLocationById(nextLocationId);
    }

    public Location getLocationById (Integer id) throws Exception{
        for (Location location: locations){
            if (location.getId().equals(id)){
                return location;
            }
        }
        throw new Exception("location with id "+id + " not found");
    }
}

