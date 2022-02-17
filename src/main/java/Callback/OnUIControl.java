package Callback;

import Syntax.Syntax;
import Variable.Variable;

public class OnUIControl extends Callback{

  private final Variable variable;

  public OnUIControl(Variable variable, String body) {
    super(CallbackType.UI_CONTROL, body);
    this.variable = variable;
  }

  @Override
  public String toString() {
    return Syntax.ON
        + " "
        + CallbackType.UI_CONTROL
        + " ("
        + variable.getName()
        + ") \n"
        + body
        + "\n"
        + Syntax.END + " " + Syntax.ON;
  }
}
