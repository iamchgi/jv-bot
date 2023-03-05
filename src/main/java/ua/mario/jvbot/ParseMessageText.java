package ua.mario.jvbot;

import org.telegram.telegrambots.meta.api.objects.Message;
import ua.mario.jvbot.menu.MainMenu;

public class ParseMessageText {
    private static final String MENU = "menu";
    private static final String DINER = "diner";
    private static final String LUNCH = "lunch";
    private static final String BREAKFAST = "breakfast";

    private final String result;

    public String getResult() {
        return result;
    }

    public ParseMessageText(Message message) {
        switch (message.getText().toLowerCase()) {
            case MENU:{
                MainMenu mainMenu = new MainMenu(message);
                mainMenu.build();
                result = "OK";
                break;
            }
            case DINER: {
              result = "DINER Menu";
            break;
            }
            case LUNCH:{
                result = "LUNCH Menu";
                break;
            }
            case  BREAKFAST: {
                result = "BREAKFAST Menu";
                break;
            }
            default: {
                result = "A cup of tee";
            }
        }
        SendMessages sendMessages = new SendMessages(message,result);
        sendMessages.build();
        System.out.println(" parse "+ result);
    }
}
