package com.xiaozhang;

//final classes cannot be extended
public final class CheckBox extends UIControl{
    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }
}

