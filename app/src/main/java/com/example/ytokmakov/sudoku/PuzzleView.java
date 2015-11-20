package com.example.ytokmakov.sudoku;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;

public class PuzzleView extends View
{
    private static final String TAG = "Sudoku";
    private final GameActivity game;

    private float width;
    private float height;
    private int selX;
    private int selY;
    private final Rect selRect = new Rect();

    public PuzzleView(Context context)
    {
        super(context);
        this.game = (GameActivity) context;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh)
    {
        width = w / 9f;
        height = h / 9f;

        getRect(selX, selY, selRect);
        Log.d(TAG, "onSizeChanged: width " + width + ", height "
                + height);
        super.onSizeChanged(w, h, oldw, oldh);
    }

    private void getRect(int x, int y, Rect rect)
    {
        rect.set((int) (x * width), (int) (y * height), (int) (x
                * width + width), (int) (y * height + height));
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        Paint background = new Paint();
        background.setColor(getResources().getColor(R.color.puzzle_background));
        canvas.drawRect(0, 0, getWidth(), getHeight(), background);
    }
}
