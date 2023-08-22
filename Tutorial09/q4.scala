class Account(initialBalance: Double) {
  private var balance: Double = initialBalance
  
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive.")
    balance += amount
  }
  
  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive.")
    require(amount <= balance, "Insufficient balance.")
    balance -= amount
  }
  
  def applyInterest(): Unit = {
    val interestRate = if (balance > 0) 0.05 else 0.1
    balance += balance * interestRate
  }
  
  def getBalance: Double = balance
}

object Bank {
  def negativeBalances(accounts: List[Account]): List[Account] =
    accounts.filter(_.getBalance < 0)
  
  def totalBalance(accounts: List[Account]): Double =
    accounts.map(_.getBalance).sum
  
  def applyInterest(accounts: List[Account]): Unit =
    accounts.foreach(_.applyInterest())
}

// Example usage
val account1 = new Account(1000)
val account2 = new Account(-500)
val account3 = new Account(2000)

val accounts = List(account1, account2, account3)

println("Accounts with negative balances:")
Bank.negativeBalances(accounts).foreach(account => println(s"Balance: ${account.getBalance}"))

println(s"Total balance of all accounts: ${Bank.totalBalance(accounts)}")

println("Final balances after applying interest:")
Bank.applyInterest(accounts)
accounts.foreach(account => println(s"Balance: ${account.getBalance}"))
