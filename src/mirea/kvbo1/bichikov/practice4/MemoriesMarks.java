package mirea.kvbo1.bichikov.practice4;

public enum MemoriesMarks {
    Samsung ("Samsung"),
    Micron ("Micron"),
    Hynix ("Hynix");
    private String title;
    MemoriesMarks(String title){
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return this.title;
    }
}
