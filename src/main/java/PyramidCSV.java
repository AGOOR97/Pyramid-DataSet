import java.util.*;
import java.io.*;

public class PyramidCSV
{
    // Define Constructor
    public PyramidCSV(){}

    // this function is for return data of each line (each pyramid)
    // each line in csv file will call this function and extract only mentioned attributes

    public Pyramid onePyramidReturned (String[] pyramidData)
    {
        String pharaoh_data = pyramidData[0];
        String modern_data = pyramidData[2];
        String site_data = pyramidData[4];
        double height_data = 0;
        if(pyramidData[7] != null && pyramidData[7].length() > 0)
        {
            height_data = Double.parseDouble(pyramidData[7]);
        }
        return new Pyramid(pharaoh_data,modern_data,site_data, height_data);
    }


    // this function represents all list of all pyramids
    // returns a list of all pyramids and its return type of <List>Pyramid
    public List<Pyramid> listofTotalPyramids (String fileCsv)
    {
        List<Pyramid> totalPyramids = new ArrayList<>();
        try( BufferedReader bf = new BufferedReader(new FileReader(fileCsv)))
        {
            String line = bf.readLine();
            if (line != null)
            {
                bf.readLine();
            }
            line = bf.readLine();
            while (line != null)
            {
                // sending attributes as a List to Function 'onePyramidReturned'
                // onePyramidReturned' Function returns only what attributes we need
                String[] attributes = line.split(",");
                Pyramid onePyramid =  onePyramidReturned(attributes);

                // after getting pyramid add it to total list
                // continue looping until finished
                totalPyramids.add(onePyramid);
                line = bf.readLine();

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return totalPyramids;
    }
}
