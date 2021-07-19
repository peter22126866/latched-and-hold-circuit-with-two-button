import java.awt.*;
import java.awt.event.*;

import javax.swing.JToggleButton;

public class App {
    public static void main(String[] args) throws Exception {
        Frame mainFrame = new Frame("眼藥水紀錄器");
        Panel panel = new Panel();
        JToggleButton button1 = new JToggleButton("紅藥水");
        button1.setBackground(Color.PINK);
        JToggleButton button2 = new JToggleButton("白藥水");
        button2.setBackground(Color.WHITE);

        mainFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        button1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                button2.setSelected(false);
                button2.setEnabled(true);
                button1.setEnabled(false);
            }
        });
        button2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                button1.setSelected(false);
                button1.setEnabled(true);
                button2.setEnabled(false);
            }
        });

        panel.add(button1);
        panel.add(button2);
        mainFrame.add(panel);
        mainFrame.setLocation(525, 350);
        mainFrame.setSize(350,150);
        mainFrame.setVisible(true);
    }
}
