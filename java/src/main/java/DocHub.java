import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class DocHub extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return TokenReader.readUserName();
    }

    @Override
    public String getBotToken() {
        return TokenReader.readToken();
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
