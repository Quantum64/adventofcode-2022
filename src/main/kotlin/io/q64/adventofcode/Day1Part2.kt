package io.q64.adventofcode

fun main() {
    input(1)
        .map { it.toIntOrNull() }
        .fold(listOf<List<Int>>()) { acc, next ->
            if (next == null) acc.plusElement(listOf())
            else acc.dropLast(1).plusElement((acc.lastOrNull() ?: emptyList()) + next)
        }
        .sortedByDescending { it.sum() }
        .take(3)
        .sumOf { it.sum() }
        .let { println(it) }
}