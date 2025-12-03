package com.javarush.kalaida.cryptoanalizer.core;

import com.javarush.kalaida.cryptoanalizer.exception.CryptoAnalizerException;
import com.javarush.kalaida.cryptoanalizer.model.ProcessingResult;
import com.javarush.kalaida.cryptoanalizer.service.ValidatonService;

public class СaesarCipher {
    private final ValidatonService validatonService;

    public СaesarCipher (ValidatonService validatonService){
        //todo инициализировать ValidatonService

        this.validatonService = validatonService;
    }

    public ProcessingResult encodeText (int key, String text) throws CryptoAnalizerException {
        //todo кодирование текста в шифр цезаря
        // 1) валидировать входной текст
        // 2) пройтись по всем символам
        // 3) найти ключ
        // 4) Собрать результат
        // 5) вернуть ProcessingResult
        return null;
    }

    public ProcessingResult decodeText (String caesarCipher) throws CryptoAnalizerException {
        //todo декодирование шифр цезаря в тукст
        // 1) валидировать шифр цезаря
        // 2) пройтись по всем символам
        // 3) Обработать текст с помощью ключа
        // 4) Собрать результат
        // 5) вернуть ProcessingResult
        return null;
    }


    // Добавить еще Брут метод!!

}
