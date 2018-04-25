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
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Word} objects.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mCategoryColorId;

    WordAdapter(@NonNull Activity context, ArrayList<Word> words, int categoryColor) {
        super(context, 0, words);
        this.mCategoryColorId = categoryColor;
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
        final Word currentWord = getItem(position);

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

        ImageView wordImageView = listItemView.findViewById(R.id.word_image);
        if (currentWord != null) {
            if (currentWord.hasImage()) {
                wordImageView.setImageResource(currentWord.getImageResourceId());
                wordImageView.setVisibility(View.VISIBLE);
            } else {
                wordImageView.setVisibility(View.GONE);
            }
        }

        // set the correct background color
        LinearLayout wordText = listItemView.findViewById(R.id.word_text);
        int color = ContextCompat.getColor(getContext(), mCategoryColorId);
        wordText.setBackgroundColor(color);

        return listItemView;
    }
}
