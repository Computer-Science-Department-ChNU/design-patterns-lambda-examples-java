package ua.edu.chnu.kkn.lambda.listener;

public class Button {

    private ButtonListener buttonListener;

    public void click() {
        if (buttonListener != null) {
            buttonListener.onCLick();
        }
    }

    public void setButtonListener(ButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }
}
