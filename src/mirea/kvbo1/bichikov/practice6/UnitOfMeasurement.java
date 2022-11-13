package mirea.kvbo1.bichikov.practice6;

public abstract class UnitOfMeasurement implements Convertable{
    private String type;
    @Override
    public UnitOfMeasurement convert(UnitOfMeasurement meas) {
        return null;
    }
    public String getType(){
        return type;
    }

    public abstract UnitOfMeasurement convert(Meases meas);
}
