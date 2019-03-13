package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import com.mmall.service.degraded.UserServiceDegraded;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(qualifier = "iUserService", name = "mmall-backservice", fallback = UserServiceDegraded.class)
@RequestMapping("/user")
public interface IUserService {
    @PostMapping("/login/{username}/{password}")
    ServerResponse<User> login(@PathVariable("username")String username, @PathVariable("password")String password);

    @PostMapping("/register")
    ServerResponse<String> register(@RequestBody User user);

    @PostMapping("/checkVerifyLink/{link}")
    ServerResponse<String> checkVerifyLink(@PathVariable("link") String link);

    @PostMapping("/checkValid/{str}/{type}")
    ServerResponse<String> checkValid(@PathVariable("str")String str, @PathVariable("type")String type);

    @PostMapping("/selectQuestion/{username}")
    ServerResponse selectQuestion(@PathVariable("username")String username);

    @PostMapping("/forgetCheckAnswer/{username}/{question}/{answer}")
    ServerResponse<String> forgetCheckAnswer(@PathVariable("username")String username, @PathVariable("question")String question, @PathVariable("answer")String answer);

    @PostMapping("/forgetResetPassword/{username}/{passwordNew}/{forgetToken}")
    ServerResponse<String> forgetResetPassword(@PathVariable("username")String username, @PathVariable("passwordNew")String passwordNew, @PathVariable("forgetToken")String forgetToken);

    @PostMapping("/resetPassword/{passwordOld}/{passwordNew}")
    ServerResponse<String> resetPassword(@PathVariable("passwordOld")String passwordOld, @PathVariable("passwordNew")String passwordNew, @RequestBody User user);

    @PostMapping("/updateInformation")
    ServerResponse<User> updateInformation(@RequestBody User user);

    @PostMapping("/getInformation/{id}")
    ServerResponse<User> getInformation(@PathVariable("id")Integer id);

    // backend
    @PostMapping("/checkAdminRole")
    ServerResponse checkAdminRole(@RequestBody User user);
}
