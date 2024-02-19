class FtoC extends ConsoleProgram {

  /**
  * A program FtoC.java that lets you enter a degree measure in Fahrenheit, and that prints the result in celsius degree measure.
  * @author: Simon Tse
  */
  
  public void run() {
    
    // Declare variables
    int intTempFar;
    int intTempCel;
    

    // Get variables
    intTempFar = readInt("Enter the temperature in Fahrenhiet: ");

    // Calculate for the temperature in celsius
    intTempCel = (intTempFar - 32) * 5 / 9;
    

    // Show result
    System.out.println("The temperature you enter in celsius is " + intTempCel + "°C");
    
  }
}