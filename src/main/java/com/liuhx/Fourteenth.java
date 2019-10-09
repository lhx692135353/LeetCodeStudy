package com.liuhx;

/**
 * 14. 最长公共前缀
 */
public class Fourteenth {

    public static void main(String[] args) {
        String[] s = new String[]{"flower","flow","flight"};
        System.out.print(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs) {
        
        StringBuilder a = new StringBuilder();
        if(strs.length<1) return a.toString();
        String b = strs[0];
        for (int i = 0; i < b.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i + 1) {
                    return a.toString();
                }
                if (b.charAt(i) == strs[j].charAt(i))
                    continue;
                else
                    return a.toString();
            }
            a.append(b.charAt(i));
        }
        return a.toString();
    }
}