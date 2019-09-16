public class Main {
  public static void main(String[] args) {
    greet("balint");
    count(23);
    cheer();
    future();


  }

  private static void cheer() {
    System.out.println("git-project");
  }

  public static void greet(String string){
    System.out.println(string);

  }

  public static void count(Integer number) {
    System.out.println(number);
  }

  public static void future(){
    System.out.println("szarhugyfing");

  }
}
