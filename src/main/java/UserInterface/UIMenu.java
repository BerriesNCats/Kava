package UserInterface;

import Syntax.Syntax;
import java.util.List;

public class UIMenu extends UIElement{
  private static final String UI_MENU = "ui_menu";
  private static final String ADD_MENU_ITEM = "add_menu_item";

  private List<String> menuItems;

  public UIMenu(String name, List<String> menuItems) {
    super(name);
    this.menuItems = menuItems;
  }

  public boolean addMenuItem(String item) {
    return menuItems.add(item);
  }

  public String toString() {
    StringBuilder menuBlock = new StringBuilder();
    menuBlock
        .append(Syntax.DECLARE + " " + UI_MENU + " ")
        .append(name).append("\n");
    for (int i = 0; i < menuItems.size(); i++) {
      menuBlock
          .append(ADD_MENU_ITEM)
          .append(" (")
          .append(name)
          .append(", \"" )
          .append(menuItems.get(i))
          .append("\", ")
          .append(i)
          .append(")\n");
    }
    return menuBlock.toString();
  }
}
