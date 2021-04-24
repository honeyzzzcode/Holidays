import com.sun.codemodel.internal.JOp;

import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {

        Holidays holidays = new Holidays();
        String[] months = {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(false);
        frame.setSize(300, 300);
        ImageIcon icon = new ImageIcon("welcome.jpeg");
        boolean x = true;
        do {
            String userChoice = (String) JOptionPane.showInputDialog(
                    frame,
                    "Choose the month to see holidays:",
                    "HOLIDAY TRACKER",
                    JOptionPane.WARNING_MESSAGE,
                    icon,
                    months,
                    months[0]
            );
            switch (userChoice) {
                case "January":
                    ImageIcon icon1 = new ImageIcon("january.jpeg");
                    JOptionPane.showMessageDialog(
                            frame,
                            "Here are holidays for " + userChoice + "  \n" + holidays.january(),
                            "HOLIDAY TRACKER",
                            JOptionPane.INFORMATION_MESSAGE,
                            icon1);

                    break;
                case "February":
                    ImageIcon icon2 = new ImageIcon("february.jpeg");
                    JOptionPane.showMessageDialog(
                            frame,
                            "Here are holidays for " + userChoice + "  \n" + holidays.february(),
                            "HOLIDAY TRACKER",
                            JOptionPane.INFORMATION_MESSAGE,
                            icon2
                    );

                    break;
                case "March":
                    ImageIcon icon3 = new ImageIcon("March.jpeg");
                    JOptionPane.showMessageDialog(
                            frame,
                            "Here are holidays for " + userChoice + "  \n" + holidays.march(),
                            "HOLIDAY TRACKER",
                            JOptionPane.INFORMATION_MESSAGE,
                            icon3);

                    break;
                case "April":
                    ImageIcon icon4 = new ImageIcon("April.jpeg");
                    JOptionPane.showMessageDialog(
                            frame,
                            "Here are holidays for " + userChoice + "  \n" + holidays.april(),
                            "HOLIDAY TRACKER",
                            JOptionPane.INFORMATION_MESSAGE,
                            icon4);

                    break;
                case "May":
                    ImageIcon icon5 = new ImageIcon("May.jpeg");
                    JOptionPane.showMessageDialog(
                            frame,
                            "Here are holidays for " + userChoice + "  \n" + holidays.may(),
                            "HOLIDAY TRACKER",
                            JOptionPane.INFORMATION_MESSAGE,
                            icon5);

                    break;
                case "June":
                    ImageIcon icon6 = new ImageIcon("june.jpeg");
                    JOptionPane.showMessageDialog(
                            frame,
                            "Here are holidays for " + userChoice + "  \n" + holidays.june(),
                            "HOLIDAY TRACKER",
                            JOptionPane.INFORMATION_MESSAGE,
                            icon6);

                    break;
                case "July":
                    ImageIcon icon7 = new ImageIcon("july.png");
                    JOptionPane.showMessageDialog(
                            frame,
                            "Here are holidays for " + userChoice + "  \n" + holidays.july(),
                            "HOLIDAY TRACKER",
                            JOptionPane.INFORMATION_MESSAGE,
                            icon7);

                    break;
                case "August":
                    ImageIcon icon8 = new ImageIcon("august.png");
                    JOptionPane.showMessageDialog(
                            frame,
                            "Here are holidays for " + userChoice + "  \n" + holidays.august(),
                            "HOLIDAY TRACKER",
                            JOptionPane.INFORMATION_MESSAGE,
                            icon8);

                    break;
                case "September":
                    ImageIcon icon9 = new ImageIcon("September.jpg");
                    JOptionPane.showMessageDialog(
                            frame,
                            "Here are holidays for " + userChoice + "  \n" + holidays.september(),
                            "HOLIDAY TRACKER",
                            JOptionPane.INFORMATION_MESSAGE,
                            icon9);

                    break;

                case "October":
                    ImageIcon icon10 = new ImageIcon("october.jpeg");
                    JOptionPane.showMessageDialog(
                            frame,
                            "Here are holidays for " + userChoice + "  \n" + holidays.october(),
                            "HOLIDAY TRACKER",
                            JOptionPane.INFORMATION_MESSAGE,
                            icon10);

                    break;
                case "November":
                    ImageIcon icon11 = new ImageIcon("november.jpeg");
                    JOptionPane.showMessageDialog(
                            frame,
                            "Here are holidays for " + userChoice + "  \n" + holidays.november(),
                            "HOLIDAY TRACKER",
                            JOptionPane.INFORMATION_MESSAGE,
                            icon11);

                    break;
                case "December":
                    ImageIcon icon12 = new ImageIcon("december.jpeg");
                    JOptionPane.showMessageDialog(
                            frame,
                            "Here are holidays for " + userChoice + "  \n" + holidays.december(),
                            "HOLIDAY TRACKER",
                            JOptionPane.INFORMATION_MESSAGE,
                            icon12);

                    break;
                default:
                    System.out.println("Wrong");
            } System.out.println(userChoice);
        } while (x );



    }
}

