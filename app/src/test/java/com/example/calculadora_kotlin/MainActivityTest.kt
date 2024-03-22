package com.example.calculadora_kotlin
import android.widget.Button
import android.widget.TextView
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config



@RunWith(RobolectricTestRunner::class)
@Config(manifest=Config.NONE)
class MainActivityTest {

    private lateinit var activity: MainActivity
    private lateinit var resultado: TextView
    private lateinit var numero1: TextView
    private lateinit var numero2: TextView
    private lateinit var sumar: Button

    @Before
    fun setUp() {
        activity = Robolectric.buildActivity(MainActivity::class.java).create().resume().get()
        resultado = activity.findViewById(R.id.resultado)
        numero1 = activity.findViewById(R.id.num1)
        numero2 = activity.findViewById(R.id.num2)
        sumar = activity.findViewById(R.id.Sum)
    }

    @Test
    fun suma_correcta() {
        // Configura los valores de los campos de entrada
        numero1.text = "5"
        numero2.text = "3"

        sumar.performClick()

        assertEquals("8", resultado.text.toString())
    }

}
