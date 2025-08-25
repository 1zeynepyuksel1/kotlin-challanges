package beginner

//recursive solution
fun factorialRecursive(n:Int):Int{
    if(n==0) return 1
    return n*factorialRecursive(n-1)
}

//iterative solution
fun factorialIterative(n:Int):Int{
    var result=1
    for(i in 1 .. n){
        result *= i
    }
    return result
}
fun main(){
    //recursive:
    println(factorialRecursive(3))
    //iterative solution
    println(factorialIterative(1))
}