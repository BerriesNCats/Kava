package UserInterface;

public class UISlider extends UIElement{
  private static final String UI_SLIDER = "ui_slider";

  private int min;
  private int max;

  public UISlider(String name, int min, int max) {
    super(name);
    this.min = min;
    this.max = max;
  }
}
