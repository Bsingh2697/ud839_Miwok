package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMivokTranslation;

    public Word(String DefaultTranslation, String MivokTranslation) {

        mDefaultTranslation = DefaultTranslation;
        mMivokTranslation = MivokTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMivokTranslation(){
        return mMivokTranslation;
    }
}
