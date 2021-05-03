import java.util.*;
import java.io.*;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;


public class MainClass
{
    public static void main(String[] args)
    {
        PyramidCSV pCsv = new PyramidCSV();
        List<Pyramid> totalPyramids = pCsv.listofTotalPyramids("D:/pyramids.csv");

        for (Pyramid p:totalPyramids)
        {
            System.out.println(p);
        }


        // printing in XChart
        double[] pyramidHeight = new double[totalPyramids.size()];
        double[] pyramidIndex = new double[totalPyramids.size()];

        for (int i = 0; i < totalPyramids.size() ; i++)
        {
            pyramidHeight[i] = totalPyramids.get(i).getHeight();
            pyramidIndex[i] = i+1;
        }

        // Create Chart
        XYChart chart = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", pyramidIndex, pyramidHeight);

        // Show it
        new SwingWrapper(chart).displayChart();





    }
}
