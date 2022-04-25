@Setter
@Getter
public class Task {
    private Long id;
    private TaskStatus TaskStatus;
    private String name;
    private LocalDate deuDate
    private int postponeCount
}

// コンストラクタ:新規作成時(初期化)
public Task(String name, LocalDate dueDate) {

    if (name == null || deuDate == null) {
        throw new IllegalArgumentException("必須項目が設定されていません");
    }   
    
    this.name          = name;
    this.dueDate       = dueDate;
    this.TaskStatus    = TaskStatus.UNDONE;
    this.postponeCount = 0;
}

// task は３回まで延期できる
public static int POSTPONE_MAX_COUNT = 3;
// 延期時の処理
public void postpone() {
    if(task.getPostponeCount() > POSTPONE_MAX_COUNT) {
        throw new IllegalArgumentException("最大延期回数を超過しています");
    }
    dueDate().plusDay(1L);
    postponeCount++;
}