package com.example;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

public class RoundedCornerListView extends ListView {

    private Path path;
    private int roundedRadius;

    public RoundedCornerListView(Context context) {
        super(context);
        init();
    }

    public RoundedCornerListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RoundedCornerListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        roundedRadius = getResources().getDimensionPixelSize(R.dimen.rounded_radius);
        setLayerType(View.LAYER_TYPE_SOFTWARE, null);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        path = new Path();
        RectF rect = new RectF(0, 0, w, h);
        path.addRoundRect(rect, roundedRadius, roundedRadius, Path.Direction.CW);
    }
}
