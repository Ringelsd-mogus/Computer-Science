import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the current day of the month:");
    int dateDay = input.nextInt();
    System.out.println("Enter the current month as an integer:");
    int dateMonth = input.nextInt();
    System.out.println("Enter the current year as an integer");
    int dateYear = input.nextInt();
    input.nextLine();
    System.out.println("Enter your first name: ");
    String first = input.nextLine();
    System.out.println("Enter your last name:");
    String last = input.nextLine();
    System.out.println("Enter the requested word types");
    System.out.println("Adjective:");
    String adjective = input.nextLine();//1
    System.out.println("Food(plural):");
    String food1 = input.nextLine();//2
    System.out.println("Verb:");
    String verb1 = input.nextLine();//3
    System.out.println("Saying:");
    String saying1 = input.nextLine();//4
    System.out.println("Noun:");
    String noun1 = input.nextLine();//5
    System.out.println("Food(plural):");
    String food2 = input.nextLine();//6
    System.out.println("Color:");
    String color1 = input.nextLine();//7
    System.out.println("Something you would ride in:");
    String ride1 = input.nextLine();//8
    System.out.println("Animal:");
    String animal1 = input.nextLine();//9
    System.out.println("Person:");
    String person1 = input.nextLine();//10
    System.out.println("Today I went to my favorite Taco Stand called the "+adjective+" "+animal1+". Unlike most food stands, they cook and prepare the food in a "+ride1+" while you "+verb1+". The best thing on the menu is the "+color1+" "+noun1+". Instead of ground beef they fill the taco with "+food2+", cheese, and top it off with a salsa made from "+food1+". If that doesn't make your mouth water, then it' just like "+person1+" always says: "+saying1+"! ");
    System.out.println(first +" "+ last + "\nThe date is currently: "+dateMonth+"/"+dateDay+"/"+dateYear);
  }
}