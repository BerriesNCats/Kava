package UserInterface;

import Syntax.Syntax;

public class UIKnob extends UIElement{
    private static final String UI_KNOB = "ui_knob";

    private int min;
    private int max;
    private float displayRatio;

    public UIKnob(String name, int min, int max, float displayRatio) {
        super(name);
        this.min = min;
        this.max = max;
        this.displayRatio = displayRatio;
    }

    @Override
    public String toString() {
        return Syntax.DECLARE + " "
            + UI_KNOB + " "
            + name + " ("
            + min + ", "
            + max + ", "
            + displayRatio + ")\n";
    }

}
