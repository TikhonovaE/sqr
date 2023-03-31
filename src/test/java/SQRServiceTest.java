import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void testNegativeNumbers() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcNumberOfSqr(-500, -400);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeAndPositiveNumbers() {
        SQRService service = new SQRService();

        int expected = 5;
        int actual = service.calcNumberOfSqr(-100, 200);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPositiveNumbers() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcNumberOfSqr(300, 400);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZeroAndPositiveNumber() {
        SQRService service = new SQRService();

        int expected = 13;
        int actual = service.calcNumberOfSqr(0, 500);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxNumberOfSQRs() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcNumberOfSqr(100, 9801);

        Assertions.assertEquals(expected, actual);
    }

}
