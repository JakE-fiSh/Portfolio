class Main {
  public static void main(String[] args) {

    System.out.println();

    Game start = new Game();
    start.startGame();
  }

  public static void printMe(int[][] pos){
    for(int row = 0; row < pos.length; row++){
      for(int col = 0; col < pos[0].length; col++){
        System.out.print(pos[row][col] + " ");
      }
      System.out.println("");
    }
  }
}