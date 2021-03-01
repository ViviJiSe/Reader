import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) {

        String dataCsvFileLocation = "C:\\Users\\default.LAPTOP-P5L9CHB3\\OneDrive - LEAD University\\3er Cuatri 2020\\Progra\\ProyectoFinal\\data.csv";
        String csvSeparator =",";
        String line = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dataCsvFileLocation))){
            // Aca va a estar el código que lee el archivo y puede fallar

            while ((line = bufferedReader.readLine()) != null) {

                String[] person = line.split(csvSeparator);
                System.out.println("Last Name: " + person[0] + " Name: " + person[1] + " JobTitle: " + person[2]);
//                System.out.println(personObj.toString());
            }
        } //TRY ENDS

        catch (FileNotFoundException fileNotFoundException){
            System.out.println("The file provided is not valid");
        }

        catch (IOException ioException){
            // Acá vamos a poner el código que se ejecuta si leer el archivo falla

            ioException.printStackTrace();
        } //CATCH ENDS


    }//MAIN METHOD ENDS -------------------------------------------------------




}// CLASS CSV READER ENDS -----------------------------------------------------



