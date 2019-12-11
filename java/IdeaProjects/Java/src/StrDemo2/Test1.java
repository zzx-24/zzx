package StrDemo2;

import java.io.UnsupportedEncodingException;

/*1.将 byte [] by={65,67,68,97,98,101}  转换成字符串输出
        将上诉字节数组  从指定的位置开始到结束转换成字符串输出
        2.同样的自定义一个字符数组用字符串的方式输出
        3."abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写
        4."我是你的谁,我是你的剑" 判断是否包含 "剑"
        5.第四题字符串判断是否以"我开头",判断是否以"剑"结尾
        6.String   str=""和 String  str2=null; 判断他们是否为空
        7.找到此字符串"我是你的小宝贝"的 "我" 进行输出
        8.找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置
        9.找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找  第一次出现的"你"
        10."我是你的谁,我是你的剑"  从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串
        11." 我是你的谁,我是你的剑 " 去除字符串左右空格
        12. "我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"
        13."我是你的谁,我是你的剑"  替换该字符串的所有的 "你" 改为 "哈"
        14. 比较 "avabc" 和 "avab" 字符串
        15. 将字符数组转换成 字符串输出
        16. 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组

        */
//1.将 byte [] by={65,67,68,97,98,101}  转换成字符串输出
       // 将上诉字节数组  从指定的位置开始到结束转换成字符串输出
public class Test1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] by = {65, 67, 68, 97, 98, 101};
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<by.length;i++){
            sb.append(by[i]);
        }
        System.out.println(sb.toString());
        //2.同样的自定义一个字符数组用字符串的方式输出
        char[] c = {'a','b','t','y','o'};
        String string1 = new String(c);
        String string2 = String.valueOf(c);
        System.out.println(string1);
        System.out.println(string2==string1);
       // 3."abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写
        String s1 = "abc";
        String s2 = "ABC";
        System.out.println(s1.equalsIgnoreCase(s2));
        //4."我是你的谁,我是你的剑" 判断是否包含 "剑"
        System.out.println(s1.contains("a"));
        //        5.第四题字符串判断是否以"我开头",判断是否以"剑"结尾
        String s3 = "我是你的谁,我是你的剑";
        System.out.println(s3.startsWith("我"));
        //6.String   str=""和 String  str2=null; 判断他们是否为空
        String str ="";
        System.out.println(str.isEmpty());
        //String str2 = null;
        //System.out.println(str2.isEmpty());
       // 7.找到此字符串"我是你的小宝贝"的 "我" 进行输出
        //10."我是你的谁,我是你的剑"  从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串
        //11." 我是你的谁,我是你的剑 " 去除字符串左右空格
        //12. "我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"
        String str3 = "我是你的谁,我是你的剑";
        System.out.println(str3.charAt(str3.indexOf("我")));
        //8.找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置
        System.out.println(str3.indexOf("你"));
        //9.找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找  第一次出现的"你"
        System.out.println(str3.lastIndexOf("你"));
        //10."我是你的谁,我是你的剑"  从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串
        System.out.println(str3.substring(2,8));
        //11." 我是你的谁,我是你的剑 " 去除字符串左右空格
        String str4 = " 我是你的谁,我是你的剑 ";
        System.out.println(str4.trim());
        //12. "我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"
        System.out.println(str3.replace("谁","被子"));
        //13."我是你的谁,我是你的剑"  替换该字符串的所有的 "你" 改为 "哈"
        System.out.println(str3.replaceAll("你","哈"));
        //14. 比较 "avabc" 和 "avab" 字符串
        String str1 = "avabavabc";
        String str2 = "avab";
        System.out.println("为什么是："+str1.compareTo(str2));
        //15. 将字符数组转换成 字符串输出
        String[] str5 = {"abc","cbd","efg"};
        StringBuffer sb1 = new StringBuffer();
        for(int i =0;i<str5.length;i++){
            sb1.append(str5[i]);
        }
        System.out.println(sb1.toString());
        //16. 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组
        String s8 = "你好";
        byte[] by1 = {12,56,78,90};
        String s = new String(by1,"UTF-8");
        byte[] by2 = s.getBytes("UTF-8");
    }
}

