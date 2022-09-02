package lambada

class NotifyRank {

    fun notifyRank(
        users: ArrayList<User>,
        onFirstLieutenantFound: (String) -> Unit = {},
        onSecondLieutenantFound: (String) -> Unit = {},
        onCaptainFound: (String) -> Unit = {},
        onMajorFound: (String) -> Unit = {},
        onBrigadierFound: (String) -> Unit = {},
    ) {
        for (user in users) {
            when (user.rank) {
                "Second Lieutenant" -> {
                    onSecondLieutenantFound(user.name + " : " + user.rank)
                }
                "First Lieutenant" -> {
                    onFirstLieutenantFound(user.name + " : " + user.rank)
                }
                "Captain" -> {
                    onCaptainFound(user.name + " : " + user.rank)
                }
                "Major" -> {
                    onMajorFound(user.name + " : " + user.rank)
                }
                else -> {
                    onBrigadierFound(user.name + " : " + user.rank)
                }
            }
        }
    }
}

fun main() {

    val user: ArrayList<User> = ArrayList()
    user.add(User("Nadeem Raza", 45, "Second Lieutenant"))
    user.add(User("Nigar Johar", 40, "First Lieutenant"))
    user.add(User("Usman Malik", 35, "Captain"))
    user.add(User("Mohammad Sarwar", 43, "Major"))
    user.add(User("Muhammad Usman", 32, "Brigadier"))

    val notifyRank = NotifyRank()
    notifyRank.notifyRank(
        users = user,
        onFirstLieutenantFound = {
            println(it)
        },
        onSecondLieutenantFound =  {
            println(it)
        },
        {
            println(it)
        },
        {
            println(it)
        },
        {
            println(it)
        }
    )

}