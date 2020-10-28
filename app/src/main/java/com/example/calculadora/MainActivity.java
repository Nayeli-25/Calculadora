package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvOperacion;
    double n1, n2, resultado;
    String operador;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPunto, btnSuma, btnResta, btnMult, btnDiv, btnIgual, btnLimpiar, btnPorcentaje, btnBorrar, btnCambiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPunto = (Button) findViewById(R.id.btnPunto);
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnPorcentaje = (Button) findViewById(R.id.btnPorcentaje);
        btnCambiar = (Button) findViewById(R.id.btnCambiar);
        btnBorrar = (Button) findViewById(R.id.btnBorrar);
        tvOperacion = (TextView) findViewById(R.id.tvOperacion);
    }
    public void Concatenar(View view){
        String Concatenar=tvOperacion.getText().toString();
        switch (view.getId()){
            case R.id.btn0:
                tvOperacion.setText(Concatenar + "0");
                break;
            case R.id.btn1:
                tvOperacion.setText(Concatenar+"1");
                break;
            case R.id.btn2:
                tvOperacion.setText(Concatenar+"2");
                break;
            case R.id.btn3:
                tvOperacion.setText(Concatenar+"3");
                break;
            case R.id.btn4:
                tvOperacion.setText(Concatenar+"4");
                break;
            case R.id.btn5:
                tvOperacion.setText(Concatenar+"5");
                break;
            case R.id.btn6:
                tvOperacion.setText(Concatenar+"6");
                break;
            case R.id.btn7:
                tvOperacion.setText(Concatenar+"7");
                break;
            case R.id.btn8:
                tvOperacion.setText(Concatenar+"8");
                break;
            case R.id.btn9:
                tvOperacion.setText(Concatenar+"9");
                break;
            case R.id.btnPunto:
                tvOperacion.setText(Concatenar+".");
                break;
        }

    }
    public  void Limpiar(View view) {
        n1=0;
        n2=0;
        tvOperacion.setText("0");
        resultado=0;
    }
    public  void Borrar(View view) {
        String cifra = tvOperacion.getText().toString();
        cifra = cifra.substring(0, cifra.length() - 1);
    }
    public  void CambiarSigno(View view){
        n1=Double.parseDouble(tvOperacion.getText().toString());
        operador="+/-";
        n1=n1*-1;
        tvOperacion.setText(String.valueOf(n1));
    }
    public  void Porcentaje(View view){
        n1=Double.parseDouble(tvOperacion.getText().toString());
        operador="%";
        tvOperacion.setText("");
    }
    public  void Dividir(View view){
        n1=Double.parseDouble(tvOperacion.getText().toString());
        operador="÷";
        tvOperacion.setText("");
    }
    public  void Multiplicar(View view){
        n1=Double.parseDouble(tvOperacion.getText().toString());
        operador="x";
        tvOperacion.setText("");
    }
    public  void Restar(View view){
        n1=Double.parseDouble(tvOperacion.getText().toString());
        operador="-";
        tvOperacion.setText("");
    }
    public  void Sumar(View view){
        n1=Double.parseDouble(tvOperacion.getText().toString());
        operador="+";
        tvOperacion.setText("");
    }

    public  void Resultado(View view) {

        switch (operador) {
            case "+":
                n2 = Double.parseDouble(tvOperacion.getText().toString());
                resultado=n1+n2;
                tvOperacion.setText(String.valueOf(resultado));
                break;
            case "-":
                n2 = Double.parseDouble(tvOperacion.getText().toString());
                resultado=n1-n2;
                tvOperacion.setText(String.valueOf(resultado));
                break;
            case "x":
                n2 = Double.parseDouble(tvOperacion.getText().toString());
                resultado=n1*n2;
                tvOperacion.setText(String.valueOf(resultado));
                break;
            case "÷":
                n2 = Double.parseDouble(tvOperacion.getText().toString());
                resultado=n1/n2;
                tvOperacion.setText(String.valueOf(resultado));
                break;
            case "%":
                n2 = Double.parseDouble(tvOperacion.getText().toString());
                resultado=(n2*n1)/100;
                tvOperacion.setText(String.valueOf(resultado));
                break;
        }

    }
}