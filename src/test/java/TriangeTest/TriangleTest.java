package TriangeTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import triangleS.Triangle;

public class TriangleTest {

        @Test
         void checkRavnostoronnii(){
        Assertions.assertNotEquals(0.0,Triangle.trS());
        }

        @Test
        void checkSides(){

            Assertions.assertAll(
                    ()->  Assertions.assertNotEquals(0.0,Triangle.a,"сторона a задана некорректно"),
                    ()->  Assertions.assertNotEquals(0.0,Triangle.b,"сторона b задана некорректно"),
                    ()->  Assertions.assertNotEquals(0.0,Triangle.c,"сторона c задана некорректно")
            );
        }
}
