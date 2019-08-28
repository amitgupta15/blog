public class ToyotaDealership extends Dealership {
    public Vehicle createVehicle(String type) {
        switch(type.toLowerCase()) {
            case "corolla": return new Corolla();
            case "camry": return new Camry();
            case "highlander": return new Highlander();
            default: {
                System.out.println("No Such Model available");
                System.exit(0);
                return null;
            }
        }
    }
}

class Corolla extends Vehicle {
    public Corolla() {
        type = "corolla";
    }
}

class Camry extends Vehicle {
    public Camry() {
        type = "camry";
    }
}

class Highlander extends Vehicle {
    public Highlander() {
        type = "highlander";
    }
}