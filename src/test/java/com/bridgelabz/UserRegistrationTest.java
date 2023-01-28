package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstNameValid_shouldReturnTrue() {
        boolean result = userRegistration.validFirstName("Poonam");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstNameInvalid_shouldReturnFalse() {
        boolean result = userRegistration.validFirstName("poonam");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastNameValid_shouldReturnTrue() {
        boolean result = userRegistration.validLastName("Desai");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastNameInvalid_shouldReturnFalse() {
        boolean result = userRegistration.validLastName("desai");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailValid_shouldReturnTrue() {
        boolean result = userRegistration.validEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailInvalid_shouldReturnFalse() {
        boolean result = userRegistration.validEmail("loharpoonam98@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNoValid_shouldReturnTrue() {
        boolean result = userRegistration.validMobFormat("91 9876567890");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNoInvalid_shouldReturnFalse() {
        boolean result = userRegistration.validMobFormat("919876567890");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule1Valid_shouldReturnTrue() {
        boolean result = userRegistration.validPasswordRule1("Poon@m15");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1Invalid_shouldReturnFalse() {
        boolean result = userRegistration.validMobFormat("poonam");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule2Valid_shouldReturnTrue() {
        boolean result = userRegistration.validPasswordRule2("Poonam@98");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2Valid_shouldReturnFalse() {
        boolean result = userRegistration.validPasswordRule2("poonam@15");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule3Valid_shouldReturnTrue() {
        boolean result = userRegistration.validPasswordRule3("Poon@m1598");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3Invalid_shouldReturnFalse() {
        boolean result = userRegistration.validPasswordRule3("poon@m15");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule4Valid_shouldReturnTrue() {
        boolean result = userRegistration.validPasswordRule4("Poon@m15@desai");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPasswordRule4Invalid_shouldReturnFalse() {
        boolean result = userRegistration.validPasswordRule4("Poon@m15");
        Assertions.assertFalse(result);
    }
}