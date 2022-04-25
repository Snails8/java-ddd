public class TaskCreateUseCase {
    @Autowired
    private TaskRepository taskRepository 

    public void createTask(String name, LocalDate deuDate){
        if (name == null || deuDate == null) {
            throw new IllegalArgumentException("必須項目が設定されていません");
        }

        Task task = new Task();
        task.setTaskStatus(TaskStatus.UNDONE); // UNDONE で新規作成
        task.setName(name);
        task.setDueDate(deuDate);
        task.setPostponeCount(0); // 延期回数の初期値は0

        taskRepository.save(task);
    }
}