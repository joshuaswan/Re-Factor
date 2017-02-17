package com.joshua.introduceExplainingVariable;

/**
 * Created by joshua on 2017/2/17.
 */
public class First {
    private String platform;
    private String browser;
    private int resize;
    private boolean init;

    public First(String platform, String browser, int resize) {
        this.platform = platform;
        this.browser = browser;
        this.resize = resize;
    }

    public boolean isOperation(){
        if ((platform.toUpperCase().indexOf("MAC")>-1) &&
                (browser.toUpperCase().indexOf("IE")> -1) &&
                wasInitialized() && resize > 0){
            return true;
        }
        else
            return false;
    }

    public void initialized(){
        init = true;
    }

    private boolean wasInitialized() {
        return init;
    }
}
