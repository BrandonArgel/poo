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

    def getPassengers(self):
        return self.passengers

    def setPassengers(self, passengers):
        if(passengers == 4):
            self.passengers = passengers
        else:
            print("The car can only hold 4 passengers")

    # print data of car
    def printDataCar(self):
        print("License: ", self.license)
        print("Driver: ", self.driver.name)
        print("Document: ", self.driver.document)
        print("Passengers: ", self.passengers)
