package comp2850.banking

const val MAX_OVERDRAFT = 100

class StudentAccount(holder: String) : BankAccount(holder){
    var overdraft = 0
    set(value){
        require(value >= 0 && value <= MAX_OVERDRAFT )
        field = value
    }


    override fun withdraw(amount: Int){
        require(amount>0) {"Withdrawal amount must be greater than 0"}
        require(balance-amount >= -overdraft) {"Insufficient funds for withdrawal"}
        balance = balance - amount
    //to do 
    }

    fun withdrawalsAllowed(): Boolean {
        if (balance > -overdraft ){
            return true
        }
        else
        {
        return false
        }
    }

    override fun toString() = "Account for $holder, balance = $balance (overdraft = $overdraft)"
}