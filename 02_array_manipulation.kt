//
//  02_array_manipulation.kt
//  
//
//  Created by Jundana Al-Basyir on 15/10/20.
//

fun variabel(
    a: IntArray, b: IntArray, c: Int, d: Int
): Int {
    val jumlah = IntArray(c)
    var i = c - 1
    var j = d - 1
    var k = c - 1
    var l = 0
    var m = 0

    while (j >= 0) {
        m = a[i] + b[j] + l
        jumlah[k] = m % 10
        l = m / 10
        i--
        j--
        k--
    }

    while (i >= 0) {
        m = a[i] + l
        jumlah[k] = m % 10
        l = m / 10
        i--
        k--
    }

    var noArr = 0

    if (l == 1)
        noArr = 10
    i = 0

    while (i <= c - 1) {
        noArr += jumlah[i]
        noArr *= 10
        i++
    }
    return noArr / 10
}

fun totalArray(
    a: IntArray, b: IntArray, c: Int, d: Int
): Int {
    return when (c >= d) {
        c >= d -> variabel(a, b, c, d)
        else -> {
            variabel(b, a, d, c)
        }
    }
}

fun main() {
    val a = intArrayOf(4,7,3)
    val b = intArrayOf(1,2,3)
    val c = a.size
    val d = b.size
    println(totalArray(a, b, c, d))
}
