public class TeslaDealership extends Dealership {
    public Vehicle createVehicle(String type) {
        switch(type.toLowerCase()) {
            case "model_s": return new ModelS();
            case "model_3": return new Model3();
            case "model_x": return new ModelX();
            case "model_y": return new ModelY();
            default: {
                System.out.println("No Such Model available");
                System.exit(0);
                return null;
            }
        } 
    }

}

class ModelS extends Vehicle {
    ModelS() {
        type = "Model S";
    }
}

class Model3 extends Vehicle {
    Model3() {
        type = "Model 3";
    }
}

class ModelX extends Vehicle {
    ModelX() {
        type = "Model X";
    }
}

class ModelY extends Vehicle {
    ModelY() {
        type = "Model Y";
    }
}