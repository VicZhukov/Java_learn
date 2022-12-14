package module_13.task_1;

import java.io.IOException;

public class HttpPractice {

    public static void main(String[] args) throws IOException, InterruptedException {
        User user = createDefaultUser();

        //Create User
        String createdUser = HttpUtil.sendPost(user);
        System.out.println(createdUser);
        //Update User
        String updateUser = HttpUtil.sendPut(10, user);
        System.out.println(updateUser);
        //Delete User
        int deleteUser = HttpUtil.sendDelete(5);
        System.out.println(deleteUser);
        //Get All Users
        String getAllUsers = HttpUtil.sendGetAllUsers();
        System.out.println(getAllUsers);
        //Get User By Id
        String getUserById = HttpUtil.sendGetUserById(3);
        System.out.println(getUserById);
        //Get User By Name
        String getUserByName = HttpUtil.sendGetUserByUserName("Delphine");
        System.out.println(getUserByName);

    }
    public static User createDefaultUser(){
        User user = new User();
        user.setId(1);
        user.setName("Java the Best");
        user.setTitle("foo");
        user.setBody("boo");
        user.setUserId(1);
        user.setUserName("java");
        return user;
    }
}
