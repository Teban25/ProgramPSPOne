package co.udea.edu.pruebas.psp.program1.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Teban-Ing
 */
public class FileStadisticalData {

    File data;
    FileReader fr = null;
    BufferedReader br = null;

    public FileStadisticalData(String ruta) throws IOException {
        this.data = new File(ruta);
    }

    public LinkedList addData() throws FileNotFoundException, IOException, NumberFormatException {
        Double datum;
        String line;
        LinkedList dataList = new LinkedList();
        fr = new FileReader(data);
        br = new BufferedReader(fr);
        while ((line = br.readLine()) != null) {
            datum = Double.parseDouble(line);
            dataList.add(datum);
        }
        System.out.println("Los datos se agregaron correctamente...");

        return dataList;
    }
}
