package com.lb.scala.ch04

import sun.org.mozilla.javascript.internal.ast.Yield

object TestMap {
  
  def main(args : Array[String]){
    
    // 不可变map, 创建后值不可修改
    val scores = Map("Alice" -> 10, "wfq" -> 93)
    // 两种方式创建map
    val scores3 = Map( ("Alice", 10), "wfq" -> 93)
    
    // 可变Map
    val scores2 = scala.collection.mutable.Map("Alice" -> 10, "wfq" -> 93)
    
    // 获取值
    val a = scores("wfq")
    print(a)
    
    // 判断key是否存在
    println(scores.contains("lb"))
    println(scores.getOrElse("wfq", 0))
    
    // 新增值
    scores2("lb") = 82
    // 更新值
    scores2("wfq") = 91
    println(scores2)
    
    for((k, v) <- scores2)
      println(k+" - "+ v)
      
    println(scores2.keySet)
   
    for(v <- scores2.values){
      println(v)
      
    for((k, v) <- for((k, v) <- scores2) yield(v, k))
    	println(k+" - "+ v)
    }
  }

}