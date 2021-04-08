package main;

import Consumer.Services.MessageQueueConsumer;
import Procedure.model.Address;
import Procedure.model.User;
import Procedure.services.UserService;

import java.util.logging.Logger;

public class Consumer {
    private static Logger logger = Logger.getLogger(Consumer.class.getName());
    public static void main(String[] args){
        logger.info("STARTING CONSUMER...");
        MessageQueueConsumer.executeConsumer();

    }
}
