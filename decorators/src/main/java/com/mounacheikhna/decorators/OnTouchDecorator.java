package com.mounacheikhna.decorators;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

import com.mounacheikhna.decor.DecorValue;

/**
 * Created by cheikhna on 17/02/2015.
 */
public class OnTouchDecorator extends OnActionBaseDecorator {

    public OnTouchDecorator(Activity activity) {
        super(activity);
    }


    @Override
    protected int[] attrs() {
        return new int[]{R.attr.decorOnTouch};
    }

    @Override
    protected void apply(View view, final DecorValue decorValue) {
        view.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return onAction(decorValue.getString(R.attr.decorOnTouch));
            }
        });
    }

}
