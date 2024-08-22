package main.phone;

import java.io.File;
import java.util.List;

public class MobilePhone {
  private boolean hasActiveCall;
  private boolean hasActiveConference;
  private String personalPhoneNumber;
  
  public Call callSomeone(String phoneNumber) {
    return new Call();
  }
  
  public void answerCall() {
  }
  
  public void playVoiceMail(File voiceMail) {
  }
  
  public void hangUpCall(Call activeCall) {
  }
  
  public Call putCallOnHold(Call activeCall) {
    return activeCall;
  }
  
  public void switchToConferenceCall(List<Call> activeCall) {
  }
}
