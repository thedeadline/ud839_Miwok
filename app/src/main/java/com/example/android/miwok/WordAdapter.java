package com.example.android.miwok;

import android.content.Context;
import android.provider.UserDictionary;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Isa on 9/14/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Instantiates a new Word adapter.
     *
     * @param context the context
     * @param words   the words
     *
     */
    public WordAdapter(Context context, ArrayList<Word> words) {

        super(context, 0, words);
    }

    /**
     * Returns a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position the AdapterView position that's requesting a view
     * @param convertView the recycled view to populate
     * @param parent the parent ViewGroup that's used for inflation
     * @return The View for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID for the miwokTextView
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokTextView);
        // Get the word from the current Word object and
        // set this text on the miwok TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID defaultTextView
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultTextView);
        // Get the default translation from the current Word object and
        // set this text on the default TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(currentWord.getImageResourceID());

        // Return the whole list item layout (containing 2 TextViews and ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
