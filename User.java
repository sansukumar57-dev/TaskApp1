public class User {
    private String userName;
   private Task[] currentUserTask=new Task[10];
    public User()
{

}
    public User(String name)
    {
        this.userName = name;
    }
    public String getUserName() {
        return userName;
    }

    public Task[] getCurrentUserTask() {
        return currentUserTask;
    }

    public void setCurrentUserTask(Task[] currentUserTask) {
        this.currentUserTask = currentUserTask;
    }
}
