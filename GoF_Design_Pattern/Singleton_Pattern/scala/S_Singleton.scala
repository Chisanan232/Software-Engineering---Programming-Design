package Software_Engineering.GoF_Design_Pattern.Singleton_Pattern.scala

class S_Singleton {

  private val s_Singleton: S_Singleton = new S_Singleton()

  def getInstance(): S_Singleton = {
    s_Singleton
  }

}
