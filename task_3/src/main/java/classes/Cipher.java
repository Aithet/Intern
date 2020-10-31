package classes;

import java.io.UnsupportedEncodingException;

public class Cipher {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String string = "G";
        binary(string);
        System.out.println(encrypt(string));
    }

    public static String encrypt(String string) {
        char[] chars = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            String binaryString = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
            String[] temp = binaryString.split("(?<=([0,1]))(?!\\1)");
            for (String str : temp) {
                stringBuilder.append(str.contains("0") ? "00" : "0");
                stringBuilder.append(" ");
                for (int i = 0; i < str.length(); i++) {
                    stringBuilder.append("0");
                }
                stringBuilder.append(" ");
            }
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    public static String binary(String line) throws UnsupportedEncodingException {

        byte[] bytes = line.getBytes("US-ASCII");
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        System.out.println("'" + line + "' to binary: " + binary);
        return binary.toString();
    }

}