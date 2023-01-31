package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstNameValid_shouldReturnTrue() {
        try {
            boolean result = userRegistration.validFirstName("Poonam");
            Assertions.assertTrue(result);
            System.out.println("first name is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Invalid name is invalid: "+ e);
        }
    }

    @Test
    public void givenFirstNameInvalid_shouldReturnFalse() {
        try{
        boolean result = userRegistration.validFirstName("poonam");
        Assertions.assertFalse(result);
        System.out.println("First name is valid");
    } catch(UserRegistrationException e) {
            System.out.println("First name invalid");
        }
    }

    @Test
    public void givenLastNameValid_shouldReturnTrue() {
        try {
            boolean result = userRegistration.validLastName("Desai");
            Assertions.assertTrue(result);
            System.out.println("lastname is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Last name Invalid");
        }
    }

        @Test
    public void givenLastNameInvalid_shouldReturnFalse() {
            try {
                boolean result = userRegistration.validLastName("desai");
                Assertions.assertFalse(result);
                System.out.println("Last name is Valid");
            } catch (UserRegistrationException e) {
                System.out.println("Last name Invalid: " + e);
            }
        }

    @Test
    public void givenEmailValid_shouldReturnTrue() {
        try {
            boolean result = userRegistration.validEmail("abc.xyz@bl.co.in");
            Assertions.assertTrue(result);
            System.out.println("Email is Valid");
        } catch (UserRegistrationException e) {
            System.out.println("Email is invalid: " + e);
        }
    }

    @Test
    public void givenEmailInvalid_shouldReturnFalse() {
        try {
            boolean result = userRegistration.validEmail("loharpoonam98@gmail.com");
            Assertions.assertFalse(result);
            System.out.println("Email is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Email is invalid: " + e);
        }
    }

    @Test
    public void givenMobileNoValid_shouldReturnTrue() {
        try {
            boolean result = userRegistration.validMobFormat("91 9876567890");
            Assertions.assertTrue(result);
            System.out.println("Mob No. is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Mob No. is Invalid: " + e);
        }
    }

    @Test
    public void givenMobileNoInvalid_shouldReturnFalse() {
        try {
            boolean result = userRegistration.validMobFormat("919876567890");
            Assertions.assertFalse(result);
            System.out.println("Mob no. is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Mob no. is Invalid: " + e);
        }
    }

    @Test
    public void givenPasswordRule1Valid_shouldReturnTrue() {
        try {
            boolean result = userRegistration.validPasswordRule1("Poon@m15");
            Assertions.assertTrue(result);
            System.out.println("Password Rule 1 is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Password rule is Invalid: " + e);
        }
    }

    @Test
    public void givenPasswordRule1Invalid_shouldReturnFalse() {
        try {
        boolean result = userRegistration.validMobFormat("poonam");
        Assertions.assertFalse(result);
            System.out.println("Password Rule 1 is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Password rule 1 is Invalid: " + e);
        }
    }

    @Test
    public void givenPasswordRule2Valid_shouldReturnTrue() {
        try{
        boolean result = userRegistration.validPasswordRule2("Poonam@98");
        Assertions.assertTrue(result);
            System.out.println("Password Rule 2 is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Password rule 2 is Invalid: " + e);
        }
    }

    @Test
    public void givenPasswordRule2Valid_shouldReturnFalse() {
        try {
            boolean result = userRegistration.validPasswordRule2("poonam@15");
            Assertions.assertFalse(result);
            System.out.println("Password Rule 2 is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Password rule 2 is Invalid: " + e);
        }
    }

    @Test
    public void givenPasswordRule3Valid_shouldReturnTrue() {
        try{
        boolean result = userRegistration.validPasswordRule3("Poon@m1598");
        Assertions.assertTrue(result);
            System.out.println("Password Rule 3 is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Password rule 3 is Invalid: " + e);
        }
    }

    @Test
    public void givenPasswordRule3Invalid_shouldReturnFalse() {
        try{
        boolean result = userRegistration.validPasswordRule3("poon@m15");
        Assertions.assertFalse(result);
            System.out.println("Password Rule 3 is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Password rule 3 is Invalid: " + e);
        }
    }

    @Test
    public void givenPasswordRule4Valid_shouldReturnTrue() {
        try{
        boolean result = userRegistration.validPasswordRule4("Poon@m15@desai");
        Assertions.assertTrue(result);
            System.out.println("Password Rule 4 is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Password rule 4 is Invalid: " + e);
        }
    }
    @Test
    public void givenPasswordRule4Invalid_shouldReturnFalse() {
        try{
        boolean result = userRegistration.validPasswordRule4("Poon@m15");
        Assertions.assertFalse(result);
            System.out.println("Password Rule 4 is valid");
        } catch (UserRegistrationException e) {
            System.out.println("Password rule 4 is Invalid: " + e);
        }
    }
}