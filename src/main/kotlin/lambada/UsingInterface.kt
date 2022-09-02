import lambada.User

class UsingInterface {

    fun notifyRanks(
        users: ArrayList<User>,
        callback: NotifyRankListener
    ) {
        for (user in users) {
            when (user.rank) {
                "Second Lieutenant" -> {
                    callback.onSecondLieutenantFound(user.name + " : " + user.rank)
                }
                "First Lieutenant" -> {
                    callback.onFirstLieutenantFound(user.name + " : " + user.rank)
                }
                "Captain" -> {
                    callback.onCaptainFound(user.name + " : " + user.rank)
                }
                "Major" -> {
                    callback.onMajorFound(user.name + " : " + user.rank)
                }
                else -> {
                    callback.onBrigadierFound(user.name + " : " + user.rank)
                }
            }
        }
    }
}

interface NotifyRankListener {
    fun onFirstLieutenantFound(s: String)
    fun onSecondLieutenantFound(s: String)
    fun onCaptainFound(s: String)
    fun onMajorFound(s: String)
    fun onBrigadierFound(s: String)
}

fun main() {

    val ranks = UsingInterface()
    val user: ArrayList<User> = ArrayList()
    user.add(User("Nadeem Raza", 45, "Second Lieutenant"))
    user.add(User("Nigar Johar", 40, "First Lieutenant"))
    user.add(User("Usman Malik", 35, "Captain"))
    user.add(User("Mohammad Sarwar", 43, "Major"))
    user.add(User("Muhammad Usman", 32, "Brigadier"))

    ranks.notifyRanks(user,object :NotifyRankListener{
        override fun onFirstLieutenantFound(s: String) {
            println(s)
        }
        override fun onSecondLieutenantFound(s: String) {
            println(s)
        }
        override fun onCaptainFound(s: String) {
            println(s)
        }
        override fun onMajorFound(s: String) {
            println(s)
        }
        override fun onBrigadierFound(s: String) {
            println(s)
        }
    })
}