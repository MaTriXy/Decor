package com.mounacheikhna.decor;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.mounacheikhna.decor.AttrsDecorator;
import com.mounacheikhna.decor.DecorValue;
import com.mounacheikhna.decor.R;

/**
 * Created by cheikhna on 28/04/2015.
 */
public class TestAttrsDecorator extends AttrsDecorator<TextView> {

    @Override
    protected int[] attrs() {
        return new int[] {R.attr.decorAttr};
    }

    @Override
    protected Class<TextView> clazz() {
        return TextView.class;
    }

    @Override
    protected void apply(TextView textView, DecorValue decorValue) {
        Log.d("TestAttrsDecorator", "Test");
    }

}
