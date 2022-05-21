import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.File;

public class Handlers {

    private static SendVideo startCommand(Update update){
        SendVideo sendVideo = new SendVideo();
        InputFile inputFile = new InputFile(new File("ROKU.mp4"));
        sendVideo.setChatId(update.getMessage().getFrom().getId().toString());
        sendVideo.setCaption("Hola "+update.getMessage().getFrom().getFirstName()+", bienvenido" +
                " a PoliHubBot.\nAqui encontraras el repositorio completo de libros recomendados" +
                " que necesitas para todas las" +
                "asignaturas durante tu carrera.");
        sendVideo.setVideo(inputFile);
        return sendVideo;
    }

    private static SendMessage getBookCommand(Update update){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getFrom().getId().toString());
        sendMessage.setText(update.getMessage().getFrom().getFirstName()+" por favor" +
                " ingresa el nombre del libro que deseas, te mostraremos una lista de libros que" +
                "te pueden interesar en funcion de tu busqueda.");
        return sendMessage;
    }

    private static SendMessage setBookCommand(Update update){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getFrom().getId().toString());
        sendMessage.setText(update.getMessage().getFrom().getFirstName()+" por el momento aun no contamos " +
                "con esta funcion incorporada, no te preocupes proto agregaremos esta y mas funciones!.");
        return sendMessage;
    }

    private static SendMessage coincidenceBookCommand(Update update){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getFrom().getId().toString());
        sendMessage.setText("Aqui tienes una lista "update.getMessage().getFrom().getFirstName()+" de los libros" +
                "que te pueden interesar, por favor ingresa el codigo que se encuentra junto al libro que desees.\n\n");
        return sendMessage;
    }

    private static SendDocument sendBookCommand(Update update){
        SendDocument sendDocument = new SendDocument();
        InputFile inputFile = new InputFile(new File(""));
        sendDocument.setCaption("Recuerda, la clave del documento es: ");
        sendDocument.setChatId(update.getMessage().getFrom().getId().toString());
        sendDocument.setDocument(inputFile);
        return sendDocument;
    }
}
