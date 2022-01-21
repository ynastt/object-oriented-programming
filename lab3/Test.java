import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        SixSignsNumber[] array = new SixSignsNumber[] {
                new SixSignsNumber(142232), //7 - 7 = 0
                new SixSignsNumber(123456), //6 - 15 = -9
                new SixSignsNumber(394286), //16- 16 = 0
                new SixSignsNumber(860538), //14- 16 = -2
        };
        for (SixSignsNumber x : array){
            System.out.println(x.d);
        }
        Arrays.sort(array);
        System.out.println("Sorted list: ");
        for (SixSignsNumber x : array){
            System.out.println(x.d);
        }
    }
}
