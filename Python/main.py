from car import Car
from uberX import UberX
from uberVan import UberVan
from account import Account

if __name__ == '__main__':
    print('Hello World!')

    # uberX = UberX("ABC123", Account("Brandon", "Brand"),
    #               4, "Chevrolet", "Spark")
    # print(uberX.printDataCar())
    # uberX.setPassengers(3)

    uberVan = UberVan("DEF456", Account(
        "Andrea", "Andy"), 6, "Dodge", "leather")
    print(uberVan.printDataCar())
    uberVan.setPassengers(7)
