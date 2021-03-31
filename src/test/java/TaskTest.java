import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;


class TaskTest {
    private Task task;

    @BeforeEach
    public void init() {
        task = new Task();
    }

    @ParameterizedTest
    @MethodSource("dataOne")
    public void massTest1(int[] a, int[] b) {
        Assertions.assertArrayEquals(a, task.elementsAfterTheLastDigitFour(b));
    }

    @ParameterizedTest
    @MethodSource("dataTwo")
    public void massTest2(int[] a) {
        Assertions.assertTrue(task.arrayOfOnesAndFours(a));
    }

    static Stream<Arguments> dataOne(){
        return Stream.of(
                Arguments.arguments(new int[]{1,3}, new int[]{3,1,4,1,3}),
                Arguments.arguments(new int[]{1,5,1,3}, new int[]{1,2,3,4,1,5,1,3}),
                Arguments.arguments(new int[]{}, new int[]{6,3,1,2,3,6,4,3,4}),
                Arguments.arguments(new int[]{1,2,3,5,2,3,5}, new int[]{4,1,2,3,5,2,3,5}),
                Arguments.arguments(new int[]{5,3,1,2}, new int[]{5,2,3,5,4,5,3,1,2})
        );
    }
    static Stream<Arguments> dataTwo(){
        return Stream.of(
                Arguments.arguments(new int[]{1,4}),
                Arguments.arguments(new int[]{1,1,1,1,4,1,1}),
                Arguments.arguments(new int[]{4,4,4,4,4,1,4,1,4,4,1}),
                Arguments.arguments(new int[]{1,1,1,1,5,5,1,1,4,1,3}),
                Arguments.arguments(new int[]{1,1,1,1,1,1,1,1,1,1,1})

        );
    }





}