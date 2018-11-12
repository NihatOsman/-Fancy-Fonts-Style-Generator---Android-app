package com.application.fonts.app.fontsapplication.model;

public class Font {
    private String fontName;
    public String previewText = "Preview text";

    public Font(String fontName) {
        this.fontName = fontName;
    }

    public String getFontName() {
        return fontName;
    }

    public String getPreviewText() {
        return previewText;
    }

    public void setPreviewText(String previewText) {
        this.previewText = previewText;
    }
}
