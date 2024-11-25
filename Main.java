
public class Main {
    public static void main(String[] args) {
        C clasaC = new C();

        A clasaA = clasaC;

        try {
            clasaA.getArrayByIndex();
        } catch (MyExceptionNR3 e){
            System.out.println("Eroarea 3: " + e.getMessage());
        } catch (MyExceptionNR2 e){
            System.out.println("Eroarea 2: " + e.getMessage());
        } catch (MyException e){
            System.out.println("Eroarea 1: " + e.getMessage());
        }
    }
}