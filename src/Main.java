public class Main {
    public static void main(String[] args) throws WrongLoginException {
        try {
            Validator.check("aert", "hgffd", "fdgdghjnbvfrtedcvgt");
            System.out.println("Логин успешно принят");
        }catch (WrongLoginException e){
            throw new RuntimeException(e);
        }
    }
}