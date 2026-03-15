package calc;

import java.util.function.IntBinaryOperator;
import java.awt.Color;

class BinOpButton extends CalculatorButton {

    private IntBinaryOperator operator;
    
    BinOpButton(String text, Situation situation, IntBinaryOperator operator) {
        super(text, situation);
        this.operator = operator;
    }

    int applyAsInt(int first, int second) {
        return operator.applyAsInt(first, second);
    }

    @Override
    void transition() {
        switch (situation.state) {
            case Input1:
                situation.leftOperand = Integer.parseInt(situation.display.getText());
                situation.binaryOperator = this;
                setBorderColor(Color.RED);
                situation.state = State.OpReady;
                break;

            case OpReady:
                situation.binaryOperator.setBorderColor(Color.BLACK);
                situation.binaryOperator = this;
                setBorderColor(Color.RED);
                break;

            case Input2:
                break;

            case HasResult:
                situation.binaryOperator.setBorderColor(Color.LIGHT_GRAY);
                situation.leftOperand = Integer.parseInt(situation.display.getText());
                situation.binaryOperator = this;
                setBorderColor(Color.RED);
                situation.state = State.OpReady;
                break;
        }
    }
}