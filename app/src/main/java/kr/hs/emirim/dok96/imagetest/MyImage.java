package kr.hs.emirim.dok96.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by appcreator16 on 2016. 9. 26..
 */
public class MyImage extends View{
    int choose=MainActivity.ORIGINAL;
    Bitmap picture;

    public MyImage(Context context) {
        super(context);
        picture= BitmapFactory.decodeResource(getResources(), R.drawable.you);
    }
    public void setChoose(int choose)
    {
        this.choose=choose;
    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        float cx=getWidth()/2.0f;
        float cy=getHeight()/2.0f;
        float x=(getWidth()-picture.getWidth())/2.0f;
        float y=(getHeight()-picture.getHeight())/2.0f;
        switch (choose)
        {
            case MainActivity.ROTATE:
                canvas.rotate(45,cx,cy); //회전
                break;
            case MainActivity.TRANSLATE:
                canvas.translate(-150,200); //이동
                break;
            case MainActivity.SCALE:
                canvas.scale(1.5f,1.5f,cx,cy); //크기
                break;
            case MainActivity.SKEW:
                canvas.skew(0.4f,0.4f); // 비틀기
                break;
        }
        canvas.drawBitmap(picture,x,y,null);
        //picture.recycle();
    }
}