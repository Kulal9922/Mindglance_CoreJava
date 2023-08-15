/*<html>
<applet code = "lifeCycle.class", 
height=300 width=300>
</applet>
</html>*/
 
import java.awt.*;
import java.applet.*;
public class lifeCycle extends Applet  
 {
  public void init()
   {
    System.out.println("In init");
   }
    public void start()
   {
    System.out.println("In start");
   }
    public void stop()
   {
    System.out.println("In stop");
   }
   public void paint(Graphics g)
   {
    System.out.println("In paint");
   }
   public void destroy()
   {
    System.out.println("In destroy");
   }
} 