package DataStructure.exercise.double_pointer;

import java.util.Arrays;

/**
 * 给定字符串，将其中的每个单词进行翻转
 */
public class Test06 {

    public static void main(String[] args) {
        String s = "hello world ni hao shi jie";

        String s1 = functionOne(s);
//        char[] a = {'a','b','c'};
//        flip(a,0,a.length-1);
//        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        String s2 = functionTwo(s);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }

    //方法一
    public static String functionOne(String s){
        StringBuffer stringBuffer = new StringBuffer();
        int n = s.length();
        int i = 0;
        while (i < n){
            //定义开始指针
            int start = i;
            //遇到空格停  之前的就是一个单词
            while(i < n&& s.charAt(i) !=' '){
                i++;
            }
            //翻转
            for ( int p = i - 1; p >= start ;p--){
                stringBuffer.append(s.charAt(p));
            }
            //是否加空格
            if (i < n &&s.charAt(i) == ' '){
                stringBuffer.append(' ');
            }
            i++;
        }
        return stringBuffer.toString();
    }

    //方法二
    public static String functionTwo(String s){
        char[] chars = s.toCharArray();
        int i = 0;
        int length = chars.length;
        while (i < length){
            int start = i;
            while (i < length && chars[i] != ' '){
                i++;
            }
            //翻转一个单词
            flip(chars,start,i-1);
            //i 指向下一个单词头部
            i++;
        }
        return new String(chars);
    }

    //部分翻转

    public static void flip(char[] str,int left,int right){
        int n = str.length;
        while(left < right){
            char a = str[left];
            str[left] = str[right];
            str[right] = a;
            left++;
            right--;
        }
    }
}
