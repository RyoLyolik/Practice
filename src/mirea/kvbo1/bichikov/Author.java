package mirea.kvbo1.bichikov;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name_, String email_, char gender_){
        name = name_;
        email = email_;
        gender = gender_;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    @Override
    public String toString(){
        String res = "";
        res += "Имя: "+this.name + "\n";
        res += "Емейл: "+this.email + "\n";
        res += "Гендер: "+this.gender;
        return res;
    }
}
