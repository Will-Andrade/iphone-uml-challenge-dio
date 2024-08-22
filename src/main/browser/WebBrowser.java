package main.browser;

import java.util.List;

public class WebBrowser {
  private List<Tab> openTabs;
  
  public Tab openTab() {
    return new Tab();
  }
  
  public Tab updateTab(Tab tab) {
    return tab;
  }
  
  public void closeTab(Tab tab) {
  }
  
  public void setBrowserView(String viewMode) {
  }
}
