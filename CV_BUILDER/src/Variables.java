
import java.awt.Font;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manav Ranawat
 */
public abstract class Variables {
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
                    
                

}
