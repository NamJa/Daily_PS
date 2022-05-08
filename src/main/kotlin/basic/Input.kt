package basic

fun main() {

    val br = System.`in`.bufferedReader()
    val num = br.readLine().toInt()

    // List<Int>
    val nums = br.readLine().split(" ").map { it.toInt() }

    // 문자열을 charArray로 받기
    val char = br.readLine().toCharArray()
}