package calc;

import java.awt.Color;

class CancelButton extends CalculatorButton {

    CancelButton(Situation situation) {
        super("C", situation);
    }

    @Override
    void transition() {
        situation.display.setText("0");
        situation.state = State.Input1;
    

        if (situation.binaryOperator != null) {
            situation.binaryOperator.setColor(Color.LIGHT_GRAY);
            situation.binaryOperator = null;
        }
    }
}
