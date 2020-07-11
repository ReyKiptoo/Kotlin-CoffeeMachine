class Point3D {
    var x: Int = 0
    var y: Int = 0
    var z: Int = 0
}

fun createPoint(x: Int, y: Int, z: Int): Point3D {
    val theObject = Point3D()
    theObject.x = x
    theObject.y = y
    theObject.z = z
    return theObject
}