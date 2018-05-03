package com.yugrdev.hencoder.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class DrawView1 extends View {

    private Paint mPaint;

    public DrawView1(Context context) {
        this(context, null);
    }

    public DrawView1(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float centerX = 200;
        float centerY = 200;
        canvas.drawCircle(centerX, centerY, 100, mPaint);
    }
}
