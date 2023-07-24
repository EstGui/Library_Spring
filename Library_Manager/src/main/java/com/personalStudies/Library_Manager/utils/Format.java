package com.personalStudies.Library_Manager.utils;

public class Format {

    public static void clean_term() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String format_prec(double val) {
        String price = (val < 10.00) ? String.format("0%.2f", val) : String.format("%.2f", val);

        return price;
    }

    public static String dots(int len) {
        StringBuilder sequency = new StringBuilder();
        sequency.append(String.valueOf(".").repeat(Math.max(0, len)));

        return sequency.toString();
    }

    public static String space_bet(int len, String a, String b) {
        int space_bet = (len - a.length() - b.length());
        String frm_str = String.format("%s" + "%" + space_bet + "s" + "%s", a, "", b);

        return frm_str;
    }

    public static String space_cen(int len, String a) {
        int space_cen = (len - a.length()) / 2;
        String frm_str = String.format("%" + space_cen + "s%s%" + space_cen + "s" + "\n", "", a, "");

        return frm_str;
    }
}