package beginner
//Recursive solution for hcf problem
fun findHcf(a:Int,b:Int):Int {
    if(b==0) return a
    return findHcf(b,a%b)
}
//Iterative solution for hcf problem
fun findHcfIterative(a:Int,b:Int):Int {
    var x=a
    var y=b
    while(y!=0){
        var temp=y
        y=x%y
        x=temp
    }
    return x
}
fun findLcm(a:Int,b:Int):Int {
    return a*b/(findHcf(a,b))
}
fun main(){
    println("Recursive solution for hcf:")
    println(findHcf(12,6))
    println("Iterative solution for hcf:")
    println(findHcfIterative(12,6))
    println("Solution for lcm")
    println(findLcm(12,6))

}