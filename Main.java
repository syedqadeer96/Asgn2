package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                System.out.println("enter a string");
                String str = sc.nextLine();
                boolean result = str.matches("[0-9]+");
                System.out.println("Original String : " + str);
                System.out.println("Does string contain only Alphabets? : " + result);
            }
        }


//time complexity O(n) ,where n is length of the string
//space complexity O(n)
//As String match() method returns array of matched objects so the Space Complexity is O(n), where n is the no of matched objects.