package com.example.user.homecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    private TextView textinput;
    public String firststring;
    public float firstint=0;
    public float secondint=0;
    public String secondstring;
    public String indicator=null;
    private float res=0,num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        textinput=(TextView)findViewById(R.id.textinput);

    }

    public void clicked1(View v){
       if(textinput.getText().toString().length()<11){
        textinput.append("1");}
    }

    public void clicked2(View v){
        if(textinput.getText().toString().length()<11) {
            textinput.append("2");
        }
    }

    public void clicked3(View v){
        if(textinput.getText().toString().length()<11){
            textinput.append("3");
    }
    }

    public void clicked4(View v){
        if(textinput.getText().toString().length()<11){
            textinput.append("4");
        }
    }

    public void clicked5(View v){
        if(textinput.getText().toString().length()<11){
            textinput.append("5");
    }
    }

    public void clicked6(View v){
        if(textinput.getText().toString().length()<11){
            textinput.append("6");
    }
    }

    public void clicked7(View v){
        if(textinput.getText().toString().length()<11){
            textinput.append("7");
    }
    }

    public void clicked8(View v){
        if(textinput.getText().toString().length()<11){
            textinput.append("8");
    }
    }

    public void clicked9(View v){
        if(textinput.getText().toString().length()<11){
            textinput.append("9");
    }
    }

    public void clicked0(View v){
        if(textinput.getText().toString().length()<11){
            textinput.append("0");
        }
    }

    public void clickedappend(View v){
        if(textinput.getText().toString().length()==0){
            textinput.setText("0.");
        }
        else if(textinput.getText().toString().length()<11){
            textinput.append(".");
        }

    }

    public void clickedclr(View v){
        if(textinput.getText().toString()=="OUT OF RANGE"){
            String s = null;
            textinput.setText(s);
            firststring=null;
        }
        String number=textinput.getText().toString();
        if(number.length()>=1){
        number=number.substring(0,number.length()-1);
        textinput.setText(number);}
    }

    public void clickeddiv(View v){
        inputreder();
        indicator="div";

    }

    public void clickedmul(View v){
        inputreder();
        indicator="mul";
    }

    public void clickedplus(View v){
        inputreder();
        indicator="plus";
    }

    public void clickedminus(View v){
        inputreder();
        indicator="minus";
    }

    public void clickedper(View v){
        inputreder();
        indicator="percentage";
    }

    public void clickedequal(View v){
        if(textinput.getText().toString().length()!=0){
            secondinputreader();
            if(indicator=="div") {
                res =firstint/secondint;
            }
            if(indicator=="mul"){
                res=firstint*secondint;
            }
            if(indicator=="plus"){
                res=firstint+secondint;
            }
            if(indicator=="minus"){
                res=firstint-secondint;
            }
            if(indicator=="percentage"){
                res=(firstint/secondint)*100;
            }

            textinput.setText(Float.toString(res));

            if(Float.toString(res).length()>10){
                textinput.setText("OUT OF RANGE");
            }
           indicator=null;
        }


    }

    public void inputreder(){
           firststring = textinput.getText().toString();
           firstint = Float.parseFloat(firststring);
           String s = null;
           textinput.setText(s);
    }

    public void clickedclrall(View v){
        String s=null;
        textinput.setText(s);
    }

    public void clickedsignchange(View v){
        num=0;
        if(textinput.getText().toString().length()!=0){
            num=Float.parseFloat(textinput.getText().toString());
            num=-num;
            textinput.setText(Float.toString(num));
        }
        else{
            textinput.setText("-");
        }

    }

    public void secondinputreader(){
        secondstring = textinput.getText().toString();
        secondint=Float.parseFloat(secondstring);
    }
}
