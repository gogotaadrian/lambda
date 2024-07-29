package ex19dventuregame;

public class Main {

    public static void main(String[] args) {
        //19. Java Adventure Game Challenge:
        //You are tasked with creating a basic text-based adventure game in
        // which the player can navigate through various locations.
        //
        //Specifications:
        //
        //The game will consist of multiple locations, each having a unique
        // identifier and a description.
        //Each location can have exits leading to other locations.
        //The program should print the current location's description and
        // available exits.
        //Players should be able to move between locations by specifying a direction.
        //The player should be able to type commands such as "Go West",
        // "run South", or just "East", and the program should move to the
        // appropriate location if there is one.
        //If a player attempts to move in an invalid direction, the program
        // should print a message indicating this and remain in the current location.
        //For ease of play, single letter commands like "N", "W", "S", "E", "Q"
        // should still be valid commands for navigating and quitting.
        //There should be a vocabulary map that associates full words like
        // "NORTH", "WEST", "SOUTH", "EAST", "QUIT" to their respective
        // single-letter commands.
        //Players can use multiple words in their command. The program should
        // recognize the valid direction from the command.
        //The game continues until the player reaches the location with ID 0,
        // which will end the game.
        //Implementation Details:
        //
        //Use the Main class for game logic.
        //Use the Location class to define locations. Each location should store
        // its ID, a description, and a map of exits (where the key is
        // the direction of exit and the value is the location id of the exit).
        // Every location automatically has a "Q" exit, leading to location ID 0.
        //The game starts with the player in the location with ID 1.
        //If a player's input has multiple words, split the input and check
        // the vocabulary map to translate full words to their respective
        // single-letter commands. The vocabulary map is a map with entries like this
        // : "SOUTH"="S", "NORTH"="N", etc.
        //Example of a game session:
        //
        //You are standing at the end of a road before a small brick building.
        //Available exits are W, E, S, N.
        //
        //> Go West
        //
        //You are at the top of a hill.
        //Available exits are N.
        //
        //> N
        //
        //You are in the forest.
        //Available exits are S, W.
        //
        //> run South
        //
        //You are standing at the end of a road before a small brick building.
        //Available exits are W, E, S, N.
        //
        //> East
        //
        //You are inside a building, a well house for a small spring.
        //Available exits are W.
        //
        //> Q
        //
        //You are sitting in front of a computer learning Java.
        //In this session, the player starts at the road (location 1) and chooses to go west to the hill (location 2). From the hill, they proceed north to the forest (location 5). Deciding to head south, they return to the road. Curious about what lies to the east, they explore the building (location 3). Finally, they decide to quit the game, ending up "sitting in front of a computer learning Java."

    }
}

