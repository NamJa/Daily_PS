package basic

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    // 기본
    print("hello")

    // bufferedWriter
    val sout = BufferedWriter(OutputStreamWriter(System.out))
    sout.appendLine()
    sout.flush()
    sout.close();

    // 더 짧은 bufferedWriter
    val bw = System.out.bufferedWriter()

    //템플릿
    val s = "abc"
    println("$s.length is ${s.length}") // prints "abc.length is 3"
}
