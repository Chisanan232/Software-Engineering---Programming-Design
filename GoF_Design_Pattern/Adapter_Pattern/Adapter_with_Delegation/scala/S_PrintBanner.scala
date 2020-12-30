package Software_Engineering.GoF_Design_Pattern.Adapter_Pattern.Adapter_with_Delegation.scala

class S_PrintBanner(private val string: String) extends S_Print {

  private val s_Banner = new S_Banner(string: String)

  override def printWeak(): Unit = {
    this.s_Banner.showWithParen()
  }

  override def printStrong(): Unit = {
    this.s_Banner.showWithAster()
  }

}
