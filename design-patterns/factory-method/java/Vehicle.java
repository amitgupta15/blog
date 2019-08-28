abstract class Vehicle {
    String type;

    public String getType() {
        return type;
    }

    public void prepareVehicle() {
        System.out.println("Preparing Vehicle..." + type);
        System.out.println("Perform Inspection...");
        System.out.println("Wash the vehicle...");
        System.out.println("Top up the fuel...");
        System.out.println("Install any accessories - all weather mats, trunk mats, paint protection, etc.");
    }

    public void performPaperwork() {
        System.out.println("Perform Paperwork for..." + type);
        System.out.println("Prepare Invoice...");
    }

    public void acceptPayment() {
        System.out.println("Accept payment...");
    }

    public void deliver() {
        System.out.println("Congratulations! Your " + type + " is ready for you!");
    }
}