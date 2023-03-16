public class ToDigit {
    public String solution(int decimal) {
        StringBuilder sb = new StringBuilder();

        dfs(decimal, sb);

        System.out.println("original: " + sb.toString());
        System.out.println("original: " + sb.hashCode());

        return sb.toString();
    }

    private void dfs(int decimal, StringBuilder binary) {
        int remainder = decimal % 2;
        int share = decimal / 2;

        System.out.println(binary.toString());
        System.out.println("copied: " + binary.toString().hashCode());

        if (share == 0) {
            binary.append(remainder);
            return;
        }

        dfs(share, binary);

        binary.append(remainder);
    }
}

//public class ToDigit {
//    public String solution(int decimal) {
//        String binary = "";
//
//        System.out.println("original: " + binary.hashCode());
//        dfs(decimal, binary);
////        System.out.println(binary);
//
//        return binary;
//    }
//
//    private void dfs(int decimal, String binary) {
//        int remainder = decimal % 2;
//        int share = decimal / 2;
//
//        System.out.println("copied: " + binary.hashCode());
//
//        binary += remainder;
//
//        System.out.println("copied: " + binary.hashCode());
//
//        System.out.println(binary);
//
//        if (share == 0) {
//            return;
//        }
//
//        dfs(share, binary);
//    }
//}
