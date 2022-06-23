package domain

sealed class Cell(val location: Location) {

    internal class Mine(location: Location) : Cell(location)
    internal class Ground(location: Location) : Cell(location)

    companion object {
        fun ground(location: Location): Cell {
            return Ground(location)
        }

        fun mine(location: Location): Cell {
            return Mine(location)
        }
    }
}
