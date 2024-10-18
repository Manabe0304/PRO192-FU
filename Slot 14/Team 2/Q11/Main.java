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
        // Create a TreeSet to store members
        TreeSet<Member> members = new TreeSet<>();

        // Add sample members to the set
        members.add(new Member(1, "Alice", "Regular"));
        members.add(new Member(2, "Bob", "Premium"));
        members.add(new Member(3, "Charlie", "Regular"));
        members.add(new Member(4, "Diana", "Premium"));
        members.add(new Member(5, "Eve", "Regular"));

        // Print all members in the set
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println(member);
        }

        // Check if a specific member exists
        System.out.println("\nIs 'Charlie' a member? " +
                members.contains(new Member(3, "Charlie", "Regular")));

        // Remove a member and print the updated set
        members.remove(new Member(3, "Charlie", "Regular"));
        System.out.println("\nUpdated Member List:");
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
