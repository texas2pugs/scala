
// Function takes an interger n and prints
//   'Hello World' n times
def f(n:Int) = {
  for(n <- Array.range(0,n)) {
    println("Hello World")
  }
}

val n = 10
f(n)
