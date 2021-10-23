from payment import Payment

class PayPal(Payment):
    email = str

    def __init__(self, id, email):
        super.__init(id)
        self.email = email