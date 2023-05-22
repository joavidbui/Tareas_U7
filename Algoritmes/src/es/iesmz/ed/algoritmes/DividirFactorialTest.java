package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {
    static DividirFactorial dividirFactorial;
    static float expectedFloat;
    static float actualFloat;
    @BeforeEach
    void setUp() {
        dividirFactorial = null;
        expectedFloat = 0f;
        actualFloat = 0f;
    }
    @ParameterizedTest
    @MethodSource("inputsShouldReturnHyperPar")
        // six numbers
    void shouldReturnHyperPar(int numerador, int denominador, int expectedArgument) {
        dividirFactorial = new DividirFactorial(numerador, denominador);
        expectedFloat = expectedArgument;
        actualFloat = dividirFactorial.calcula();
        Assertions.assertEquals(expectedFloat, actualFloat);
    }
    private static Stream<Arguments> inputsShouldReturnHyperPar() {
        return Stream.of(
                Arguments.of(1, 1, 1)
        );
    }
}