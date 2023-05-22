public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        /**
         * В b у нас лежит ноль, а на ноль делить нельзя.
         * Решения:
         * 1)Написать проверку и не выполнять операцию, если знаменатель 0
         * 2)Обработать Exception и вывести сообщение об ошибке
         */
        try {
            Integer c = calc.devide.apply(a, b);

            calc.println.accept(c);

        } catch (ArithmeticException e) {

            System.out.println("Ошибка при делении: " + e.getMessage());

        }
    }
}
