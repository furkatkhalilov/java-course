package day18;

public class Task1 {
    // Create 2D array
    // in first row put names
    // in second row put surnames
    // Hint:
    // String[][] namesAndSurnames

    public static void main(String[] args) {
        //part 1. create 2D array with names and surnames;
        String[][] fullname = {
                {"John", "Cameron", "Susan"},
                {"Travolta", "Mcmillan", "Boyle"},
        };
        //part 2. print name and surname, without loop
        //ex: John Travolta
        //    Cameron Mcmillan
        //    Susan Boyle
        System.out.println( "Part 1 -------------------------------" );
        System.out.println( fullname[0][0] + " " + fullname[1][0] );
        System.out.println( fullname[0][1] + " " + fullname[1][1] );
        System.out.println( fullname[0][2] + " " + fullname[1][2] );

        //part 3  print name and surname, with one loop only
        //ex: John Travolta
        //    Cameron Mcmillan
        //    Susan Boyle
        System.out.println( "\nPart 2 -------------------------------" );
        for(int i = 0; i < fullname[0].length; i++) {
            System.out.println( fullname[0][i] + " " + fullname[1][i] );
        }

        //part 4  print name and surname, with two loop only
        //ex: John Travolta
        //    Cameron Mcmillan
        //    Susan Boyle
//        System.out.println( fullname[0][0] + " " + fullname[1][0] );
//        System.out.println( fullname[0][1] + " " + fullname[1][1] );
//        System.out.println( fullname[0][2] + " " + fullname[1][2] );

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print( fullname[j][i] + " " );
            }
            System.out.println();
        }

    }
}
