import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Laberinto:");
        Laberinto laberinto = new Laberinto("/home/dachudev/IdeaProjects/Laberinto/archivos/laberinto.txt");
        laberinto.imprimirLaberinto();
        System.out.println("inicio:");
        for(int numeros : laberinto.getInicio())
        {
            System.out.print(numeros + ",");
        }
    }


}