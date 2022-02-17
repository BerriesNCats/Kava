package Callback;

public enum CallbackType {
  INIT("init"),
  NOTE("note"),
  RELEASE("release"),
  CONTROLLER("controller"),
  UI_CONTROL("ui_control"),
  REGISTERED_PARAMETER_NUMBER("rpn"),
  NON_REGISTERED_PARAMETER_NUMBER("nrpn"),
  ASYNC_COMPLETE("async_complete"),
  LISTENER("listener"),
  PERSISTENCE_CHANGED("persistence_changed"),
  PROGRAM_GLOBAL_STORAGE_CHANGED("pgs_changed"),
  POLYPHONIC_AFTERTOUCH("poly_at"),
  UI_UPDATE("ui_update");

  private final String type;

  CallbackType(String type) {
    this.type = type;
  }

  @Override
  public String toString() { return this.type; }
}
