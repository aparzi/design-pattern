package decorator;

import decorator.application.UpperCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo {

    public static void main(String args[]){
        int c;
        try {

            InputStream inputStream =
                    new UpperCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("design-pattern/decorator/resources/DecoratorInputFile")));
            while((c = inputStream.read()) >= 0) {
                System.out.print((char)c);
            }

            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
