fun main() {
    val user = setUser("Rio","ngedit video",  17)
    println(user)
}

fun setUser(name: String, hobby: String, age: Int) = "My name is $name, i like $hobby, and I'm $age years old"
