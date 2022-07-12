package Software_Engineering.GoF_Design_Pattern.Adapter_Pattern.Adapter_with_Delegation.scala

class S_Banner(private val string: String) {

  def showWithParen(): Unit = {
    println("(" + string + ")")
  }

  def showWithAster(): Unit = {
    println("*" + string + "*")
  }

}
