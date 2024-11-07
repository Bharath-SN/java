import java.awt.*;
import java.applet.*;

/*
<applet code = "Pgm6_fact" width=300 height=150>
<param name = "number" value = "5">
</applet>
*/

public class Pgm6_fact extends Applet
{
  int number;
  int factorial;

  public void init()
  {
    setBackground(Color.cyan);
    String param = getParameter("number");
    if(param!=null)
    {
     number = Integer.parseInt(param);
     factorial = factorial(number);
    }
  }

  public void paint(Graphics g)
  {
    g.drawString("Number:"+number,20,50);
    g.drawString("Factorial:"+factorial,20,70);
  }

  private int factorial(int n)
  {
    if(n<=1)
      return 1;
    else
      return n*factorial(n-1);
  }
}