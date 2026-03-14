package calc;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    public GUI() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel display = new JLabel("0", SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 30));
        display.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        display.setOpaque(true);
        display.setBackground(Color.WHITE);

        Situation situation = new Situation(display);

        JPanel canvas = new JPanel(new GridBagLayout());
        JPanel keyPad = new JPanel(new GridLayout(4,4));
        
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        canvas.add(display,gbc);

        gbc.gridy = 1;
        canvas.add(keyPad, gbc);

        this.setContentPane(canvas);

        this.pack();
        this.setVisible(true);
    }

}
