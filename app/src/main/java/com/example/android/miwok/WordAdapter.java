package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
private int mcolorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int id){
    super(context,0,words);
    mcolorResourceId=id;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView mword = (TextView) listItemView.findViewById(R.id.word_miwok);
        mword.setText(currentWord.getMiwokTranslation());

        TextView eword = (TextView) listItemView.findViewById(R.id.word_english);
        eword.setText(currentWord.getDefaultTranslation());

        ImageView im=(ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            im.setVisibility(View.VISIBLE);
            im.setImageResource(currentWord.getResourceId());
        }else
            im.setVisibility(View.GONE);
        View t=listItemView.findViewById(R.id.vertical_lay);
        int col= ContextCompat.getColor(getContext(),mcolorResourceId);
        t.setBackgroundColor(col);
        return listItemView;
    }
}
