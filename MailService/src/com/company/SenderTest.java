package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SenderTest {

    private Sender sender;

    @BeforeEach
    public void setup() {
        sender = new Sender();
    }

    @Test
    public void testSenderPigeon(){
        Assertions.assertEquals("Pigeon?! In the twenty-first century, really?!!! You are crazy! I'm flying away", sender.send(new Pigeon()));
    }

    @Test
    public void testSenderDHL(){
        Assertions.assertEquals("Put a letter in an envelope, put a stamp, send", sender.send(new DHL()));
    }

    @Test
    public void testSenderEmail(){
        Assertions.assertEquals("Send by internet", sender.send(new Email()));
    }
}
