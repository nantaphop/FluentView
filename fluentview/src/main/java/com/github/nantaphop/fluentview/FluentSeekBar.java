package com.github.nantaphop.fluentview;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import android.widget.SeekBar;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentSeekBar extends FluentProgressBar {

    SeekBar seekBar;

    public FluentSeekBar(SeekBar seekBar) {
        super(((ProgressBar) seekBar));
        this.seekBar = seekBar;
    }

    public FluentSeekBar setKeyProgressIncrement(int increment) {
        seekBar.setKeyProgressIncrement(increment);
        return this;
    }


    public synchronized FluentSeekBar setMax(int max) {
        seekBar.setMax(max);
        return this;
    }


    public FluentSeekBar setSplitTrack(boolean splitTrack) {
        seekBar.setSplitTrack(splitTrack);
        return this;
    }


    public FluentSeekBar setThumb(Drawable thumb) {
        seekBar.setThumb(thumb);
        return this;
    }


    public FluentSeekBar setThumbOffset(int thumbOffset) {
        seekBar.setThumbOffset(thumbOffset);
        return this;
    }


    public FluentSeekBar setThumbTintList(ColorStateList tint) {
        seekBar.setThumbTintList(tint);
        return this;
    }


    public FluentSeekBar setThumbTintMode(PorterDuff.Mode tintMode) {
        seekBar.setThumbTintMode(tintMode);
        return this;
    }
}
