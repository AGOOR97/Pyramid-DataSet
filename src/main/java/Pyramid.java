public class Pyramid
{
    // Define Attributes
    private String pharaoh;
    private String modernName;
    private String site;
    private double height;

    // Define Constructor
    public Pyramid(String pharaoh,String modernName,String site,double height)
    {
        this.pharaoh = pharaoh;
        this.modernName = modernName;
        this.site = site;
        this.height = height;
    }

    // Define Setters and Getters


    public String getPharaoh()
    {
        return pharaoh;
    }

    public void setPharaoh(String pharaoh)
    {
        this.pharaoh = pharaoh;
    }

    public String getModernName()
    {
        return modernName;
    }

    public void setModernName(String modernName)
    {
        this.modernName = modernName;
    }

    public String getSite()
    {
        return site;
    }

    public void setSite(String site)
    {
        this.site = site;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    /// this function is to print it will be called by return
    // if you say return that format will be printed
    @Override
    public String toString()
    {
        return "Pyramid{" + "pharaoh=" + pharaoh + ", modern_name=" + modernName + ", site=" + site + ", height=" + height + '}';
    }
}
