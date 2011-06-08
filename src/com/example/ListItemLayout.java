package com.example;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.RelativeLayout;

public class ListItemLayout extends RelativeLayout implements Checkable {

    private boolean checked = false;

    public ListItemLayout(Context context) {
        super(context);
    }

    public ListItemLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ListItemLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setChecked(boolean b) {
        checked = b;
    }

    public boolean isChecked() {
        return checked;
    }

    public void toggle() {

    }
}
