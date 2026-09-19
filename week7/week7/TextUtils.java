package college.util;

public class TextUtils {

    private TextUtils() {
    }

    private static int count = 0;

    public static String normalizeName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        name = name.trim();

        StringBuilder result = new StringBuilder();
        boolean space = false;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (Character.isWhitespace(ch)) {

                if (!space) {
                    result.append(' ');
                    space = true;
                }

            } else {
                result.append(ch);
                space = false;
            }
        }

        String text = result.toString();

        StringBuilder finalName = new StringBuilder();
        boolean first = true;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch == ' ') {
                finalName.append(ch);
                first = true;
            } else {

                if (first) {
                    finalName.append(Character.toUpperCase(ch));
                    first = false;
                } else {
                    finalName.append(Character.toLowerCase(ch));
                }
            }
        }

        count++;

        return finalName.toString();
    }

    public static int getCount() {
        return count;
    }
}