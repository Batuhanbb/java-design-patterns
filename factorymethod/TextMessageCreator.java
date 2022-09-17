package com.coffeepoweredcrew.factorymethod;

import com.coffeepoweredcrew.factorymethod.message.Message;
import com.coffeepoweredcrew.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    protected TextMessage createMessage() {
        return new TextMessage();
    }

}
