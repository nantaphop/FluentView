package com.github.nantaphop.fluentview;

import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentView {
    View view;

    public FluentView(View view) {
        this.view = view;
    }

    public View getView() {
        return view;
    }

    public FluentView setAccessibilityDelegate(View.AccessibilityDelegate delegate) {
        view.setAccessibilityDelegate(delegate);
        return this;
    }


    public FluentView setAccessibilityLiveRegion(int mode) {
        view.setAccessibilityLiveRegion(mode);
        return this;
    }


    public FluentView setAccessibilityTraversalAfter(int afterId) {
        view.setAccessibilityTraversalAfter(afterId);
        return this;
    }


    public FluentView setAccessibilityTraversalBefore(int beforeId) {
        view.setAccessibilityTraversalBefore(beforeId);
        return this;
    }


    public FluentView setActivated(boolean activated) {
        view.setActivated(activated);
        return this;
    }


    public FluentView setAlpha(float alpha) {
        view.setAlpha(alpha);
        return this;
    }


    public FluentView setAnimation(Animation animation) {
        view.setAnimation(animation);
        return this;
    }


    public FluentView setBackground(Drawable background) {
        view.setBackground(background);
        return this;
    }


    public FluentView setBackgroundColor(int color) {
        view.setBackgroundColor(color);
        return this;
    }


    public FluentView setBackgroundDrawable(Drawable background) {
        view.setBackgroundDrawable(background);
        return this;
    }


    public FluentView setBackgroundResource(int resid) {
        view.setBackgroundResource(resid);
        return this;
    }


    public FluentView setBackgroundTintList(ColorStateList tint) {
        view.setBackgroundTintList(tint);
        return this;
    }


    public FluentView setBackgroundTintMode(PorterDuff.Mode tintMode) {
        view.setBackgroundTintMode(tintMode);
        return this;
    }


    public FluentView setCameraDistance(float distance) {
        view.setCameraDistance(distance);
        return this;
    }


    public FluentView setClickable(boolean clickable) {
        view.setClickable(clickable);
        return this;
    }


    public FluentView setClipBounds(Rect clipBounds) {
        view.setClipBounds(clipBounds);
        return this;
    }


    public FluentView setClipToOutline(boolean clipToOutline) {
        view.setClipToOutline(clipToOutline);
        return this;
    }


    public FluentView setContentDescription(CharSequence contentDescription) {
        view.setContentDescription(contentDescription);
        return this;
    }


    public FluentView setContextClickable(boolean contextClickable) {
        view.setContextClickable(contextClickable);
        return this;
    }


    public FluentView setDrawingCacheBackgroundColor(int color) {
        view.setDrawingCacheBackgroundColor(color);
        return this;
    }


    public FluentView setDrawingCacheEnabled(boolean enabled) {
        view.setDrawingCacheEnabled(enabled);
        return this;
    }


    public FluentView setDrawingCacheQuality(int quality) {
        view.setDrawingCacheQuality(quality);
        return this;
    }


    public FluentView setDuplicateParentStateEnabled(boolean enabled) {
        view.setDuplicateParentStateEnabled(enabled);
        return this;
    }


    public FluentView setElevation(float elevation) {
        view.setElevation(elevation);
        return this;
    }


    public FluentView setEnabled(boolean enabled) {
        view.setEnabled(enabled);
        return this;
    }


    public FluentView setFadingEdgeLength(int length) {
        view.setFadingEdgeLength(length);
        return this;
    }


    public FluentView setFilterTouchesWhenObscured(boolean enabled) {
        view.setFilterTouchesWhenObscured(enabled);
        return this;
    }


    public FluentView setFitsSystemWindows(boolean fitSystemWindows) {
        view.setFitsSystemWindows(fitSystemWindows);
        return this;
    }


    public FluentView setFocusable(boolean focusable) {
        view.setFocusable(focusable);
        return this;
    }


    public FluentView setFocusableInTouchMode(boolean focusableInTouchMode) {
        view.setFocusableInTouchMode(focusableInTouchMode);
        return this;
    }


    public FluentView setForeground(Drawable foreground) {
        view.setForeground(foreground);
        return this;
    }


    public FluentView setForegroundGravity(int gravity) {
        view.setForegroundGravity(gravity);
        return this;
    }


    public FluentView setForegroundTintList(ColorStateList tint) {
        view.setForegroundTintList(tint);
        return this;
    }


    public FluentView setForegroundTintMode(PorterDuff.Mode tintMode) {
        view.setForegroundTintMode(tintMode);
        return this;
    }


    public FluentView setHapticFeedbackEnabled(boolean hapticFeedbackEnabled) {
        view.setHapticFeedbackEnabled(hapticFeedbackEnabled);
        return this;
    }


    public FluentView setHasTransientState(boolean hasTransientState) {
        view.setHasTransientState(hasTransientState);
        return this;
    }


    public FluentView setHorizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled) {
        view.setHorizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled);
        return this;
    }


    public FluentView setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled) {
        view.setHorizontalScrollBarEnabled(horizontalScrollBarEnabled);
        return this;
    }


    public FluentView setHovered(boolean hovered) {
        view.setHovered(hovered);
        return this;
    }


    public FluentView setId(int id) {
        view.setId(id);
        return this;
    }


    public FluentView setImportantForAccessibility(int mode) {
        view.setImportantForAccessibility(mode);
        return this;
    }


    public FluentView setKeepScreenOn(boolean keepScreenOn) {
        view.setKeepScreenOn(keepScreenOn);
        return this;
    }


    public FluentView setLabelFor(int id) {
        view.setLabelFor(id);
        return this;
    }


    public FluentView setLayerPaint(Paint paint) {
        view.setLayerPaint(paint);
        return this;
    }


    public FluentView setLayerType(int layerType, Paint paint) {
        view.setLayerType(layerType, paint);
        return this;
    }


    public FluentView setLayoutDirection(int layoutDirection) {
        view.setLayoutDirection(layoutDirection);
        return this;
    }


    public FluentView setLayoutParams(ViewGroup.LayoutParams params) {
        view.setLayoutParams(params);
        return this;
    }


    public FluentView setLongClickable(boolean longClickable) {
        view.setLongClickable(longClickable);
        return this;
    }


    public FluentView setMinimumHeight(int minHeight) {
        view.setMinimumHeight(minHeight);
        return this;
    }


    public FluentView setMinimumWidth(int minWidth) {
        view.setMinimumWidth(minWidth);
        return this;
    }


    public FluentView setNestedScrollingEnabled(boolean enabled) {
        view.setNestedScrollingEnabled(enabled);
        return this;
    }


    public FluentView setNextFocusDownId(int nextFocusDownId) {
        view.setNextFocusDownId(nextFocusDownId);
        return this;
    }


    public FluentView setNextFocusForwardId(int nextFocusForwardId) {
        view.setNextFocusForwardId(nextFocusForwardId);
        return this;
    }


    public FluentView setNextFocusLeftId(int nextFocusLeftId) {
        view.setNextFocusLeftId(nextFocusLeftId);
        return this;
    }


    public FluentView setNextFocusRightId(int nextFocusRightId) {
        view.setNextFocusRightId(nextFocusRightId);
        return this;
    }


    public FluentView setNextFocusUpId(int nextFocusUpId) {
        view.setNextFocusUpId(nextFocusUpId);
        return this;
    }


    public FluentView setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        view.setOnApplyWindowInsetsListener(listener);
        return this;
    }


    public FluentView setOnClickListener(View.OnClickListener l) {
        view.setOnClickListener(l);
        return this;
    }


    public FluentView setOnContextClickListener(View.OnContextClickListener l) {
        view.setOnContextClickListener(l);
        return this;
    }


    public FluentView setOnCreateContextMenuListener(View.OnCreateContextMenuListener l) {
        view.setOnCreateContextMenuListener(l);
        return this;
    }


    public FluentView setOnDragListener(View.OnDragListener l) {
        view.setOnDragListener(l);
        return this;
    }


    public FluentView setOnFocusChangeListener(View.OnFocusChangeListener l) {
        view.setOnFocusChangeListener(l);
        return this;
    }


    public FluentView setOnGenericMotionListener(View.OnGenericMotionListener l) {
        view.setOnGenericMotionListener(l);
        return this;
    }


    public FluentView setOnHoverListener(View.OnHoverListener l) {
        view.setOnHoverListener(l);
        return this;
    }


    public FluentView setOnKeyListener(View.OnKeyListener l) {
        view.setOnKeyListener(l);
        return this;
    }


    public FluentView setOnLongClickListener(View.OnLongClickListener l) {
        view.setOnLongClickListener(l);
        return this;
    }


    public FluentView setOnScrollChangeListener(View.OnScrollChangeListener l) {
        view.setOnScrollChangeListener(l);
        return this;
    }


    public FluentView setOnSystemUiVisibilityChangeListener(View.OnSystemUiVisibilityChangeListener l) {
        view.setOnSystemUiVisibilityChangeListener(l);
        return this;
    }


    public FluentView setOnTouchListener(View.OnTouchListener l) {
        view.setOnTouchListener(l);
        return this;
    }


    public FluentView setOutlineProvider(ViewOutlineProvider provider) {
        view.setOutlineProvider(provider);
        return this;
    }


    public FluentView setOverScrollMode(int overScrollMode) {
        view.setOverScrollMode(overScrollMode);
        return this;
    }


    public FluentView setPadding(int left, int top, int right, int bottom) {
        view.setPadding(left, top, right, bottom);
        return this;
    }


    public FluentView setPaddingRelative(int start, int top, int end, int bottom) {
        view.setPaddingRelative(start, top, end, bottom);
        return this;
    }


    public FluentView setPivotX(float pivotX) {
        view.setPivotX(pivotX);
        return this;
    }


    public FluentView setPivotY(float pivotY) {
        view.setPivotY(pivotY);
        return this;
    }


    public FluentView setPressed(boolean pressed) {
        view.setPressed(pressed);
        return this;
    }


    public FluentView setRotation(float rotation) {
        view.setRotation(rotation);
        return this;
    }


    public FluentView setRotationX(float rotationX) {
        view.setRotationX(rotationX);
        return this;
    }


    public FluentView setRotationY(float rotationY) {
        view.setRotationY(rotationY);
        return this;
    }


    public FluentView setSaveEnabled(boolean enabled) {
        view.setSaveEnabled(enabled);
        return this;
    }


    public FluentView setSaveFromParentEnabled(boolean enabled) {
        view.setSaveFromParentEnabled(enabled);
        return this;
    }


    public FluentView setScaleX(float scaleX) {
        view.setScaleX(scaleX);
        return this;
    }


    public FluentView setScaleY(float scaleY) {
        view.setScaleY(scaleY);
        return this;
    }


    public FluentView setScrollBarDefaultDelayBeforeFade(int scrollBarDefaultDelayBeforeFade) {
        view.setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade);
        return this;
    }


    public FluentView setScrollBarFadeDuration(int scrollBarFadeDuration) {
        view.setScrollBarFadeDuration(scrollBarFadeDuration);
        return this;
    }


    public FluentView setScrollbarFadingEnabled(boolean fadeScrollbars) {
        view.setScrollbarFadingEnabled(fadeScrollbars);
        return this;
    }


    public FluentView setScrollBarSize(int scrollBarSize) {
        view.setScrollBarSize(scrollBarSize);
        return this;
    }


    public FluentView setScrollBarStyle(int style) {
        view.setScrollBarStyle(style);
        return this;
    }


    public FluentView setScrollContainer(boolean isScrollContainer) {
        view.setScrollContainer(isScrollContainer);
        return this;
    }


    public FluentView setScrollIndicators(int indicators) {
        view.setScrollIndicators(indicators);
        return this;
    }


    public FluentView setScrollIndicators(int indicators, int mask) {
        view.setScrollIndicators(indicators, mask);
        return this;
    }


    public FluentView setScrollX(int value) {
        view.setScrollX(value);
        return this;
    }


    public FluentView setScrollY(int value) {
        view.setScrollY(value);
        return this;
    }


    public FluentView setSelected(boolean selected) {
        view.setSelected(selected);
        return this;
    }


    public FluentView setSoundEffectsEnabled(boolean soundEffectsEnabled) {
        view.setSoundEffectsEnabled(soundEffectsEnabled);
        return this;
    }


    public FluentView setStateListAnimator(StateListAnimator stateListAnimator) {
        view.setStateListAnimator(stateListAnimator);
        return this;
    }


    public FluentView setSystemUiVisibility(int visibility) {
        view.setSystemUiVisibility(visibility);
        return this;
    }


    public FluentView setTag(int key, Object tag) {
        view.setTag(key, tag);
        return this;
    }


    public FluentView setTag(Object tag) {
        view.setTag(tag);
        return this;
    }


    public FluentView setTextAlignment(int textAlignment) {
        view.setTextAlignment(textAlignment);
        return this;
    }


    public FluentView setTextDirection(int textDirection) {
        view.setTextDirection(textDirection);
        return this;
    }


    public FluentView setTouchDelegate(TouchDelegate delegate) {
        view.setTouchDelegate(delegate);
        return this;
    }


    public FluentView setTranslationX(float translationX) {
        view.setTranslationX(translationX);
        return this;
    }


    public FluentView setTranslationY(float translationY) {
        view.setTranslationY(translationY);
        return this;
    }


    public FluentView setTranslationZ(float translationZ) {
        view.setTranslationZ(translationZ);
        return this;
    }


    public FluentView setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled) {
        view.setVerticalFadingEdgeEnabled(verticalFadingEdgeEnabled);
        return this;
    }


    public FluentView setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled) {
        view.setVerticalScrollBarEnabled(verticalScrollBarEnabled);
        return this;
    }


    public FluentView setVerticalScrollbarPosition(int position) {
        view.setVerticalScrollbarPosition(position);
        return this;
    }


    public FluentView setVisibility(int visibility) {
        view.setVisibility(visibility);
        return this;
    }


    public FluentView setWillNotCacheDrawing(boolean willNotCacheDrawing) {
        view.setWillNotCacheDrawing(willNotCacheDrawing);
        return this;
    }


    public FluentView setWillNotDraw(boolean willNotDraw) {
        view.setWillNotDraw(willNotDraw);
        return this;
    }


    public FluentView setX(float x) {
        view.setX(x);
        return this;
    }


    public FluentView setY(float y) {
        view.setY(y);
        return this;
    }


    public FluentView setZ(float z) {
        view.setZ(z);
        return this;
    }
}
