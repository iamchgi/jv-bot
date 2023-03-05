package ua.mario.jvbot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ua.mario.jvbot.handlers.LPBot;

@SpringBootApplication
public class JvBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(JvBotApplication.class, args);
		System.out.println("App start");
		LPBot tgBot = new LPBot();
		TelegramBotsApi telegramBotsApi;
		try {
			telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
			telegramBotsApi.registerBot(tgBot);
		} catch (TelegramApiException e) {
			throw new RuntimeException(e);
		}
		System.out.println("App finish");
	}
}
