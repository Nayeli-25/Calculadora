package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    TextView tvOperacion;
    double resultado=0;
    boolean cambiarSigno=false;
    boolean porcentaje=false;
    boolean suma=false;
    boolean resta=false;
    boolean multiplicacion=false;
    boolean division=false;
    String numeros="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvOperacion=findViewById(R.id.tvOperacion);
    }
    public void concatenar(View view) {
        switch (view.getId())
        {
            case R.id.btn0:
                if (numeros!="")
                {
                    numeros = numeros+"0";
                    tvOperacion.setText(numeros);
                }
                else {tvOperacion.setText("0");}
                break;
            case R.id.btn1:
                numeros = numeros+"1";
                tvOperacion.setText(numeros);
                break;
            case R.id.btn2:
                numeros = numeros+"2";
                tvOperacion.setText(numeros);
                break;
            case R.id.btn3:
                numeros = numeros+"3";
                tvOperacion.setText(numeros);
                break;
            case R.id.btn4:
                numeros = numeros+"4";
                tvOperacion.setText(numeros);
                break;
            case R.id.btn5:
                numeros = numeros+"5";
                tvOperacion.setText(numeros);
                break;
            case R.id.btn6:
                numeros = numeros+"6";
                tvOperacion.setText(numeros);
                break;
            case R.id.btn7:
                numeros = numeros+"7";
                tvOperacion.setText(numeros);
                break;
            case R.id.btn8:
                numeros = numeros+"8";
                tvOperacion.setText(numeros);
                break;
            case R.id.btn9:
                numeros = numeros+"9";
                tvOperacion.setText(numeros);
                break;
            case R.id.btnPunto:
                if (numeros=="")
                {
                    numeros = numeros+"0.";
                    tvOperacion.setText(numeros);
                }
                else
                {
                    numeros = numeros+".";
                    tvOperacion.setText(numeros);
                }
                break;
            default:
                break;
        }
    }
    public void cambiarSigno(View view){
        if(numeros!="") {
            if(resultado==0){
                this.resultado= Double.parseDouble(numeros);
            }else {
                this.resultado = resultado * (Double.parseDouble(numeros)*-1);
            }
        }
        cambiarSigno=false;
        porcentaje=true;
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        tvOperacion.setText(numeros);
        numeros = "";
    }
    public void porcentaje(View view){
        if(numeros!="") {
            if(resultado==0){
                this.resultado= Double.parseDouble(numeros);
            }else {
                this.resultado = resultado * (Double.parseDouble(numeros)*0.01);
            }
        }
        porcentaje=true;
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        tvOperacion.setText(numeros);
        numeros = "";
    }
    public void sumar(View view)
    {
        if(numeros!="") {
            this.resultado =resultado+Double.parseDouble(numeros);
        }
        porcentaje=false;
        suma = true;
        resta = false;
        multiplicacion = false;
        division = false;
        tvOperacion.setText(numeros);
        numeros = "";
    }
    public void restar(View view) {
        if(numeros!="") {
            if(resultado==0){
                this.resultado= Double.parseDouble(numeros);
            }else {
                this.resultado = resultado - Double.parseDouble(numeros);
            }
        }
        porcentaje=false;
        suma = false;
        resta = true;
        multiplicacion = false;
        division = false;
        tvOperacion.setText(numeros);
        numeros = "";

    }
    public void multiplicar(View view) {
        if(resultado==0){
            this.resultado= Double.parseDouble(numeros);
        }else {
            this.resultado = resultado * Double.parseDouble(numeros);
        }
        porcentaje=false;
        suma = false;
        resta = false;
        multiplicacion = true;
        division = false;
        tvOperacion.setText(numeros);
        numeros = "";
    }
    public void dividir(View view) {
        if(resultado==0){
            this.resultado= Double.parseDouble(numeros);
        }else {
            try {
                this.resultado = resultado / Double.parseDouble(numeros);
            }catch (Exception ex){
                Toast.makeText(this,ex.getMessage(), Toast.LENGTH_SHORT).show();
            }

        }
        porcentaje=false;
        suma = false;
        resta = false;
        multiplicacion = false;
        division = true;
        tvOperacion.setText(numeros);
        numeros = "";

    }

    public void igual(View view){
        if (cambiarSigno=true) {
            this.resultado = resultado * (Double.parseDouble(numeros)*-1);
            tvOperacion.setText(String.valueOf(resultado));
        }
        if (porcentaje=true) {
            this.resultado = resultado * (Double.parseDouble(numeros)*0.01);
            tvOperacion.setText(String.valueOf(resultado));
        }
        if (suma==true)
        {
            this.resultado =resultado+Double.parseDouble(numeros);
            tvOperacion.setText(String.valueOf(resultado));
        }
        else if (resta==true)
        {
            this.resultado =resultado-Double.parseDouble(numeros);
            tvOperacion.setText(String.valueOf(resultado));
        }
        else if (multiplicacion==true)
        {
            this.resultado =resultado*Double.parseDouble(numeros);
            tvOperacion.setText(String.valueOf(resultado));
        }
        else
        {

            if (division==true)
            {
                try {
                    this.resultado = resultado / Double.parseDouble(numeros);
                    tvOperacion.setText(String.valueOf(resultado));
                }catch (Exception e){
                    Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
                    tvOperacion.setText("Error");
                }
            }
        }

    }

    public void limpiar(View view)
    {
        numeros="";
        resultado=0;
        suma=false;
        resta=false;
        multiplicacion=false;
        division=false;
        tvOperacion.setText("0");
    }


}