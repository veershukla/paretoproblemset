package com.veer.twopointerrs;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while( l<r ) {
            while(l<r && !isAlphaNumeric(s.charAt(l))){
                l++;
            }
            while( r> l && !isAlphaNumeric(s.charAt(r))){
                r--;
            }
            if( Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    private static boolean isAlphaNumeric(char c) {
        if (c >= 'a' && c <= 'z' ||
                c >= 'A' && c <= 'Z' ||
                c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }
}
