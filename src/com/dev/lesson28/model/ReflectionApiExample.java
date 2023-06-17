package com.dev.lesson28.model;

import java.lang.reflect.*;

public class ReflectionApiExample {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        /*User user = new User(25L, "Ivan");
        Class<? extends User> userClass = user.getClass();
        Class<User> userClass1 = User.class;
        System.out.println(userClass == userClass1);*/

        //testConstructor();

        //User user = new User(25L, "Ivan");
        //testFields(user);

        User user = new User(25L, "Ivan", 24);
        testMethods(user);


    }

    private static void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User petr = constructor.newInstance(5L, "petr");
        System.out.println(petr);
    }

    private static void testFields(User user) throws IllegalAccessException {
        Field[] declaredFields = User.class.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object value = declaredField.get(user);
            System.out.println(declaredField.getModifiers());
            System.out.println(Modifier.isPrivate(declaredField.getModifiers()));
            System.out.println(value);
        }
    }

    private static void testMethods(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = user.getClass().getDeclaredMethod("getName");
        System.out.println(method.invoke(user));
    }

    private class Tast1 {

    }

    private static class Test3 {

    }

    private enum Tast2 {
        ONE, TWO
    }
}
