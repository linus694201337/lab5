package calc;
import javax.swing.JLabel;

 class Situation {
    State state = State.Input1;
    JLabel display;
    BinOpButton binaryOpeator;
    int leftOperand;

    Situation(JLabel display) {
        this.display = display;
    }
}
