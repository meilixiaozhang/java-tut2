package com.xiaozhang;

public class Main {

    public static void main(String[] args) {
//      =====================TextBox========================
//        var textBox1 = new TextBox();
//        textBox1.setText("Box 1");
//        System.out.println(textBox1.text.toUpperCase()); // BOX 1
//
//        var textBox2 = new TextBox();
//        textBox2.setText("Box 2");
//        System.out.println(textBox2.text); // Box 2
//
//        var textBox3 = textBox1;
//        textBox3.setText("Hello World");
//        System.out.println(textBox1.text); // Hello World
//      =====================================================

//      ===================Employee==========================
//        var employee = new Employee(
//                50_000, 20);
//        Employee.printNumberOfEmployees();
//        int wage = employee.calculateWage(0);
//        System.out.println(wage);
//      =====================================================

//      =================MORTGAGE CALCULATOR=================
//        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
//        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
//        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
//
//        var calculator = new MortgageCalculator(principal, annualInterest, years);
//        var report = new MortgageReport(calculator);
//
//        report.printMortgage();
//        report.printPaymentSchedule();
//      =====================================================

//      =====================UI CONTROL======================
//        var control = new TextBox();
//        control.disable();
//        System.out.println(control.isEnabled());
//      -----------------------------------------------------
//        var box1 = new TextBox();
//        var box2 = box1;
//        var box3 = new TextBox();
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());
//        System.out.println(box3);
//      -----------------------------------------------------
//        var textBox = new TextBox();
//        textBox.setText("Hello hello hey 请给我舞台");
//        System.out.println(textBox);
//      -----------------------------------------------------
//        var control = new UIControl(true);
//        var textBox = new TextBox();
//        show(textBox);
//      ======================================================

//      =======================Point==========================
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello 你好我姓张");
            System.out.println(control);
        }
    }
}
