public class BitMaskUtility {

    static boolean isBitSet(int number, int position) {

        return (number & (1 << position)) != 0;
    }

    static int setBit(int number, int position) {

        return number | (1 << position);
    }

    static int clearBit(int number, int position) {

        return number & ~(1 << position);
    }

    static int toggleBit(int number, int position) {

        return number ^ (1 << position);
    }

    static String toBinary32(int number) {

        return String.format("%32s", Integer.toBinaryString(number))
                .replace(' ', '0');
    }
}
