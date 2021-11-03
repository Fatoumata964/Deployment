package sn.test2

case class Person1(id:Int, prenom:String){
  def getId(x:Int): Int = id+x

  def getPrenom(): String=this.prenom

  }
