package com.dev.lesson27.task;

/**
 * 3. Написать программу, выполняющую поиск в строке всех тегов
 * абзацев, в т.ч. тех, у которых есть параметры, например <p id
 * ="p1">,
 * и замену их на простые теги абзацев <p>.
 */

public class Task3 {

    public static void main(String[] args) {
        String regex = "(<p .+?>)(.+?</p>)";
        String input = "<p>sdadasdaas s </p> <b> dsasds adas <p id=\"p1\">saaad </p>";
        System.out.println(input.replaceAll(regex, "<p>$2"));
    }
}
