/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Abdelsalam
 */
import java.io.Serializable;
public class OfTime implements Serializable {
    private static final long serialVersionUID = 1342423543566243L;
    int hours = 0 , minutes = 0, days = 0 ;
    OfTime(int d, int h, int m){
        this.hours = h;
        this.minutes = m;
        this.days = d;
        
    
    }
}
