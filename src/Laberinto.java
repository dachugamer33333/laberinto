import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Laberinto {
    private String[][] laberinto;
    private String ruta;
    private int[] inicio;

    public Laberinto(String ruta) {
        this.ruta = ruta;
        this.laberinto = obtenerLaberinto(ruta);
        obtenerInicio();

    }

    public int[] getInicio() {
        return inicio;
    }

    public void obtenerInicio()
    {
        for(int i =0; i< laberinto.length;i++)
        {
            for(int j =0; j< laberinto[i].length;j++)
            {
               if(laberinto[i][j].equals("I"))
               {
                   inicio = new int[]{i, j};
                   return;
               }
            }

        }
    }

    public void imprimirLaberinto()
    {
        for(int i =0; i< laberinto.length;i++)
        {
            for(int j =0; j< laberinto[i].length;j++)
            {
                System.out.print(laberinto[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static String[][] obtenerLaberinto(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta)))
        {
            String linea;
            linea = br.readLine();
            String[] tamano = linea.split(" ");
            String[][] laberinto = new String[Integer.parseInt(tamano[0])][Integer.parseInt(tamano[1])];
            int j = 0;
            while((linea=br.readLine()) != null)
            {
                String[] tmp = linea.split(" ");
                for(int i =0; i < tmp.length;i++)
                {
                    laberinto[j][i]=tmp[i];
                }
                j++;
            }
            return laberinto;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String toString() {
        return "Laberinto{" +
                "laberinto=" + Arrays.toString(laberinto) +
                ", ruta='" + ruta + '\'' +
                ", inicio=" + Arrays.toString(inicio) +
                '}';
    }
}
