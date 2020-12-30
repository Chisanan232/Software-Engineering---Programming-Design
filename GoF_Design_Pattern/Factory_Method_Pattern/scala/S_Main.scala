package Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.scala

import Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.scala.framework.S_Factory
import Software_Engineering.GoF_Design_Pattern.Factory_Method_Pattern.scala.idcard.S_IDCardFactory


object S_Main extends App {

//  val factory = new S_IDCardFactory().asInstanceOf[S_Factory]
  val factory: S_Factory = new S_IDCardFactory()
  val card1 = factory.create("Michael Jordan")
  val card2 = factory.create("Kobe Bryant")
  val card3 = factory.create("Lebron James")

  card1.use()
  card2.use()
  card3.use()

}
