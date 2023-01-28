package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    /*UC1: Valid First Name
       FirstName starts with Cap and has minimum 3 characters
     */


    public static boolean validFirstName(String name) {

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    /*UC2: Valid Last Name
       LastName starts with Cap and has minimum 3 characters
     */


    public static boolean validLastName(String name) {

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    /*
    UC3:As a User need to enter a valid email
    E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
    with precise @ and . positions
     */

    public static boolean validEmail(String email) {

        String regex = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    /*UC4:As a User need to follow pre-defined
    Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number
     */

    public static boolean validMobFormat(String mobileNo ) {

        String regex = "^[0-9]{2}\\s[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    /*UC5:As a User need to follow pre-defined Password rules.
      Rule1– minimum 8 Characters - NOTE – All rules must be passed
     */

    public static boolean validPasswordRule1(String Password) {

        String regex = "^[A-Za-z0-9@]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Password);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    /*UC6:Rule2 – Should have at least 1 Upper Case - NOTE – All rules must be passed
     */

    public static boolean validPasswordRule2(String Password2) {

        String regex = "^[A-Z]{1}[a-z0-9@]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Password2);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    /*
    UC7: Rule2 – Should have at least 1 Upper Case - NOTE – All rules must be passed
     */

    public static boolean validPasswordRule3(String Password3) {

        String regex = "(?=.*[A-z])(?=.*[0-9])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Password3);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    /*UC8:Rule4 – Has exactly 1 Special Character - NOTE – All rules must be passed
     */

    public static boolean validPasswordRule4(String Password4) {

        String regex = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Password4);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;

    }
    /*
    UC9:Should clear all email samples provided separately
     */

    public static boolean validEmailSamples(String emailSample) {

        String regex = "^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailSample);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;

    }
}
