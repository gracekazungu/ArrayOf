fun main() {
    var names = Strings("Grace", "Becky", "Cathy", "Rose")
    println(names)
    println(cities())
    numbers()
    var name=stringArray("Pauline","Idaya","Eunice")
    println(name)
}



//Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun Strings(name1:String,name2:String,name3:String,name4:String){
     println(arrayOf(name1,name2,name3,name4).contentToString())
}
//Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.
fun cities() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { city->println(city.capitalize()) }
}
// Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
fun numbers(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
println(numbers.indexOf(158))//(ii) prints out the index of 158
    var sum=numbers[1]+numbers[4]//(i) prints out the sum of the second and fifth elements
    println(sum)
    numbers.sort()//(iii) prints out the elements in ascending order
    println(numbers.contentToString())
}
// Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun stringArray(name5:String,name6:String,name7:String):String{
    return arrayOf(name5,name6,name7).contentToString()
}