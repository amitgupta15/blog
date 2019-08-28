abstract public class Dealership {
    public void orderVehicle(String type) {
        
        Vehicle vehicle = createVehicle(type);
        System.out.println("Ordering Vehicle..." + vehicle.getType());
        vehicle.prepareVehicle();
        vehicle.performPaperwork();
        vehicle.acceptPayment();
        vehicle.deliver();
    }

    abstract public Vehicle createVehicle(String type);
} 
