package com.lb.scala.ch06

class Account {
  
  val id = Account.newUniqueNumber

}

// 于class同名的Object为class的半生对象
object Account{
  
  // 单例对象
  private var lastNumber = 0
  private def newUniqueNumber()= {
    lastNumber += 1;
    lastNumber;
  }
  
}