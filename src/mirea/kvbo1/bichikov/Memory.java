package mirea.kvbo1.bichikov;

import java.lang.management.MemoryManagerMXBean;

public class Memory {
    private MemoriesMarks mark;
    private String title;
    private int frequency;
    private int quantity;
    public Memory(MemoriesMarks mark, String title, int frequency, int quantity) {
        this.mark = mark;
        this.title = title;
        this.frequency = frequency;
        this.quantity = quantity;
    }

    public MemoriesMarks getMark() {
        return mark;
    }

    public String getTitle() {
        return title;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString(){
        String res = "";
        res += "mark: " + this.mark;
        res += "\ntitle: " + this.title;
        res += "\nfrequency: " + this.frequency;
        res += "\nquantity:" + this.quantity;
        return res;
    }
}
