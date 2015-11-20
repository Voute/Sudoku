package com.example.ytokmakov.sudoku;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;


public class DrawActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(new GraphicsView(this));
    }

    public static class GraphicsView extends View
    {
        public GraphicsView(Context context)
        {
            super(context);
            setBackgroundResource(R.drawable.background);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            String mess = "This is truuuuuuulez, yeah!";
            float[] dashes = {1, 2, 3, 4};

            Path circle = new Path();
            Paint cPaint = new Paint();
            Paint tPaint = new Paint();
            cPaint.setStyle(Paint.Style.STROKE);
            cPaint.setStrokeWidth(20);
            cPaint.setPathEffect(new DashPathEffect(dashes, 20));
            tPaint.setTextSize(40);
            circle.addCircle(300, 300, 250, Path.Direction.CW);
            canvas.drawPath(circle, cPaint);
            canvas.drawTextOnPath(mess, circle, 10, -30, tPaint);
        }
    }
}
