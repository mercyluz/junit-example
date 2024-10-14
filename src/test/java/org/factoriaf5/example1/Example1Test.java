package org.factoriaf5.example1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class Example1Test {
    private Example1 example;
    @BeforeEach
    public void init(){
        this.example = new Example1();

    }
    @Test
    public void testSumar() {
        Example1 example =  new Example1(); 
        //crear el objecto example
        // Given - Teniendo
        int num1 = 35; // parametros
        int num2 = 79;

        // When - Cuando
        int result = example.sumar(num1, num2);

        // Then - Entonces
        assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
       // assertInstanceOf(Integer.class, result);
}

@Test
     public void testCheckPositivo() {
      //  given
       int number = 4;
       boolean result = example.checkPositivo(number);
       assertTrue(result);
    }
    @Test
    public void testCheckPositivoError() {
     int number = -4;
    assertThrows(IllegalArgumentException.class, () -> {
        example.checkPositivo(number);
    });
        //conjunto de
    }

    @Test
    public void testcontarLetrasA() {
        String string = "casa";
        int result = example.contarLetrasA(string);
        assertEquals(2, result);
    }
    
    @Test
    public void testContieneElemento() {
       
        List<String> lista = Arrays.asList("manzana", "banana", "cereza");

        assertTrue(example.contieneElemento(lista, "banana"), "La lista debería contener 'banana'");
        assertFalse(example.contieneElemento(lista, "kiwi"), "La lista no debería contener 'kiwi'");
        List<String> listaVacia = Arrays.asList();
        assertFalse(example.contieneElemento(listaVacia, "manzana"), "Una lista vacía no debería contener 'manzana'");
        assertFalse(example.contieneElemento(lista, null), "La lista no debería contener un elemento nulo");
    }
    @Test
    public void testRevertirCadena() {
        String string = "horacio";
        String result = example.revertirCadena(string);
        assertEquals("oicaroh",result);
    }
    @Test
    public void testFactorial() {
        int number = 4;
        long result = example.factorial(number);
        assertEquals(24,result);
    }

    @Test
    public void testFactorialNegativeNumber() {
        int number = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            example.factorial(number);
        });
    }
    
            @Test
            public void testMensajeConRetraso() throws InterruptedException {
                  
                assertEquals("Listo después de retraso", example.mensajeConRetraso());
            
}

@Test
    public void testConvertirAString() {
       
        List<Integer> listaEnteros = Arrays.asList(1, 2, 3, 4);
        List<String> listaEsperada = Arrays.asList("1", "2", "3", "4");
        assertEquals(listaEsperada, example.convertirAString(listaEnteros), "La lista convertida debería contener las cadenas '1', '2', '3' y '4'");
    }
    
       
    
        @Test
    public void testcalcularMedia() {
        List<Integer> list = Arrays.asList(2,5,11);
        double result = example.calcularMedia(list);
        assertEquals(        6, result);
    }

    @Test
    public void testCalcularMediaListaVacia() {
        List<Integer> list = Arrays.asList();
        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(list);
        });
    }

    @Test
    public void testCalcularMediaListaNull() {
        List<Integer> list = null;
        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(list);
        });

    }
            @Test
            public void testConvertirListaAString() {
              
                List<String> lista = Arrays.asList("manzana", "banana", "cereza");
                assertEquals("MANZANA,BANANA,CEREZA", example.convertirListaAString(lista), "Debería convertir y unir elementos de la lista en mayúsculas");
                List<String> listaConNull = Arrays.asList("manzana", null, "cereza");
                assertEquals("MANZANA,NULL,CEREZA", example.convertirListaAString(listaConNull), "Debería reemplazar null con 'NULL' y unir los elementos en mayúsculas");
                List<String> listaVacia = Arrays.asList();
                assertEquals("", example.convertirListaAString(listaVacia), "Una lista vacía debería devolver una cadena vacía");
            }          
}

    


