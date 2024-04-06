package com.example.dynamic_usercontrol;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class CustomControl extends LinearLayout {
    private EditText editText;
    private Button buyButton;

    public CustomControl(Context context) {
        super(context);
        init(context);
    }

    public CustomControl(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomControl(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.custom_control_layout, this);
        editText = findViewById(R.id.editText);
        buyButton = findViewById(R.id.buyButton);
    }

    public String getText() {
        return editText.getText().toString();
    }

    public void setBuyButtonClickListener(OnClickListener listener) {
        buyButton.setOnClickListener(listener);
    }
}
