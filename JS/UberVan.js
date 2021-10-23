class UberVan extends Car {
	constructor(id, license, driver, passengers, typeCarAccepted, seatsMaterial) {
		super(id, license, driver, passengers);
		this.typeCarAccepted = typeCarAccepted;
		this.seatsMaterial = seatsMaterial;
	}

	setPassengers(passengers) {
		if (passengers != 4) {
			console.log("Debes tener 6 pasajeros");
		} else {
			this._passenger = passengers;
		}
	}

	printDataCar() {
		super.printDataCar();
		console.log(`Type Car Accepted: ${this.typeCarAccepted}`);
		console.log(`Seats Material: ${this.seatsMaterial}`);
	}
}
