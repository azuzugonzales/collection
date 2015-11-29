package com.examples.conversion;

public class StringToInt {
    public static void main(String[] args) {
        String arg = "71";
        try {
            int value1 = Integer.parseInt(arg); // return int
            int value2 = Integer.valueOf(arg);  // return Integer
            int value3 = Integer.decode(arg);   // return Integer
            int value4 = new Integer(arg);  // create Integer

            System.out.println(value1);
            System.out.println(StringToInt.class.getClassLoader() + " type"+ value1);
            System.out.println(value2);
            System.out.println(value3);
            System.out.println(value4);
        } catch (NumberFormatException e) {
            System.err.println("Wrong format number " + e);
        }

        int value = 71;
        try {
            String arg1 = Integer.toString(value);
            String arg2 = String.valueOf(value);
            String arg3 = "" + value;

            System.out.println(arg1);
            System.out.println(arg2);
            System.out.println(arg3);
        } catch (NumberFormatException e) {
            System.err.println("Wrong format " + e);
        }
    }
}
