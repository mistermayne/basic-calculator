package com.basiccalculator.mybasiccalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private Button btnAdd,btnsub,btndivide,btnmul;
    private TextView tvresult;

    private EditText etfirst,etsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnAdd =(Button)findViewById(R.id.btnAdd);
        btnsub = (Button)findViewById(R.id.btnSubtract);
        btndivide = (Button)findViewById(R.id.btnDivide);
        btnmul = (Button)findViewById(R.id.btnMultiply);
        etfirst = (EditText)findViewById(R.id.etFirstNumber);
        etsecond =(EditText)findViewById(R.id.etSecondNumber);
        tvresult = (TextView)findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmul.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num1 = etfirst.getText().toString();
        String num2 = etsecond.getText().toString();
        switch(view.getId()){
            case R.id.btnAdd:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                tvresult.setText(String.valueOf(addition));
                break;
            case R.id.btnSubtract:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                tvresult.setText(String.valueOf(subtraction));
                break;
            case R.id.btnDivide:
                try{
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(division));
                }catch(Exception e){
                    tvresult.setText("Cannot DIVIDE!");
                }
                break;
            case R.id.btnMultiply:
                int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
                tvresult.setText(String.valueOf(multiply));
                break;
        }
    }
}