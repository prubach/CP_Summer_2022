package Exercises03_04;
// Calculate the volume of the sphere with a radius r = 1 and r = 1.2345.

public class Exercise08 {
 public static void main(String[] args) {
  // vol = 4/3*pi*r*r*r
  double r, r2, pi = Math.PI, volumeOfSphere;
  r = 1;
  r2 = 1.2345;
  // volumeOfSphere = (double) 4/3*pi*r*r*r; // the result of dividing integers (4/3) is an integer
  volumeOfSphere = 4.0/3.0*pi*r*r*r;
  System.out.println(volumeOfSphere);
  // r2
  volumeOfSphere = 4.0/3.0*pi*Math.pow(r2, 3);
  System.out.println(volumeOfSphere);
 }
}
