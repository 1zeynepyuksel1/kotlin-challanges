package beginner
//girilen sayı kadar fibonacci serisi yazdırır.
//Iterative solution
fun fibonacci(n:Int):List<Int>{
    val rootList= mutableListOf<Int>(0,1)
    for (i in 2..n){
        rootList.add(rootList[i-1]+rootList[i-2])
    }
    return rootList.take(n)
}

//Recursive solution
fun fibonacciRecursive(n:Int):Int{
    when(n){
        0->return 0
        1->return 1
    }
    return fibonacciRecursive(n-1)+fibonacciRecursive(n-2)
}
fun main(){
    println("Iterative Solution:")
    println(fibonacci(10))
    println("/n")
    println("Recursive Solution:")
    val fibonacciList= mutableListOf<Int>()
    for (i in 0 until 10){
        fibonacciList.add(fibonacciRecursive(i))
    }
    println(fibonacciList)
}