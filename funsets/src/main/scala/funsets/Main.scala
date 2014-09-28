package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  printSet(map(singletonSet(1), x => x*2))

  val s = singletonSet(2);
}
