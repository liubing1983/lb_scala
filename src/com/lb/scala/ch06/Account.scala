package com.lb.scala.ch06

class Account {
  
  val id = Account.newUniqueNumber

}

// ��classͬ����ObjectΪclass�İ�������
object Account{
  
  // ��������
  private var lastNumber = 0
  private def newUniqueNumber()= {
    lastNumber += 1;
    lastNumber;
  }
  
}