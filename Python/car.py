from account import Account


class Car:
    id = int
    license = str
    driver = Account("", "")
    passengers = int

    def __init__(self, license, driver, passengers):
        self.license = license
        self.driver = driver
        self.passengers = passengers
