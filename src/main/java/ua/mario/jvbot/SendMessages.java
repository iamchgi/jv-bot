package ua.mario.jvbot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public class SendMessages {
    private final long chatId;
    private final String text;

    public SendMessages(Message message, String text) {
        chatId = message.getChatId();
        this.text = text;
    }

    public void build() {
        SendMessage sendMessage = SendMessage
                .builder()
                .text(text)
                .chatId(String.valueOf(chatId))
          //      .replyMarkup(replyKeyboard)
                .build();
        System.out.println("build message   " + sendMessage);
    }
}
