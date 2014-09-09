package com.lb.scala.ch05

class Counter  {

  // 字段必须初始化
  private var age = 0

  // 方法默认是共有的
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
