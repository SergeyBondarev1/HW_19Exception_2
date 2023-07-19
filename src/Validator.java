public class Validator {
    private static final String ALLOWED_CHARS = "abcdefghijkmnopqrstuvwxyz";
    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !isValidChars(login)) {
            throw new WrongLoginException("Логин содержит недопустимые символы!");
        }
        if (password.length() > 20||!isValidChars(password)) {
            throw new WrongPasswordException("Пароль содержит недопустимые символы");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не равны");
        }
    }
    private static boolean isValidChars(String str) {
        var lowerCase = str.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            var c = lowerCase.charAt(i);
            if (!ALLOWED_CHARS.contains(String.valueOf(c))) {
                    return false;
                }
            }
        return true;
    }
}