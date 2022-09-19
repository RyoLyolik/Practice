package mirea.kvbo1.bichikov;

public class Computer {
    private Processor processor;
    private Monitor monitor;
    private Memory memory;
    public Computer(Processor processor, Memory memory, Monitor monitor) {
        this.processor = processor;
        this.monitor = monitor;
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    @Override
    public String toString(){
        String res = "";
        res += "Processor:\n"+processor+"\n\nMemory:\n"+this.memory+"\n\nMonitor:\n"+monitor;
        return res;
    }
}
