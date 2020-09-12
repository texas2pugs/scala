
// For a given list, repeat each element in the list n
//   amount of times.

val s = 4              // Number of repeats
val x = List(1,2,3,4)  // List of elements which are to be repeated

def f(num:Int, arr:List[Int]): List[Int] = {
  return List.fill(num)(arr).flatten.sorted
}

f(s,x)
