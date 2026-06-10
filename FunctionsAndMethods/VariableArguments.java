package FunctionsAndMethods;

import java.util.*;

public class VariableArguments {
    public static void main(String[] args) {
        fun();
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
        demo("67","89","35");
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}

