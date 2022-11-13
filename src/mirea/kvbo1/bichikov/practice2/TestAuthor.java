package mirea.kvbo1.bichikov.practice2;

public class TestAuthor {
    public void test(){
        Author a = new Author("Автор", "a@e.ru", 'f');
        System.out.println(a);
        a.setName("NewName");
        System.out.println(a);
    }
}
