package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chapter10 {
    public static void main(String[] args) throws Exception {
        List<Task> list = new ArrayList<>();
        list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
        list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
        list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
        list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
        list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));

        // 未完了のタスクの個数を表示
        long incompleteCount = list.stream()
                .filter(task -> !task.isDone())
                .count();
        System.out.println("未完了のタスクの個数は" + incompleteCount);

     // 未完了のタスクを日時の昇順に並び替えて一覧表示
        System.out.println("【未完了のタスクを昇順に並び替えて一覧表示】");
        list.stream()
                .filter(task -> !task.isDone()) // 未完了のタスクのみフィルタリング
                .sorted((t1, t2) -> t1.getDate().compareTo(t2.getDate())) // 日時の昇順でソート
                .forEach(task -> System.out.println(task.getDate() + " " + task.getTask())); // 一覧表示    
        
    }
}
