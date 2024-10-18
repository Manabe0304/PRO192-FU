/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Participant implements Comparable<Participant> {
    // Fields
    private int participantId;
    private String participantName;
    private String workshopTitle;

    // Constructor
    public Participant(int participantId, String participantName, String workshopTitle) {
        this.participantId = participantId;
        this.participantName = participantName;
        this.workshopTitle = workshopTitle;
    }

    // Getter for participantId
    public int getParticipantId() {
        return participantId;
    }

    // Getter for participantName
    public String getParticipantName() {
        return participantName;
    }

    // Getter for workshopTitle
    public String getWorkshopTitle() {
        return workshopTitle;
    }

    // toString method to print participant details
    @Override
    public String toString() {
        return "Participant ID: " + participantId + ", Name: " + participantName + ", Workshop: " + workshopTitle;
    }

    // compareTo method to compare participants by name
    @Override
    public int compareTo(Participant other) {
        return this.participantName.compareTo(other.participantName);
    }

    // equals method to check participant equality based on ID, name, and workshop
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Participant that = (Participant) obj;
        return participantId == that.participantId &&
               participantName.equals(that.participantName) &&
               workshopTitle.equals(that.workshopTitle);
    }

    // hashCode method for proper functioning of TreeSet
    @Override
    public int hashCode() {
        return participantName.hashCode() + workshopTitle.hashCode() + Integer.hashCode(participantId);
    }
}
