package io.q64.adventofcode

fun main() {
    input(2)
        .map { it.split(" ") }
        .map { (opponent, self) -> opponent.first() - 'A' to self.first() - 'X' }
        .sumOf { (opponent, self) ->
            when (self) {
                0 -> (opponent + 2) % 3
                1 -> opponent + 3
                2 -> (opponent + 1) % 3 + 6
                else -> 0
            } + 1
        }
        .let { println(it) }
}