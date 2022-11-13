package mirea.kvbo1.bichikov.practice7;

public class ProcessString implements Stringable{
    public ProcessString(){}

    @Override
    public int countSymbols(String s) {
        return s.length();
    }

    @Override
    public String generateString(String s) {
        StringBuilder new_s = new StringBuilder();
        for (int i = 0; i < s.length(); i+=2){
            new_s.append(s.charAt(i));
        }
        return String.valueOf(new_s);
    }

    @Override
    public String invertString(String s) {
        StringBuilder new_s = new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--){
            new_s.append(s.charAt(i));
        }
        return String.valueOf(new_s);
    }
}
