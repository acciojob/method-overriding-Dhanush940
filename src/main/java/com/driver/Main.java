package com.driver;



public class Main {
    static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }

    static class B extends A
    {
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.meth());
        obj=new B();
        System.out.println(obj.meth());
    }
}