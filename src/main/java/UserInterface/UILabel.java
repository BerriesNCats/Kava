package UserInterface;

import Syntax.Syntax;

public class UILabel extends UIElement {
  private static final String UI_LABEL = "ui_label";
  private static final String SET_TEXT = "set_text";

  private String text;
  private int widthInGridUnits;
  private int heightInGridUnits;

  public UILabel(String name, String text, int widthInGridUnits, int heightInGridUnits) {
    super(name);
    this.text = text;
    this.widthInGridUnits = widthInGridUnits;
    this.heightInGridUnits = heightInGridUnits;
  }

  public String toString() {
    return Syntax.DECLARE + " "
        + UI_LABEL + " "
        + name + " ("
        + widthInGridUnits + ", "
        + heightInGridUnits + ") \n"
        + SET_TEXT + "("
        + name + ", \""
        + text + "\")\n";
  }

}
