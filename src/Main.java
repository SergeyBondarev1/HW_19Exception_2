public class Main {
    public static void main(String[] args) throws WrongLoginException {
        try {
            Validator.check("art", "asd", "asd");
            System.out.println("Логин успешно принят");
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}
