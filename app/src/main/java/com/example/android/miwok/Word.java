package com.example.android.miwok;

/**
 * Represents a word to learn, with a default translation
 * and a Miwok translation
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    /**
     * Constructor - Word class
     *
     * @param defaultTranslation default translation
     * @param miwokTranslation   Miwok translation
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    /**
     * @return default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * @return Miwok traslation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    @Override
    public String toString() {
        return mDefaultTranslation + " - " + mMiwokTranslation;
    }
}
