package ua.mario.jvbot.handlers;

import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.BotOptions;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import ua.mario.jvbot.ParseCallbackData;
import ua.mario.jvbot.ParseMessageText;

public class LPBot implements LongPollingBot {
    BotOptions botOptions = new DefaultBotOptions();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                ParseMessageText parseMessageText = new ParseMessageText(update.getMessage());
                System.out.println(parseMessageText.getResult());
            }
        }
        if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            ParseCallbackData parseCallbackData = new ParseCallbackData(update.getCallbackQuery());
            System.out.println(callbackQuery.getData());
        }
        System.out.println(update);
    }

    @Override
    public BotOptions getOptions() {
        return botOptions;
    }

    @Override
    public void clearWebhook() throws TelegramApiRequestException {

    }

    @Override
    public String getBotUsername() {
        return "mario_development_bot";
    }

    @Override
    public String getBotToken() {
        return "6238773566:AAEVpL7yX0UKtVKD-kyHX3p_V1FAjhTMYXY";
    }
}
