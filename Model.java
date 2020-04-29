import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Double.parseDouble;
import static java.lang.Math.pow;

class Model {

    static ArrayList<String> prepare(String string){
        Scanner scanner = new Scanner(string);
        ArrayList<String> list = new ArrayList<>();
        while(scanner.hasNext()){
                list.add(scanner.next());
        }
        return list;
    }
    static String count(ArrayList<String> list){
        try {
            while (list.size() > 1) {
                if (list.contains("(")) {
                    int replaceable = list.indexOf("(");
                    ArrayList smallList = new ArrayList<>();
                    int i = list.indexOf("(") + 1;
                    while (!list.get(i).equals(")") && i < list.size() - 1) {
                        smallList.add(list.get(i));
                        i++;
                    }
                    int smallListSize = smallList.size();
                    String a = count(smallList);
                    ArrayList secondList = new ArrayList();
                    if (replaceable > 0) {
                        for (int n = 0; n < replaceable; n++) {
                            secondList.add(n, list.get(n));
                        }
                        secondList.add(replaceable, a);
                    } else {
                        secondList.add(a);
                    }
                    if (list.size() - smallListSize - 3 > 0) {
                        int l = 0;
                        for (int m = replaceable + 1; m < list.size() - smallList.size() - 3; m++) {
                            int z = list.indexOf("(") + smallListSize + 2 + l;
                            secondList.add(list.get(z));
                            l++;
                        }
                        list = secondList;
                    } else {
                        list = secondList;
                    }
                } else {
                    if (list.contains("^")) {
                        list.set(list.indexOf("^") - 1, Double.toString(pow(Double.parseDouble(list.get(list.indexOf("^") - 1)), Double.parseDouble(list.get(list.indexOf("^") + 1)))));
                        list.remove(list.indexOf("^") + 1);
                        list.remove("^");

                    }
                    if (list.contains("log")) {
                        double a = Math.log10(Double.parseDouble(list.get(list.indexOf("log") + 1)));
                        list.remove(list.indexOf("log") + 1);
                        list.set(list.indexOf("log"), Double.toString(a));

                    }
                    if (list.contains("ln")) {
                        double a = Math.log(Double.parseDouble(list.get(list.indexOf("ln") + 1)));
                        list.remove(list.indexOf("ln") + 1);
                        list.set(list.indexOf("ln"), Double.toString(a));

                    }
                    if (list.contains("*")) {
                        list.set(list.indexOf("*") - 1, Double.toString(parseDouble(list.get(list.indexOf("*") - 1)) * parseDouble(list.get(list.indexOf("*") + 1))));
                        list.remove(list.indexOf("*") + 1);
                        list.remove("*");

                    }
                    if (list.contains("/")) {
                        list.set(list.indexOf("/") - 1, Double.toString(parseDouble(list.get(list.indexOf("/") - 1)) / parseDouble(list.get(list.indexOf("/") + 1))));
                        list.remove(list.indexOf("/") + 1);
                        list.remove("/");

                    }
                    if (list.contains("+")) {
                        list.set(list.indexOf("+") - 1, Double.toString(parseDouble(list.get(list.indexOf("+") - 1)) + parseDouble(list.get(list.indexOf("+") + 1))));
                        list.remove(list.indexOf("+") + 1);
                        list.remove("+");

                    }
                    if (list.contains("-")) {
                        list.set(list.indexOf("-") - 1, Double.toString(parseDouble(list.get(list.indexOf("-") - 1)) - parseDouble(list.get(list.indexOf("-") + 1))));
                        list.remove(list.indexOf("-") + 1);
                        list.remove("-");

                    }
                }

            }
            return list.get(0);
        }catch(IndexOutOfBoundsException e){
            return "Error: invalid input";
        }catch (NumberFormatException e){
            return "Error: invalid input";
        }
    }
}
