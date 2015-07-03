package pl.szkolenie.projekty.polekoa;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by JAVA on 2015-07-03.
 */
public class Circle extends View {
    public Circle(Context context) {
        super(context);
    }

    public Circle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Circle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas c) {
        float sx=1000,sy=1000,r=400;
        try{
            sx=getWidth();
            sy=getHeight();
            r=Math.min(sx,sy)/2-10;
        }
        catch(Exception ex)
        {

        }
        Paint p=new Paint();
        Paint p2=new Paint();
        p2.setColor(Color.WHITE);
        c.drawCircle(sx / 2, sy / 2, r, p);
        c.drawCircle(sx/2,sy/2, r-2 ,p2 );
        c.drawLine(sx / 2, sy / 2, sx / 2 + r, sy / 2, p);
        c.drawText("promień=", sx/2+r/2,sy/2+20,p);
        invalidate();
    }
}
