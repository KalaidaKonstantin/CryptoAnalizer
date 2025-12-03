package com.javarush.kalaida.cryptoanalizer.service;

import com.javarush.kalaida.cryptoanalizer.exception.CryptoAnalizerException;

public class ValidatonService {
    public void validateTextForEncoding (String txt) throws CryptoAnalizerException {
        //todo валидация текста для кодирования
        //1) проверить на null
        //2) пройтись по всем символам
        //3) проверить наличие в алфавите
        //4) выбросить исключение в инфо о позиции ошибки
    }
    public void validateСaesarCipher (String txt, String encoding) throws CryptoAnalizerException {
        //todo валидация кода
        // 1) проверить на null
        // 2) разбить на отдельные коды
        // 3) проверить каждый код
        // 4) выбросить исключение с инфо о позиции ошибки

    }
}
