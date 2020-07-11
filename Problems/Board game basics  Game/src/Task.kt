object PlayingField {
    object Size {
        var width = 0
        var height = 0
        fun changeSize(newWidth: Int, newHeight: Int) {
            width = newWidth.coerceIn(0..newHeight)
            height = newHeight.coerceIn(0..newHeight)
        }
    }
}