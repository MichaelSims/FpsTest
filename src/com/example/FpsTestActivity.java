package com.example;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FpsTestActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public static class MyLayout extends LinearLayout {

        private TextView currentFpsView;

        public MyLayout(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        @Override
        protected void onFinishInflate() {
            super.onFinishInflate();
            setWillNotDraw(false);
            currentFpsView = (TextView) findViewById(R.id.current_fps_view);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            currentFpsView.setText("" + System.currentTimeMillis());
        }

    }
}
