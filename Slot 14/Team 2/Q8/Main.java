/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet to store participants
        HashSet<Participant> participants = new HashSet<>();

        // Add sample participants to the set
        participants.add(new Participant(1, "Alice Johnson", "alice@example.com"));
        participants.add(new Participant(2, "Bob Smith", "bob@example.com"));
        participants.add(new Participant(3, "Charlie Brown", "charlie@example.com"));
        participants.add(new Participant(4, "Diana Prince", "diana@example.com"));
        participants.add(new Participant(2, "Bob Smith", "bob@example.com")); // Duplicate

        // Print all participants
        System.out.println("Registered Participants:");
        for (Participant participant : participants) {
            System.out.println(participant);
        }

        // Check if a specific participant is registered
        System.out.println("\nIs Bob Smith registered? " +
                participants.contains(new Participant(2, "Bob Smith", "bob@example.com")));

        // Remove a participant and print the updated list
        participants.remove(new Participant(2, "Bob Smith", "bob@example.com"));
        System.out.println("\nUpdated Participant List:");
        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }
}
