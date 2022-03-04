package Input_Output;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingStream {

    public static void getOutput() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter your name: ");
        String outPut = br.readLine();
        System.out.println("Your name is: "+ outPut);
    }

    public static void main(String [] args) throws IOException {
        getOutput();
    }


}
