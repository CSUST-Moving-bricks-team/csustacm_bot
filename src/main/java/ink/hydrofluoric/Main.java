package ink.hydrofluoric;


import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main {

    private static AbilityBot bot;

    public static void main(String[] args) {

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(getBot());
            System.out.println("Inited...");
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }


    public static AbilityBot getBot() {
        if(bot == null) bot = new MyAbilityBot();
        return bot;
    }

}