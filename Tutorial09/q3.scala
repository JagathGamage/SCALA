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
  
  def transfer(amount: Double, targetAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive.")
    require(amount <= balance, "Insufficient balance for transfer.")
    
    withdraw(amount)
    targetAccount.deposit(amount)
  }
  
  def getBalance: Double = balance
}

// Example usage
val account1 = new Account(1000)
val account2 = new Account(500)

println(s"Initial balance of account1: ${account1.getBalance}")
println(s"Initial balance of account2: ${account2.getBalance}")

account1.deposit(200)
account1.withdraw(150)
account1.transfer(300, account2)

println(s"Final balance of account1: ${account1.getBalance}")
println(s"Final balance of account2: ${account2.getBalance}")
