package com.github.nantaphop.fluentview;

import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class FluentEditText extends FluentTextView {

    EditText editText;

    public FluentEditText(EditText editText) {
        super(((EditText) editText));
        this.editText = editText;
    }

    public FluentEditText setEllipsize(TextUtils.TruncateAt ellipsis) {
        editText.setEllipsize(ellipsis);
        return this;
    }


    public FluentEditText setSelection(int index) {
        editText.setSelection(index);
        return this;
    }


    public FluentEditText setSelection(int start, int stop) {
        editText.setSelection(start, stop);
        return this;
    }


    public FluentEditText setText(CharSequence text, TextView.BufferType type) {
        editText.setText(text, type);
        return this;
    }
}
