package com.janbask.training3;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*String arg = args[0];
        Object argObject = arg;
        Object argsObject = args;
        Class classArgs = args.getClass();*/
        try{
            String abc = "This!is a!test string!"; //2215
            abc+=" Welcome to!this string!"; //2734
            String[] words = abc.split("!");
            for (int i = 0; i<words.length; i++){
                System.out.println(words[i]);
            }
            Class thisType = Class.forName("com.janbask.training3.Main");
            System.out.println("The type name FQDN is:" + thisType.getName());
            Class objectClass = Class.forName("java.lang.Object");
            if(objectClass.isInstance(args)){
                Class argsClass = args.getClass();
                if(argsClass.isArray()){
                    System.out.println("It is an array object");
                }
                else
                    System.out.println("Not an Array!");
                System.out.println(objectClass.getPackage().getName());
            }
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static Object getDummy(){
        //Autoboxing
        Integer primitive = 129;
        int primitiveOrig = 1;

        //Auto unboxing
        int value = primitive;
        byte val = primitive.byteValue();
        //val = -127;
        Object[] array = new Object[2];
        array[0] = primitive;
        //Autoboxing
        array[1] = primitiveOrig;

        Vector<Integer> vector = new Vector<>();
        vector.add(primitiveOrig);
        int data = vector.get(0);
        return primitive;
    }
}
