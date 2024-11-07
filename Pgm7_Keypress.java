import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="Pgm7_Keypress" width=500 height=500></applet>*/

public class Pgm7_Keypress extends Applet implements KeyListener
{
  String msg=" ";
  String msg1 = "Press M or m or A or a or E or e or N or n";

  
  public void init()
  {
    addKeyListener(this);
  }
  
  
  public void keyPressed(KeyEvent ke)
  {
    int key = ke.getKeyCode();
    switch(key)
    {
      case KeyEvent.VK_M:
      msg="Good Morning";
      break;

      case KeyEvent.VK_A:
      msg="Good Afternoon";
      break;

      case KeyEvent.VK_E:
      msg="Good Evening";
      break;
 
      case KeyEvent.VK_N:
      msg="Good Night";
      break;
    }
    repaint();
  }

  public void keyReleased(KeyEvent ke)
  {
  
  }


  public void keyTyped(KeyEvent ke)
  {
    repaint();
  }

  public void paint(Graphics g)
  {
    g.setColor(Color.blue);
    g.drawString(msg,100,20);
    g.drawString(msg1,20,200);
  }
}
       