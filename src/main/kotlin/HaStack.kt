class HaStack {


    val fun1: (needle: String, array: List<String>) -> Boolean = { n, arr ->

        var isFound: Boolean = false
        for (i in arr) {
            if (i == n) {
                isFound = true
                break
            }
        }
        isFound
    }

    val fun2: (List<String>, List<String>) -> Unit = { arrA, arrB ->

        for (needle in arrA) {
            if (fun1(needle, arrB)) {

            } else {

            }
        }
    }
}


