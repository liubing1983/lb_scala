package com.lb.scala.ch05

class Counter  {

  // �ֶα����ʼ��
  private var age = 0

  // ����Ĭ���ǹ��е�
  def increment() { age += 1 }

  def current() = age
  
  
  private var privateName = "lb"
  def name = privateName
  def name_= (newValue : String) {
    if(newValue  == "lb"){
      privateName = newValue //"liu bing"
    }else{
      privateName = "liu bing"
    }
  }
  

}
