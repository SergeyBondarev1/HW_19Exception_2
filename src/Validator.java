public class Validator {
    private static final String ALLOWED_CHARS = "abcdefghijkmnopqrstuvwxyz";
    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !isValidChars(login)) {
            throw new WrongLoginException("Логин содержит недопустимые символы!");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль не может содержать больше 20 символов");
        }
        if (isValidChars(password)) {
            throw new WrongPasswordException("Строка содержит недопустимые символы");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не равны");
        }
    }

    public static boolean isValidChars(String str) {
        var lowerCase = str.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            var c = lowerCase.charAt(i);
            for (int j = 0; j < ALLOWED_CHARS.length(); j++) {
                if (ALLOWED_CHARS.charAt(j) != c) {
                    return false;
                }
            }
        }
        return true;
    }
}