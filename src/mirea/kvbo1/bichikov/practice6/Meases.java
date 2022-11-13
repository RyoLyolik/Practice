package mirea.kvbo1.bichikov.practice6;

public enum Meases {
    C ("C"),
    K ("K"),
    F ("F");

    private String title;
    Meases(String title){
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
