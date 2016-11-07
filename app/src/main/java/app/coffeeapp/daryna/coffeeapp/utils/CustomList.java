package app.coffeeapp.daryna.coffeeapp.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by dasha on 05.08.16.
 */


public class CustomList extends ListView {
    public CustomList(Context context) {
        super(context);
    }

    public CustomList(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomList(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(MeasureSpec.UNSPECIFIED, 0));

        int childHeight = getMeasuredHeight() - (getListPaddingTop() +
                getListPaddingBottom() + getVerticalFadingEdgeLength() * 2);

        int fullHeight = getListPaddingTop() + getListPaddingBottom() + childHeight * (getCount());

        setMeasuredDimension(getMeasuredWidth(), fullHeight + getCount());
    }

}