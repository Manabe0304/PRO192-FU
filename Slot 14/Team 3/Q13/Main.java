/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store tasks
        ArrayList<Task> taskList = new ArrayList<>();

        // Add sample tasks to the list
        taskList.add(new Task(1, "Complete Java assignment", false));
        taskList.add(new Task(2, "Prepare presentation", false));
        taskList.add(new Task(3, "Attend team meeting", false));
        taskList.add(new Task(4, "Review code submissions", false));
        taskList.add(new Task(5, "Respond to emails", false));

        // Print all tasks
        System.out.println("Task List:");
        for (Task task : taskList) {
            System.out.println(task);
        }

        // Retrieve and print the task at index 3 (0-based index)
        System.out.println("\nTask at Index 3:");
        System.out.println(taskList.get(3));

        // Update the status of a task and print the updated list
        taskList.get(1).setIsCompleted(true); // Mark task 2 as completed
        System.out.println("\nUpdated Task List:");
        for (Task task : taskList) {
            System.out.println(task);
        }
    }
}
