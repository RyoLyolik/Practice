package mirea.kvbo1.bichikov.practice6;

public class Kelvin extends UnitOfMeasurement{
    private double temperature;
    private String type = "K";
    public Kelvin(double temperature)
    {
        this.temperature = temperature;
    }

    public double getTemperature(){
        return this.temperature;
    }
    public void setTemperature(double t){
        this.temperature = t;
    }

    @Override
    public UnitOfMeasurement convert(Meases meas) {
        if ( meas.getTitle().equals("C") ){
            return new Celsius(this.temperature-273);
        }
        else if ( meas.getTitle().equals("K")  ){
            return new Kelvin(this.temperature);
        }
        else if ( meas.getTitle().equals("F") ){
            return new Fahrenheit((this.temperature-273)*9.5+32);
        }
        return null;
    }
    @Override
    public String toString(){
        return this.temperature+" K";
    }
}
