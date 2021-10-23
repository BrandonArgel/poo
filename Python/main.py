from car import Car
from uberX import UberX
from uberPool import UberPool
from account import Account

if __name__ == '__main__':
    print('Hello World!')

    uberX = UberX("ABC123", Account("Brandon", "Brand"),
                  4, "Chevrolet", "Spark")
    print("UberX license: " + str(uberX.license))
    print("UberX driver: " + str(vars(uberX.driver)))
    print("UberX passengers: " + str(uberX.passengers))
    print("UberX make: " + str(uberX.brand))
    print("UberX model: " + str(uberX.model))

    uberPool = UberPool("DEF456", Account(
        "Andrea", "Andy"), 4, "Dodge", "Attitude")
    print("UberPool license: " + str(uberPool.license))
    print("UberPool driver: " + str(vars(uberPool.driver)))
    print("UberPool passengers: " + str(uberPool.passengers))
    print("UberPool make: " + str(uberPool.brand))
    print("UberPool model: " + str(uberPool.model))
