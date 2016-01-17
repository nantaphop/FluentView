package com.github.nantaphop.fluentview;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.CompoundButton;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentCompoundButton extends FluentButton{

    CompoundButton compoundButton;

    public FluentCompoundButton(CompoundButton compoundButton) {
        super(((Button) compoundButton));
        this.compoundButton = compoundButton;
    }

    @Nullable
    public FluentCompoundButton setButtonDrawable(Drawable drawable) {
        compoundButton.setButtonDrawable(drawable);
        return this;
    }


    public FluentCompoundButton setButtonDrawable(int resId) {
        compoundButton.setButtonDrawable(resId);
        return this;
    }


    public FluentCompoundButton setButtonTintList(ColorStateList tint) {
        compoundButton.setButtonTintList(tint);
        return this;
    }


    public FluentCompoundButton setButtonTintMode(PorterDuff.Mode tintMode) {
        compoundButton.setButtonTintMode(tintMode);
        return this;
    }


    public FluentCompoundButton setChecked(boolean checked) {
        compoundButton.setChecked(checked);
        return this;
    }


    public FluentCompoundButton setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener) {
        compoundButton.setOnCheckedChangeListener(listener);
        return this;
    }


    public FluentCompoundButton toggle() {
        compoundButton.toggle();
        return this;
    }
}
