package Callback;

public class OnPersistenceChanged extends Callback{

  public OnPersistenceChanged(String body) {
    super(CallbackType.PERSISTENCE_CHANGED, body);
  }
}
