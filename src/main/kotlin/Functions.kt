fun main(){
    val user = setUser("Zulfiana Aulia Syafa", "watching youtube videos", 16)
    println(user)
}

fun setUser(name:String, hobby:String, age:Int) = "My name is $name, I like $hobby, and I'm $age year's old"