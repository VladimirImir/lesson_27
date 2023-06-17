package com.dev.lesson28.model;

public class ReflectionApiExample {

    public static void main(String[] args) {
        User user = new User(25L, "Ivan");
        Class<? extends User> userClass = user.getClass();
        Class<User> userClass1 = User.class;
        System.out.println(userClass == userClass1);
    }

    private class Tast1 {

    }

    private static class Test3{

    }

    private enum Tast2 {
        ONE, TWO
    }
}
