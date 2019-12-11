package StrDemo2;

import org.w3c.dom.ls.LSOutput;

public class Test2 {
    public static void main(String[] args) {
        String str = "1125847214@qq.com";
        String reg = "^\\d{10}\\@[q]{2}\\.(com)";
        System.out.println(str.matches(reg));
    }
}
