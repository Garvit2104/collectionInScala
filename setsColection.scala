import scala.collection.immutable
object setsColection {  // set is collection of unique element of same data type
//  set is a collection of
   val mySet:Set[Int] = Set(1,2,3,4,4,5,6,6)
  val mySet2: Set[Int] = Set(4,6,7,8,9,0)

  def main(args:Array[String]): Unit = {
    println(mySet)   // It prints all unique element without considering any order
  // concatenate of two set
    println(mySet ++ mySet2)
    println(mySet.&(mySet2))
    println(8)  // it checks 8 is present in the set or not
    println(mySet.head)  // it return the first element
    println(mySet2.tail)  // it return the last element of the set

    mySet.foreach(println)
    println("for loop")
    for(nums <- mySet2){
      println(nums)

    }
   }

}
