package com.examples.extendz.supper.exampl01;

public class Sub_class extends Super_class {

    int num = 10;

    // display method of sub class
    public void display() {
        System.out.println("This is the display method of subclass");
    }

    public void my_method() {
        // Instantiating subclass
        Sub_class sub = new Sub_class();

        // Invoking the display() method of sub class
        sub.display();

        // Invoking the display() method of super class
        super.display();

        // Printing the value of variable num of sub class
        System.out.println("value of the variable named num in sub class: " + sub.num);

        // Printing the value of variable num of super class
        System.out.println("value of the variable named num in super class: " + super.num);
    }

    public static void main(String[] args) {
        Sub_class obj = new Sub_class();
        obj.my_method();
    }
}
