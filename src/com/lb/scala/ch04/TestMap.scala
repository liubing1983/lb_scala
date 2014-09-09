package com.lb.scala.ch04

import sun.org.mozilla.javascript.internal.ast.Yield

object TestMap {
  
  def main(args : Array[String]){
    
    // ���ɱ�map, ������ֵ�����޸�
    val scores = Map("Alice" -> 10, "wfq" -> 93)
    // ���ַ�ʽ����map
    val scores3 = Map( ("Alice", 10), "wfq" -> 93)
    
    // �ɱ�Map
    val scores2 = scala.collection.mutable.Map("Alice" -> 10, "wfq" -> 93)
    
    // ��ȡֵ
    val a = scores("wfq")
    print(a)
    
    // �ж�key�Ƿ����
    println(scores.contains("lb"))
    println(scores.getOrElse("wfq", 0))
    
    // ����ֵ
    scores2("lb") = 82
    // ����ֵ
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