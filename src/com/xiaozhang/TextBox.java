package com.xiaozhang;

public class TextBox extends UIControl {
    private String text; // Field

//    public TextBox() {
//        super(true);
//        System.out.println("TextBox");
//    }


    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString(){
       return text;
    }

    public void setText(String text) {
        this.text = text; // inheritance
    }

    public void clear() {
        text = "";
    }
}
