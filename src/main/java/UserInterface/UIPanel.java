package UserInterface;

/**
 * A panel is a control that can contain one or multiple controls. Unlike the rest of the UI control
 * types, panels don’t have size. They are very useful for grouping controls that are meant to be
 * handled together, then one can simultaneously modify the $CONTROL_PAR_HIDE, $CONTROL_PAR_POS_X,
 * $CONTROL_PAR_POS_Yor $CONTROL_PAR_Z_LAYER properties of all the controls contained in that panel.
 * The position of a contained control is relative to the panel’s position. This means that the
 * control’s (0,0) position is the current (x,y) position of the panel. Panels can be nested, so
 * they can contain other panels. If panelA is contained in panelB, then panelA will appear in front
 * of panelB. This is because children panels have a higher Z-layer value than their parent panels.
 * One could use this logic to easily create hierarchies in a performance view.
 */
public class UIPanel extends UIElement {
  private static final String UI_PANEL = "ui_panel";


  public UIPanel(String name) {
    super(name);
  }
}
