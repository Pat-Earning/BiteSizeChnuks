package BiteSizeChunks.ClockHands;

import java.time.*;

public class ClockHands {
    
     public static double MinuteHandAngle(LocalTime time){
         Integer minute = time.getMinute();
         return (double) minute / 30 * Math.PI;  
     }

}
