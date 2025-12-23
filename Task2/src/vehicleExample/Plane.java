package vehicleExample;

public class Plane implements vehicle{
    private DatabaseOperations databaseOperations;
    @Override
    public void storevehicle(){
        databaseOperations.storeVehicleIntoDatabase("Plane");
    }
}
