
package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
    private LocalDate date;
    private String task;
    private boolean done; // 追加　完了はtrue, 未完了は false

	public Task(LocalDate date, String task, boolean done) {
		this.date = date;
		this.task = task;
		this.done = done;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getTask() {
		return task;
	}

	// boolean型のgetterメソッドはis～とすることもあります
	public boolean isDone() {
		return done;
	}

	// compareToメソッドをオーバーライドする
	// 日付で並び替えるため、LocalDateのcompareToを使う
	@Override
	public int compareTo(Task t) {
		return this.date.compareTo(t.date);
	}

	@Override
	public String toString() {
		return this.date + " " + this.task;
	}
}