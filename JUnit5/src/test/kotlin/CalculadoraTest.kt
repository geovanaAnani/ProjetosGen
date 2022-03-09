import calc.Calculadora
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest {


        @Test
        fun addTest(){

            assertEquals(4.0, Calculadora.add(2.0, 2.0))

        }

        @Test
        fun subTest(){

            assertEquals(10.0, Calculadora.sub(30.0, 20.0))

        }
        @Test
        fun divTest (){

            assertEquals(5.0, Calculadora.div(10.0, 2.0))

        }
        @Test
        fun multTest (){
            assertEquals(12.0, Calculadora.mult(4.0, 3.0))

        }
}



