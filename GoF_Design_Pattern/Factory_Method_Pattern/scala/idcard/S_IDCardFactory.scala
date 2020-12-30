package Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.scala.idcard

import Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.scala.framework.{S_Factory, S_Product}


class S_IDCardFactory extends S_Factory {

  private var owners: Array[String] = Array[String]()

  override def createProduct(owner: String): S_Product = {
    new S_IDCard(owner)
  }


  override def registerProduct(product: S_Product): Unit = {
    this.owners :+ product.asInstanceOf[S_IDCard].getOwner()
  }


  def getOwners(): Array[String] = {
    owners
  }

}
