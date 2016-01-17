package com.github.nantaphop.fluentview;

import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentToggleButton extends FluentCompoundButton {
    ToggleButton toggleButton;

    public FluentToggleButton(ToggleButton toggleButton) {
        super(((CompoundButton) toggleButton));
        this.toggleButton = toggleButton;
    }

    public FluentToggleButton setBackgroundDrawable(Drawable d) {
        toggleButton.setBackgroundDrawable(d);
        return this;
    }


    public FluentToggleButton setChecked(boolean checked) {
        toggleButton.setChecked(checked);
        return this;
    }


    public FluentToggleButton setTextOff(CharSequence textOff) {
        toggleButton.setTextOff(textOff);
        return this;
    }


    public FluentToggleButton setTextOn(CharSequence textOn) {
        toggleButton.setTextOn(textOn);
        return this;
    }
}
