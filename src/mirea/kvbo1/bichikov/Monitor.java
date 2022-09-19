package mirea.kvbo1.bichikov;

public class Monitor {
    private MonitorsMarks mark;
    private String title;
    private int frequency;
    public Monitor(MonitorsMarks mark, String title, int frequency) {
        this.mark = mark;
        this.title = title;
        this.frequency = frequency;
    }

    public MonitorsMarks getMark() {
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

    @Override
    public String toString(){
        String res = "";
        res += "mark: " + this.mark;
        res += "\ntitle: " + this.title;
        res += "\nfrequency: " + this.frequency;
        return res;
    }
}
