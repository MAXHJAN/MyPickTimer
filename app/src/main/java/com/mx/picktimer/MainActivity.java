package com.mx.picktimer;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends Activity implements PickValueView.onSelectedChangeListener{

    PickValueView pickValues;
    TextView tvSelected;
    NumberPicker numberPicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pickValues = (PickValueView) findViewById(R.id.pickValues);
        tvSelected = (TextView) findViewById(R.id.Main_tvSelected);
        pickValues.setOnSelectedChangeListener(this);
        String value[] = new String[24];
        for (int i = 0; i < value.length; i++) {
            if (i<9)
              value[i] = "0"+(i + 1);
            else
                value[i] = ""+(i + 1);
        }
        String middle[] = new String[60];
        for (int i = 0; i < middle.length; i++) {
            if (i<9)
                middle[i] = "0"+(i + 1);
            else
                middle[i] = ""+(i + 1);
        }
        pickValues.setValueData(value, value[0], middle, middle[0]);
        numberPicker= (NumberPicker) findViewById(R.id.numberPicker2);
        numberPicker.setMaxValue(10);
        numberPicker.setMinValue(0);
        numberPicker.setWrapSelectorWheel(true);
    }

    @Override
    public void onSelected(PickValueView view, Object leftValue, Object rightValue) {
      /*  int left = (int) leftValue;
        int right = (int) rightValue;*/
        tvSelected.setText("selected: left:" + leftValue + "  right:" + rightValue);
    }
}
