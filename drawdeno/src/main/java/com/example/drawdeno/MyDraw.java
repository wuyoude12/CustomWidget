package com.example.drawdeno;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 吴友德 on 2016/6/27.
 */
public class MyDraw extends View {

    private Paint mPaint;
    private float degrees = 0;

    public MyDraw(Context context) {
        super(context);
        init();
    }



    public MyDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyDraw(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();
        degrees++;
        canvas.translate(400,400);
        canvas.rotate(degrees,100,100);
        mPaint.setColor(Color.RED);
        canvas.drawRect(0,0,200,200,mPaint);

        invalidate();
    }
}
