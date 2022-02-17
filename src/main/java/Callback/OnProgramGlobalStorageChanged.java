package Callback;

public class OnProgramGlobalStorageChanged extends Callback{

  public OnProgramGlobalStorageChanged(String body) {
    super(CallbackType.PROGRAM_GLOBAL_STORAGE_CHANGED, body);
  }
}
