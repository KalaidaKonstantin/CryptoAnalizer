package com.javarush.kalaida.cryptoanalizer.exception;

public class CryptoAnalizerException extends Exception {

    public CryptoAnalizerException (String message) {
        //todo: вызвать конструктор родителя с сообщением
        super(message);
    }

    public CryptoAnalizerException (String messege, Throwable th) {
        //todo: вызвать конструктор родителя с сообщением и причиной
        super (messege, th);
    }
}
