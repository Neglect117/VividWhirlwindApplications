public class Liquid
{
    private double boilingPoint;
    private double freezingPoint;
    private double currentTemp;

    public Liquid()
    {
        currentTemp = 50;
    }

    public void lowerTemp()
    {
        currentTemp -= 10;
    }

    public double getTemp()
    {
        return currentTemp;
    }
}