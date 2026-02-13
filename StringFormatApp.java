public class StringFormatApp{
  public static void main(String[] args) { 
    String name = args[0];
    int age = Integer.parseInt(args[1]); // or: Integer.valueOf(..)
    float height = Float.parseFloat(args[2]); //or: Float.valueOf(..)
    double spaceHeight = height * 1.023;
    float marsAge = Math.round(age / 1.88);

    System.out.printf("name: %-20s Age: %3d Height: %4.2fm%n", name, age, height);
    System.out.println("My space height would be " + spaceHeight + "cm");
    System.out.println("On Mars I would be approximately " + marsAge + " years old.");
  }
  }