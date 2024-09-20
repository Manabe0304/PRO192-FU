/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team2;

/**
 *
 * @author Asus
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Event {
    private String eventName;
    private LocalDate eventDate;
    
    public Event(String eventName, LocalDate eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }
    
    public long daysUntilEvent() {
        LocalDate currentDate = LocalDate.now();
        if (eventDate.isBefore(currentDate)) {
            return 0;
        }
        return ChronoUnit.DAYS.between(currentDate, eventDate);
    }
    
    public String getDetails() {
        return "Event: " + eventName + ", Day Until Event: " + daysUntilEvent();
    }
    
    public static void main(String[] args) {
        LocalDate eventDate = LocalDate.of(2024, 12, 25);
        Event event = new Event ("Christmas Party", eventDate);
        System.out.println(event.getDetails());
        
        LocalDate pastEventDate = LocalDate.of(2023,1, 1);
        Event pastEvent = new Event("New Year Celebration", pastEventDate);
        System.out.println(pastEvent.getDetails());
    }
}
