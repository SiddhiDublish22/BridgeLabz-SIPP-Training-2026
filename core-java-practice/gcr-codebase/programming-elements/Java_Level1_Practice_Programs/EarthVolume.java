class EarthVolume {
  public static void main(String[] args) {
    double r = 6378;
    double volume = (4.0 / 3.0) * 3.14159 * r * r * r;
    System.out.println(volume);
  }
}