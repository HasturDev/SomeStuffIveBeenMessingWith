package com.LecherousCthulhu.getorganized;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int v1 = 10, v2 = 4, diff;
       if(v1 > v2){
           diff = v1 - v2;
           System.out.println("v1 is bigger by");
           System.out.println(diff);
       }
       else if(v2 > v1){
           diff = v2 - v1;
           System.out.println(" v2 is bigger by");
           System.out.println(diff);
       }
       else
           System.out.println("v1 and v2 are equal");
    }
}
