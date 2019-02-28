package edu.qc.seclass.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final String check_Amount_Value = "checkAmountValue";
    private static final String party_Size_Value = "partySizeValue";

    private double checkAmountValue; //check amount entered by user
    private int partySizeValue; //party size entered by user
    private EditText fifteenPercentTipValue;
    private EditText twentyPercentTipValue;
    private EditText twentyfivePercentTipValue;
    private EditText fifteenPercentTotalValue;
    private EditText twentyPercentTotalValue;
    private EditText twentyfivePercentTotalValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (checkAmountValue==null){

        }


    }
}
