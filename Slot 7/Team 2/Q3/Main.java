/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // Create a Player object
        Player player = new Player("John Doe", 25);
        
        // Create a FootballPlayer object
        FootballPlayer footballPlayer = new FootballPlayer("David Beckham", 38, "Midfielder");
        
        // Call displayPlayerInfo method for the player
        player.displayPlayerInfo();
        
        // Call displayPlayerInfo method for the football player
        footballPlayer.displayPlayerInfo();
    }
}
