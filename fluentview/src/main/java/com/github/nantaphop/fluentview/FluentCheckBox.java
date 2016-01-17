package com.github.nantaphop.fluentview;

import android.support.v7.widget.AppCompatCheckBox;
import android.widget.CheckBox;
import android.widget.CompoundButton;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentCheckBox extends FluentCompoundButton{

    CheckBox checkBox;
    
    public FluentCheckBox(CheckBox checkBox) {
        super(((CompoundButton) checkBox));
        this.checkBox = checkBox;
    }
}
