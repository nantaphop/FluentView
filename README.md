# FluentView
Android Library for Setting a View via Fluent Interface

#Welcome for Pull Request 

##Features
Set up Android View via fluent interface style. Basically, you can use most of setter for that view. CustomView is welcome but you have to casting it by yourself.

#Setup
**Gradle (jCenter)**
```
dependencies {
  compile 'com.github.nantaphop:fluentview:1.0.0'
}
```

## Example
```
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // FluentTextView
        Fluent.withTextView(this, R.id.text)
                .setText("Hello From FluentView")
                .setTextColor(Color.parseColor("#ff00ff"))
                .setAllCaps(true);

        // Or pass View Object (May be already injected by ButterKnife or etc.)
        TextView text = (TextView) findViewById(R.id.text);
        Fluent.with(text)
                .setText("Hello From FluentView")
                .setTextColor(Color.parseColor("#ff00ff"))
                .setAllCaps(true);
                
        // For CustomView you have to manual casting like this
        MyCustomTextView customText = (TextView) findViewById(R.id.customeTextView);
        Fluent.with((TextView)customText)
                .setText("Hello From FluentView")
                .setTextColor(Color.parseColor("#ff00ff"))
                .setAllCaps(true);
                
        // You can new Object of FluentView too
        FluentTextView fluentText = new FluentTextView(text);
        if(1+1 == 2){
          fluentText.setText("YES")
                    .setTextColor(Color.parseColor("#ff00ff"));
        } else{
            fluentText.setText("NOOOO")
                    .setTextColor(Color.parseColor("#0000ff"));
        }

        // FluentImageView
        Fluent.withImageView(this, R.id.imageView)
                .setImageResource(R.drawable.ic_action_action_history)
                .setScaleType(ImageView.ScaleType.FIT_CENTER);

        // FluentButton
        Fluent.withButton(this, R.id.button)
                .setText("Hello From FluentButton")
                .setAllCaps(true);
    }
```

##Avalible Fluent View Support
- FluentView
- FluentTextView
- FluentEditText
- FluentButton
- FluentImageView
- FluentImageButton
- FluentCompoundButton
- FluentCheckBox
- FluentRadioButton
- FluentSwitch
- FluentToggleButton
- FluentProgressBar
- FluentSeekBar

#License
```
Copyright 2016 Nantaphop Phuengphae

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
