/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Coffee {
    // **Fields**
    private String name;
    private int size;
    
    // **Constructor**
    public Coffee(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
    // **Getter methods**
    public String getName() {
        return name;
    }
    
    public int getSize() {
        return size;
    }
    
    // **Setter method**
    public void setSize(int size) {
        this.size = size;
    }
}
