package mirea.kvbo1.bichikov.practice4;

public class Processor {
    private ProcessorsMarks mark;
    private String title;
    private int cores_amount;
    private int threads_amount;
    private int frequency;

    public Processor(ProcessorsMarks mark, String title, int cores_amount, int threads_amount, int frequency) {
        this.mark = mark;
        this.title = title;
        this.cores_amount = cores_amount;
        this.threads_amount = threads_amount;
        this.frequency = frequency;
    }

    public ProcessorsMarks getMark() {
        return mark;
    }

    public String getTitle() {
        return title;
    }

    public int getCores_amount() {
        return cores_amount;
    }

    public int getThreads_amount() {
        return threads_amount;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString(){
        String res = "";
        res += "mark:" + this.mark;
        res += "\ntitle:" + this.title;
        res += "\ncores:" + this.cores_amount;
        res += "\nthreads:" + this.threads_amount;
        res += "\nfrequency: " + this.frequency;
        return res;
    }
}
