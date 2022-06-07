package com.example.ecole2.util;

import junit.framework.TestCase;

public class VerificationMessageTest extends TestCase {
    VerificationMessage verificationMessage = new VerificationMessage();

    public void testIsEmailValid1() {
        assertEquals(false, verificationMessage.isEmailValid("test.com"));
    }

    public void testIsEmailValid2() {
        assertEquals(false, verificationMessage.isEmailValid("test@test"));
    }

    public void testIsEmailValid3() {
        assertEquals(false, verificationMessage.isEmailValid("test@test.a"));
    }

    public void testIsEmailValid4() {
        assertEquals(false, verificationMessage.isEmailValid("test@test.cà"));
    }

    public void testIsEmailValid5() {
        assertEquals(false, verificationMessage.isEmailValid("tèst@test.com"));
    }

    public void testIsEmailValid6() {
        assertEquals(true, verificationMessage.isEmailValid("test@email.com"));
    }

    public void testIsNomPrenomValid1() {
        assertEquals(false, verificationMessage.isNomPrenomValid("Nom", "Pr&nom"));
    }

    public void testIsNomPrenomValid2() {
        assertEquals(false, verificationMessage.isNomPrenomValid("N1m", "Prénom"));
    }

    public void testIsNomPrenomValid3() {
        assertEquals(true, verificationMessage.isNomPrenomValid("Nom", "Prénom-Prénom"));
    }
}