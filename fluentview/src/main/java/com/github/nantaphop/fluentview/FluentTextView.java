package com.github.nantaphop.fluentview;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.StringRes;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.widget.Scroller;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.Locale;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentTextView extends FluentView{

    TextView textView;

    public FluentTextView(TextView textView) {
        super((View)textView);
        this.textView = textView;
    }


    public FluentTextView setEnabled(boolean enabled) {
        textView.setEnabled(enabled);
        return this;
    }


    public FluentTextView setTypeface(Typeface tf, int style) {
        textView.setTypeface(tf, style);
        return this;
    }


    public FluentTextView setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        textView.setCompoundDrawables(left, top, right, bottom);
        return this;
    }


    public FluentTextView setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) {
        textView.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        return this;
    }


    public FluentTextView setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        textView.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        return this;
    }


    public FluentTextView setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        textView.setCompoundDrawablesRelative(start, top, end, bottom);
        return this;
    }


    public FluentTextView setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        return this;
    }


    public FluentTextView setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        return this;
    }


    public FluentTextView setCompoundDrawablePadding(int pad) {
        textView.setCompoundDrawablePadding(pad);
        return this;
    }


    public FluentTextView setCompoundDrawableTintList(ColorStateList tint) {
        textView.setCompoundDrawableTintList(tint);
        return this;
    }


    public FluentTextView setCompoundDrawableTintMode(PorterDuff.Mode tintMode) {
        textView.setCompoundDrawableTintMode(tintMode);
        return this;
    }


    public FluentTextView setPadding(int left, int top, int right, int bottom) {
        textView.setPadding(left, top, right, bottom);
        return this;
    }


    public FluentTextView setPaddingRelative(int start, int top, int end, int bottom) {
        textView.setPaddingRelative(start, top, end, bottom);
        return this;
    }


    public FluentTextView setTextAppearance(int resId) {
        textView.setTextAppearance(resId);
        return this;
    }


    public FluentTextView setTextLocale(Locale locale) {
        textView.setTextLocale(locale);
        return this;
    }


    public FluentTextView setTextSize(float size) {
        textView.setTextSize(size);
        return this;
    }


    public FluentTextView setTextSize(int unit, float size) {
        textView.setTextSize(unit, size);
        return this;
    }


    public FluentTextView setTextScaleX(float size) {
        textView.setTextScaleX(size);
        return this;
    }


    public FluentTextView setTypeface(Typeface tf) {
        textView.setTypeface(tf);
        return this;
    }


    public FluentTextView setElegantTextHeight(boolean elegant) {
        textView.setElegantTextHeight(elegant);
        return this;
    }


    public FluentTextView setLetterSpacing(float letterSpacing) {
        textView.setLetterSpacing(letterSpacing);
        return this;
    }


    public FluentTextView setBreakStrategy(int breakStrategy) {
        textView.setBreakStrategy(breakStrategy);
        return this;
    }


    public FluentTextView setHyphenationFrequency(int hyphenationFrequency) {
        textView.setHyphenationFrequency(hyphenationFrequency);
        return this;
    }


    public FluentTextView setFontFeatureSettings(String fontFeatureSettings) {
        textView.setFontFeatureSettings(fontFeatureSettings);
        return this;
    }


    public FluentTextView setTextColor(int color) {
        textView.setTextColor(color);
        return this;
    }


    public FluentTextView setTextColor(ColorStateList colors) {
        textView.setTextColor(colors);
        return this;
    }


    public FluentTextView setHighlightColor(int color) {
        textView.setHighlightColor(color);
        return this;
    }


    public FluentTextView setShadowLayer(float radius, float dx, float dy, int color) {
        textView.setShadowLayer(radius, dx, dy, color);
        return this;
    }


    public FluentTextView setGravity(int gravity) {
        textView.setGravity(gravity);
        return this;
    }


    public FluentTextView setPaintFlags(int flags) {
        textView.setPaintFlags(flags);
        return this;
    }


    public FluentTextView setHorizontallyScrolling(boolean whether) {
        textView.setHorizontallyScrolling(whether);
        return this;
    }


    public FluentTextView setMinLines(int minlines) {
        textView.setMinLines(minlines);
        return this;
    }


    public FluentTextView setMinHeight(int minHeight) {
        textView.setMinHeight(minHeight);
        return this;
    }


    public FluentTextView setMaxLines(int maxlines) {
        textView.setMaxLines(maxlines);
        return this;
    }


    public FluentTextView setMaxHeight(int maxHeight) {
        textView.setMaxHeight(maxHeight);
        return this;
    }


    public FluentTextView setLines(int lines) {
        textView.setLines(lines);
        return this;
    }


    public FluentTextView setHeight(int pixels) {
        textView.setHeight(pixels);
        return this;
    }


    public FluentTextView setMinEms(int minems) {
        textView.setMinEms(minems);
        return this;
    }


    public FluentTextView setMinWidth(int minpixels) {
        textView.setMinWidth(minpixels);
        return this;
    }


    public FluentTextView setMaxEms(int maxems) {
        textView.setMaxEms(maxems);
        return this;
    }


    public FluentTextView setMaxWidth(int maxpixels) {
        textView.setMaxWidth(maxpixels);
        return this;
    }


    public FluentTextView setEms(int ems) {
        textView.setEms(ems);
        return this;
    }


    public FluentTextView setWidth(int pixels) {
        textView.setWidth(pixels);
        return this;
    }


    public FluentTextView setLineSpacing(float add, float mult) {
        textView.setLineSpacing(add, mult);
        return this;
    }


    public FluentTextView setFreezesText(boolean freezesText) {
        textView.setFreezesText(freezesText);
        return this;
    }

    public FluentTextView setText(CharSequence text, TextView.BufferType type) {
        textView.setText(text, type);
        return this;
    }

    public FluentTextView setText(String text) {
        textView.setText(text);
        return this;
    }

    public FluentTextView setText(@StringRes int stringRes) {
        textView.setText(stringRes);
        return this;
    }

    public FluentTextView setCustomInsertionActionModeCallback(ActionMode.Callback actionModeCallback) {
        textView.setCustomInsertionActionModeCallback(actionModeCallback);
        return this;
    }


    public FluentTextView setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        textView.setCustomSelectionActionModeCallback(actionModeCallback);
        return this;
    }


    public FluentTextView setScroller(Scroller s) {
        textView.setScroller(s);
        return this;
    }


    public FluentTextView setSelected(boolean selected) {
        textView.setSelected(selected);
        return this;
    }


    public FluentTextView setCursorVisible(boolean visible) {
        textView.setCursorVisible(visible);
        return this;
    }


    public FluentTextView setSelectAllOnFocus(boolean selectAllOnFocus) {
        textView.setSelectAllOnFocus(selectAllOnFocus);
        return this;
    }


    public FluentTextView setMarqueeRepeatLimit(int marqueeLimit) {
        textView.setMarqueeRepeatLimit(marqueeLimit);
        return this;
    }


    public FluentTextView setEllipsize(TextUtils.TruncateAt where) {
        textView.setEllipsize(where);
        return this;
    }


    public FluentTextView setSingleLine(boolean singleLine) {
        textView.setSingleLine(singleLine);
        return this;
    }


    public FluentTextView setAllCaps(boolean allCaps) {
        textView.setAllCaps(allCaps);
        return this;
    }


    public FluentTextView setSingleLine() {
        textView.setSingleLine();
        return this;
    }


    public FluentTextView setIncludeFontPadding(boolean includepad) {
        textView.setIncludeFontPadding(includepad);
        return this;
    }


    public FluentTextView setExtractedText(ExtractedText text) {
        textView.setExtractedText(text);
        return this;
    }


    public FluentTextView setTextIsSelectable(boolean selectable) {
        textView.setTextIsSelectable(selectable);
        return this;
    }


    public FluentTextView setFilters(InputFilter[] filters) {
        textView.setFilters(filters);
        return this;
    }

    public FluentTextView setError(CharSequence error, Drawable icon) {
        textView.setError(error, icon);
        return this;
    }


    public FluentTextView setError(CharSequence error) {
        textView.setError(error);
        return this;
    }


    public FluentTextView setInputExtras(int xmlResId) throws XmlPullParserException, IOException {
        textView.setInputExtras(xmlResId);
        return this;
    }


    public FluentTextView setPrivateImeOptions(String type) {
        textView.setPrivateImeOptions(type);
        return this;
    }


    public FluentTextView setOnEditorActionListener(TextView.OnEditorActionListener l) {
        textView.setOnEditorActionListener(l);
        return this;
    }


    public FluentTextView setImeActionLabel(CharSequence label, int actionId) {
        textView.setImeActionLabel(label, actionId);
        return this;
    }


    public FluentTextView setImeOptions(int imeOptions) {
        textView.setImeOptions(imeOptions);
        return this;
    }


    public FluentTextView setRawInputType(int type) {
        textView.setRawInputType(type);
        return this;
    }


    public FluentTextView setInputType(int type) {
        textView.setInputType(type);
        return this;
    }


    public FluentTextView setKeyListener(KeyListener input) {
        textView.setKeyListener(input);
        return this;
    }

}
