//Declare Dealership function constructor
function Dealership(createVehicle) {
    this.createVehicle = createVehicle;
}

//It is better to add a function to the prototype so that it is shared between objects. If you put the function inside the function constructor, then it gets copied for each object and takes up memory space
Dealership.prototype.orderVehicle = function(type) {
    var vehicle = this.createVehicle(type);
    //createVehicle() is the Factory Method
    if (vehicle === null) {
        console.error('No such vehicle available - ' + type);
        return;
    }
    console.log('Ordering ' + vehicle.getType());
    vehicle.prepareVehicle();
    vehicle.performPaperwork();
    vehicle.acceptPayment();
    vehicle.deliver();
};

//Declare Vehicle function constructor
function Vehicle(type) {
    this.type = type;
}

Vehicle.prototype = {
    getType: function() {
        return this.type;
    },
    prepareVehicle: function() {
        console.log('Preparing ' + this.type);
    },
    performPaperwork: function() {
        console.log('Performing Paperwork for ' + this.type);
    },
    acceptPayment: function() {
        console.log('Accepting payment for ' + this.type);
    },
    deliver: function() {
        console.log('Congratulations! Your ' + this.type + ' is ready!');
    },
};

var toyotaDealership = new Dealership(function(type) {
    if (type.toLowerCase() === 'corolla') {
        return new Vehicle('Corolla');
    } else if (type.toLowerCase() === 'camry') {
        return new Vehicle('Camry');
    } else if (type.toLowerCase() === 'highlander') {
        return new Vehicle('Highlander');
    } else {
        return null;
    }
});
var lexusDealership = new Dealership(function(type) {
    if (type.toLowerCase() === 'es') {
        return new Vehicle('ES');
    } else if (type.toLowerCase() === 'is') {
        return new Vehicle('IS');
    } else if (type.toLowerCase() === 'rx') {
        return new Vehicle('RX');
    } else {
        return null;
    }
});

toyotaDealership.orderVehicle('camry');
console.log('');
lexusDealership.orderVehicle('es');
