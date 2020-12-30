package Software_Engineering.GoF_Design_Pattern.Adapter_Pattern.Adapter_with_Delegation.scala

object S_Main extends App {

  val p: S_Print = new S_PrintBanner("Hello, Mr. Scala's Worldwide")
  p.printWeak()
  p.printStrong()

}
