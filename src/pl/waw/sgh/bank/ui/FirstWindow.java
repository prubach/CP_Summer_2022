package pl.waw.sgh.bank.ui;

import javax.swing.*;
import java.awt.*;

public class FirstWindow {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("My first GUI");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LayoutManager layoutManager = new FlowLayout();
        frame.setLayout(layoutManager);
        JPanel mainPanel = new JPanel();
        JTextField nameField = new JTextField(60);
        mainPanel.add(nameField);
        JButton okButton = new JButton("OK");
        mainPanel.add(okButton);
        frame.add(mainPanel);


        frame.setVisible(true);
    }
}
