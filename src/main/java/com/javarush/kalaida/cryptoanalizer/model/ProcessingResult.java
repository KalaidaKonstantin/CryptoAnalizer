package com.javarush.kalaida.cryptoanalizer.model;

public class ProcessingResult {

    private final boolean success;
    private final String message;
    private final String InputPreview;
    private final String OutputPreview;



    public ProcessingResult (boolean success, String message, String InputPreview, String OutputPreview) {
        this.success = success;
        this.message = message;
        this.InputPreview = InputPreview;
        this.OutputPreview = OutputPreview;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getInputPreview() {
        return InputPreview;
    }

    public String getOutputPreview() {
        return OutputPreview;
    }
}
