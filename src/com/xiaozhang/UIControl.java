package com.xiaozhang;

public class UIControl extends Object {
    protected boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled();
        System.out.println("UI Control");
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
