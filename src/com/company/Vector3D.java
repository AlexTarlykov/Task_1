package com.company;

public class Vector3D {

    private final int x;
    private final int y;
    private final int z;

    Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public static Vector3D sumOfVector(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(vector1.x + vector2.x, vector1.y + vector2.y, vector1.z + vector2.z);
    }

    public static Vector3D vectorDifference(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(vector1.x - vector2.x, vector1.y - vector2.y, vector1.z - vector2.z);
    }

    public static int scalarProductOfVectors(Vector3D vector1, Vector3D vector2) {
        return vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z;
    }

    public double lengthOfVector() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double cosBetweenVectors(Vector3D vector1, Vector3D vector2) {
        return scalarProductOfVectors(vector1, vector2) / vector1.lengthOfVector() / vector2.lengthOfVector();
    }

    public static int mixedProductVectors(Vector3D vector1, Vector3D vector2, Vector3D vector3) {
        return (vector1.y * vector2.z - vector1.z * vector2.y) * vector3.x +
                (vector1.z * vector2.x - vector1.x * vector2.z) * vector3.y +
                (vector1.x * vector2.y - vector2.x * vector1.y) * vector3.z;
    }

    public static Vector3D vectorProductOfVectors(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(
                vector1.y * vector2.z - vector1.z * vector2.y,
                vector1.z * vector2.x - vector1.x * vector2.z,
                vector1.x * vector2.y - vector2.x * vector1.y
        );
    }

    public static boolean coplanarityOfVectors(Vector3D vector1, Vector3D vector2, Vector3D vector3) {
        return mixedProductVectors(vector1, vector2, vector3) == 0;
    }
}
