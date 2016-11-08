package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Helper class that handles the media player aspects so that audio can be played and
 * MediaPlayer resources released.
 * Created by Isabelle on 11/7/2016.
 */

public class MediaPlayerHandler {
    private static MediaPlayer mMediaPlayer;

    private static MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener(){
        @Override
        public void onCompletion(MediaPlayer mp){
            releaseMediaPlayer();
        }
    };

    public static void handler(Context activityContext, int uri) {

        releaseMediaPlayer();


        // Create and setup the {@link MediaPlayer} for the audio resource associated
        // with the current word
        mMediaPlayer = MediaPlayer.create(activityContext, uri);

        // Start the audio file
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);

    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private static void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}