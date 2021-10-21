from car import Car
from account import Account

if __name__ == '__main__':
    print('Hello World!')

    car = Car("ABC123", Account("Brandon", "Brand"), 4)
    print("Car license: " + str(car.license))
    print("Car driver: " + str(vars(car.driver)))
    print("Car passengers: " + str(car.passengers))
