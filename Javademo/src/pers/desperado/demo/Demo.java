package pers.desperado.demo;

public class Demo {
    static{
        System.load("C:\\Users\\test\\Desktop\\demo\\Cdemo\\cmake-build-debug\\libCdemo.dll");
    }

    public  native  static void hello();

    public static void main(String[] args) {
        hello();
    }
}
