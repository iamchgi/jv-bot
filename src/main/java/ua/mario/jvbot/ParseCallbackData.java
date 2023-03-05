package ua.mario.jvbot;

import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

public class ParseCallbackData {
    private static final String DINER = "diner";
    private static final String LUNCH = "lunch";
    private static final String BREAKFAST = "breakfast";
    private final String callbackData;
    public ParseCallbackData(CallbackQuery callbackQuery) {
        callbackData = callbackQuery.getData();
        switch (callbackData) {
            case DINER: {
                System.out.println("callBack diner");
                break;
            }
            case LUNCH: {
                System.out.println("callBack lunch");
                break;
            }
            case BREAKFAST: {
                System.out.println("callBack breakfast");
                break;
            }
            default: {
                System.out.println("callBack else");
                break;
            }
        }
    }
}
