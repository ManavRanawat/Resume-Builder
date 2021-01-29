
import java.awt.Font;
import javax.swing.JButton;
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
public class Popup {
    JFrame jfrm;
    Popup()
    {
        Font newfont=new Font("Serif",Font.BOLD,18);
        jfrm=new JFrame("NOT COMPLETE");
        jfrm.setSize(600,150);
        jfrm.setResizable(false);
        JLabel jlabel=new JLabel("YOU HAVE NOT FILLED ALL THE COMPULSORY FIELDS");
        jlabel.setFont(newfont);
        jfrm.add(jlabel);
        jfrm.setVisible(true);
    }
}
