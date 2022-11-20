/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waypoint;

/**
 *
 * @author pratyushbh
 */
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Dimension;
public class ButtonWayPoint extends JButton {
    public ButtonWayPoint(){
        this.setContentAreaFilled(true);
        this.setIcon(new ImageIcon(getClass().getResource("/icon/pin.png")));
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setSize(new Dimension(24,24));
    }
}
