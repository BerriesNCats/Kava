package Callback;

import Syntax.Syntax;

public class Callback {
  protected final CallbackType callbackType;
  protected String body;

  public Callback(CallbackType type, String body) {
    this.callbackType = type;
    this.body = body;
  }

  //TODO: Turn body into a List and loop through to create String
  //TODO: Override for UI Control for taking in a variable
 @Override
  public String toString() {
    return Syntax.ON
        + " "
        + callbackType.toString()
        + "\n"
        + body
        + "\n"
        + Syntax.END + " " + Syntax.ON;
  }
}
