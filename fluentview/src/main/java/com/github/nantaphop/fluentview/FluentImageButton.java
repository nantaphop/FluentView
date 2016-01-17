package com.github.nantaphop.fluentview;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ZoomButton;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentImageButton extends FluentImageView {
    ImageButton imageButton;

    public FluentImageButton(ImageButton imageButton) {
        super(((ImageView) imageButton));
        this.imageButton = imageButton;
    }
}
