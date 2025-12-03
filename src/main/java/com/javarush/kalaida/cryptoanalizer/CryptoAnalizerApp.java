package com.javarush.kalaida.cryptoanalizer;

public class CryptoAnalizerApp {

    //todo: Поля класса - зависимости

    //todo: Конструктор - Инициализация зависимостей

    static void main() {
        System.out.println("Hello Word");

        //todo: Создать экземпляр приложения и запустить
    }

    public void run() {
        //todo: главный цикл приложения
        //1) вывести приветствие
        //2) Меню (бесконечный цикл)*
        //3) Обработка выбора пользователя
        //4) * Выход по команде
    }

    private void printWelcomeMessage () {
        //todo: Красивое приветствие с названием приложения
    }

    private void showMainMenu() {
        //todo: отобразить меню с вариантами действий
    }

    private void processEncodeFile() {
        //todo: обработка кодирования файла
        //1) получить пути файлов
        //2) прочитать исходный файл
        //3) закодировать текст
        //4) записать результат
        //5) показать успешный результат
    }

    private void processDecodeFile() {
        //todo обработка декодирования файла
        //1) Получить пути файлов
        //2) прочитать файл
        //3) декодировать код Цезаря
        //4) записать результат
        //5) показать результат пользователю
    }

    private String getInputFilePath() {
        //todo запрос пути к исходному файлу
        return null;
    }

    private String getOutputFilePath() {
        //todo запрос пути по исходящему файлу
        return null;
    }

    private void displaySuccessResult() {

        //todo: красивый вывод результата
    }

    private void displayError (String message) {
        //todo: вывод сообщения об ошибке
    }

    private void showAlphabetInfo () {
        //todo вывод справки по алфавиту Цезаря
    }
}
