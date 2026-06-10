package Stringsss;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "siva";
        System.out.println(name.charAt(0));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());

        System.out.println(name.indexOf('a'));

        String name2 = "siva kumar allu iam";
        System.out.println(Arrays.toString(name2.split(" ")));
    }
}
