package Variable;

public enum VariableType {
  INT("$"),
  FLOAT("~"),
  STRING("@");

  private final String type;

  VariableType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return this.type;
  }
}
