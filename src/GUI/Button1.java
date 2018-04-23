package GUI;

import javax.swing.*;
import java.awt.*;

public class Button1 {
    public static void main(String[] args) {
        Button1 button1 = new Button1();
        button1.go();
    }
    public void  go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JButton button = new JButton("shock me");
        JButton button2 = new JButton("bliss");
        panel.add(button);
        panel.add(button2);
        frame.getContentPane().add(BorderLayout.EAST,panel);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
