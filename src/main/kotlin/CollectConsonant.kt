class CollectConsonant {

        fun collectConsonant(s: String): MutableList<String> {

        val list: MutableList<String> = ArrayList()

        val line = s.lowercase()
        val char: List<Char> = line.toList()

        for (c in char) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == ' ')) {
                list.add(c.toString())
            }
        }
        return list
    }

}