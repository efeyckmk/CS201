import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class ReadFile {
    public static void main(String[] args) {
            File myObj = new File("input.txt");
            Scanner Scanner1 = new Scanner("input.txt");

            String a = Scanner1.next();
            for ( int i = 0; a > i; i++ );
                String data = Scanner1.nextLine();
                if ( data <= 1)
                    System.out.println("Not");

                for (int k = 2; k < data ; k++)
                    if ( data % k == 0);
                    System.out.println("Prime");


    }
}
