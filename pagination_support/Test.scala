/**
  * Created by raquelhao on 19/09/2016.
  */
object Test extends App{

  val (from, to, totalPages) = pageCalc(1, 25, 180)
  println(s"passing in 1, 25, 180 gives: from:$from, to:$to, totalPages:$totalPages")

  val (from2, to2, totalPages2) = pageCalc(2, 25, 180)
  println(s"passing in 2, 25, 180 gives: from:$from2, to:$to2, totalPages:$totalPages2")

  val (from3, to3, totalPages3) = pageCalc(3, 25, 180)
  println(s"passing in 3, 25, 180 gives: from:$from3, to:$to3, totalPages:$totalPages3")

  val (from4, to4, totalPages4) = pageCalc(4, 25, 180)
  println(s"passing in 4, 25, 180 gives: from:$from4, to:$to4, totalPages:$totalPages4")

  val (from5, to5, totalPages5) = pageCalc(5, 25, 180)
  println(s"passing in 5, 25, 180 gives: from:$from5, to:$to5, totalPages:$totalPages5")

  val (from6, to6, totalPages6) = pageCalc(6, 25, 180)
  println(s"passing in 6, 25, 180 gives: from:$from6, to:$to6, totalPages:$totalPages6")

  val (from7, to7, totalPages7) = pageCalc(7, 25, 180)
  println(s"passing in 7, 25, 180 gives: from:$from7, to:$to7, totalPages:$totalPages7")


  val (from8, to8, totalPages8) = pageCalc(8, 25, 180)
  println(s"passing in 8, 25, 180 gives: from:$from8, to:$to8, totalPages:$totalPages8")

  /*
  /Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/bin/java -Didea.launcher.port=7538 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/htmlconverter.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/lib/javafx-doclet.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_80.jdk/Contents/Home/lib/tools.jar:/Users/raquelhao/Documents/Projects/Tester/target/scala-2.11/classes:/Users/raquelhao/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.11.8.jar:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain Test
    passing in 1, 25, 180 gives: from:1, to:25, totalPages:8
  passing in 2, 25, 180 gives: from:26, to:50, totalPages:8
  passing in 3, 25, 180 gives: from:51, to:75, totalPages:8
  passing in 4, 25, 180 gives: from:76, to:100, totalPages:8
  passing in 5, 25, 180 gives: from:101, to:125, totalPages:8
  passing in 6, 25, 180 gives: from:126, to:150, totalPages:8
  passing in 7, 25, 180 gives: from:151, to:175, totalPages:8
  passing in 8, 25, 180 gives: from:176, to:180, totalPages:8
  */

  //java.lang.IndexOutOfBoundsException: 8
  //  val (from9, to9, totalPages9) = pageCalc(9, 25, 180)
  //  println(s"passing in 9, 25, 180 gives: from:$from9, to:$to9, totalPages:$totalPages9")

  //java.lang.IndexOutOfBoundsException: -1
  //  val (from0, to0, totalPages0) = pageCalc(0, 25, 180)
  //  println(s"passing in 0, 25, 180 gives: from:$from0, to:$to0, totalPages:$totalPages0")




  println("\n\n")

  val (from_1, to_1, totalPages_1) = pageCalc(1, 25, 175)
  println(s"passing in 1, 25, 175 gives: from_1:$from_1, to:$to_1, totalPages:$totalPages_1")

  val (from_2, to_2, totalPages_2) = pageCalc(2, 25, 175)
  println(s"passing in 2, 25, 175 gives: from_:$from_2, to:$to_2, totalPages:$totalPages_2")

  val (from_3, to_3, totalPages_3) = pageCalc(3, 25, 175)
  println(s"passing in 3, 25, 175 gives: from_:$from_3, to:$to_3, totalPages:$totalPages_3")

  val (from_4, to_4, totalPages_4) = pageCalc(4, 25, 175)
  println(s"passing in 4, 25, 175 gives: from_:$from_4, to:$to_4, totalPages:$totalPages_4")

  val (from_5, to_5, totalPages_5) = pageCalc(5, 25, 175)
  println(s"passing in 5, 25, 175 gives: from_:$from_5, to:$to_5, totalPages:$totalPages_5")

  val (from_6, to_6, totalPages_6) = pageCalc(6, 25, 175)
  println(s"passing in 6, 25, 175 gives: from_:$from_6, to:$to_6, totalPages:$totalPages_6")

  val (from_7, to_7, totalPages_7) = pageCalc(7, 25, 175)
  println(s"passing in 7, 25, 175 gives: from_:$from_7, to:$to_7, totalPages:$totalPages_7")
/*
  passing in 1, 25, 175 gives: from_1:1, to:25, totalPages:7
  passing in 2, 25, 175 gives: from_:26, to:50, totalPages:7
  passing in 3, 25, 175 gives: from_:51, to:75, totalPages:7
  passing in 4, 25, 175 gives: from_:76, to:100, totalPages:7
  passing in 5, 25, 175 gives: from_:101, to:125, totalPages:7
  passing in 6, 25, 175 gives: from_:126, to:150, totalPages:7
  passing in 7, 25, 175 gives: from_:151, to:175, totalPages:7
*/

  //java.lang.IndexOutOfBoundsException: 7
//  val (from_8, to_8, totalPages_8) = pageCalc(8, 25, 175)
//  println(s"passing in 8, 25, 175 gives: from_:$from_8, to:$to_8, totalPages:$totalPages_8")


  def pageCalc(page: Int, pageSize: Int, totalItems: Int) = {
    val pages = 1 to totalItems by pageSize
    val from = pages(page - 1)
    val to = from + pageSize - 1 min totalItems
    val totalPages = pages.size
    (from, to, totalPages)
  }

}
