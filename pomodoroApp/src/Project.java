/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.Serializable;
import java.time.LocalTime;
/**
 *
 * @author Abdelsalam
 */

public class Project implements Serializable {
    String name;
    OfTime pomoTime = new OfTime(0,0,0);
            
     OfTime    breakTime = new OfTime(0,0,0) ;
      private static final long serialVersionUID = 13421254356243L;
    
    String getPomoTime(){
         
        String all = String.format("days : %s , hours : %s , minutes : %s " , pomoTime.days,pomoTime.hours,pomoTime.minutes);
        return all;
    }
        String getBreakTime(){
         
        String all = String.format("days : %s , hours : %s , minutes : %s " , breakTime.days,breakTime.hours,breakTime.minutes);
        return all;
    }
        String getTotalTime(){
               String all = String.format("days : %s , hours : %s , minutes : %s " , breakTime.days + pomoTime.days,breakTime.hours + pomoTime.hours,pomoTime.minutes+breakTime.minutes);
        return all;
        }
    
    void addToPomo(int mintues){
        
        int countH = 0 , countD = 0 ;

          countH = mintues/60 ;
        
         countD = countH/24;
         pomoTime.days += countD ;
         pomoTime.hours += countH - countD*24;
         pomoTime.minutes += mintues - countH*60; 
        
    }
    
        void addToBreak(int mintues){
        
        int countH = 0 , countD = 0 ;

          countH = mintues/60 ;
        
         countD = countH/24;
         breakTime.days += countD ;
         breakTime.hours += countH - countD*24;
         breakTime.minutes += mintues - countH*60; 
        
    }
    
}
