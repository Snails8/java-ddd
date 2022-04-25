public class TaskPostponeUseCase {
    @Autowired

    private TaskRepository taskRepository;

    public static int POSTPONE_MAX_COUNT = 3;

    public void postponeTask(Long taskId) {
        Task task = taskRepository.findById(taskId);

        if(task.getPostponeCount() > POSTPONE_MAX_COUNT) {
            throw new IllegalArgumentException("最大延期回数を超過しています");
        }

        task.setDueDate(task.getDueDate().plusDay(1L));
        task.setPostponeCount(task.getPostponeCount() + 1 );
        task.TaskRepository.save();
    }
}