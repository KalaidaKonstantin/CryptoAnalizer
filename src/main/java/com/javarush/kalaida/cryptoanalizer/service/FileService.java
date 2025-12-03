package com.javarush.kalaida.cryptoanalizer.service;

import com.javarush.kalaida.cryptoanalizer.exception.CryptoAnalizerException;

public class FileService {

    public String readFile (String FilePath) throws CryptoAnalizerException {
        // todo чтение файла с валидацией
        // 1) преобразовать путь в  Path
        // 2) проверить существование файла
        // 3) проверить права на чтение
        // 4) проверить содержимое
        // 5) обработать IOException
        return null;
    }

    public void writeFile (String content, String FilePath) throws CryptoAnalizerException {
        //todo запись файла с созданием директории
        //1) преобразовать путь
        // 2) создать родительские директории
        // 3) записать содержимое с правильными опциями
        // 4) Обработать IOException
    }

    public boolean fileExists (String filePath) {
        //todo проверка существования файла
        return false;
    }
}
