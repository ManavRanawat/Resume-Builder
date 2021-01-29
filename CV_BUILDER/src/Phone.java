
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
 * @author Jash
 */
public class Phone {
    Phone()
    {
        Font newfont=new Font("Serif",Font.PLAIN,16);
        JFrame jfrm=new JFrame("NOT COMPLETE");
        jfrm.setSize(400,150);
        jfrm.setResizable(false);
        JLabel jlabel=new JLabel("The phone number you have added is invalid \n Please enter valid 10-digit phone number ");
        jlabel.setFont(newfont);
        jfrm.add(jlabel);
        jfrm.setVisible(true);
    }
}
