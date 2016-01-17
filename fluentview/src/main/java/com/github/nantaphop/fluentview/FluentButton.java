package com.github.nantaphop.fluentview;

import android.widget.Button;
import android.widget.TextView;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentButton extends FluentTextView {

    Button button;

    public FluentButton(Button button) {
        super((TextView)button);
        this.button = button;
    }
}
