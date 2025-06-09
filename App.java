import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class App {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner teclado = new Scanner(System.in);
        int lineCount = 1;
        
        while(teclado.hasNextLine()){
            String line = teclado.nextLine();
            System.out.println(lineCount+ " "+ line);
            lineCount++;
        }
        
        
    }
}