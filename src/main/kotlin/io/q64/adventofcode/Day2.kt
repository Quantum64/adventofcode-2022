package io.q64.adventofcode

fun main() {
    input(2)
        .map { it.split(" ") }
        .map { (opponent, self) -> opponent.first() - 'A' to self.first() - 'X' }
        .sumOf { (opponent, self) ->
            when (self) {
                opponent -> 3
                opponent + 1, opponent - 2 -> 6
                else -> 0
            } + self + 1
        }
        .let { println(it) }
}