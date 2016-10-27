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
    private int mAudioResourceID;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = NO_IMAGE_AVAILABLE;
        mAudioResourceID = audioResourceID;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
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
    public int getAudioResourceID(){
        return mAudioResourceID;
    }
    public boolean imageAvailable(){
        return mImageResourceID !=NO_IMAGE_AVAILABLE;
    }

}
