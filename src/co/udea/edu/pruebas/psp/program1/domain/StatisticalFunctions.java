package co.udea.edu.pruebas.psp.program1.domain;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author Teban-Ing
 */
public class StatisticalFunctions {

    LinkedList data;
    Double mean;
    Double deviation;
    FileStadisticalData fileData;

    public StatisticalFunctions(String ruta) throws IOException {
        this.data=new LinkedList();
        this.fileData=new FileStadisticalData(ruta);
        data=fileData.addData();
    }
    public Double calculateDeviation() throws IOException {
        Double sum=0.0;
        if(data.isEmpty())
            return null;
        if(mean==null)
            mean=calculateMean();
        for (Object list1 : data) {
            Double datum=(Double)list1;
            sum=sum+Math.pow(datum-mean, 2);
        }
        deviation=Math.sqrt(sum/(data.size()-1));
        return deviation;
    }

    public Double calculateMean() throws IOException {
        Double sum = 0.0;
        if(data.isEmpty())
            return null;
        for (Object data1 : data) {
            Double datum=(Double)data1;
            sum = datum + sum;
        }
        mean=sum/data.size();
        return mean;
    }
}
