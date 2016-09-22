package com.example.android.miwok;

/**
 * Created by Isabelle Giuong on 9/14/2016.
 * Word represents a vocab word. It has a default and Miwok translation for the word.
 */
public class Word {
    /**
     * Default and Miwok translations of the word.
     */
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;
    private static final int NO_IMAGE_AVAILABLE = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = NO_IMAGE_AVAILABLE;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageResourceID() {
        return mImageResourceID;
    }
    public boolean imageAvailable(){
        return mImageResourceID !=NO_IMAGE_AVAILABLE;
    }
}
