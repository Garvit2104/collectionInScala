object reduceMethod extends App{
  val lst = List(1, 2, 3, 5, 7, 10, 13)
  val lst2 = List("A", "B", "C")
  // Reduce Left fn start iteration from the left side
  println(lst2.reduceLeft(_+_))   // It add two char and then take sum as parameter and add to third char
  println(lst.reduceLeft(_+_))   // It add two nums and then take sum as parameter and add to third nums and so on

  println(lst.reduceLeft((x,y) =>{
    println(x + "," + y);
    x+y
  }))
  // Reduce Right start iterate from Right side
  println(lst.reduceRight(_-_))   // It add two nums and then take sum as parameter and subs to third nums and so on

}
