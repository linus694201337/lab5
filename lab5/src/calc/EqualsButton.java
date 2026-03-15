package calc;

import java.awt.Color;

class EqualsButton extends CalculatorButton {

    EqualsButton(Situation situation) {
        super("=", situation);
    }

    @Override
    void transition() {
        switch (situation.state) {
            case Input2:
                int rightOperand = Integer.parseInt(situation.display.getText());

                int result = situation.binaryOperator.applyAsInt(situation.leftOperand, rightOperand);

                situation.display.setText(String.valueOf(result));

                situation.binaryOperator.setBorderColor(Color.BLACK);

                situation.state = State.HasResult;
                break;
        
            default:
                break;
        }
    }
}