package com.mmall.service.degraded;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;

public class UserServiceDegraded implements IUserService {
    @Override
    public ServerResponse<User> login(String username, String password) {
        return ServerResponse.createByErrorMessage("Calling API Failed");
    }

    @Override
    public ServerResponse<String> register(User user) {
        return ServerResponse.createByErrorMessage("Calling API Failed");
    }

    @Override
    public ServerResponse<String> checkVerifyLink(String link) {
        return ServerResponse.createByErrorMessage("Calling API Failed");
    }

    @Override
    public ServerResponse<String> checkValid(String str, String type) {
        return ServerResponse.createByErrorMessage("Calling API Failed");
    }

    @Override
    public ServerResponse selectQuestion(String username) {
        return ServerResponse.createByErrorMessage("Calling API Failed");
    }

    @Override
    public ServerResponse<String> forgetCheckAnswer(String username, String question, String answer) {
        return ServerResponse.createByErrorMessage("Calling API Failed");
    }

    @Override
    public ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken) {
        return ServerResponse.createByErrorMessage("Calling API Failed");
    }

    @Override
    public ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user) {
        return ServerResponse.createByErrorMessage("Calling API Failed");
    }

    @Override
    public ServerResponse<User> updateInformation(User user) {
        return ServerResponse.createByErrorMessage("Calling API Failed");
    }

    @Override
    public ServerResponse<User> getInformation(Integer id) {
        return ServerResponse.createByErrorMessage("Calling API Failed");
    }

    @Override
    public ServerResponse checkAdminRole(User user) {
        return ServerResponse.createByErrorMessage("Calling API Failed");
    }
}
