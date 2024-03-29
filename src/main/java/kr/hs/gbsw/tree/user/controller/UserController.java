package kr.hs.gbsw.tree.user.controller;

import kr.hs.gbsw.tree.user.dto.CreateUserDto;
import kr.hs.gbsw.tree.user.model.User;
import kr.hs.gbsw.tree.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    public UserService userService;

    @PostMapping
    public User createUser(@RequestBody CreateUserDto dto) {
        return userService.createUser(dto);
    }

    @GetMapping("/me")
    public User getMyProfile(
            @AuthenticationPrincipal User user
    ) {
        return user;
    }
}
