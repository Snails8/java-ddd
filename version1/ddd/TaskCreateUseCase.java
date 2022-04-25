public class TaskCreateUseCase {
    @Autowired
    private TaskRepository taskRepository 

    public void createTask(String name, LocalDate deuDate){

        Task task = new Task(String name, LocalDate dueDate);
        taskRepository.save(task);
    }
}