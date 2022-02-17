package Variable;

public class Variable {

  private final VariableType type;
  private final String name;
  private boolean isConst;
  private boolean isPolyphonic;

  public Variable(VariableType type, String name, boolean isConst, boolean isPolyphonic) {
    this.type = type;
    this.name = name;
    this.isConst = isConst;
    this.isPolyphonic = isPolyphonic;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type.toString();
  }
}
