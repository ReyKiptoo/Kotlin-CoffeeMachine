class BankAccount {
    var deposited: Long = 0
    var withdrawn: Long = 0
    var balance: Long = 0
    constructor(_deposited: Long, _withdrawn: Long) {
        this.deposited = _deposited
        this.withdrawn = _withdrawn
        this.balance = _deposited - _withdrawn
    }
}