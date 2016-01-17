package com.github.nantaphop.fluentview;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentImageView extends FluentView{
    ImageView imageView;

    public FluentImageView(ImageView imageView) {
        super(((View) imageView));
        this.imageView = imageView;
    }


    public FluentImageView setAdjustViewBounds(boolean adjustViewBounds) {
        imageView.setAdjustViewBounds(adjustViewBounds);
        return this;
    }


    public FluentImageView setAlpha(int alpha) {
        imageView.setAlpha(alpha);
        return this;
    }


    public FluentImageView setBaseline(int baseline) {
        imageView.setBaseline(baseline);
        return this;
    }


    public FluentImageView setBaselineAlignBottom(boolean aligned) {
        imageView.setBaselineAlignBottom(aligned);
        return this;
    }


    public FluentImageView setColorFilter(ColorFilter cf) {
        imageView.setColorFilter(cf);
        return this;
    }


    public FluentImageView setCropToPadding(boolean cropToPadding) {
        imageView.setCropToPadding(cropToPadding);
        return this;
    }

    public FluentImageView setImageAlpha(int alpha) {
        imageView.setImageAlpha(alpha);
        return this;
    }


    public FluentImageView setImageBitmap(Bitmap bm) {
        imageView.setImageBitmap(bm);
        return this;
    }


    public FluentImageView setImageDrawable(Drawable drawable) {
        imageView.setImageDrawable(drawable);
        return this;
    }


    public FluentImageView setImageIcon(Icon icon) {
        imageView.setImageIcon(icon);
        return this;
    }


    public FluentImageView setImageLevel(int level) {
        imageView.setImageLevel(level);
        return this;
    }


    public FluentImageView setImageMatrix(Matrix matrix) {
        imageView.setImageMatrix(matrix);
        return this;
    }


    public FluentImageView setImageResource(int resId) {
        imageView.setImageResource(resId);
        return this;
    }


    public FluentImageView setImageState(int[] state, boolean merge) {
        imageView.setImageState(state, merge);
        return this;
    }


    public FluentImageView setImageTintList(ColorStateList tint) {
        imageView.setImageTintList(tint);
        return this;
    }


    public FluentImageView setImageTintMode(PorterDuff.Mode tintMode) {
        imageView.setImageTintMode(tintMode);
        return this;
    }


    public FluentImageView setImageURI(Uri uri) {
        imageView.setImageURI(uri);
        return this;
    }


    public FluentImageView setMaxHeight(int maxHeight) {
        imageView.setMaxHeight(maxHeight);
        return this;
    }


    public FluentImageView setMaxWidth(int maxWidth) {
        imageView.setMaxWidth(maxWidth);
        return this;
    }


    public FluentImageView setScaleType(ImageView.ScaleType scaleType) {
        imageView.setScaleType(scaleType);
        return this;
    }


    public FluentImageView setSelected(boolean selected) {
        imageView.setSelected(selected);
        return this;
    }


    public FluentImageView setVisibility(int visibility) {
        imageView.setVisibility(visibility);
        return this;
    }
}
