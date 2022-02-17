package Utils;

public class ScriptUtilities {

  public static String cleanName(String name) {
    if (name.charAt(0) != '$') {
      name = "$" + name;
    }
    return name;
  }
}
