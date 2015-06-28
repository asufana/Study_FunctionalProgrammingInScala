package c1_1

case class Charge(creditCard: CreditCard, amount:Double) {

    def combine(otherCharge:Charge):Charge =
        if(creditCard == otherCharge.creditCard)
            Charge(creditCard, amount + otherCharge.amount)
        else
            throw new Exception("Can't combine.")

}
