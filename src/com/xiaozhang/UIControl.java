package com.xiaozhang;

public abstract class UIControl extends Object {
    protected boolean isEnabled = true;

//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled();
//    }

    public abstract void render(); // only declaration but no implementation

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
