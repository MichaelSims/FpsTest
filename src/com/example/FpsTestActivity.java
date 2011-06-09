package com.example;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class FpsTestActivity extends Activity {

    private static final String TAG = FpsTestActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final ListView listView = (ListView) findViewById(R.id.my_list_view);
        listView.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
        listView.setAdapter(new MyBaseAdapter(this));
        listView.setItemChecked(0, true);
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

    private static class MyBaseAdapter extends BaseAdapter {

        private LayoutInflater li;

        public MyBaseAdapter(Context context) {
            li = LayoutInflater.from(context);
        }

        public int getCount() {
            return LIST_DATA.length;
        }

        public Object getItem(int i) {
            return LIST_DATA[i];
        }

        public long getItemId(int i) {
            return -1;
        }

        public View getView(int i, View convertView, ViewGroup parent) {
            View listItem;
            ViewHolder viewHolder;
            if (convertView != null && convertView instanceof TextView) {
                listItem = convertView;
                viewHolder = (ViewHolder) convertView.getTag();
            } else {
                listItem = li.inflate(R.layout.list_item, null, false);
                viewHolder = new ViewHolder();
                viewHolder.myTextView = (TextView) listItem.findViewById(R.id.myTextView);
                listItem.setTag(viewHolder);
            }
            viewHolder.myTextView.setText(LIST_DATA[i]);
            return listItem;
        }

        private static class ViewHolder {
            TextView myTextView;
        }

    }

    private static class ListItemLayout extends RelativeLayout implements Checkable {

        private static final int[] CHECKED_STATE_SET = {
                android.R.attr.state_checked
        };

        private CheckedTextView textView;

        public ListItemLayout(Context context) {
            super(context);
        }

        public ListItemLayout(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public ListItemLayout(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
        }

        @Override
        protected int[] onCreateDrawableState(int extraSpace) {
            int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
            if (isChecked()) {
                mergeDrawableStates(drawableState, CHECKED_STATE_SET);
            }
            return drawableState;
        }

        @Override
        protected void onFinishInflate() {
            super.onFinishInflate();
            textView = (CheckedTextView) findViewById(R.id.myTextView);
        }

        public void setChecked(boolean b) {
            if (textView.isChecked() != b) {
                textView.setChecked(b);
                refreshDrawableState();
            }
        }

        public boolean isChecked() {
            /* Check for null here since this is called before we are fully inflated */
            return textView != null ? textView.isChecked() : false;
        }

        public void toggle() {
            textView.toggle();
        }
    }

}
