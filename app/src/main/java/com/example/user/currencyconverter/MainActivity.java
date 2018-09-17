package com.example.user.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void dollartotaka() {
        EditText Edittext1 = (EditText) findViewById(R.id.edittext1);
        Edittext1.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText Edittext2 = (EditText) findViewById(R.id.edittext1);
        Edittext2.setInputType(InputType.TYPE_CLASS_NUMBER);
        double a = Integer.parseInt(Edittext1.getText().toString());
        Double result = a * 84.15;
        Edittext2.setText(String.valueOf(result));
    }
    void takatodollar()
    {
        EditText Edittext1=(EditText)findViewById(R.id.edittext1);
        Edittext1.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText Edittext2=(EditText)findViewById(R.id.edittext1);
        Edittext2.setInputType(InputType.TYPE_CLASS_NUMBER);


        double a=Integer.parseInt(Edittext2.getText().toString());
        Double result=a/84.15;
        Edittext1.setText(String.valueOf(result));


    }
    void rupeetotaka(){

        EditText Edittext3=(EditText)findViewById(R.id.edittext3);
        Edittext3.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText Edittext4=(EditText)findViewById(R.id.edittext4);
        Edittext4.setInputType(InputType.TYPE_CLASS_NUMBER);



        double b=Integer.parseInt(Edittext3.getText().toString());
        Double result2=b*0.86;
        Edittext4.setText(String.valueOf(result2));

    }
    void takatorupee(){

        EditText Edittext3=(EditText)findViewById(R.id.edittext3);
        Edittext3.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText Edittext4=(EditText)findViewById(R.id.edittext4);
        Edittext4.setInputType(InputType.TYPE_CLASS_NUMBER);
        double b=Integer.parseInt(Edittext4.getText().toString());
        Double result2=b/0.84;
        Edittext4.setText(String.valueOf(result2));

    }

    public void click(View view){

        dollartotaka();
        Button button2=(Button)findViewById(R.id.button2);
        button2.setEnabled(false);
    }
    public void click2(View view){

        takatodollar();
        Button button2=(Button)findViewById(R.id.button2);
        button2.setEnabled(false);


    }
    public void click3(View view){

        rupeetotaka();
        Button button3=(Button)findViewById(R.id.button3);
        button3.setEnabled(false);
    }
    public void click4(View view){

        takatorupee();
        Button button4=(Button)findViewById(R.id.button4);
        button4.setEnabled(false);
    }

    public void reset(View view)
    {

        Button button1=(Button)findViewById(R.id.button1);
        button1.setEnabled(true);
        Button button2=(Button)findViewById(R.id.button2);
        button2.setEnabled(true);
        Button button3=(Button)findViewById(R.id.button3);
        button3.setEnabled(true);
        Button button4=(Button)findViewById(R.id.button4);
        button4.setEnabled(true);
        EditText Edittext1=(EditText)findViewById(R.id.edittext1);
        EditText Edittext2=(EditText)findViewById(R.id.edittext2);
        EditText Edittext3=(EditText)findViewById(R.id.edittext3);
        EditText Edittext4=(EditText)findViewById(R.id.edittext4);
        Edittext1.setText("");
        Edittext2.setText("");

        Edittext3.setText("");
        Edittext4.setText("");
    }



}
