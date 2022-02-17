package UserInterface;

public class UIButton extends UIElement {

  private int presetValue;
  private String text;

  public UIButton(String name, int presetValue, String text) {
    super(name);
    this.presetValue = presetValue;
    this.text = text;
  }
}
