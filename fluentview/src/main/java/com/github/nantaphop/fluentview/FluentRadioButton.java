package com.github.nantaphop.fluentview;

import android.support.v7.widget.AppCompatRadioButton;
import android.widget.CompoundButton;
import android.widget.RadioButton;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentRadioButton extends FluentCompoundButton {

    RadioButton radioButton;

    public FluentRadioButton(RadioButton radioButton) {
        super(((CompoundButton) radioButton));
        this.radioButton = radioButton;
    }

}
