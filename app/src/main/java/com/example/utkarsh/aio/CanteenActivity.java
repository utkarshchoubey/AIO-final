package com.example.utkarsh.aio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CanteenActivity extends AppCompatActivity {

    int minteger1 = 0,minteger2 = 0,minteger3 = 0,minteger4 = 0,minteger5 = 0,minteger6 = 0,minteger7 = 0,minteger8 = 0,minteger9 = 0,minteger10 = 0,minteger11 = 0,minteger12 = 0,minteger13 = 0,minteger14 = 0;
    private Button btn;
    private Button inc1;

    private TextView val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13,val14;
    private TextView price1,price2,price3,price4,price5,price6,price7,price8,price9,price10,price11,price12,price13,price14,pricetotal;
    int price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen);


        val1=(TextView)findViewById(R.id.integer_number1);
        price1=(TextView)findViewById(R.id.textViewPrice1);

        val2=(TextView)findViewById(R.id.integer_number2);
        price2=(TextView)findViewById(R.id.textViewPrice2);

        val3=(TextView)findViewById(R.id.integer_number3);
        price3=(TextView)findViewById(R.id.textViewPrice3);

        val4=(TextView)findViewById(R.id.integer_number4);
        price4=(TextView)findViewById(R.id.textViewPrice4);
        val5=(TextView)findViewById(R.id.integer_number5);
        price5=(TextView)findViewById(R.id.textViewPrice5);
        val6=(TextView)findViewById(R.id.integer_number6);
        price6=(TextView)findViewById(R.id.textViewPrice6);
        val7=(TextView)findViewById(R.id.integer_number7);
        price7=(TextView)findViewById(R.id.textViewPrice7);
        val8=(TextView)findViewById(R.id.integer_number8);
        price8=(TextView)findViewById(R.id.textViewPrice8);
        val9=(TextView)findViewById(R.id.integer_number9);
        price9=(TextView)findViewById(R.id.textViewPrice9);
        val10=(TextView)findViewById(R.id.integer_number10);
        price10=(TextView)findViewById(R.id.textViewPrice10);
        val11=(TextView)findViewById(R.id.integer_number11);
        price11=(TextView)findViewById(R.id.textViewPrice11);
        val12=(TextView)findViewById(R.id.integer_number12);
        price12=(TextView)findViewById(R.id.textViewPrice12);
        val13=(TextView)findViewById(R.id.integer_number13);
        price13=(TextView)findViewById(R.id.textViewPrice13);
        val14=(TextView)findViewById(R.id.integer_number14);
        price14=(TextView)findViewById(R.id.textViewPrice14);
        btn=(Button)findViewById(R.id.showbtn);
        pricetotal=(TextView)findViewById(R.id.pricetotal);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price=((Integer.parseInt(val1.getText().toString()))*(Integer.parseInt(price1.getText().toString())))+
                        (Integer.parseInt(val2.getText().toString())*(Integer.parseInt(price2.getText().toString())))+
                        (Integer.parseInt(val3.getText().toString())*(Integer.parseInt(price3.getText().toString())))+
                        (Integer.parseInt(val4.getText().toString())*(Integer.parseInt(price4.getText().toString())))+
                        (Integer.parseInt(val5.getText().toString())*(Integer.parseInt(price5.getText().toString())))+
                        (Integer.parseInt(val6.getText().toString())*(Integer.parseInt(price6.getText().toString())))+
                        (Integer.parseInt(val7.getText().toString())*(Integer.parseInt(price7.getText().toString())))+
                        (Integer.parseInt(val8.getText().toString())*(Integer.parseInt(price8.getText().toString())))+
                        (Integer.parseInt(val9.getText().toString())*(Integer.parseInt(price9.getText().toString())))+
                        (Integer.parseInt(val10.getText().toString())*(Integer.parseInt(price10.getText().toString())))+
                        (Integer.parseInt(val11.getText().toString())*(Integer.parseInt(price11.getText().toString())))+
                        (Integer.parseInt(val12.getText().toString())*(Integer.parseInt(price12.getText().toString())))+
                        (Integer.parseInt(val13.getText().toString())*(Integer.parseInt(price13.getText().toString())))+
                        (Integer.parseInt(val14.getText().toString())*(Integer.parseInt(price14.getText().toString())));


                String py=Integer.toString(price);
                Log.d("canteen",py);
                pricetotal.setText("Total-"+ Integer.toString(price));

            }
        });



    }



    public void increaseInteger1(View view) {
        minteger1 = minteger1 + 1;
        display1(minteger1);

    }
    public void decreaseInteger1(View view) {
        minteger1 = minteger1 - 1;
        display1(minteger1);
    }
    private void display1(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number1);
        displayInteger.setText("" + number);
    }
    public void increaseInteger2(View view) {
        minteger2 = minteger2 + 1;
        display2(minteger2);

    }public void decreaseInteger2(View view) {
        minteger2 = minteger2 - 1;
        display2(minteger2);
    }
    private void display2(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number2);
        displayInteger.setText("" + number);
    }
    public void increaseInteger3(View view) {
        minteger3 = minteger3 + 1;
        display3(minteger3);

    }public void decreaseInteger3(View view) {
        minteger3 = minteger3 - 1;
        display3(minteger3);
    }
    private void display3(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number3);
        displayInteger.setText("" + number);
    }
    public void increaseInteger4(View view) {
        minteger4 = minteger4 + 1;
        display4(minteger4);

    }public void decreaseInteger4(View view) {
        minteger4 = minteger4 - 1;
        display4(minteger4);
    }
    private void display4(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number4);
        displayInteger.setText("" + number);
    }
    public void increaseInteger5(View view) {
        minteger5 = minteger5 + 1;
        display5(minteger5);

    }public void decreaseInteger5(View view) {
        minteger5 = minteger5 - 1;
        display5(minteger5);
    }
    private void display5(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number5);
        displayInteger.setText("" + number);
    }
    public void increaseInteger6(View view) {
        minteger6 = minteger6 + 1;
        display6(minteger6);

    }public void decreaseInteger6(View view) {
        minteger6 = minteger6 - 1;
        display6(minteger6);
    }
    private void display6(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number6);
        displayInteger.setText("" + number);
    }
    public void increaseInteger7(View view) {
        minteger7 = minteger7 + 1;
        display7(minteger7);

    }public void decreaseInteger7(View view) {
        minteger1 = minteger1 - 1;
        display7(minteger1);
    }
    private void display7(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number7);
        displayInteger.setText("" + number);
    }
    public void increaseInteger8(View view) {
        minteger8 = minteger8 + 1;
        display8(minteger8);

    }public void decreaseInteger8(View view) {
        minteger1 = minteger8 - 1;
        display8(minteger8);
    }
    private void display8(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number8);
        displayInteger.setText("" + number);
    }
    public void increaseInteger9(View view) {
        minteger9 = minteger9 + 1;
        display9(minteger9);

    }public void decreaseInteger9(View view) {
        minteger9 = minteger9 - 1;
        display9(minteger9);
    }
    private void display9(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number9);
        displayInteger.setText("" + number);
    }
    public void increaseInteger10(View view) {
        minteger10 = minteger10 + 1;
        display10(minteger10);
    }public void decreaseInteger10(View view) {
        minteger10 = minteger10 - 1;
        display10(minteger10);
    }
    private void display10(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number10);
        displayInteger.setText("" + number);
    }
    public void increaseInteger11(View view) {
        minteger11 = minteger11 + 1;
        display10(minteger11
        );
    }public void decreaseInteger11(View view) {
        minteger11 = minteger11 - 1;
        display11(minteger11);
    }
    private void display11(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number11);
        displayInteger.setText("" + number);
    }
    public void increaseInteger12(View view) {
        minteger12 = minteger12 + 1;
        display12(minteger12);

    }public void decreaseInteger12(View view) {
        minteger12 = minteger12 - 1;
        display12(minteger12);
    }
    private void display12(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number12);
        displayInteger.setText("" + number);
    }
    public void increaseInteger13(View view) {
        minteger13 = minteger13 + 1;
        display13(minteger13);

    }public void decreaseInteger13(View view) {
        minteger13 = minteger13 - 1;
        display13(minteger13);
    }
    private void display13(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number13);
        displayInteger.setText("" + number);
    }
    public void increaseInteger14(View view) {
        minteger14 = minteger14 + 1;
        display14(minteger14);

    }public void decreaseInteger14(View view) {
        minteger14 = minteger14 - 1;
        display14(minteger14);
    }
    private void display14(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number14);
        displayInteger.setText("" + number);
    }

}
