package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MailDeliveryServiceFactoryTest {

    private MailDeliveryServiceFactory factory;

    @BeforeEach
    public void setup() {
        factory = new MailDeliveryServiceFactory();
    }

    @Test
    public void testEmail() {
        Assertions.assertInstanceOf(Email.class, factory.createMailDeliveryService("Email"));
    }

    @Test
    public void testPigeon() {
        Assertions.assertInstanceOf(Pigeon.class, factory.createMailDeliveryService("Pigeon"));
    }

    @Test
    public void testDHL() {
        Assertions.assertInstanceOf(DHL.class, factory.createMailDeliveryService("dhl"));
    }
}
