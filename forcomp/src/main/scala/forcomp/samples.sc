import forcomp.Anagrams.{Occurrences, Sentence, Word}

val w:Word = "hellow"
val s:Sentence = List("This", "is", "a", "sentence")

w.groupBy(elem => elem).toList.map(x => (x._1, x._2.length))
s.reduce(_+_)

val occ:Occurrences = List(('a', 2), ('b', 2))

def combinations(occurrences: Occurrences): List[Occurrences] = {
  for {
    (c, max) <- occurrences
    n <- 1 until max
  } yield List((c, n)) :: combinations(occurrences.tail)
}


combinations(occ)