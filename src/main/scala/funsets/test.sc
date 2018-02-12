import funsets.FunSets
import funsets.FunSets.{Set, diff, map, intersect, union}

val evenSet: Set = x => x % 2 == 0
val fiveSet: Set = x => x % 5 == 0
val tenSet = intersect(evenSet, fiveSet)
val positiveTen = intersect(tenSet, x => x > 0)
val unionSet = union(evenSet, fiveSet)
val diffSet = diff(evenSet, fiveSet)
val testSet: Set = x => 1 <= x && x <= 10

FunSets.toString(testSet)
FunSets.toString(map(testSet, x => x * 10))

