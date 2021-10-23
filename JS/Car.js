class Car {
	constructor(license, driver) {
		this.id;
		this.license = license;
		this.driver = driver;
		this._passengers;
	}

	get passengers() {
		return this._passengers;
	}

	set passengers(passengers) {
		if (passengers != 4) {
			console.log("Debes tener 4 pasajeros");
		} else {
			this._passenger = passengers;
		}
	}

	printDataCar = () => {
		console.log(this);
	};
}
