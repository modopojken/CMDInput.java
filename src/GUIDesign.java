import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDesign {
    private JButton button1;
    private JButton button2;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JPanel h1234;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIDesign");
        frame.setContentPane(new GUIDesign().h1234);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public GUIDesign() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Nu tryckte du på button1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You did the big press on button2");
            }
        });
    }
}
