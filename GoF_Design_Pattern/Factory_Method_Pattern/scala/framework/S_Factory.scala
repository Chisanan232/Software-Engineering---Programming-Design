package Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.scala.framework


abstract class S_Factory {

  def create(owner: String): S_Product = {
    val product = createProduct(owner)
    registerProduct(product)
    product
  }


  def createProduct(owner: String): S_Product


  def registerProduct(product: S_Product): Unit

}
