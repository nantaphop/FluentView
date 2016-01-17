package com.github.nantaphop.fluentview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentProgressBar extends FluentView {

    ProgressBar progressBar;

    public FluentProgressBar(ProgressBar progressBar) {
        super(((View) progressBar));
        this.progressBar = progressBar;
    }


    public synchronized FluentProgressBar setIndeterminate(boolean indeterminate) {
        progressBar.setIndeterminate(indeterminate);
        return this;
    }

    
    public FluentProgressBar setIndeterminateDrawable(Drawable d) {
        progressBar.setIndeterminateDrawable(d);
        return this;
    }


    public FluentProgressBar setIndeterminateDrawableTiled(Drawable d) {
        progressBar.setIndeterminateDrawableTiled(d);
        return this;
    }

    
    public FluentProgressBar setIndeterminateTintList(ColorStateList tint) {
        progressBar.setIndeterminateTintList(tint);
        return this;
    }

    
    public FluentProgressBar setIndeterminateTintMode(PorterDuff.Mode tintMode) {
        progressBar.setIndeterminateTintMode(tintMode);
        return this;
    }

    
    public FluentProgressBar setInterpolator(Context context, int resID) {
        progressBar.setInterpolator(context, resID);
        return this;
    }

    
    public FluentProgressBar setInterpolator(Interpolator interpolator) {
        progressBar.setInterpolator(interpolator);
        return this;
    }

    
    public synchronized FluentProgressBar setMax(int max) {
        progressBar.setMax(max);
        return this;
    }

    
    public synchronized FluentProgressBar setProgress(int progress) {
        progressBar.setProgress(progress);
        return this;
    }

    
    public FluentProgressBar setProgressBackgroundTintList(ColorStateList tint) {
        progressBar.setProgressBackgroundTintList(tint);
        return this;
    }

    
    public FluentProgressBar setProgressBackgroundTintMode(PorterDuff.Mode tintMode) {
        progressBar.setProgressBackgroundTintMode(tintMode);
        return this;
    }

    
    public FluentProgressBar setProgressDrawable(Drawable d) {
        progressBar.setProgressDrawable(d);
        return this;
    }

    
    public FluentProgressBar setProgressDrawableTiled(Drawable d) {
        progressBar.setProgressDrawableTiled(d);
        return this;
    }

    
    public FluentProgressBar setProgressTintList(ColorStateList tint) {
        progressBar.setProgressTintList(tint);
        return this;
    }

    
    public FluentProgressBar setProgressTintMode(PorterDuff.Mode tintMode) {
        progressBar.setProgressTintMode(tintMode);
        return this;
    }

    
    public synchronized FluentProgressBar setSecondaryProgress(int secondaryProgress) {
        progressBar.setSecondaryProgress(secondaryProgress);
        return this;
    }

    
    public FluentProgressBar setSecondaryProgressTintList(ColorStateList tint) {
        progressBar.setSecondaryProgressTintList(tint);
        return this;
    }

    
    public FluentProgressBar setSecondaryProgressTintMode(PorterDuff.Mode tintMode) {
        progressBar.setSecondaryProgressTintMode(tintMode);
        return this;
    }

    
    public FluentProgressBar setVisibility(int v) {
        progressBar.setVisibility(v);
        return this;
    }
}
