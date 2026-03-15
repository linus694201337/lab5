package calc;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

abstract class CalculatorButton extends JButton {
    Situation situation;

    public CalculatorButton(String text, Situation situation) {
        super(text);
        this.situation = situation;

        this.setFont(new Font("Arial", Font.BOLD, 25));
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(60,60));

        this.addActionListener(e -> transition());
    }

    abstract void transition();

    void setColor(Color color) {
        this.setBackground(color);
    }

    @Override
    public String toString() {
        return this.getText();
    }

}
