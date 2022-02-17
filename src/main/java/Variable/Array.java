package Variable;

import java.util.List;

public class Array<T> {

  private final ArrayType type;
  private final String name;
  private final List<T> elements;

  public Array(ArrayType type, String name, List<T> elements) {
    this.type = type;
    this.name = name;
    this.elements = elements;
  }

  public boolean addElement(T element) {
    return elements.add(element);
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type.toString();
  }
}
