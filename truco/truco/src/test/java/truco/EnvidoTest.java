package truco;

import org.junit.jupiter.api.Test;

public class EnvidoTest 
{
    // Ver datos en consola
    @Test
    void envido() {
        Envido envido = new Envido();
        System.out.println(envido.ordenPorFrecuencia());
    }
}
