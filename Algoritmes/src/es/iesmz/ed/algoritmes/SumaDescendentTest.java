package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class SumaDescendentTest {
    static SumaDescendent sumaDescendent;
    static long expectedLong;
    static long actualLong;
    @BeforeEach
    void setUp() {
        sumaDescendent = null;
        expectedLong = 0;
        actualLong = 0;
    }
    @ParameterizedTest
    @MethodSource("inputsShouldReturnHyperPar")
        // six numbers
    void shouldReturnHyperPar(long numero, long resultado) {
        sumaDescendent = new SumaDescendent(numero);
        expectedLong = resultado;
        actualLong = sumaDescendent.suma();
        Assertions.assertEquals(expectedLong, actualLong);
    }
    private static Stream<Arguments> inputsShouldReturnHyperPar() {
        return Stream.of(
                Arguments.of(0, 0)
        );
    }

}