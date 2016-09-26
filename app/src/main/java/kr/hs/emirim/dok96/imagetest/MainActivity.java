package kr.hs.emirim.dok96.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super햣 .onCreate(savedInstanceState);
        setContentView(new MyImage(getApplicationContext()));
    }


    class MyImage extends View {
        MyImage(Context context){
            super(context);

        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Bitmap picture= BitmapFactory.decodeResource(getResources(),R.drawable.you);
            float cx=getWidth()/2.0f;
            float cy=getHeight()/2.0f;
            float x=(getWidth()-picture.getWidth())/2.0f;
            float y=(getHeight()-picture.getHeight())/2.0f;
            canvas.drawBitmap(picture,x,y,null);

            //회전
            //canvas.rotate(180,cx,cy);
            //이동
            //canvas.translate(-150,200);
            //크기
            //canvas.scale(1.5f,1.5f,cx,cy);
            //비틀기 (축의 이동)
            canvas.skew(0.4f,0.4f);
            canvas.drawBitmap(picture,x,y,null);

        }
    }
}
