package UserInterface;

import Syntax.Syntax;

public class UITable extends UIElement {
  private static final String UI_TABLE = "ui_table";
  private static final String SET_TEXT = "set_text";

  private String text;
  private int widthInGridUnits;
  private int heightInGridUnits;
  private int range;
  private int size;

  public UITable(String name, String text, int size, int widthInGridUnits, int heightInGridUnits, int range) {
    super(name);
    this.text = text;
    this.widthInGridUnits = widthInGridUnits;
    this.heightInGridUnits = heightInGridUnits;
    this.range = range;
    this.size = size;
  }

  public String toString() {
    return Syntax.DECLARE + " "
        + UI_TABLE + " "
        + name + " ["
        + size + "] ("
        + widthInGridUnits + ", "
        + heightInGridUnits + ", "
        + range + ")\n";
  }

}

