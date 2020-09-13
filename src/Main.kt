fun isItPalindrom(s: String): String {
    for (i in 0..(s.length) / 2) {
        if (s[i] != s[s.length - 1 - i]) return "NO"
    }
    return "YES"
}

fun main() {
    print(isItPalindrom(readLine()!!))
}
