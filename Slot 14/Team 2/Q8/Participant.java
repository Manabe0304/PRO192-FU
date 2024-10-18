/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Objects;

public class Participant {
    private int participantId;
    private String participantName;
    private String email;

    // Constructor
    public Participant(int participantId, String participantName, String email) {
        this.participantId = participantId;
        this.participantName = participantName;
        this.email = email;
    }

    // Getter for participantId
    public int getParticipantId() {
        return participantId;
    }

    // Getter for participantName
    public String getParticipantName() {
        return participantName;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Override toString to display participant details
    @Override
    public String toString() {
        return "Participant ID: " + participantId + ", Name: " + participantName + ", Email: " + email;
    }

    // Override equals to prevent duplicate participants
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return participantId == that.participantId;
    }

    // Override hashCode to ensure correct behavior in HashSet
    @Override
    public int hashCode() {
        return Objects.hash(participantId);
    }
}
