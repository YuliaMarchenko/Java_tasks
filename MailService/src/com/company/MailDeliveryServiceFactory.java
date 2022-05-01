package com.company;

public class MailDeliveryServiceFactory {

    public MailDeliveryService createMailDeliveryService(String enteredService) {
        Services service = Services.valueOf(enteredService.toUpperCase());
        switch (service) {
            case PIGEON:
                return new Pigeon();
            case DHL:
                return new DHL();
            case EMAIL:
                return new Email();
        }
        return null;
    }
}
