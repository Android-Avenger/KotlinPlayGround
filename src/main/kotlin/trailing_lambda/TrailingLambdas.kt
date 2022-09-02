package trailing_lambda

class TrailingLambdas {

    fun ticTacToe(
        stateOne:Boolean = false,
        stateTwo:Boolean = false,
        stateThree:Boolean = false,
        onSuccess:(String) ->Unit
    ) {
        val result:String = if (stateOne && stateTwo && stateThree){
            "you win"
        }else {
            "you lose"
        }
        onSuccess(result)
    }
}

fun main() {
    val trailingLambdas = TrailingLambdas()
    trailingLambdas.ticTacToe(stateOne = false,stateTwo = true,stateThree = true){
        println(it)
    }
}