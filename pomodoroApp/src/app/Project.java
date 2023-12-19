/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package app;
import java.time.LocalTime;
/**
 *
 * @author Abdelsalam
 */

public class Project {
    String name;
    OfTime pomoTime, breakTime ;
    
    void addToPomo(int mintues){
        
        int countH = 0 , countD = 0 ;

          countH = mintues/60 ;
        
         countD = countH/24;
         pomoTime.days = countD ;
         pomoTime.hours = countH - countD*24;
         pomoTime.minutes = mintues - countH*60; 
        
    }
    
        void addToBreak(int mintues){
        
        int countH = 0 , countD = 0 ;

          countH = mintues/60 ;
        
         countD = countH/24;
         breakTime.days = countD ;
         breakTime.hours = countH - countD*24;
         breakTime.minutes = mintues - countH*60; 
        
    }
    
}
