package com.xiaozhang;

public class Main {

    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase()); // BOX 1

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text); // Box 2

        var textBox3 = textBox1;
        textBox3.setText("Hello World");
        System.out.println(textBox1.text); // Hello World
    }
}
