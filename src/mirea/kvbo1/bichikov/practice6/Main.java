package mirea.kvbo1.bichikov.practice6;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        //Напишите два класса MovablePoint и MovableCircle - которые
        //реализуют интерфейс Movable (см рис. 6.3)
        System.out.println("Напишите два класса MovablePoint и MovableCircle - которые\nреализуют интерфейс Movable (см рис. 6.3)");
        MovableCircle circle = new MovableCircle(0,0,1,1,1);
        MovablePoint point = new MovablePoint(0,0,1,1);
        System.out.println(circle);
        System.out.println(point);
        // Задание 2
        //Напишите новый класс MovableRectangle (движущийся
        //прямоугольник). Его можно представить как две движущиеся точки
        //MovablePoints (представляющих верхняя левая и нижняя правая точки) и
        //реализующие интерфейс Movable, см рис. 6.4. Убедитесь, что две точки имеет
        //одну и ту же скорость (вам понадобится метод проверяющий это условие).
        System.out.println("Напишите новый класс MovableRectangle (движущийся\nпрямоугольник). Его можно представить как две движущиеся точки\n" +
                "MovablePoints (представляющих верхняя левая и нижняя правая точки) и\nреализующие интерфейс Movable, см рис. 6.4. Убедитесь, что две точки имеет\n" +
                "одну и ту же скорость (вам понадобится метод проверяющий это условие).");
        MovableRectangle rectangle = new MovableRectangle(0,1,0,1,1,1);
        System.out.println(rectangle);
        //Задание 11
        //Напишите программу для перевода температуры по Цельсию в
        //температуру по Кельвину и Фаренгейту. Для этого добавьте интерфейс
        //Convertable у которого есть метод convert для конвертации из одной системы
        //измерения в другую.
        System.out.println("Напишите программу для перевода температуры по Цельсию в\nтемпературу по Кельвину и Фаренгейту. Для этого добавьте интерфейс\n" +
                "Convertable у которого есть метод convert для конвертации из одной системы\nизмерения в другую.");
        Celsius c = new Celsius(10);
        UnitOfMeasurement k = c.convert(Meases.K);
        System.out.println(c);
        System.out.println(k);
    }
}
