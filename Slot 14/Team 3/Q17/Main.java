/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create a TreeSet to store participants
        TreeSet<Participant> participants = new TreeSet<>();

        // Add sample participants to the set
        participants.add(new Participant(1, "Alice", "Java Workshop"));
        participants.add(new Participant(2, "Bob", "Python Workshop"));
        participants.add(new Participant(3, "Charlie", "Data Science Workshop"));
        participants.add(new Participant(4, "Diana", "AI Workshop"));
        participants.add(new Participant(5, "Eve", "Web Development Workshop"));

        // Print all participants
        System.out.println("Workshop Participants:");
        for (Participant participant : participants) {
            System.out.println(participant);
        }

        // Check if a specific participant is registered
        System.out.println("\nIs 'Charlie' registered? " +
                participants.contains(new Participant(3, "Charlie", "Data Science Workshop")));

        // Remove a participant and print the updated list
        participants.remove(new Participant(3, "Charlie", "Data Science Workshop"));
        System.out.println("\nUpdated Participants List:");
        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }
}
