package service;

import bean.Human;

public class HumanDemo {
    Human human = new Human(15, "Roma");
    public String greet (){
return ("hello," + human.getName() + human.getAge());
    }
}
