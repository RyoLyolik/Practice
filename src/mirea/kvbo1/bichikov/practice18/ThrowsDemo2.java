package mirea.kvbo1.bichikov.practice18;

import java.lang.*;
import java.util.Scanner;

public class ThrowsDemo2 {
    public void getKey(){
        Scanner myScanner = new Scanner( System.in
        );
        String key = myScanner.next();
        try {
            printDetails( key );
        }catch (Exception e){
            getKey();
        }

    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}
