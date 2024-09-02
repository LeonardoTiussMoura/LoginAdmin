import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Digite o login: ");
    String login1 = sc.next();
    System.out.println("");
    String admin = "admin";
    int senha1 = 12345;
  
    
    if (login1.equals(admin)) {
      System.out.println("Digite sua senha: ");
    } else {
      System.out.println("Login errado.");
    } int senha = sc.nextInt();
      if (senha==senha1) {
      System.out.println("");
      System.out.println("Acesso permitido.");
    } else {
      System.out.println("");
      System.out.println("Acesso negado.");
    }  

    sc.close();
      }
        }