import java.awt.*;
import java.awt.event.*;

public class pgm8_mouse extends Frame implements MouseListener
{  
  Label L;
  pgm8_mouse()
  {
    addMouseListener(this);
    L=new Label();
    L.setBounds(20,50,100,20);
    add(L);
    setTitle("Mouse Handling Events");
    setSize(300,300);
    setLayout(null);
    setVisible(true);

    addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent we)
      {
        dispose();
      }
    });
  }
 
  public void mouseClicked(MouseEvent e)
  {
    L.setText("Mouse Clicked");
  }

  public void mouseEntered(MouseEvent e)
  {
    L.setText("Mouse Entered");
  }

  public void mouseExited(MouseEvent e)
  {
    L.setText("Mouse Exited");
  }

  public void mousePressed(MouseEvent e)
  {
    L.setText("Mouse Pressed");
  }

  public void mouseReleased(MouseEvent e)
  {
    L.setText("Mouse Released");
  }

  public static void main(String[] args)
  {
    new pgm8_mouse();
  }
}

    