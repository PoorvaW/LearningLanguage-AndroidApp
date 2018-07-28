package com.example.android.miwok;

import android.widget.ImageView;

public class Word {
    private String mdefault,mmiwok;
    private int mimage_rid=NO_IMAGE;
    private static final int NO_IMAGE=-1;
    private int maudio_rid;

    public Word(String o, String i,int r,int a)
    {
        mdefault=o;
        mmiwok=i;
        mimage_rid=r;
        maudio_rid=a;
    }
    public Word(String o, String i,int a)
    {
        mdefault=o;
        mmiwok=i;
        maudio_rid=a;
    }
    public String getDefaultTranslation(){
        return mdefault;
    }
    public String getMiwokTranslation(){
        return mmiwok;
    }
    public int getResourceId(){return mimage_rid;}
    public int getAudioId(){return maudio_rid;}
    public boolean hasImage(){return mimage_rid!=NO_IMAGE;}
}
