package com.github.nantaphop.fluentview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.widget.Switch;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentSwitch extends FluentCompoundButton {

    Switch aSwitch;

    public FluentSwitch(Switch aSwitch) {
        super((CompoundButton) aSwitch);
        this.aSwitch = aSwitch;
    }


    public FluentSwitch setChecked(boolean checked) {
        aSwitch.setChecked(checked);
        return this;
    }


    public FluentSwitch setShowText(boolean showText) {
        aSwitch.setShowText(showText);
        return this;
    }


    public FluentSwitch setSplitTrack(boolean splitTrack) {
        aSwitch.setSplitTrack(splitTrack);
        return this;
    }


    public FluentSwitch setSwitchMinWidth(int pixels) {
        aSwitch.setSwitchMinWidth(pixels);
        return this;
    }


    public FluentSwitch setSwitchPadding(int pixels) {
        aSwitch.setSwitchPadding(pixels);
        return this;
    }


    public FluentSwitch setSwitchTextAppearance(Context context, int resid) {
        aSwitch.setSwitchTextAppearance(context, resid);
        return this;
    }


    public FluentSwitch setSwitchTypeface(Typeface tf) {
        aSwitch.setSwitchTypeface(tf);
        return this;
    }


    public FluentSwitch setSwitchTypeface(Typeface tf, int style) {
        aSwitch.setSwitchTypeface(tf, style);
        return this;
    }


    public FluentSwitch setTextOff(CharSequence textOff) {
        aSwitch.setTextOff(textOff);
        return this;
    }


    public FluentSwitch setTextOn(CharSequence textOn) {
        aSwitch.setTextOn(textOn);
        return this;
    }


    public FluentSwitch setThumbDrawable(Drawable thumb) {
        aSwitch.setThumbDrawable(thumb);
        return this;
    }


    public FluentSwitch setThumbResource(int resId) {
        aSwitch.setThumbResource(resId);
        return this;
    }


    public FluentSwitch setThumbTextPadding(int pixels) {
        aSwitch.setThumbTextPadding(pixels);
        return this;
    }


    public FluentSwitch setThumbTintList(ColorStateList tint) {
        aSwitch.setThumbTintList(tint);
        return this;
    }


    public FluentSwitch setThumbTintMode(PorterDuff.Mode tintMode) {
        aSwitch.setThumbTintMode(tintMode);
        return this;
    }


    public FluentSwitch setTrackDrawable(Drawable track) {
        aSwitch.setTrackDrawable(track);
        return this;
    }


    public FluentSwitch setTrackResource(int resId) {
        aSwitch.setTrackResource(resId);
        return this;
    }


    public FluentSwitch setTrackTintList(ColorStateList tint) {
        aSwitch.setTrackTintList(tint);
        return this;
    }


    public FluentSwitch setTrackTintMode(PorterDuff.Mode tintMode) {
        aSwitch.setTrackTintMode(tintMode);
        return this;
    }
}
