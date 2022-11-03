package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    List answers;
    Computer() {
        answers = Computer.generateNumber();
    }

    static public List<Integer> generateNumber() {
        List list = new ArrayList();
        while (list.size() < 3) {
            int number = Randoms.pickNumberInRange(1, 9);
            if (!list.contains(number)) {
                list.add(number);
            }
        }
        return list;
    }
}
