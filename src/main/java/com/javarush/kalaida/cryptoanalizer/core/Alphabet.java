package com.javarush.kalaida.cryptoanalizer.core;

import java.util.Arrays;

public class Alphabet {

    public static final String [] ALPHABET = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л",
            "м", "н", "о", "п", "р", "с", "т", "у", "ф", "ч", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я",
            ".", ",", "\"", ":", ";", "!", "?", " "} ;
    //public static final String [] CAESAR_CIPHER_TO_TEXT;

    static {
        //todo инициализировать алфавит
        //1) заполнить алфавит
        //2) заполнить цифры
        //3) заполнить знаки пунктуации
    }

    private Alphabet(){

    }
    public String [] getSotedArray () {
        // посмотреть нужно ли преобразовывать массив строк в чар если нужно изменить константу
        String [] sortedAlphabet = Arrays.sort(ALPHABET);
        return sortedAlphabet;
    }
}
