package vehicleExample;

public class Car implements vehicle{
    private DatabaseOperations databaseoperation;

    public Car(DatabaseOperations databaseoperation){
        this.databaseoperation = databaseoperation;
    }
    @Override
    public void storevehicle(){
        databaseoperation.storeVehicleIntoDatabase("Car");
    }
}
