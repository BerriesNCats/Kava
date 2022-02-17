package Variable;

public enum ArrayType {
  INT("%"),
  FLOAT("?"),
  STRING("!");

  private final String type;

  ArrayType(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }
}
