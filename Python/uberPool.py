from car import Car


class UberPool(Car):
    brand = str
    model = str

    def __init__(self, license, driver, passengers, brand, model):
        super().__init__(license, driver, passengers)
        self.brand = brand
        self.model = model
