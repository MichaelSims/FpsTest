package com.example;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class FpsTestActivity extends Activity {

    private static final String TAG = FpsTestActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final TextView currentFpsView = (TextView) findViewById(R.id.current_fps_view);
        currentFpsView.setText("Hello there");

        final ListView listView = (ListView) findViewById(R.id.my_list_view);
        listView.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, LIST_DATA));
    }

    public static class MyLayout extends LinearLayout {

        private TextView currentFpsView;

        public MyLayout(Context context, AttributeSet attrs) {
            super(context, attrs);
            setWillNotDraw(false);
        }

        @Override
        protected void onFinishInflate() {
            super.onFinishInflate();
            setWillNotDraw(false);
            currentFpsView = (TextView) findViewById(R.id.current_fps_view);
        }

        private static final long ONE_SECOND = 1000;
        private int framesSinceLastSample;
        private long timeOfLastSample;
        private int currentFps;

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            //sleep(33);
            final long now = System.currentTimeMillis();
            framesSinceLastSample++;
            if (now - timeOfLastSample > ONE_SECOND) {
                timeOfLastSample = now;
                currentFps = framesSinceLastSample;
                framesSinceLastSample = 0;
                currentFpsView.setText("Current FPS is " + currentFps);
            }
            //invalidate();
        }

        private void sleep(int sleepTime) {
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
            }
        }

    }

    private static final String[] LIST_DATA = new String[]{
            "Philip J. Fry",
            "Bender",
            "Leela",
            "Professor Farnsworth",
            "Doctor Zoidberg",
            "Amy Wong",
            "Hermes Conrad",
            "Nibbler",
            "Brannigan, Zapp",
            "Kroker, Kif",
            "Mom",
            "Agnew, Spiro",
            "Boxy",
            "Brain Slugs",
            "Brain Spawn",
            "Calculon",
            "Crushinator, The",
            "Changstein-El-Gamal, Father",
            "Chanukah Zombie",
            "Clamps",
            "Conrad, Dwight",
            "Conrad, LeBarbara",
            "Donbot",
            "Elzar",
            "Farnsworth, Cubert",
            "Flexo",
            "Gore, Al",
            "Gypsy-bot",
            "Hawking, Stephen",
            "Hedonism Bot",
            "Horrible Gelatinous Blob",
            "Hyperchicken",
            "Hypnotoad",
            "Kwanzaabot",
            "Lrrr",
            "Linda",
            "McDoogal, Hattie",
            "Michelle",
            "Morbo",
            "Mousepad, Joey",
            "Munchnik Randy",
            "Nixon, Richard",
            "Panucci, Mr.",
            "Pazuzu",
            "Petunia",
            "Preacherbot, Reverend",
            "Roberto",
            "Robot Devil",
            "Robot Santa",
            "Sal",
            "Scruffy",
            "Slim, Barbados",
            "Smitty",
            "Tate, Ethan 'Bubblegum'",
            "Tim, Tinny",
            "Turanga, Morris",
            "Turanga, Munda",
            "URL",
            "Vogel, Warden",
            "Wernstrom, Ogden",
            "Wong, Inez",
            "Wong, Leo", "Philip J. Fry",
            "Bender",
            "Leela",
            "Professor Farnsworth",
            "Doctor Zoidberg",
            "Amy Wong",
            "Hermes Conrad",
            "Nibbler",
            "Brannigan, Zapp",
            "Kroker, Kif",
            "Mom",
            "Agnew, Spiro",
            "Boxy",
            "Brain Slugs",
            "Brain Spawn",
            "Calculon",
            "Crushinator, The",
            "Changstein-El-Gamal, Father",
            "Chanukah Zombie",
            "Clamps",
            "Conrad, Dwight",
            "Conrad, LeBarbara",
            "Donbot",
            "Elzar",
            "Farnsworth, Cubert",
            "Flexo",
            "Gore, Al",
            "Gypsy-bot",
            "Hawking, Stephen",
            "Hedonism Bot",
            "Horrible Gelatinous Blob",
            "Hyperchicken",
            "Hypnotoad",
            "Kwanzaabot",
            "Lrrr",
            "Linda",
            "McDoogal, Hattie",
            "Michelle",
            "Morbo",
            "Mousepad, Joey",
            "Munchnik Randy",
            "Nixon, Richard",
            "Panucci, Mr.",
            "Pazuzu",
            "Petunia",
            "Preacherbot, Reverend",
            "Roberto",
            "Robot Devil",
            "Robot Santa",
            "Sal",
            "Scruffy",
            "Slim, Barbados",
            "Smitty",
            "Tate, Ethan 'Bubblegum'",
            "Tim, Tinny",
            "Turanga, Morris",
            "Turanga, Munda",
            "URL",
            "Vogel, Warden",
            "Wernstrom, Ogden",
            "Wong, Inez",
            "Wong, Leo", "Philip J. Fry",
            "Bender",
            "Leela",
            "Professor Farnsworth",
            "Doctor Zoidberg",
            "Amy Wong",
            "Hermes Conrad",
            "Nibbler",
            "Brannigan, Zapp",
            "Kroker, Kif",
            "Mom",
            "Agnew, Spiro",
            "Boxy",
            "Brain Slugs",
            "Brain Spawn",
            "Calculon",
            "Crushinator, The",
            "Changstein-El-Gamal, Father",
            "Chanukah Zombie",
            "Clamps",
            "Conrad, Dwight",
            "Conrad, LeBarbara",
            "Donbot",
            "Elzar",
            "Farnsworth, Cubert",
            "Flexo",
            "Gore, Al",
            "Gypsy-bot",
            "Hawking, Stephen",
            "Hedonism Bot",
            "Horrible Gelatinous Blob",
            "Hyperchicken",
            "Hypnotoad",
            "Kwanzaabot",
            "Lrrr",
            "Linda",
            "McDoogal, Hattie",
            "Michelle",
            "Morbo",
            "Mousepad, Joey",
            "Munchnik Randy",
            "Nixon, Richard",
            "Panucci, Mr.",
            "Pazuzu",
            "Petunia",
            "Preacherbot, Reverend",
            "Roberto",
            "Robot Devil",
            "Robot Santa",
            "Sal",
            "Scruffy",
            "Slim, Barbados",
            "Smitty",
            "Tate, Ethan 'Bubblegum'",
            "Tim, Tinny",
            "Turanga, Morris",
            "Turanga, Munda",
            "URL",
            "Vogel, Warden",
            "Wernstrom, Ogden",
            "Wong, Inez",
            "Wong, Leo", "Philip J. Fry",
            "Bender",
            "Leela",
            "Professor Farnsworth",
            "Doctor Zoidberg",
            "Amy Wong",
            "Hermes Conrad",
            "Nibbler",
            "Brannigan, Zapp",
            "Kroker, Kif",
            "Mom",
            "Agnew, Spiro",
            "Boxy",
            "Brain Slugs",
            "Brain Spawn",
            "Calculon",
            "Crushinator, The",
            "Changstein-El-Gamal, Father",
            "Chanukah Zombie",
            "Clamps",
            "Conrad, Dwight",
            "Conrad, LeBarbara",
            "Donbot",
            "Elzar",
            "Farnsworth, Cubert",
            "Flexo",
            "Gore, Al",
            "Gypsy-bot",
            "Hawking, Stephen",
            "Hedonism Bot",
            "Horrible Gelatinous Blob",
            "Hyperchicken",
            "Hypnotoad",
            "Kwanzaabot",
            "Lrrr",
            "Linda",
            "McDoogal, Hattie",
            "Michelle",
            "Morbo",
            "Mousepad, Joey",
            "Munchnik Randy",
            "Nixon, Richard",
            "Panucci, Mr.",
            "Pazuzu",
            "Petunia",
            "Preacherbot, Reverend",
            "Roberto",
            "Robot Devil",
            "Robot Santa",
            "Sal",
            "Scruffy",
            "Slim, Barbados",
            "Smitty",
            "Tate, Ethan 'Bubblegum'",
            "Tim, Tinny",
            "Turanga, Morris",
            "Turanga, Munda",
            "URL",
            "Vogel, Warden",
            "Wernstrom, Ogden",
            "Wong, Inez",
            "Wong, Leo"
    };
}
