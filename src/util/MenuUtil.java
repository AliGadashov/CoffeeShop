package util;

public class MenuUtil {
    public static Byte entryApp(){

        System.out.println(
                "----------| COFFEE SHOP |----------\n" +
                        "\n[0] -> Exit" +
                        "\n[1] -> Buy Coffee" +
                        "\n[2] -> Show Customer" +
                        "\n[3] -> Add Coffee"
        );

        return InputUtil.getInstance().inputTypeByte("\nChoose the option: ");

    }
}
