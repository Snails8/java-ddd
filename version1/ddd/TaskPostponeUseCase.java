public class TaskPostponeUseCase {
    @Autowired

    private TaskRepository taskRepository;



    public void postponeTask(Long taskId) {
        Task task = taskRepository.findById(taskId);
        task.postpone();
        task.TaskRepository.save();
    }
}