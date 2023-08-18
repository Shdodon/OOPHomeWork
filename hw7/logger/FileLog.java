package ru.danilov.oop.homework.hw7.logger;

import ru.danilov.oop.homework.hw7.interfaces.WriteLog;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLog implements WriteLog {
    private final Logger logger = Logger.getLogger("MyLog");

    public  FileLog() {
        setFileHandler("log.txt");
    }

    public  FileLog(String fileNameLog) {
        setFileHandler(fileNameLog);
    }
    public void setFileHandler(String fileNameLog){
        this.logger.setUseParentHandlers(false);
        try{
            FileHandler fh = new FileHandler(fileNameLog, true);
            this.logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
        } catch(Exception e) {
            System.out.println("Ошибка работы с файлом.");
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void log(String msg) {
        logger.info(msg);
    }
}
