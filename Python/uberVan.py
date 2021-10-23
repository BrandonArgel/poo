from car import Car


class UberVan(Car):
    typeCarAccepted = []
    seatsMaterial = []

    def __init__(self, license, driver, passengers, typeCarAccepted, seatsMaterial):
        super().__init__(license, driver, passengers)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial

    def printDataCar(self):
        super().printDataCar()
        print("Type Car Accepted: ", self.typeCarAccepted)
        print("Seats Material: ", self.seatsMaterial)

    def setPassengers(self, passengers):
        if passengers == 6:
            self.passengers = passengers
        else:
            print("The number of passengers must be 6")
