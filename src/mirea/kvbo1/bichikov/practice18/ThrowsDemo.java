package mirea.kvbo1.bichikov.practice18;

import java.lang.*;

public class ThrowsDemo {
    private String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails" );
        }
        return "data for" + key;
    }
    public void printMessage(String key) {
        String message = null;
        try {
            message = getDetails(key);
        } catch (NullPointerException e) {
            message = e.getMessage();
        }
        System.out.println( message );
    }
}

