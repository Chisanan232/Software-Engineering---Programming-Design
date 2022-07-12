package Software_Engineering.GoF_Design_Pattern.Adapter_Pattern.Adapter_with_Extends.scala

class S_PrintBanner(private val string: String) extends S_Banner (string: String) with S_Print {

  override def printWeak(): Unit = {
    super.showWithParen()
  }

  override def printStrong(): Unit = {
    super.showWithAster()
  }

}
