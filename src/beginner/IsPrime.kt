package beginner

import kotlin.math.sqrt

fun isPrime(n:Int):Boolean{
    when(n){
        1->return false
        2->return true
    }
    for(i in 3 .. sqrt(n.toDouble()).toInt()){
        if(n%i==0){
            return false
        }
    }
    return true
}
fun main(){
    println(isPrime(15))
    println(isPrime(7))
    println(isPrime(9))
    println(isPrime(2))
    println(isPrime(13))
}