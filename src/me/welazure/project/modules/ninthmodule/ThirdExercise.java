package me.welazure.project.modules.ninthmodule;

import me.welazure.project.modules.ninthmodule.thirdexercise.Room;
import me.welazure.project.modules.ninthmodule.thirdexercise.SingleRoom;
import me.welazure.project.modules.ninthmodule.thirdexercise.SuiteRoom;

import java.util.Arrays;

import static me.welazure.project.modules.Utils.print;

public class ThirdExercise {
    public static void main(String[] args) {
        SuiteRoom room = new SuiteRoom(10, 100d);
        room.addService("1", 100);
        room.addService("2", 200);
        room.addService("3", 300);

        print(room.getTotalPrice(3));
    }
}
