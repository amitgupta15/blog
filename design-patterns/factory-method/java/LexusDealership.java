public class LexusDealership extends Dealership {
    public Vehicle createVehicle(String type) {
        switch(type.toLowerCase()) {
            case "es": return new ES();
            case "is": return new IS();
            case "rx": return new RX();
            default: {
                System.out.println("No Such Model available");
                System.exit(0);
                return null;
            }
        }
    }
}

class ES extends Vehicle {
    ES() {
        type = "ES";
    }
}

class IS extends Vehicle {
    IS() {
        type = "IS";
    }
}

class RX extends Vehicle {
    RX() {
        type = "RX";
    }
}

