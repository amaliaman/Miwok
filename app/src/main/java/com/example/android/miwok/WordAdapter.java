package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Word} objects.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    WordAdapter(@NonNull Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView nameTextView = listItemView.findViewById(R.id.miwok_text_view);
        if (currentWord != null) {
            nameTextView.setText(currentWord.getMiwokTranslation());
        }

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView numberTextView = listItemView.findViewById(R.id.default_text_view);
        if (currentWord != null) {
            numberTextView.setText(currentWord.getDefaultTranslation());
        }

        return listItemView;
    }
}
