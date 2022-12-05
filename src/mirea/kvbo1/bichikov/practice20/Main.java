package mirea.kvbo1.bichikov.practice20;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                1. Создать обобщенный класс с тремя параметрами (T, V, K).
                2. Класс содержит три переменные типа (T, V, K), конструктор,
                принимающий на вход параметры типа (T, V, K), методы возвращающие
                значения трех переменных. Создать метод, выводящий на консоль имена
                классов для трех переменных класса.
                3. Наложить ограничения на параметры типа: T должен
                реализовать интерфейс Comparable (классы оболочки, String), V должен
                реализовать интерфейс Serializable и расширять класс Animal, K\s""");
        Generalized<String, Integer, Double> g = new Generalized<>("Строка", 0, 1.25);
        System.out.println(g.typesInString());

        System.out.println("""
                
                4. Написать обобщенный класс MinMax, который содержит
                методы для нахождения минимального и максимального элемента
                массива. Массив является переменной класса. Массив должен
                передаваться в класс через конструктор. Написать класс Калькулятор
                (необобщенный), который содержит обобщенные статические методы -
                sum, multiply, divide, subtraction. Параметры этих методов - два числа
                разного типа, над которыми должна быть произведена операция.
                """);
        Double[] arr = new Double[5];
        for (int i = 0; i < 5; i++){
            arr[i] = Math.random();
        }

        MinMax<Double> mm = new MinMax<>(arr);
        System.out.println("Массив: ");
        for (int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Минимум: " + mm.min() + "\nМаксимум: " + mm.max());
        System.out.println("\nКалькулятор: ");
        int x = 10;
        double y = 1.2;
        System.out.println(Calculator.add(x,y));
    }
}
