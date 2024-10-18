/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Task {
    // Fields
    private int taskId;
    private String description;
    private boolean isCompleted;

    // Constructor
    public Task(int taskId, String description, boolean isCompleted) {
        this.taskId = taskId;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    // Getter for taskId
    public int getTaskId() {
        return taskId;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Getter for isCompleted
    public boolean getIsCompleted() {
        return isCompleted;
    }

    // Setter for isCompleted
    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    // toString method to print task details
    @Override
    public String toString() {
        return "Task ID: " + taskId + ", Description: " + description + ", Completed: " + isCompleted;
    }
}
