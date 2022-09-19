package mirea.kvbo1.bichikov;

public enum MonitorsMarks {
    Samsung ("Samsung"),
    LG ("LG");
    private String title;
    MonitorsMarks(String title_){
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
