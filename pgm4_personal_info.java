import java.awt.*;
import java.applet.*;

/*<applet code="pgm4_personal_info" width=250 height=150></applet>*/

public class pgm4_personal_info extends Applet
{
  public void init()
  {
    setBackground(Color.cyan);
  }
  public void paint(Graphics g)
  {
    g.drawString("Name:Bharath",6,50);
    g.drawString("Age:22",6,70);
    g.drawString("Address:Bangalore",6,90);
    g.drawString("Course:MCA",6,110);
  }
}