package Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.scala.idcard

import Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.scala.framework.S_Product


class S_IDCard(private val owner: String) extends S_Product {

  override def use(): Unit = {
    println(s"Use $owner's ID card")
  }


  def getOwner(): String = {
    owner
  }

}
