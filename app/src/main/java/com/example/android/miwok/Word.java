package com.example.android.miwok;

/**
 * Represents a word to learn, with a default translation
 * and a Miwok translation
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;

    /**
     * Constructor - Word class
     *
     * @param defaultTranslation default translation
     * @param miwokTranslation   Miwok translation
     */
    Word(String defaultTranslation, String miwokTranslation) {
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
     * @return Miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * @return image reource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return mDefaultTranslation + " - " + mMiwokTranslation;
    }
}
