package mirea.kvbo1.bichikov.practice4;

public class Fourth {
    public void fourth(){
        System.out.println("4.4.\tСоздать класс, описывающий сущность компьютер (Computer). Для описания составных частей компьютера использовать отдельные классы (Processor, Memory, Monitor). Описать необходимые свойства и методы для каждого класса. Для названий марок компьютера используйте перечисления (enum)");
        ProcessorsMarks prm = ProcessorsMarks.AMD;
        MemoriesMarks mem = MemoriesMarks.Micron;
        MonitorsMarks mom = MonitorsMarks.LG;
        Processor processor = new Processor(prm, "Ryzen 5", 6, 12, 3600);
        Memory memory = new Memory(mem, "Adata", 3000, 16);
        Monitor monitor = new Monitor(mom, "LG12315h1", 60);
        Computer c = new Computer(processor, memory, monitor);
        System.out.println(c);
    }
    public void first(){
        System.out.println("4.1.1.\tНеобходимо реализовать простейший класс Shape (Фигура). Добавьте метод класса getType() (тип фигуры, возвращает строку тип String название фигуры). С помощью наследования создайте дочерние классы Circle, Rectangle и Square. (из предыдущей практической работы). ");
        ShapeTester test = new ShapeTester();
        test.test();
        ShapeTester t;
    }
}
