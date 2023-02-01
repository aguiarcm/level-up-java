package org.example.concepts.solid;


/**
 * - Must make sure that new derived classes are extending the base classes without changing their original behaviour.
 * - Derived classes should never do less than parent classes.
 * - If a subtype of the supertype does something that the client of the supertype does not expect, then this is in violation
 *
 */
public class LiskovSubstitutionSample {

    class MediaPlayer {
        void playAudio(){};
    }

    class VideoMediaPlayer extends MediaPlayer {
        void playVideo(){}
    }

    class Winamp extends  MediaPlayer {
        @Override
        void playAudio() {
            super.playAudio();
        }
    }

    class VLCPlayer extends VideoMediaPlayer {
        @Override
        void playAudio() {
            super.playAudio();
        }

        @Override
        void playVideo() {
            super.playVideo();
        }
    }

    class WrongWinamp extends VideoMediaPlayer {
        @Override
        void playAudio() {
            super.playAudio();
        }

        @Override
        void playVideo() {
            throw new RuntimeException("I cant run video");
        }
    }
}
