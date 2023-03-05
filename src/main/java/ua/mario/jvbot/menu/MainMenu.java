package ua.mario.jvbot.menu;

import org.json.JSONObject;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;

import static org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup.*;

public class MainMenu {

    JSONObject jsonObjMenu = new JSONObject();
    ReplyKeyboard replyKeyboard;
    public MainMenu(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
      //  replyKeyboard = builder().keyboard();
        sendMessage.setReplyMarkup(replyKeyboard);
    }

    public static void build() {
    }
}

