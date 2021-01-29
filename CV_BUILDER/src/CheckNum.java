
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajad
 */
public class CheckNum {
                public boolean isNumeric(String str)
            {
                try
                    {
                      Double.parseDouble(str);
                      return true;
                    }
                catch(NumberFormatException e)
                    {
                      for (char c : str.toCharArray())
                            {
                                if (!Character.isDigit(c) ) return false;
                            }
                            return true;
                    }
                //return false;
            }
                
                
                void popback()
    {
        Font newfont=new Font("Serif",Font.PLAIN,16);
        JFrame jfr=new JFrame("INVALID INPUT");
        jfr.setSize(400,150);
        jfr.setResizable(false);
        JLabel jlabel=new JLabel("Percentages and CGPA should be numeric ");
        jlabel.setFont(newfont);
        jfr.add(jlabel);
        jfr.setVisible(true);
    }
}
