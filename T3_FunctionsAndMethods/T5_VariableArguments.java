package T3_FunctionsAndMethods;

import java.util.*;

public class T5_VariableArguments {
    public static void main(String[] args) {
        fun(10 , 20, 30, 40, 50);
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

