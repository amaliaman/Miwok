package com.example.android.miwok;

/**
 * Represents a word to learn, with a default translation
 * and a Miwok translation
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_RESOURCE;
    private int mAudioResourceId;

    private static final int NO_IMAGE_RESOURCE = -1;

    /**
     * Constructor - Word class
     *
     * @param defaultTranslation default translation
     * @param miwokTranslation   Miwok translation
     */
    Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = audioResourceId;
    }

    /**
     * Constructor with image resource ID
     *
     * @param defaultTranslation default translation
     * @param miwokTranslation   Miwok translation
     * @param imageResourceId    image resource ID
     */
    Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
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
     * @return image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return audio resource ID
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return mDefaultTranslation + " - " + mMiwokTranslation;
    }

    /**
     * @return whether this word has an image or not
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_RESOURCE;
    }
}
