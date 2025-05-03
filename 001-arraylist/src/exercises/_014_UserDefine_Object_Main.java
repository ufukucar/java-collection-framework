package exercises;

import java.util.ArrayList;
import java.util.List;

public class _014_UserDefine_Object_Main {

    public static void main(String[] args) {

        List<_014_User> users = new ArrayList<>();

        users.add(new _014_User("Ufuk", "Erkek", 37));
        users.add(new _014_User("Cumali", "Erkek", 43));
        users.add(new _014_User("Gamze", "Kadın", 30 ));

        users.forEach(user -> {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge() + ", Gender: " + user.getAge());
        });



    }


}
