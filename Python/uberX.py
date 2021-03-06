from car import Car


class UberX(Car):
    brand = str
    model = str

    def __init__(self, license, driver, passengers, brand, model):
        super().__init__(license, driver, passengers)
        self.brand = brand
        self.model = model

    def printDataCar(self):
        super().printDataCar()
        print("Brand: {}".format(self.brand))
        print("Model: {}".format(self.model))
