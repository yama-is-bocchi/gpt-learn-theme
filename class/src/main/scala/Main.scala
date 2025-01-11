class BankAccount(accountName: String) {
  private var balance: Int = 0
  def deposit(money: Int): Unit = {
    balance += money
    printf("%d円預け入れました。\n残高:%d円\n", money, balance)
  }
  def withdraw(money: Int): Int = {
    if ((balance - money) < 0) {
      throw new RuntimeException("残高が足りません\n" + "** 残高:" + balance + "円 **")
    }
    balance -= money
    printf("%d円引き出しました。\n残高:%d円\n", money, balance)
    return money
  }
}

object BankApp {
  private var accounts: Map[String, BankAccount] = Map.empty
  def makeAccount(accountName: String): BankAccount = {
    if (isDuplicate(accountName)) {
      throw new RuntimeException(
        "アカウントが重複しています\n" + "** 対象アカウント:" + accountName + " **"
      )
    }
    val newAccount = new BankAccount(accountName)
    accounts += (accountName -> newAccount)
    println(accountName + "さんのアカウントを追加しました!")
    newAccount
  }
  def isDuplicate(targetName: String): Boolean = {
    accounts.contains(targetName)
  }
}

@main def main(): Unit = {
  // 1.アカウントの作成
  var users: List[BankAccount] = List.empty
  try {
    users = users :+ BankApp.makeAccount("Aさん")
    users = users :+ BankApp.makeAccount("Bさん")
    users = users :+ BankApp.makeAccount("Cさん")
    users = users :+ BankApp.makeAccount("Cさん")
  } catch {
    case e: RuntimeException => println(e.getMessage())
  }
  // 2.預け入れ,引き出し
  try {
    users.head.deposit(1000)
    users.head.withdraw(999)
    users.head.deposit(1)
    users.head.withdraw(3)
  } catch {
    case e: RuntimeException => println(e.getMessage())
  }
}
