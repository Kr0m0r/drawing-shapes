public class Shapes {
   public static void main(String[] args) {
      Turtle GreenGuy = new Turtle();
      // Task 1: Draw a regular shape
      for (int i = 0; i < 5; i++) {
         GreenGuy.forward(50);
         GreenGuy.right(72);
      }
      // Task 2: Draw a regular shape many times
      GreenGuy.up();
      GreenGuy.setPosition(-150, 50);
      GreenGuy.down();
      for (int i = 1; i <= 10; i++) {
         for (int j = 0; j < 5; j++) {
            GreenGuy.forward(50);
            GreenGuy.left(72);
         }
         GreenGuy.forward(10);
      }

      // Task 3: How many times does Turtle turn!
      GreenGuy.up();
      GreenGuy.setPosition(-200, -200);
      GreenGuy.down();
      int totalTurns = 0;
      for (int i = 1; i <= 10; i++) {
         for (int j = 0; j < 5; j++) {
            GreenGuy.forward(50);
            GreenGuy.left(72);
            totalTurns++;
         }
         GreenGuy.forward(10);
      }
      System.out.println("GreenGuy has turned " + totalTurns + " times!");


      // Extension 1: Additional Use of Loop Variable
      GreenGuy.up();
      GreenGuy.forward(50);
      GreenGuy.down();
      for (int i = 1; i <= 5; i++) {
         for (int j = 0; j < 5; j++) {
            GreenGuy.forward(i * 10);
            GreenGuy.left(72);
         }
      }


      // Extension 2: Three Loops
      GreenGuy.up();
      GreenGuy.setPosition(60, 50);
      GreenGuy.down();
      for (int i = 1; i <= 6; i++) {
         for (int j = 1; j <= 6; j++) {
            for (int k = 0; k < 6; k++) {
               GreenGuy.forward(10);
               GreenGuy.left(60);
            }
            GreenGuy.forward(10);
            GreenGuy.right(60);
         }
         GreenGuy.forward(10);
         GreenGuy.left(60);
         GreenGuy.forward(10);
         GreenGuy.right(60);
         GreenGuy.forward(10);
         GreenGuy.left(60);
      }

    }
}
