import java.util.Collections.max


fun hello(listener: CallbacksListener) {
    listener.onSomething1()
}

fun main(args: Array<String>) {

    hello(object: CallbacksListener {
        override fun onSomething() {

        }

        override fun onSomething1() {

        }

        override fun onSomething2() {

        }
    })

}

interface CallbacksListener {
    fun onSomething()
    fun onSomething1()
    fun onSomething2()
}