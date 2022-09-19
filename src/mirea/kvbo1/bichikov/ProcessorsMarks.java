package mirea.kvbo1.bichikov;

public enum ProcessorsMarks {
    Intel("Intel"),
    AMD("AMD");

    private String title;

    ProcessorsMarks(String title_) {
        this.title = title_;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return this.title;
    }
}
