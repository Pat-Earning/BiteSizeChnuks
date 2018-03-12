package BiteSizeChunks.ClockHands;

import java.time.*;

public class ClockhandsDemo {
    
  public static void main(){    
    Double hourHand;
    Double minuteHand;    
    
    LocalTime time = LocalTime.parse("10:15:30");
    
    //hourHand = ClockHands.HourHandAngle(time);
    minuteHand = ClockHands.MinuteHandAngle(time);
    
    System.out.println(minuteHand);
  }
}
