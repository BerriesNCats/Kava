import Callback.Callback;
import Function.Function;
import UserInterface.UIElement;
import Variable.Variable;
import java.util.List;

public class Script {
  private String name;
  private List<Variable> scriptVariables;
  private List<Callback> scriptCallBacks;
  private List<Function> scriptFunctions;
  private List<UIElement> scriptUiElements;

  public boolean addVariable(Variable variable) {
    return scriptVariables.add(variable);
  }

  public boolean addCallback(Callback callback) {
    return scriptCallBacks.add(callback);
  }

  public boolean addFunction(Function function) {
    return scriptFunctions.add(function);
  }
}
