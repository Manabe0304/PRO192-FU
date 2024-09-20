/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Subscription {
    private String subscriberName;
    private LocalDate startDate;
    private LocalDate endDate;
    
    public Subscription(String subscriberName, LocalDate startDate, LocalDate endDate) {
        this.subscriberName = subscriberName;
        this.startDate = startDate;
        this.endDate = endDate;
    } 
    
    public int dayLeft() {
        LocalDate currentDate = LocalDate.now();
        if (endDate.isBefore(currentDate)) {
            return 0;
        }
        return Period.between(currentDate, endDate).getDays();
    }
    
    public String getDetails() {
        return "Subscriber: " + subscriberName + ", Days left: " + dayLeft();
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
    
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2023, 10, 1);
        LocalDate end = LocalDate.of(2024, 10, 1);
        Subscription subscription = new Subscription("John Doe", start, end);
        
        System.out.println(subscription.getDetails());
    }
}
