package com.github.nantaphop.fluentview;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by nantaphop on 17-Jan-16.
 */
public class Fluent {
    private Fluent() {
    };

    public static FluentTextView withTextView(@NonNull Activity activity, @IdRes int id) {
        return new FluentTextView((TextView) activity.findViewById(id));
    }

    public static FluentTextView withTextView(@NonNull ViewGroup viewGroup, @IdRes int id) {
        return new FluentTextView((TextView) viewGroup.findViewById(id));
    }

    public static FluentTextView with(TextView textView) {
        return new FluentTextView(textView);
    }

    public static FluentImageView withImageView(@NonNull Activity activity, @IdRes int id) {
        return new FluentImageView((ImageView) activity.findViewById(id));
    }

    public static FluentImageView withImageView(@NonNull ViewGroup viewGroup, @IdRes int id) {
        return new FluentImageView((ImageView) viewGroup.findViewById(id));
    }

    public static FluentImageView with(ImageView imageView) {
        return new FluentImageView(imageView);
    }

    public static FluentButton withButton(@NonNull Activity activity, @IdRes int id) {
        return new FluentButton((Button) activity.findViewById(id));
    }

    public static FluentButton withButton(@NonNull ViewGroup viewGroup, @IdRes int id) {
        return new FluentButton((Button) viewGroup.findViewById(id));
    }

    public static FluentButton with(Button button) {
        return new FluentButton(button);
    }

    public static FluentRadioButton withRadioButton(@NonNull Activity activity, @IdRes int id) {
        return new FluentRadioButton((RadioButton) activity.findViewById(id));
    }

    public static FluentRadioButton withRadioButton(@NonNull ViewGroup viewGroup, @IdRes int id) {
        return new FluentRadioButton((RadioButton) viewGroup.findViewById(id));
    }

    public static FluentRadioButton with(RadioButton button) {
        return new FluentRadioButton(button);
    }

    public static FluentCheckBox withCheckBox(@NonNull Activity activity, @IdRes int id) {
        return new FluentCheckBox((CheckBox) activity.findViewById(id));
    }

    public static FluentCheckBox withCheckBox(@NonNull ViewGroup viewGroup, @IdRes int id) {
        return new FluentCheckBox((CheckBox) viewGroup.findViewById(id));
    }

    public static FluentCheckBox with(CheckBox button) {
        return new FluentCheckBox(button);
    }

    public static FluentSwitch withSwitch(@NonNull Activity activity, @IdRes int id) {
        return new FluentSwitch((Switch) activity.findViewById(id));
    }

    public static FluentSwitch withSwitch(@NonNull ViewGroup viewGroup, @IdRes int id) {
        return new FluentSwitch((Switch) viewGroup.findViewById(id));
    }

    public static FluentSwitch with(Switch button) {
        return new FluentSwitch(button);
    }

    public static FluentToggleButton withToggleButton(@NonNull Activity activity, @IdRes int id) {
        return new FluentToggleButton((ToggleButton) activity.findViewById(id));
    }

    public static FluentToggleButton withToggleButton(@NonNull ViewGroup viewGroup, @IdRes int id) {
        return new FluentToggleButton((ToggleButton) viewGroup.findViewById(id));
    }


    public static FluentToggleButton with(ToggleButton button) {
        return new FluentToggleButton(button);
    }

    public static FluentImageButton withImageButton(@NonNull Activity activity, @IdRes int id) {
        return new FluentImageButton((ImageButton) activity.findViewById(id));
    }

    public static FluentImageButton withImageButton(@NonNull ViewGroup viewGroup, @IdRes int id) {
        return new FluentImageButton((ImageButton) viewGroup.findViewById(id));
    }

    public static FluentImageButton with(ImageButton button) {
        return new FluentImageButton(button);
    }

    public static FluentProgressBar withProgressBar(@NonNull Activity activity, @IdRes int id) {
        return new FluentProgressBar((ProgressBar) activity.findViewById(id));
    }

    public static FluentProgressBar withProgressBar(@NonNull ViewGroup viewGroup, @IdRes int id) {
        return new FluentProgressBar((ProgressBar) viewGroup.findViewById(id));
    }

    public static FluentProgressBar with(ProgressBar button) {
        return new FluentProgressBar(button);
    }

    public static FluentSeekBar withSeekBar(@NonNull Activity activity, @IdRes int id) {
        return new FluentSeekBar((SeekBar) activity.findViewById(id));
    }

    public static FluentSeekBar withSeekBar(@NonNull ViewGroup viewGroup, @IdRes int id) {
        return new FluentSeekBar((SeekBar) viewGroup.findViewById(id));
    }

    public static FluentSeekBar with(SeekBar button) {
        return new FluentSeekBar(button);
    }

    public static FluentEditText withEditText(@NonNull Activity activity, @IdRes int id) {
        return new FluentEditText((EditText) activity.findViewById(id));
    }

    public static FluentEditText withEditText(@NonNull ViewGroup viewGroup, @IdRes int id) {
        return new FluentEditText((EditText) viewGroup.findViewById(id));
    }

    public static FluentEditText with(EditText button) {
        return new FluentEditText(button);
    }
}
