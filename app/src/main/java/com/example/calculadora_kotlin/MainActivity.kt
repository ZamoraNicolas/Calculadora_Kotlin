package com.example.calculadora_kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultado:TextView;
        val numero1:TextView;
        val numero2:TextView;
        val sumar:Button;
        val restar:Button;
        val multiplicar:Button;
        val dividir:Button;
        val Fibonacci:Button;
        val Factorial:Button

        resultado = findViewById(R.id.resultado);
        numero1 = findViewById(R.id.num1);
        numero2 = findViewById(R.id.num2);
        sumar = findViewById(R.id.Sum);
        restar = findViewById(R.id.res);
        multiplicar = findViewById(R.id.mult);
        dividir = findViewById(R.id.div);
        Fibonacci = findViewById(R.id.fibonacci);
        Factorial = findViewById(R.id.factorial);

        sumar.setOnClickListener{
            val num1 = numero1.text.toString().toDouble()
            val num2 = numero2.text.toString().toDouble()
            val suma = num1 + num2
            resultado.text=suma.toString()
        };
        restar.setOnClickListener{
            val num1 = numero1.text.toString().toDouble()
            val num2 = numero2.text.toString().toDouble()
            val resta = num1 - num2
            resultado.text=resta.toString()
        };
        multiplicar.setOnClickListener{
            val num1 = numero1.text.toString().toDouble()
            val num2 = numero2.text.toString().toDouble()
            val multiplicacion = num1 * num2
            resultado.text=multiplicacion.toString()
        };
        dividir.setOnClickListener{
            val num1 = numero1.text.toString().toDouble()
            val num2 = numero2.text.toString().toDouble()
            val division = num1 / num2
            resultado.text=division.toString()
        };

        Fibonacci.setOnClickListener{
            val num1 = numero1.text.toString().toInt()
            if(num1<=1){
                resultado.text = num1.toString()
            }
            else{
                var fiboanterior = 0
                var fiboactual = 1
                var resultados = 0

                for(i in 2..num1){
                    resultados = fiboanterior + fiboactual
                    fiboanterior = fiboactual
                    fiboactual = resultados
                }
                resultado.text = resultados.toString()
            }
        }

        Factorial.setOnClickListener{
            val num1 = numero1.text.toString().toInt()
            if(num1 == 1 || num1 == 0){
                resultado.text= "1"
            }
            else{
                var factoriales = 1
                for (i in 1 .. num1){
                    factoriales *= 1
                }
                resultado.text = factoriales.toString()
            }
        }
    }
}