class Main {
  public static int lastElement(int[] intArray) {
    int result = 0;
    if (intArray.length !=0) {
      result = intArray[intArray.length - 1];
    }
    return result;
  }
  public static void main(String[] args) {
    int[] intArray = new int[]{1, 2, 3, 4, 5};
    System.out.println("Last element: " + lastElement(intArray));
  }
}
