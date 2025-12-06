package com.javarush.kalaida.cryptoanalizer.service;

import com.javarush.kalaida.cryptoanalizer.exception.CryptoAnalizerException;
import com.javarush.kalaida.cryptoanalizer.exception.CryptoAnalizerRuntimeException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileService {

    public String readFile (String filePath) throws CryptoAnalizerException {
        // todo чтение файла с валидацией
        // 1) преобразовать путь в  Path
        // 2) проверить существование файла
        // 3) проверить права на чтение
        // 4) проверить содержимое
        // 5) обработать IOException
       try {
           Path inputPath = Path.of(filePath);
           if (!Files.exists(inputPath)) {
               //System.out.println("файл существует");
               throw new CryptoAnalizerException("Файл несуществует. " + filePath + " Введите другой путь или ссылку на файл");
           }
           if (!Files.isReadable(inputPath)) {
               throw new CryptoAnalizerException("Нет прав на чтение файла" + filePath);
           }
           if (Files.size(inputPath) == 0) {
               throw new CryptoAnalizerException("Файл пуст" + filePath);
           } else return Files.lines(inputPath).toString();
       }

       catch (IOException exc) {
            throw new CryptoAnalizerException("Ошибка чтения файла" + exc.getMessage(), exc);
       }
        }

    public void writeFile (String content, String filePath) throws CryptoAnalizerException {
        //todo запись файла с созданием директории

        try {
            Path outputPath = Path.of(filePath);
            Path parentDir = outputPath.getParent();
            if (parentDir != null && !Files.exists(parentDir)) {
                Files.createDirectory(parentDir);
            }
            Files.writeString(outputPath, content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException exc) {
            throw new CryptoAnalizerException("Ошибка записи файла" + exc.getMessage(), exc);
        }

    }

    /*public boolean fileExists (String filePath) {
        //todo проверка существования файла
        if (Files.exists(Path.of(filePath))) {
            System.out.println("Файл существует");
            return true;
        } else return false;
    }*/
}
