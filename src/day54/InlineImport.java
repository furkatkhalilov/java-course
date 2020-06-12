package day54;

import java.util.Date;

public class InlineImport {

    public static void main(String[] args) {
        Date date = new Date();

        ///
        java.sql.Date date2 = new  java.sql.Date(1);
    }



}
